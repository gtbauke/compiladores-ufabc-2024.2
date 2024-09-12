package io.compiler.core.messages.warnings;

public class UnusedVariableWarning extends Warning {
    public UnusedVariableWarning(String identifier) {
        super("Variable " + identifier + " is declared but never used.");
    }
}
