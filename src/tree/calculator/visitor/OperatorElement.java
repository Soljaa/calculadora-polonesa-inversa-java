package tree.calculator.visitor;

public class OperatorElement implements Element{

    public char opera;

    public OperatorElement(char opera){
        this.opera = opera;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
