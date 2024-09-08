package io.compiler.core.exceptions;

import io.compiler.types.Type;

public class DeclarationTypeMismatchException extends SemanticException {
    public DeclarationTypeMismatchException(Type expected, Type received) {
        super("In declaration, expected type " + expected + " but received type " + received);
    }
}
