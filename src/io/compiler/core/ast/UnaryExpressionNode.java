package io.compiler.core.ast;

import io.compiler.core.operators.UnaryOperator;
import io.compiler.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;

import java.util.Objects;

public class UnaryExpressionNode extends AstNode {
    private final UnaryOperator operator;
    private AstNode operand;

    public UnaryExpressionNode(UnaryOperator operator) {
        super(Type.Boolean);
        this.operator = operator;
        this.operand = null;
    }

    public UnaryExpressionNode(UnaryOperator operator, AstNode operand) {
        super(operand.type);
        this.operator = operator;
        this.operand = operand;
    }

    public UnaryOperator getOperator() {
        return operator;
    }

    public AstNode getOperand() {
        return operand;
    }

    public void setOperand(AstNode operand) {
        this.operand = operand;
        this.type = operand.type;
    }

    @Override
    public String generateCTarget() {
        return switch (operator) {
            case NOT -> "!(" + operand.generateCTarget() + ")";
        };
    }

    @Override
    public String generateJavaTarget() {
        return switch (operator) {
            case NOT -> "!(" + operand.generateJavaTarget() + ")";
        };
    }

    @Override
    public Value interpret(Interpreter interpreter) throws Exception {
        var operandValue = operand.interpret(interpreter);

        if (Objects.requireNonNull(operator) == UnaryOperator.NOT) {
            if (!operandValue.is(Type.Boolean)) {
                throw new Exception("Invalid operand type for unary operator: " + operator);
            }

            return new Value(Type.Boolean, !(boolean) operandValue.getValue());
        }

        throw new Exception("Invalid unary operator: " + operator);
    }
}
