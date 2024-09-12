package io.interpreter.exceptions;

import io.compiler.core.ast.operators.UnaryOperator;

public class UnknownUnaryOperatorException extends IsiLangRuntimeException{
    private final UnaryOperator operator;

    public UnknownUnaryOperatorException(UnaryOperator operator) {
        super("Unknown or not implemented unary operator: " + operator);
        this.operator = operator;
    }

    public UnaryOperator getOperator() {
        return operator;
    }
}
