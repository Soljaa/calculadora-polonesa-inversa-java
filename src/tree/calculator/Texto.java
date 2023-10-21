package tree.calculator;

public class Texto {
    // ATRIBUTOS
    private String expressao;

    // MÉTODOS
    public Texto() { // Construtor
        // Vazia. (Posso inicializar vazia)
    }
    public Texto(String expressao) { // Construtor
        this.expressao = expressao; // Posso inicializar com a expressão
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }

    public String getExpressao() {
        return expressao;
    }

}
