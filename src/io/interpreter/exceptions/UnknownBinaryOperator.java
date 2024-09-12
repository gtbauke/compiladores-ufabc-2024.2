package io.interpreter.exceptions;

import io.compiler.core.ast.operators.BinaryOperator;

public class UnknownBinaryOperator extends IsiLangRuntimeException{
    private final BinaryOperator operator;

    public UnknownBinaryOperator(BinaryOperator operator) {
        super("Unknown or not implemented binary operator: " + operator);
        this.operator = operator;
    }

    public BinaryOperator getOperator() {
        return operator;
    }
}
