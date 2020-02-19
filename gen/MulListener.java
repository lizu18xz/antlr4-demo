// Generated from E:/Ideljava/githubWork/antlr4-demo/src/main/resources\Mul.g4 by ANTLR 4.8
        //�?种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类�?要包名，可以在这里统�?定义
 package antlr4mul;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MulParser}.
 */
public interface MulListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MulParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MulParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MulParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MulParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link MulParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(MulParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link MulParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(MulParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MulParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MulParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MulParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MulParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link MulParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MulParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link MulParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MulParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MulParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MulParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(MulParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(MulParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(MulParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(MulParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MulParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MulParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(MulParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(MulParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code power}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(MulParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code power}
	 * labeled alternative in {@link MulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(MulParser.PowerContext ctx);
}