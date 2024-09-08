package io.compiler.core.warnings;

public class VariableUsedWithoutInitializationWarning extends Warning {
    public VariableUsedWithoutInitializationWarning(String identifier) {
        super("Variable " + identifier + " is being used without being initialized.");
    }
}
