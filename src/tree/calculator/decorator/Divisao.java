package tree.calculator.decorator;

import tree.calculator.interpreter.Context;
import tree.calculator.interpreter.DivExpression;
import tree.calculator.interpreter.Expression;

public class Divisao implements OperacaoAritmetica {
    @Override
    public double execute(Expression num1, Expression num2, Context context) {
        DivExpression expression = new DivExpression(num1, num2);
        return expression.interpret(context);
    }

}
