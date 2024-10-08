package io.compiler.core.symbols.types;

import io.compiler.targets.c.CTargetable;
import io.compiler.targets.java.JavaTargetable;

public enum Type implements JavaTargetable, CTargetable {
    Integer(1),
    Float(2),
    String(3),
    Boolean(4),
    Void(5);

    public static final Type[] NUMERIC = {Integer, Float};
    private final int value;

    private Type(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static Type fromString(String value) {
        return switch (value) {
            case "int" -> Integer;
            case "float" -> Float;
            case "string" -> String;
            case "boolean" -> Boolean;
            case "void" -> Void;
            default -> throw new IllegalArgumentException("Invalid value: " + value);
        };
    }

    @Override
    public java.lang.String generateCTarget(int indent) {
        return switch (this) {
            case Integer, Boolean -> "int";
            case Float -> "double";
            case String -> "char*";
            case Void -> "void";
            default -> throw new IllegalArgumentException("Invalid value: " + this);
        };
    }

    @Override
    public java.lang.String generateJavaTarget(int indent) {
        return switch (this) {
            case Integer -> "int";
            case Float -> "double";
            case String -> "String";
            case Void -> "void";
            case Boolean -> "boolean";
            default -> throw new IllegalArgumentException("Invalid value: " + this);
        };
    }
}
