import Lexer_Parser.cringBaseVisitor;
import Lexer_Parser.cringParser;
import generatorCode.AST.*;
import generatorCode.compiler.ASMCompiler;
import symbols.SymbolTable;
import symbols.Type;

import java.io.File;
import java.util.Stack;

//генерация объектного кода, с помощью создания дерева элементов, каждый из которых
// имеет метод генерации байт-кода для JVM
public class MajorCringVisitor extends cringBaseVisitor<Node> {

    private SymbolTable top = null;
    private int used = 0;
    private void error(String s) { throw new Error("near line " + s); }

    @Override
    public Node visitProgram(cringParser.ProgramContext ctx) {
        Stmt main = (Stmt) visit(ctx.mainProg());
        // jvm код
        ASMCompiler comp = new ASMCompiler(main);
        comp.genClass(new File("cring.class"));
        return main;
    }

    @Override
    public Node visitMainProg(cringParser.MainProgContext ctx) { return visit(ctx.block()); }

    /*@Override
    public Node visitFunction(cringParser.FunctionContext ctx) {
        // Get function name and expected type information.
        String name = ctx.getChild(2).getText();
        Node type = top.get("function" + name);
        if (type == null) { return null; } // not declared in function table.
        int j = 4;
        ParseTree a = ctx.getChild(j);
        if (a instanceof cringParser.FunctionContext) {
            Node v = visit(a);
            for (int i = j; i < ctx.getChildCount(); i += 2) {
                ParseTree parameter = ctx.getChild(i);
                v = visit(parameter);
            }
        }
        return null;
    }*/

    @Override
    public Node visitBlock(cringParser.BlockContext ctx) {
        SymbolTable savedSymbolTable = top;
        top = new SymbolTable(top);
        // проход по всем Stmt и объединение их в Seq(Stmt1, Seq(Stmt2, Seq(Stmt3, Stmt.Null)))
        Stack<Stmt> stack = new Stack<>();
        for (int i = 0; i < ctx.statement().size(); i++) {
            stack.push((Stmt) visit(ctx.statement(i)));
        }
        Seq seq = new Seq(stack.pop(), Stmt.Null);
        while (!stack.empty()) {
            seq = new Seq(stack.pop(), seq);
        }
        Stmt s = seq;
        top = savedSymbolTable;
        return s;
    }

    @Override
    public Node visitStatement(cringParser.StatementContext ctx) { return visit(ctx.getChild(0)); }

    //return Declr
    @Override
    public Node visitVarDeclaration(cringParser.VarDeclarationContext ctx) {
        String varName = ctx.varname().getText();
        Type p = Type.getType(ctx.type().getText());
        if (p == null) error(ctx.start.getLine() + ": " + varName + " null type exception");
        Id id = new Id(varName, p, ++used );
        top.put(varName, id);
        if (ctx.expression() != null) {
            Expr x = (Expr) visit(ctx.expression());
            top.put(varName, id);
            return new Declr(id, x);
        }
        return new Declr(id);
    }

    @Override
    public Node visitPrint(cringParser.PrintContext ctx) { return visit(ctx.expressionList()); }

    @Override
    public Node visitIfStatement(cringParser.IfStatementContext ctx) {
        Expr x; Stmt s1, s2;
        //x = (Expr) visit(ctx.concList()); // without ELSE IF in grammatic
        x = (Expr) visit(ctx.parametrs());
        s1 = (Stmt) visit(ctx.block(0));
        if (ctx.block(1) != null) {
            s2 = (Stmt) visit(ctx.block(1));
            return new Else(x, s1, s2);
        }
        return new If(x, s1);
    }

    @Override
    public Node visitAssign(cringParser.AssignContext ctx) {
        String varName = ctx.varname().getText();
        Id id = top.get(varName);
        if( id == null ) error(  ctx.start.getLine() + ": " + varName + " undeclared");
        Expr x = (Expr) visit(ctx.expression());
        if ( x == null ) error( ctx.start.getLine() + ": " + " bad expression");
        return new Set(id, x);
    }

    @Override
    public Node visitWhileStatement(cringParser.WhileStatementContext ctx) {
        Expr x; Stmt s1;
        While while_node = new While();
        Stmt saved_Stmt = Stmt.Enclosing;
        x = (Expr) visit(ctx.parametrs());
        s1 = (Stmt) visit(ctx.block());
        while_node.init(x, s1);
        Stmt.Enclosing = saved_Stmt;
        return while_node;
        //return new While(x, s1);
    }

    @Override
    public Node visitEqualityConclusion(cringParser.EqualityConclusionContext ctx) {
        return new Rel(ctx.op.getText(), (Expr) visit(ctx.expression(0)), (Expr) visit(ctx.expression(1)));
    }

    @Override
    public Node visitMoreThenConclusion(cringParser.MoreThenConclusionContext ctx) {
        return new Rel(ctx.op.getText(), (Expr) visit(ctx.expression(0)), (Expr) visit(ctx.expression(1)));
    }

    @Override
    public Node visitLessThenConclusion(cringParser.LessThenConclusionContext ctx) {
        return new Rel(ctx.op.getText(), (Expr) visit(ctx.expression(0)), (Expr) visit(ctx.expression(1)));
    }

    @Override
    public Node visitParametrs(cringParser.ParametrsContext ctx) {
        Expr x = (Expr)visit(ctx.parametr(0));
        if (ctx.parametr().size() > 1) {
            for (int i = 1; i < ctx.parametr().size(); i++) {
                switch (ctx.pob.getText()) {
                    case "and":
                        x = new And("and", x, (Expr) visit(ctx.parametr(i)));
                    case "or":
                        x = new Or("or", x, (Expr) visit(ctx.parametr(i)));
                }
            }
        }
        return x;
    }

    @Override
    public Node visitAdditiveExpr(cringParser.AdditiveExprContext ctx) {
        return new Arithm(ctx.op.getText(), (Expr) visit(ctx.expression(0)), (Expr) visit(ctx.expression(1)));
    }

    @Override
    public Node visitVarnameExpr(cringParser.VarnameExprContext ctx) {
        String s = ctx.varname().getText();
        Id id = top.get(s);
        if( id == null ) error( ctx.start.getLine() + ": " + s + " undeclared");
        return id;
    }

    // return: int|float|char|bool and Type in Constant
    @Override
    public Node visitLiteralExpr(cringParser.LiteralExprContext ctx) { return visitChildren(ctx); }

    @Override
    public Node visitParenExpr(cringParser.ParenExprContext ctx) { return visit(ctx.expression()); }

    @Override
    public Node visitMultiplicationExpr(cringParser.MultiplicationExprContext ctx) {
        return new Arithm(ctx.op.getText(), (Expr) visit(ctx.expression(0)), (Expr) visit(ctx.expression(1)));
    }

    @Override
    public Node visitExpressionList(cringParser.ExpressionListContext ctx) {
        Stack<Expr> e = new Stack<>();
        for (int i = 0; i < ctx.expression().size(); i++)
            e.push((Expr) visit(ctx.expression(i)));
        Expr x1, x2;
        if (e.size() > 1) {
            x1 = e.pop();
            x2 = e.pop();
        } else return new Print(e.pop());
        EList p = new EList(x2, x1);
        while (!e.empty())
            p = new EList(e.pop(), p);
        return new Print(p);
    }

    // return: 100 type.Int
    @Override
    public Node visitIntLiteral(cringParser.IntLiteralContext ctx) { return new TypeLiteral(ctx.getText(), Type.Int); }

    // return: a-z Type.Char
    @Override
    public Node visitCharLiteral(cringParser.CharLiteralContext ctx) { return new TypeLiteral(ctx.IDENTIFIER().getText(), Type.Char); }

    // return: 3.0 Type .Float
    @Override
    public Node visitFloatLiteral(cringParser.FloatLiteralContext ctx) { return new TypeLiteral(ctx.getText(), Type.Float); }

    // return: true Type.Bool
    @Override
    public Node visitBoolLiteral(cringParser.BoolLiteralContext ctx) {
        switch (ctx.getText()) {
            case "true":
                return TypeLiteral.True;
            case "false":
                return TypeLiteral.False;
        }
        return null;
    }

    @Override
    public Node visitBreakStat(cringParser.BreakStatContext ctx) { return new Break(); }

    @Override
    public Node visitContStat(cringParser.ContStatContext ctx) { return new Continue(); }

}
