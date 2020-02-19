/*
package exprVisit;

import antlr4ExprVisit.DslExprLexer;
import antlr4ExprVisit.DslExprParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

*/
/**
 * @author dalizu on 2020/2/9.
 * @version v1.0
 * @desc
 *//*

public class Test {

    public static void main(String[] args) {

        Integer A=8;
        String expr= "ISNULL ( ISDATE (`"+A+"`) );";

        //String expr= "SUBSTR (`abc` , 11);";

        //(sta (expr SUBSTR ( (content (quotedIdentifier `abc`)) , (index (identifier 11)) )) (ender ;))

        //  (content (quotedIdentifier `abc`))    (index (identifier 11))
        //String expr= "ISDATE (`"+A+"`);";

        CodePointCharStream input= CharStreams.fromString(expr);
        DslExprLexer lexer = new DslExprLexer(input);  //词法分析
        CommonTokenStream tokens = new CommonTokenStream(lexer);  //转成token流
        DslExprParser parser = new DslExprParser(tokens); // 语法分析
        DslExprParser.StaContext tree = parser.sta();  //获取某一个规则树，这里获取的是最外层的规则

        System.out.println(tree.toStringTree(parser)); //打印规则数

        System.out.println(tree.expr().size()); //打印规则数
        for (ParseTree pt: tree.children){
            System.out.println(pt.getText());
            if(pt instanceof DslExprParser.ExprContext){

              System.out.println(((DslExprParser.ExprContext) pt).expr().children.size());
              List<ParseTree>list=((DslExprParser.ExprContext) pt).expr().children;
                for (ParseTree s: list){
                    System.out.println("--"+s.getText());
                }
            }


        }


    }


}
*/
