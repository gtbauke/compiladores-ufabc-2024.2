package io.compiler.core.ast.expressions;

import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

public class GroupedExpressionNode extends ExpressionAstNode {
    private final ExpressionAstNode expression;

    public GroupedExpressionNode(ExpressionAstNode expression) {
        super(expression.getType());
        this.expression = expression;
    }

    public ExpressionAstNode getExpression() {
        return expression;
    }

    @Override
    public boolean isGroup() {
        return true;
    }

    @Override
    public String generateCTarget(int indent) {
        return "(" + expression.generateCTarget(0) + ")";
    }

    @Override
    public String generateJavaTarget(int indent) {
        return "(" + expression.generateJavaTarget(0) + ")";
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        return expression.interpret(interpreter);
    }
}
