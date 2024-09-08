package io.compiler.core.operators;

public enum UnaryOperator {
    NOT;

    public static UnaryOperator fromString(String value) {
        return switch (value) {
            case "!" -> NOT;
            default -> throw new IllegalArgumentException("Invalid unary operator: " + value);
        };
    }
}
