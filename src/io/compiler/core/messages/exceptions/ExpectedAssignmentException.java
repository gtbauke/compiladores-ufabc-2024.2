package io.compiler.core.messages.exceptions;

public class ExpectedAssignmentException extends SemanticException {
    public ExpectedAssignmentException(String message) {
        super("Expected assignment " + message);
    }
}
