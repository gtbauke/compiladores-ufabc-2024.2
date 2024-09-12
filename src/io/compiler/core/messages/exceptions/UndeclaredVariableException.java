package io.compiler.core.messages.exceptions;

public class UndeclaredVariableException extends RuntimeException{
    public UndeclaredVariableException(String identifier) {
        super("Variable " + identifier + " was not declared");
    }
}
