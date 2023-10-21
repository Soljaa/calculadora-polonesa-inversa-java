package tree.calculator.interpreter;

public class DivExpression implements Expression{
    private final Expression num1;
    private final Expression num2;

    public DivExpression(Expression num1, Expression num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double interpret(Context context) {
        double leftValue = num1.interpret(context);
        double rightValue = num2.interpret(context);
        return leftValue / rightValue;
    }
}
