package tree.calculator.cor;

public class MultHandler extends Handler {

    public MultHandler(){
        setNextHandler(new DivHandler());
    }

    public Double handleRequest(Request request) {
        if (request.operator.equals("*")) {
            return request.num1 * request.num2;
        }
        else {
            return nextHandler.handleRequest(request);
        }
    }

}
