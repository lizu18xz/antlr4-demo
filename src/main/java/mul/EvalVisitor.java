package mul;

import antlr4mul.MulBaseVisitor;
import antlr4mul.MulParser;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dalizu on 2020/2/10.
 * @version v1.0
 * @desc
 */
public class EvalVisitor extends MulBaseVisitor<Double> {
    Map<String, Double> memory = new HashMap<String, Double>();

    //id = expr
    @Override
    public Double visitAssign(MulParser.AssignContext ctx){
        String id = ctx.ID().getText();
        Double value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    // expr
    @Override
    public Double visitPrintExpr(MulParser.PrintExprContext ctx) {
        Double value = visit(ctx.expr());
        //保留两位有数字的方法
        DecimalFormat df = new DecimalFormat("#.##");
        String s_value = df.format(value);
        System.out.println(s_value);
        return 0.0;
    }

    //print
    @Override
    public Double visitPrint(MulParser.PrintContext ctx){
        String id = ctx.ID().getText();
        Double value=0.0;
        if(memory.containsKey(id)) value = memory.get(id);
        DecimalFormat df = new DecimalFormat("#.##");
        String s_value = df.format(value);
        System.out.println(s_value);
        return value;

    }

    //Number
    @Override
    public Double  visitNumber(MulParser.NumberContext ctx){
        int size = ctx.getChildCount();
        if(size == 2){
            if(ctx.sign.getType() == MulParser.SUB){
                return -1 *  Double.valueOf(ctx.getChild(1).getText());
            }else{
                return Double.valueOf(ctx.getChild(1).getText());
            }
        }else{
            return Double.valueOf(ctx.getChild(0).getText());
        }
    }

    //ID
    @Override
    public Double visitId(MulParser.IdContext ctx){
        String id = ctx.ID().getText();
        if(memory.containsKey(id)) return memory.get(id);
        return 0.0;
    }

    //expr op=('*'|'/') expr
    @Override
    public Double visitMulDiv(MulParser.MulDivContext ctx)  {
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));

        if(ctx.op.getType() == MulParser.MUL){
            return left * right;
        }else{
            if(right == 0 || right == 0.0){
                System.out.println("Divisor can not be zero");
                return 0.0;
            }else{
                return left / right;
            }
        }
    }

    //expr op=('+'|'-') expr
    @Override
    public Double visitAddSub(MulParser.AddSubContext ctx){
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));
        if(ctx.op.getType() == MulParser.ADD)
            return left + right;
        return left - right;
    }

    // '(' expr ')'
    @Override
    public Double visitParens(MulParser.ParensContext ctx){
        return visit(ctx.expr());
    }

    // '^'
    @Override
    public Double visitPower(MulParser.PowerContext ctx){
        Double base = visit(ctx.expr(0));
        Double exponet = visit(ctx.expr(1));
        return Math.pow(base, exponet);
    }


}