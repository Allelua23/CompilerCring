// Generated from E:/IntelliJ IDEA Community Edition 2019.2.4/Kurs/src/grammatic\cring.g4 by ANTLR 4.8

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
	 * Visit a parse tree produced by {@link cringParser#consts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsts(cringParser.ConstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(cringParser.FunctionsContext ctx);
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
	 * Visit a parse tree produced by the {@code ExpConclusin}
	 * labeled alternative in {@link cringParser#conc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpConclusin(cringParser.ExpConclusinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallMethodConlusin}
	 * labeled alternative in {@link cringParser#conc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMethodConlusin(cringParser.CallMethodConlusinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualsConclusion}
	 * labeled alternative in {@link cringParser#conc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsConclusion(cringParser.EqualsConclusionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreThenConclusion}
	 * labeled alternative in {@link cringParser#conc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreThenConclusion(cringParser.MoreThenConclusionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThenConclusion}
	 * labeled alternative in {@link cringParser#conc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThenConclusion(cringParser.LessThenConclusionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#concList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcList(cringParser.ConcListContext ctx);
	/**
	 * Visit a parse tree produced by {@link cringParser#parametrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrList(cringParser.ParametrListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SummExpression}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummExpression(cringParser.SummExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpression}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(cringParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallMethodExpression}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMethodExpression(cringParser.CallMethodExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarNameExpression}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarNameExpression(cringParser.VarNameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(cringParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(cringParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultipliesExpression}
	 * labeled alternative in {@link cringParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipliesExpression(cringParser.MultipliesExpressionContext ctx);
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