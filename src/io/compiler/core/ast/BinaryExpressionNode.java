package io.compiler.core.ast;

import io.compiler.core.operators.BinaryOperator;
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
        throw new Exception("Not implemented");
    }
}
