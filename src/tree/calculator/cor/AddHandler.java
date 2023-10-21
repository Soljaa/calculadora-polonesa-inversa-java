package tree.calculator.cor;

import tree.calculator.decorator.Adicao;
import tree.calculator.interpreter.VarExpression;

public class AddHandler extends Handler {
    public AddHandler(){
        setNextHandler(new SubHandler());
    }

    public Double handleRequest(Request request) {
        if (request.operator.equals("+")) {
            Adicao adicao = new Adicao();
            return adicao.execute(new VarExpression(request.num1.toString()), new VarExpression(request.num2.toString()), request.context);
        }
        else {
            return nextHandler.handleRequest(request);
        }
    }

}
