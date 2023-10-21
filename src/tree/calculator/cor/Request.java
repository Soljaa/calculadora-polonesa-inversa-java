package tree.calculator.cor;

import tree.calculator.interpreter.Context;

public class Request {
    // ATRIBUTOS
    public Double num1;
    public Double num2;
    public String operator;
    public Context context;

    // MÉTODOS
    public Request(Double num1, Double num2, String operator, Context context) {
        this.operator = operator;
        this.num1 = num1;
        this.num2 = num2;
        this.context = context;
    }

    public Double handle(){
        return new AddHandler().handleRequest(this);
    }


}
