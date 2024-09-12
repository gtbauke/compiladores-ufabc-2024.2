package io.compiler.core.exceptions;

public class ExpectedAssignmentException extends SemanticException {
    public ExpectedAssignmentException(String message) {
        super("Expected assignment " + message);
    }
}
