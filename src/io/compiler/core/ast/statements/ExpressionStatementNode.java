package io.compiler.core.ast.statements;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.StatementNode;
import io.interpreter.Interpreter;
import io.interpreter.Value;

public class ExpressionStatementNode extends StatementNode {
    private final AstNode expression;

    public ExpressionStatementNode(AstNode expression) {
        this.expression = expression;
    }

    public AstNode getExpression() {
        return expression;
    }

    @Override
    public String generateCTarget() {
        return expression.generateCTarget() + ";";
    }

    @Override
    public String generateJavaTarget() {
        return "var _ = " + expression.generateJavaTarget() + ";";
    }

    @Override
    public Value interpret(Interpreter interpreter) throws Exception {
        return expression.interpret(interpreter);
    }
}
