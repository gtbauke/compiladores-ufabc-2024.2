package io.compiler.core.operators;

public enum UnaryOperator {
    NOT,
    NEGATE;

    public static UnaryOperator fromString(String value) {
        return switch (value) {
            case "!" -> NOT;
            case "-" -> NEGATE;
            default -> throw new IllegalArgumentException("Invalid unary operator: " + value);
        };
    }
}
