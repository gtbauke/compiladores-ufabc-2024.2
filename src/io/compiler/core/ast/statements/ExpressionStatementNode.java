package io.compiler.core.ast.statements;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.StatementNode;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

public class ExpressionStatementNode extends StatementNode {
    private final AstNode expression;

    public ExpressionStatementNode(AstNode expression) {
        this.expression = expression;
    }

    public AstNode getExpression() {
        return expression;
    }

    @Override
    public String generateCTarget(int indent) {
        return expression.generateCTarget(0) + ";";
    }

    @Override
    public String generateJavaTarget(int indent) {
        return "var _ = " + expression.generateJavaTarget(0) + ";";
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        return expression.interpret(interpreter);
    }
}
