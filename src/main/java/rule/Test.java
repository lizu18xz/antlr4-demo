package rule;

import antlr4.DslLexer;
import antlr4.DslParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author dalizu on 2020/2/8.
 * @version v1.0
 * @desc
 */
public class Test {

    public static void main(String[] args) {

        String sql= "load json.`F:\\tmp\\user` as 121;";
        //ANTLRInputStream input = new ANTLRInputStream(sql);  //将输入转成antlr的input流

        CodePointCharStream input= CharStreams.fromString(sql);
        DslLexer lexer = new DslLexer(input);  //词法分析
        CommonTokenStream tokens = new CommonTokenStream(lexer);  //转成token流
        DslParser parser = new DslParser(tokens); // 语法分析
        DslParser.StaContext tree = parser.sta();  //获取某一个规则树，这里获取的是最外层的规则，也可以通过sql()获取sql规则树......


        System.out.println(tree.toStringTree(parser)); //打印规则数

        //sta 下面只有一层sql
        for (ParseTree c :tree.children) {

            if(c instanceof DslParser.SqlContext){
                System.out.println("ssssssss"+c.getText());
            }
        }
    }


}
