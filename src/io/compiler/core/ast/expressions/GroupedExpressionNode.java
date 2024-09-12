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
    public String generateCTarget() {
        return "(" + expression.generateCTarget() + ")";
    }

    @Override
    public String generateJavaTarget() {
        return "(" + expression.generateJavaTarget() + ")";
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        return expression.interpret(interpreter);
    }
}
