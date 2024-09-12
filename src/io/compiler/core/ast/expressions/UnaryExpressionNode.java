package io.compiler.core.ast.expressions;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.operators.UnaryOperator;
import io.compiler.core.symbols.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.ExpectedValueOfTypeException;
import io.interpreter.exceptions.IsiLangRuntimeException;
import io.interpreter.exceptions.UnknownUnaryOperatorException;

public class UnaryExpressionNode extends ExpressionAstNode {
    private final UnaryOperator operator;
    private AstNode operand;

    public UnaryExpressionNode(UnaryOperator operator) {
        super(Type.Boolean);
        this.operator = operator;
        this.operand = null;
    }

    public UnaryExpressionNode(UnaryOperator operator, AstNode operand) {
        super(operand.getType());
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
        this.type = operand.getType();
    }

    @Override
    public String generateCTarget(int indent) {
        return switch (operator) {
            case NOT -> "!(" + operand.generateCTarget(0) + ")";
            case NEGATE -> "-" + operand.generateCTarget(0);
        };
    }

    @Override
    public String generateJavaTarget(int indent) {
        return switch (operator) {
            case NOT -> "!(" + operand.generateJavaTarget(0) + ")";
            case NEGATE -> "-" + operand.generateJavaTarget(0);
        };
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        var operandValue = operand.interpret(interpreter);

        if (operator == UnaryOperator.NOT) {
            if (!operandValue.is(Type.Boolean)) {
                throw new ExpectedValueOfTypeException(Type.Boolean, operandValue.type());
            }

            return new Value(Type.Boolean, !(boolean) operandValue.value());
        } else if (operator == UnaryOperator.NEGATE) {
            return switch (operandValue.type()) {
                case Integer -> new Value(Type.Integer, -(int) operandValue.value());
                case Float -> new Value(Type.Float, -(float) operandValue.value());
                default -> throw new ExpectedValueOfTypeException(Type.NUMERIC, operandValue.type());
            };
        }

        throw new UnknownUnaryOperatorException(operator);
    }
}
