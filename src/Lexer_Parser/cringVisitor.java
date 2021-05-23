// Generated from E:/IntelliJ IDEA Community Edition 2019.2.4/Kurs/src/grammatic\cring.g4 by ANTLR 4.8
package Lexer_Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cringParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cringVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cringParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(cringParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(cringParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#mainProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProg(cringParser.MainProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(cringParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(cringParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(cringParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#callMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMethod(cringParser.CallMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(cringParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(cringParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(cringParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(cringParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(cringParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#forInside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInside(cringParser.ForInsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(cringParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#breakStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStat(cringParser.BreakStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#contStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContStat(cringParser.ContStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#retStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetStat(cringParser.RetStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpConclusin}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpConclusin(cringParser.ExpConclusinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallMethodConlusin}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMethodConlusin(cringParser.CallMethodConlusinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityConclusion}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityConclusion(cringParser.EqualityConclusionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreThenConclusion}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreThenConclusion(cringParser.MoreThenConclusionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThenConclusion}
	 * labeled alternative in {@link cringParser#parametr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThenConclusion(cringParser.LessThenConclusionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#parametrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrs(cringParser.ParametrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#parametrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrList(cringParser.ParametrListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(cringParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallMethodExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMethodExpr(cringParser.CallMethodExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarnameExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarnameExpr(cringParser.VarnameExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(cringParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(cringParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(cringParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(cringParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(cringParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinusExpr}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(cringParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(cringParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(cringParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#intLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(cringParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#charLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(cringParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(cringParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(cringParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(cringParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarname(cringParser.VarnameContext ctx);
}