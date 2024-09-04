package io.compiler.core.ast;

import io.interpreter.Value;

import java.util.List;

public class WhileStatementNode extends AstNode {
    private final AstNode condition;
    private final List<AstNode> body;

    public WhileStatementNode(AstNode condition, List<AstNode> body) {
        this.condition = condition;
        this.body = body;
    }

    public AstNode getCondition() {
        return condition;
    }

    public List<AstNode> getBody() {
        return body;
    }

    @Override
    public String generateCTarget() {
        StringBuilder builder = new StringBuilder();

        builder.append("while (");
        builder.append(condition.generateCTarget());
        builder.append(") {\n");

        for (AstNode node : body) {
            builder.append(node.generateCTarget());
        }

        builder.append("}\n");

        return builder.toString();
    }

    @Override
    public String generateJavaTarget() {
        StringBuilder builder = new StringBuilder();

        builder.append("while (");
        builder.append(condition.generateJavaTarget());
        builder.append(") {\n");

        for (AstNode node : body) {
            builder.append(node.generateJavaTarget());
        }

        builder.append("}\n");

        return builder.toString();
    }

    @Override
    public Value interpret() throws Exception {
        throw new Exception("Not implemented");
    }
}
