package io.compiler.core.exceptions;

import io.compiler.types.Type;

public class AssignmentTypeMismatchException extends SemanticException {
    public AssignmentTypeMismatchException(Type expected, Type received) {
        super("In assignment, expected type " + expected + " but received type " + received);
    }
}