package tree.calculator.decorator;

import tree.calculator.interpreter.Context;
import tree.calculator.interpreter.Expression;

public interface OperacaoAritmetica {
    double execute(Expression num1, Expression num2, Context context);
}
