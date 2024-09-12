package io.compiler.core.ast.operators;

public enum BinaryOperator {
    Addition(1),
    Subtraction(1),
    Multiplication(2),
    Division(2),
    Modulo(2),
    And(5),
    Or(6),
    Equals(4),
    NotEquals(4),
    LessThan(3),
    LessThanOrEqual(3),
    GreaterThan(3),
    GreaterThanOrEqual(3);

    private final int value;

    private BinaryOperator(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static BinaryOperator fromString(String value) {
        return switch (value) {
            case "+" -> Addition;
            case "-" -> Subtraction;
            case "*" -> Multiplication;
            case "/" -> Division;
            case "%" -> Modulo;
            case "&&" -> And;
            case "||" -> Or;
            case "==" -> Equals;
            case "!=" -> NotEquals;
            case "<" -> LessThan;
            case "<=" -> LessThanOrEqual;
            case ">" -> GreaterThan;
            case ">=" -> GreaterThanOrEqual;
            default -> throw new IllegalArgumentException("Invalid binary operator: " + value);
        };
    }
}
