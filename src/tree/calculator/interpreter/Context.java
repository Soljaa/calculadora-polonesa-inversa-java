package tree.calculator.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<String, Double> variables;

    public Context() {
        variables = new HashMap<>();
    }

    public void setVariable(String variable, Double value) {
        variables.put(variable, value);
    }

    public double getVariable(String variable) {
        if (!variables.containsKey(variable)) {
            throw new IllegalArgumentException("Variable not found: " + variable);
        }
        return variables.get(variable);
    }
}
