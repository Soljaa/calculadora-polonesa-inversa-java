package tree.calculator.visitor;

public class NumberElement implements Element{

    public char num;

    public NumberElement(char num){
        this.num = num;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
