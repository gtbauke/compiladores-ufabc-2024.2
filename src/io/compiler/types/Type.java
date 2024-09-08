package io.compiler.types;

import io.compiler.core.targets.ICTarget;
import io.compiler.core.targets.IJavaTarget;

public enum Type implements IJavaTarget, ICTarget {
    Integer(1),
    Float(2),
    String(3),
    Boolean(4),
    Void(5);

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
            case 4 -> Boolean;
            case 5 -> Void;
            default -> throw new IllegalArgumentException("Invalid value: " + value);
        };
    }

    public static Type fromString(String value) {
        return switch (value) {
            case "int" -> Integer;
            case "float" -> Float;
            case "string" -> String;
            case "bool" -> Boolean;
            case "void" -> Void;
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
            case Boolean -> "bool";
            case Void -> "void";
        };
    }

    @Override
    public java.lang.String generateJavaTarget() {
        return switch (this) {
            case Integer, Boolean -> "int";
            case Float -> "float";
            case String -> "String";
            case Void -> "void";
        };
    }
}
