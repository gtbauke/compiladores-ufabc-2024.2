package io.compiler.core.warnings;

public class UnusedVariableWarning extends Warning {
    public UnusedVariableWarning(String identifier) {
        super("Variable " + identifier + " is declared but never used.");
    }
}
