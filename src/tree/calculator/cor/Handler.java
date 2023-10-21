package tree.calculator.cor;

public abstract class Handler {
    // ATRIBUTOS
    public Handler nextHandler;

    // MÉTODOS
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }

    public abstract Double handleRequest(Request request);
}
