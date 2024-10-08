package io.compiler.core.messages.exceptions;

import io.compiler.core.symbols.types.Type;

public class AssignmentTypeMismatchException extends SemanticException {
    public AssignmentTypeMismatchException(Type expected, Type received) {
        super("In assignment, expected type " + expected + " but received type " + received);
    }
}