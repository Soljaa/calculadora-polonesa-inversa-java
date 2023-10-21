package tree.calculator.visitor;

import java.util.Stack;

public class ObjectStructure {
    private final Stack<Element> elements = new Stack<>();

    public ObjectStructure(String exp){
        char[] letters = exp.toCharArray();
        for (char letter : letters) {
            if (Character.isDigit(letter)) {
                elements.add(new NumberElement(letter));
            } else if (Character.isLetter(letter)) {
                elements.add(new NumberElement(letter));
            } else if (isOperator(letter)) {
                elements.add(new OperatorElement(letter));
            } else {
                System.out.println("Expressão inválida.");
                break;
            }
        }
    }

    private static boolean isOperator(char c) {
        return c == '*' || c == '/' || c == '+' || c == '-';
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
