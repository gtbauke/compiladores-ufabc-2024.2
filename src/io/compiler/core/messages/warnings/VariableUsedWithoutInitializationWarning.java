package io.compiler.core.messages.warnings;

public class VariableUsedWithoutInitializationWarning extends Warning {
    public VariableUsedWithoutInitializationWarning(String identifier) {
        super("Variable " + identifier + " is being used without being initialized.");
    }
}
