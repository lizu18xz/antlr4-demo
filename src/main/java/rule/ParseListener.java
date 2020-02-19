package rule;

import antlr4.DslBaseListener;
import antlr4.DslLexer;
import antlr4.DslParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;

/**
 * @author dalizu on 2020/2/9.
 * @version v1.0
 * @desc
 */
public class ParseListener extends DslBaseListener {


    @Override
    public void enterSql(DslParser.SqlContext ctx) {
        String keyword = ctx.children.get(0).getText();  //获取sql规则的第一个元素，为select或者load

        System.out.println(keyword);

        if("select".equalsIgnoreCase(keyword)){
            execSelect(ctx);   //第一个元素为selece的时候执行select
        }else if("load".equalsIgnoreCase(keyword)){
            execLoad(ctx);  //第一个元素为load的时候执行load
        }

    }

    private void execLoad(DslParser.SqlContext ctx) {

        List<ParseTree> children = ctx.children;   //获取该规则树的所有子节点
        String format = "";
        String path = "";
        String tableName = "";
        for (ParseTree c :children) {
            if(c instanceof DslParser.FormatContext){
                format = c.getText();
            }else if(c instanceof DslParser.PathContext){
                path = c.getText().substring(1,c.getText().length()-1);
            }else if(c instanceof DslParser.TableNameContext){
                tableName = c.getText();
            }
        }
        System.out.println(format);
        System.out.println(path);
        System.out.println(tableName);


    }

    private void execSelect(DslParser.SqlContext ctx) {


    }


    public static void main(String[] args) {

        //(sta (sql load (format (identifier json)) . (path (quotedIdentifier `F:\\tmp\\user`)) (as as) (tableName (identifier temp))) (ender ;))

        String sql = "load json.`F:\\tmp\\user` as 121;";
        CodePointCharStream input = CharStreams.fromString(sql);
        DslLexer lexer = new DslLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DslParser parser = new DslParser(tokens);
        DslParser.SqlContext tree = parser.sql();
        ParseListener listener = new ParseListener();
        ParseTreeWalker.DEFAULT.walk(listener,tree);  //规则树遍历



    }


}
