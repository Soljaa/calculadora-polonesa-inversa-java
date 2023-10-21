package tree.calculator.decorator;

import tree.calculator.interpreter.AddExpression;
import tree.calculator.interpreter.Context;
import tree.calculator.interpreter.Expression;

public class Adicao implements OperacaoAritmetica {
    @Override
    public double execute(Expression num1, Expression num2, Context context) {
        AddExpression expression = new AddExpression(num1, num2);
        return expression.interpret(context);
    }

}
