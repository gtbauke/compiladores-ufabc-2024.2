package io.compiler.core.messages.exceptions;

public class BreakOutsideLoopException extends SemanticException {
    public BreakOutsideLoopException() {
        super("Break statement outside loop");
    }
}
