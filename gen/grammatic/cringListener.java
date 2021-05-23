// Generated from E:/IntelliJ IDEA Community Edition 2019.2.4/Kurs/src/grammatic\cring.g4 by ANTLR 4.8
package grammatic;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cringParser}.
 */
public interface cringListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cringParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(cringParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(cringParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(cringParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(cringParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#mainProg}.
	 * @param ctx the parse tree
	 */
	void enterMainProg(cringParser.MainProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#mainProg}.
	 * @param ctx the parse tree
	 */
	void exitMainProg(cringParser.MainProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(cringParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(cringParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(cringParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(cringParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(cringParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(cringParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#callMethod}.
	 * @param ctx the parse tree
	 */
	void enterCallMethod(cringParser.CallMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#callMethod}.
	 * @param ctx the parse tree
	 */
	void exitCallMethod(cringParser.CallMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(cringParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(cringParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(cringParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(cringParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(cringParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(cringParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(cringParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(cringParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(cringParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(cringParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#forInside}.
	 * @param ctx the parse tree
	 */
	void enterForInside(cringParser.ForInsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#forInside}.
	 * @param ctx the parse tree
	 */
	void exitForInside(cringParser.ForInsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(cringParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(cringParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#breakStat}.
	 * @param ctx the parse tree
	 */
	void enterBreakStat(cringParser.BreakStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#breakStat}.
	 * @param ctx the parse tree
	 */
	void exitBreakStat(cringParser.BreakStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#contStat}.
	 * @param ctx the parse tree
	 */
	void enterContStat(cringParser.ContStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#contStat}.
	 * @param ctx the parse tree
	 */
	void exitContStat(cringParser.ContStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#retStat}.
	 * @param ctx the parse tree
	 */
	void enterRetStat(cringParser.RetStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#retStat}.
	 * @param ctx the parse tree
	 */
	void exitRetStat(cringParser.RetStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpConclusin}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 */
	void enterExpConclusin(cringParser.ExpConclusinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpConclusin}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 */
	void exitExpConclusin(cringParser.ExpConclusinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallMethodConlusin}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 */
	void enterCallMethodConlusin(cringParser.CallMethodConlusinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallMethodConlusin}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 */
	void exitCallMethodConlusin(cringParser.CallMethodConlusinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityConclusion}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityConclusion(cringParser.EqualityConclusionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityConclusion}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityConclusion(cringParser.EqualityConclusionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoreThenConclusion}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 */
	void enterMoreThenConclusion(cringParser.MoreThenConclusionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoreThenConclusion}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 */
	void exitMoreThenConclusion(cringParser.MoreThenConclusionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThenConclusion}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 */
	void enterLessThenConclusion(cringParser.LessThenConclusionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThenConclusion}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 */
	void exitLessThenConclusion(cringParser.LessThenConclusionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#parametrs}.
	 * @param ctx the parse tree
	 */
	void enterParametrs(cringParser.ParametrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#parametrs}.
	 * @param ctx the parse tree
	 */
	void exitParametrs(cringParser.ParametrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#parametrList}.
	 * @param ctx the parse tree
	 */
	void enterParametrList(cringParser.ParametrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#parametrList}.
	 * @param ctx the parse tree
	 */
	void exitParametrList(cringParser.ParametrListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(cringParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(cringParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallMethodExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallMethodExpr(cringParser.CallMethodExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallMethodExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallMethodExpr(cringParser.CallMethodExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarnameExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarnameExpr(cringParser.VarnameExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarnameExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarnameExpr(cringParser.VarnameExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(cringParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(cringParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(cringParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(cringParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(cringParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(cringParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicationExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(cringParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicationExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(cringParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(cringParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(cringParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(cringParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(cringParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(cringParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(cringParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(cringParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(cringParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(cringParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(cringParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharLiteral(cringParser.CharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharLiteral(cringParser.CharLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(cringParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(cringParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(cringParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(cringParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(cringParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(cringParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cringParser#varname}.
	 * @param ctx the parse tree
	 */
	void enterVarname(cringParser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cringParser#varname}.
	 * @param ctx the parse tree
	 */
	void exitVarname(cringParser.VarnameContext ctx);
}