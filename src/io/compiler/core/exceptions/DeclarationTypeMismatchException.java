package io.compiler.core.exceptions;

import io.compiler.core.symbols.types.Type;

public class DeclarationTypeMismatchException extends SemanticException {
    public DeclarationTypeMismatchException(String identifier, Type expected, Type received) {
        super("In declaration for " + identifier + ", expected type " + expected + " but received type " + received);
    }
}
