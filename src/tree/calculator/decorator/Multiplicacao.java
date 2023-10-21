package tree.calculator.decorator;

import tree.calculator.interpreter.Context;
import tree.calculator.interpreter.Expression;
import tree.calculator.interpreter.MultExpression;

public class Multiplicacao implements OperacaoAritmetica {
    @Override
    public double execute(Expression num1, Expression num2, Context context) {
        MultExpression expression = new MultExpression(num1, num2);
        return expression.interpret(context);
    }

}
