package io.compiler.core.messages.exceptions;

public class ContinueOutsideLoopException extends SemanticException {
    public ContinueOutsideLoopException() {
        super("Continue statement outside loop");
    }
}
