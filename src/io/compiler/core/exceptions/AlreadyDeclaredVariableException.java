package io.compiler.core.exceptions;

public class AlreadyDeclaredVariableException extends SemanticException {
    public AlreadyDeclaredVariableException(String identifier) {
        super("Variable '" + identifier + "' already declared");
    }
}
