package tree.calculator.cor;

import tree.calculator.decorator.Divisao;
import tree.calculator.interpreter.VarExpression;

public class DivHandler extends Handler{

    public Double handleRequest(Request request) {
        if (request.operator.equals("/")) {
            Divisao divisao = new Divisao();
            return divisao.execute(new VarExpression(request.num1.toString()), new VarExpression(request.num2.toString()), request.context);
        }
        else {
            return nextHandler.handleRequest(request);
        }
    }

}
