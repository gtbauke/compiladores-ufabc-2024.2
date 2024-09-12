package io.compiler.core.ast.expressions;

import io.compiler.core.ast.operators.BinaryOperator;
import io.compiler.core.symbols.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.DivisionByZeroException;
import io.interpreter.exceptions.IsiLangRuntimeException;
import io.interpreter.exceptions.OperationNotDefinedForException;
import io.interpreter.exceptions.UnknownBinaryOperator;

public class BinaryExpressionNode extends ExpressionAstNode {
    private ExpressionAstNode left;
    private ExpressionAstNode right;
    private final BinaryOperator operator;

    public BinaryExpressionNode(ExpressionAstNode left, BinaryOperator operator, ExpressionAstNode right) {
        super(left.getType());
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public BinaryExpressionNode(char operator) {
        super(Type.Void);
        this.operator = BinaryOperator.fromString(String.valueOf(operator));
    }

    public BinaryExpressionNode(BinaryOperator operator) {
        super(Type.Void);
        this.operator = operator;
    }

    public ExpressionAstNode getLeft() {
        return left;
    }

    public void setLeft(ExpressionAstNode left) {
        this.left = left;
        this.type = left.getType();
    }

    public ExpressionAstNode getRight() {
        return right;
    }

    public void setRight(ExpressionAstNode right) {
        this.right = right;
    }

    public BinaryOperator getOperator() {
        return operator;
    }

    @Override
    public String generateCTarget(int indent) {
        return switch (operator) {
            case Addition -> left.generateCTarget(0) + " + " + right.generateCTarget(0);
            case Subtraction -> left.generateCTarget(0) + " - " + right.generateCTarget(0);
            case Multiplication -> left.generateCTarget(0) + " * " + right.generateCTarget(0);
            case Division -> left.generateCTarget(0) + " / " + right.generateCTarget(0);
            case Modulo -> left.generateCTarget(0) + " % " + right.generateCTarget(0);
            case LessThan -> left.generateCTarget(0) + " < " + right.generateCTarget(0);
            case LessThanOrEqual -> left.generateCTarget(0) + " <= " + right.generateCTarget(0);
            case GreaterThan -> left.generateCTarget(0) + " > " + right.generateCTarget(0);
            case GreaterThanOrEqual -> left.generateCTarget(0) + " >= " + right.generateCTarget(0);
            case Equals -> left.generateCTarget(0) + " == " + right.generateCTarget(0);
            case NotEquals -> left.generateCTarget(0) + " != " + right.generateCTarget(0);
            case And -> left.generateCTarget(0) + " && " + right.generateCTarget(0);
            case Or -> left.generateCTarget(0) + " || " + right.generateCTarget(0);
        };
    }

    @Override
    public String generateJavaTarget(int indent) {
        return switch (operator) {
            case Addition -> left.generateJavaTarget(0) + " + " + right.generateJavaTarget(0);
            case Subtraction -> left.generateJavaTarget(0) + " - " + right.generateJavaTarget(0);
            case Multiplication -> left.generateJavaTarget(0) + " * " + right.generateJavaTarget(0);
            case Division -> left.generateJavaTarget(0) + " / " + right.generateJavaTarget(0);
            case Modulo -> left.generateJavaTarget(0) + " % " + right.generateJavaTarget(0);
            case LessThan -> left.generateJavaTarget(0) + " < " + right.generateJavaTarget(0);
            case LessThanOrEqual -> left.generateJavaTarget(0) + " <= " + right.generateJavaTarget(0);
            case GreaterThan -> left.generateJavaTarget(0) + " > " + right.generateJavaTarget(0);
            case GreaterThanOrEqual -> left.generateJavaTarget(0) + " >= " + right.generateJavaTarget(0);
            case Equals -> left.generateJavaTarget(0) + " == " + right.generateJavaTarget(0);
            case NotEquals -> left.generateJavaTarget(0) + " != " + right.generateJavaTarget(0);
            case And -> left.generateJavaTarget(0) + " && " + right.generateJavaTarget(0);
            case Or -> left.generateJavaTarget(0) + " || " + right.generateJavaTarget(0);
        };
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        var leftValue = left.interpret(interpreter);
        var rightValue = right.interpret(interpreter);

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

                throw new OperationNotDefinedForException.Addition(leftValue.getType(), rightValue.getType());
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

                throw new OperationNotDefinedForException.Subtraction(leftValue.getType(), rightValue.getType());
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

                throw new OperationNotDefinedForException.Multiplication(leftValue.getType(), rightValue.getType());
            }
            case Division: {
                if (leftValue.is(Type.Integer) && rightValue.is(Type.Integer)) {
                    var leftInt = (int) leftValue.getValue();
                    var rightInt = (int) rightValue.getValue();

                    if (rightInt == 0) {
                        throw new DivisionByZeroException();
                    }

                    return new Value(Type.Integer, leftInt / rightInt);
                }

                if (leftValue.is(Type.Float) && rightValue.is(Type.Float)) {
                    var leftFloat = (float) leftValue.getValue();
                    var rightFloat = (float) rightValue.getValue();

                    if (rightFloat == 0) {
                        throw new DivisionByZeroException();
                    }

                    return new Value(Type.Float, leftFloat / rightFloat);
                }

                throw new OperationNotDefinedForException.Division(leftValue.getType(), rightValue.getType());
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

                throw new OperationNotDefinedForException.GreaterThan(leftValue.getType(), rightValue.getType());
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

                throw new OperationNotDefinedForException.GreaterThanOrEqual(leftValue.getType(), rightValue.getType());
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

                throw new OperationNotDefinedForException.LessThan(leftValue.getType(), rightValue.getType());
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

                throw new OperationNotDefinedForException.LessThanOrEqual(leftValue.getType(), rightValue.getType());
            }
            case And: {
                if (leftValue.is(Type.Boolean) && rightValue.is(Type.Boolean)) {
                    var leftBool = (boolean) leftValue.getValue();
                    var rightBool = (boolean) rightValue.getValue();

                    return new Value(Type.Boolean, leftBool && rightBool);
                }

                throw new OperationNotDefinedForException.And(leftValue.getType(), rightValue.getType());
            }
            case Or: {
                if (leftValue.is(Type.Boolean) && rightValue.is(Type.Boolean)) {
                    var leftBool = (boolean) leftValue.getValue();
                    var rightBool = (boolean) rightValue.getValue();

                    return new Value(Type.Boolean, leftBool || rightBool);
                }

                throw new OperationNotDefinedForException.Or(leftValue.getType(), rightValue.getType());
            }
            default: throw new UnknownBinaryOperator(operator);
        }
    }
}
