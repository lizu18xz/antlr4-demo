// Generated from E:/Ideljava/githubWork/antlr4-demo/src/main/resources\Mul.g4 by ANTLR 4.8
        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package antlr4mul;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MulParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MulVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MulParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MulParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link MulParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(MulParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MulParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MulParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link MulParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MulParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MulParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(MulParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(MulParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(MulParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MulParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code power}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(MulParser.PowerContext ctx);
}