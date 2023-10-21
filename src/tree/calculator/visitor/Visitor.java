package tree.calculator.visitor;

public interface Visitor {

    void visit(NumberElement num);
    void visit(OperatorElement opera);
}
