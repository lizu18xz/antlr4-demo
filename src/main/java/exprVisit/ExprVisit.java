package exprVisit;

import antlr4ExprVisit.DslExprBaseVisitor;
import antlr4ExprVisit.DslExprLexer;
import antlr4ExprVisit.DslExprParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * @author dalizu on 2020/2/9.
 * @version v1.0
 * @desc
 */
public class ExprVisit extends DslExprBaseVisitor<Object> {

    @Override
    public Object visitSta(DslExprParser.StaContext ctx) {

        Object value = visit(ctx.expr(0));

        return value;

    }

    @Override
    public Object visitCallFunTag(DslExprParser.CallFunTagContext ctx) {
        String func=ctx.children.get(0).getText();
        System.out.println("visitCallFunTag:"+func);
        List<DslExprParser.ExprContext>exprContextList=ctx.expr();

        if(exprContextList != null){
            int counter = 0;
            int size = exprContextList.size();
            for (DslExprParser.ExprContext context:exprContextList){
                visit(context);
                if (counter != size - 1) {
                    System.out.println(",");
                    counter++;
                }
            }
        }

        return null;
    }

    @Override
    public Object visitVarTag(DslExprParser.VarTagContext ctx) {
        System.out.println("visitVarTag:"+ctx.getText());


        return null;
    }

    @Override
    public Object visitIntTag(DslExprParser.IntTagContext ctx) {

        System.out.println("visitIntTag:"+ctx.getText());


        return null;
    }

    @Override
    public Object visitStringTag(DslExprParser.StringTagContext ctx) {

        System.out.println("visitStringTag:"+ctx.getText());

        return null;
    }

    @Override
    public Object visitAddSubTag(DslExprParser.AddSubTagContext ctx) {
        System.out.println("visitAddSubTag");

        visit(ctx.expr(0));
        System.out.println(ctx.op.getText());
        visit(ctx.expr(1));
        return null;
    }

    @Override
    public Object visitMdmTag(DslExprParser.MdmTagContext ctx) {
        System.out.println("visitMdmTag");
        String op = ctx.MDM().getText();
        visit(ctx.expr(0));
        System.out.println(op);
        visit(ctx.expr(1));

        return null;
    }

    public static void main(String[] args) {

        String expr="sub(2,3) + 1;";

        String expr2="sub(replace(222,2,3),3);";

        String expr3="replace(2,3) + 1;";

        String expr4="length(replace(3332,2,3)) + 1;";

        String expr5="equals('abc',replace(3332,2,3));";

        String expr6="3 % 4;";

        CodePointCharStream input= CharStreams.fromString(expr6);
        DslExprLexer lexer = new DslExprLexer(input);  //词法分析
        CommonTokenStream tokens = new CommonTokenStream(lexer);  //转成token流
        DslExprParser parser = new DslExprParser(tokens); // 语法分析
        DslExprParser.StaContext tree = parser.sta();
        ExprVisit visitor=new ExprVisit();
        Object res= visitor.visit(tree);

    }


}
