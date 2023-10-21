package tree.calculator.interpreter;

public class VarExpression implements Expression {
    public String element;

    public VarExpression(String element){
        this.element = element;
    }
    @Override
    public Double interpret(Context context) {
        try {
            return Double.parseDouble(element);
        } catch (NumberFormatException nfe) {
            return context.getVariable(element);
        }
    }
}
