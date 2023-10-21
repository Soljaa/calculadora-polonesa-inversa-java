package tree.calculator.decorator;

import tree.calculator.interpreter.Context;
import tree.calculator.interpreter.Expression;
import tree.calculator.interpreter.SubExpression;
public class Subtracao implements OperacaoAritmetica {
    @Override
    public double execute(Expression num1, Expression num2, Context context) {
        SubExpression expression = new SubExpression(num1, num2);
        return expression.interpret(context);
    }

}
