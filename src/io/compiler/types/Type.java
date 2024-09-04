package io.compiler.types;

import io.compiler.core.targets.ICTarget;
import io.compiler.core.targets.IJavaTarget;

public enum Type implements IJavaTarget, ICTarget {
    Integer(1),
    Float(2),
    String(3);

    private final int value;

    private Type(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static Type fromInteger(int value) {
        return switch (value) {
            case 1 -> Integer;
            case 2 -> Float;
            case 3 -> String;
            default -> throw new IllegalArgumentException("Invalid value: " + value);
        };
    }

    // TODO: how to handle pointers? We need to alloc the memory for the string and have a way of freeing it later
    @Override
    public java.lang.String generateCTarget() {
        return switch (this) {
            case Integer -> "int";
            case Float -> "float";
            case String -> "char*";
        };
    }

    @Override
    public java.lang.String generateJavaTarget() {
        return switch (this) {
            case Integer -> "int";
            case Float -> "float";
            case String -> "String";
        };
    }
}
