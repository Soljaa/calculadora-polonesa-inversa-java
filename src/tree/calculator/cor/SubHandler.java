package tree.calculator.cor;

import tree.calculator.decorator.Subtracao;
import tree.calculator.interpreter.VarExpression;

public class SubHandler extends Handler{

    public SubHandler(){
        setNextHandler(new MultHandler());
    }

    public Double handleRequest(Request request) {
        if (request.operator.equals("-")) {
            Subtracao subtracao = new Subtracao();
            return subtracao.execute(new VarExpression(request.num1.toString()), new VarExpression(request.num2.toString()), request.context);
        }
        else {
            return nextHandler.handleRequest(request);
        }
    }

}
