package io.compiler.core.ast;

import io.compiler.core.operators.BinaryOperator;
import io.compiler.types.Type;
import io.interpreter.Value;

public class BinaryExpressionNode extends AstNode {
    private AstNode left;
    private AstNode right;
    private final BinaryOperator operator;

    public BinaryExpressionNode(AstNode left, BinaryOperator operator, AstNode right) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public BinaryExpressionNode(char operator) {
        this.operator = BinaryOperator.fromString(String.valueOf(operator));
    }

    public BinaryExpressionNode(BinaryOperator operator) {
        this.operator = operator;
    }

    public AstNode getLeft() {
        return left;
    }

    public void setLeft(AstNode left) {
        this.left = left;
    }

    public AstNode getRight() {
        return right;
    }

    public void setRight(AstNode right) {
        this.right = right;
    }

    public BinaryOperator getOperator() {
        return operator;
    }

    @Override
    public String generateCTarget() {
        return switch (operator) {
            case Addition -> left.generateCTarget() + " + " + right.generateCTarget();
            case Subtraction -> left.generateCTarget() + " - " + right.generateCTarget();
            case Multiplication -> left.generateCTarget() + " * " + right.generateCTarget();
            case Division -> left.generateCTarget() + " / " + right.generateCTarget();
            case Modulo -> left.generateCTarget() + " % " + right.generateCTarget();
            case LessThan -> left.generateCTarget() + " < " + right.generateCTarget();
            case LessThanOrEqual -> left.generateCTarget() + " <= " + right.generateCTarget();
            case GreaterThan -> left.generateCTarget() + " > " + right.generateCTarget();
            case GreaterThanOrEqual -> left.generateCTarget() + " >= " + right.generateCTarget();
            case Equals -> left.generateCTarget() + " == " + right.generateCTarget();
            case NotEquals -> left.generateCTarget() + " != " + right.generateCTarget();
            case And -> left.generateCTarget() + " && " + right.generateCTarget();
            case Or -> left.generateCTarget() + " || " + right.generateCTarget();
        };
    }

    @Override
    public String generateJavaTarget() {
        return switch (operator) {
            case Addition -> left.generateJavaTarget() + " + " + right.generateJavaTarget();
            case Subtraction -> left.generateJavaTarget() + " - " + right.generateJavaTarget();
            case Multiplication -> left.generateJavaTarget() + " * " + right.generateJavaTarget();
            case Division -> left.generateJavaTarget() + " / " + right.generateJavaTarget();
            case Modulo -> left.generateJavaTarget() + " % " + right.generateJavaTarget();
            case LessThan -> left.generateJavaTarget() + " < " + right.generateJavaTarget();
            case LessThanOrEqual -> left.generateJavaTarget() + " <= " + right.generateJavaTarget();
            case GreaterThan -> left.generateJavaTarget() + " > " + right.generateJavaTarget();
            case GreaterThanOrEqual -> left.generateJavaTarget() + " >= " + right.generateJavaTarget();
            case Equals -> left.generateJavaTarget() + " == " + right.generateJavaTarget();
            case NotEquals -> left.generateJavaTarget() + " != " + right.generateJavaTarget();
            case And -> left.generateJavaTarget() + " && " + right.generateJavaTarget();
            case Or -> left.generateJavaTarget() + " || " + right.generateJavaTarget();
        };
    }

    @Override
    public Value interpret() throws Exception {
        var leftValue = left.interpret();
        var rightValue = right.interpret();

        switch (operator) {
            case Addition: {
                if (leftValue.is(Type.Integer) && rightValue.is(Type.Integer)) {
                    var leftInt = (int) leftValue.getValue();
                    var rightInt = (int) rightValue.getValue();

                    return new Value(Type.Integer, leftInt + rightInt);
                }

                if (leftValue.is(Type.Float) && rightValue.is(Type.Float)) {
                    var leftFloat = (float) leftValue.getValue();
                    var rightFloat = (float) rightValue.getValue();

                    return new Value(Type.Float, leftFloat + rightFloat);
                }

                // TODO: custom exceptions
                throw new Exception("Invalid operation: Addition between " + leftValue.getType() + " and " + rightValue.getType());
            }
            case Subtraction: {
                if (leftValue.is(Type.Integer) && rightValue.is(Type.Integer)) {
                    var leftInt = (int) leftValue.getValue();
                    var rightInt = (int) rightValue.getValue();

                    return new Value(Type.Integer, leftInt - rightInt);
                }

                if (leftValue.is(Type.Float) && rightValue.is(Type.Float)) {
                    var leftFloat = (float) leftValue.getValue();
                    var rightFloat = (float) rightValue.getValue();

                    return new Value(Type.Float, leftFloat - rightFloat);
                }

                throw new Exception("Invalid operation: Subtraction between " + leftValue.getType() + " and " + rightValue.getType());
            }
            case Multiplication: {
                if (leftValue.is(Type.Integer) && rightValue.is(Type.Integer)) {
                    var leftInt = (int) leftValue.getValue();
                    var rightInt = (int) rightValue.getValue();

                    return new Value(Type.Integer, leftInt * rightInt);
                }

                if (leftValue.is(Type.Float) && rightValue.is(Type.Float)) {
                    var leftFloat = (float) leftValue.getValue();
                    var rightFloat = (float) rightValue.getValue();

                    return new Value(Type.Float, leftFloat * rightFloat);
                }

                throw new Exception("Invalid operation: Multiplication between " + leftValue.getType() + " and " + rightValue.getType());
            }
            case Division: {
                if (leftValue.is(Type.Integer) && rightValue.is(Type.Integer)) {
                    var leftInt = (int) leftValue.getValue();
                    var rightInt = (int) rightValue.getValue();

                    if (rightInt == 0) {
                        throw new Exception("Division by zero");
                    }

                    return new Value(Type.Integer, leftInt / rightInt);
                }

                if (leftValue.is(Type.Float) && rightValue.is(Type.Float)) {
                    var leftFloat = (float) leftValue.getValue();
                    var rightFloat = (float) rightValue.getValue();

                    if (rightFloat == 0) {
                        throw new Exception("Division by zero");
                    }

                    return new Value(Type.Float, leftFloat / rightFloat);
                }

                throw new Exception("Invalid operation: Division between " + leftValue.getType() + " and " + rightValue.getType());
            }
            case Equals: {
                return new Value(Type.Boolean, leftValue.equals(rightValue));
            }
            case NotEquals: {
                return new Value(Type.Boolean, !leftValue.equals(rightValue));
            }
            case GreaterThan: {
                if (leftValue.is(Type.Integer) && rightValue.is(Type.Integer)) {
                    var leftInt = (int) leftValue.getValue();
                    var rightInt = (int) rightValue.getValue();

                    return new Value(Type.Boolean, leftInt > rightInt);
                }

                if (leftValue.is(Type.Float) && rightValue.is(Type.Float)) {
                    var leftFloat = (float) leftValue.getValue();
                    var rightFloat = (float) rightValue.getValue();

                    return new Value(Type.Boolean, leftFloat > rightFloat);
                }

                throw new Exception("Invalid operation: GreaterThan between " + leftValue.getType() + " and " + rightValue.getType());
            }
            case GreaterThanOrEqual: {
                if (leftValue.is(Type.Integer) && rightValue.is(Type.Integer)) {
                    var leftInt = (int) leftValue.getValue();
                    var rightInt = (int) rightValue.getValue();

                    return new Value(Type.Boolean, leftInt >= rightInt);
                }

                if (leftValue.is(Type.Float) && rightValue.is(Type.Float)) {
                    var leftFloat = (float) leftValue.getValue();
                    var rightFloat = (float) rightValue.getValue();

                    return new Value(Type.Boolean, leftFloat >= rightFloat);
                }

                throw new Exception("Invalid operation: GreaterThanOrEqual between " + leftValue.getType() + " and " + rightValue.getType());
            }
            case LessThan: {
                if (leftValue.is(Type.Integer) && rightValue.is(Type.Integer)) {
                    var leftInt = (int) leftValue.getValue();
                    var rightInt = (int) rightValue.getValue();

                    return new Value(Type.Boolean, leftInt < rightInt);
                }

                if (leftValue.is(Type.Float) && rightValue.is(Type.Float)) {
                    var leftFloat = (float) leftValue.getValue();
                    var rightFloat = (float) rightValue.getValue();

                    return new Value(Type.Boolean, leftFloat < rightFloat);
                }

                throw new Exception("Invalid operation: LessThan between " + leftValue.getType() + " and " + rightValue.getType());
            }
            case LessThanOrEqual: {
                if (leftValue.is(Type.Integer) && rightValue.is(Type.Integer)) {
                    var leftInt = (int) leftValue.getValue();
                    var rightInt = (int) rightValue.getValue();

                    return new Value(Type.Boolean, leftInt <= rightInt);
                }

                if (leftValue.is(Type.Float) && rightValue.is(Type.Float)) {
                    var leftFloat = (float) leftValue.getValue();
                    var rightFloat = (float) rightValue.getValue();

                    return new Value(Type.Boolean, leftFloat <= rightFloat);
                }

                throw new Exception("Invalid operation: LessThanOrEqual between " + leftValue.getType() + " and " + rightValue.getType());
            }
            default: throw new Exception("Not implemented yet");
        }
    }
}
