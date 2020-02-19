// Generated from E:/Ideljava/githubWork/antlr4-demo/src/main/resources\DslExpr.g4 by ANTLR 4.8
        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package antlr4ExprVisit;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DslExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DslExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DslExprParser#sta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSta(DslExprParser.StaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslExprParser#ender}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnder(DslExprParser.EnderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mdmTag}
	 * labeled alternative in {@link DslExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdmTag(DslExprParser.MdmTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callFunTag}
	 * labeled alternative in {@link DslExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunTag(DslExprParser.CallFunTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varTag}
	 * labeled alternative in {@link DslExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarTag(DslExprParser.VarTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubTag}
	 * labeled alternative in {@link DslExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubTag(DslExprParser.AddSubTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intTag}
	 * labeled alternative in {@link DslExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntTag(DslExprParser.IntTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringTag}
	 * labeled alternative in {@link DslExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTag(DslExprParser.StringTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslExprParser#funtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuntype(DslExprParser.FuntypeContext ctx);
}