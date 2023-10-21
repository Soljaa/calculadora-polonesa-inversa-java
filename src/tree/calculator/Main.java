package tree.calculator;

import tree.calculator.visitor.Calculator;

public class Main {
    public static void main(String[] args) {
        Texto exp = new Texto("2 3 + 4 * a - b *");
        Calculator calc = new Calculator(exp);
        calc.context.setVariable("a",4.0);
        calc.context.setVariable("b",2.5);
        String result = calc.calculate();

        System.out.println(result);
    }

}
