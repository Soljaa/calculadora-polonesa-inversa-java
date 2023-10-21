package tree.calculator.visitor;

import tree.calculator.Texto;
import tree.calculator.cor.Request;
import tree.calculator.interpreter.Context;
import tree.calculator.interpreter.VarExpression;

public class Calculator implements Visitor {
    public Texto exp = new Texto(); //public String exp;
    public Context context = new Context();
    public String num1 = null;
    public String num2;

    public Calculator(Texto exp) {
        // formata a entrada para retirar espaços
        this.exp.setExpressao(exp.getExpressao().replace(" ",""));
    }

    public String calculate(){
        ObjectStructure stack = new ObjectStructure(exp.getExpressao());
        stack.accept(this);
        return num1;
    }

    @Override
    public void visit(NumberElement num) {
        if(num1 == null){
            num1 = String.valueOf(num.num);
        }else{
            num2 = String.valueOf(num.num);
        }
    }

    @Override
    public void visit(OperatorElement opera) {
        // interpretar
        Double value1 = new VarExpression(num1).interpret(context);
        Double value2 = new VarExpression(num2).interpret(context);
        Request request = new Request(value1, value2, String.valueOf(opera.opera), context);
        num1 = String.valueOf(request.handle());
    }
}
