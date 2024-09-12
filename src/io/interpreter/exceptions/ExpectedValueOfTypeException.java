package io.interpreter.exceptions;

import io.compiler.core.symbols.types.Type;

import java.util.Arrays;

public class ExpectedValueOfTypeException extends IsiLangRuntimeException {
    private final Type[] expectedType;
    private final Type actualType;

    public ExpectedValueOfTypeException(Type[] expectedType, Type actualType) {
        super("Expected value to be of one of the following types: " +
                Arrays.stream(expectedType).map(Enum::toString) + ", but got: " + actualType);

        this.expectedType = expectedType;
        this.actualType = actualType;
    }

    public ExpectedValueOfTypeException(Type expectedType, Type actualType) {
        this(new Type[] { expectedType }, actualType);
    }

    public Type[] getExpectedType() {
        return expectedType;
    }

    public Type getActualType() {
        return actualType;
    }
}
