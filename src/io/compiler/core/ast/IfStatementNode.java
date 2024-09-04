package io.compiler.core.ast;

import java.util.List;

public class IfStatementNode extends AstNode {
    private final AstNode condition;
    private final List<AstNode> thenBranch;
    private final List<AstNode> elseBranch;

    public IfStatementNode(AstNode condition, List<AstNode> thenBranch, List<AstNode> elseBranch) {
        this.condition = condition;
        this.thenBranch = thenBranch;
        this.elseBranch = elseBranch;
    }

    public AstNode getCondition() {
        return condition;
    }

    public List<AstNode> getThenBranch() {
        return thenBranch;
    }

    public List<AstNode> getElseBranch() {
        return elseBranch;
    }

    @Override
    public String generateCTarget() {
        var builder = new StringBuilder();

        builder.append("if (");
        builder.append(condition.generateCTarget());
        builder.append(") {\n");

        for (var node : thenBranch) {
            builder.append(node.generateCTarget());
        }

        builder.append("} ");

        if (!elseBranch.isEmpty()) {
            builder.append("else {\n");

            for (var node : elseBranch) {
                builder.append(node.generateCTarget());
            }

            builder.append("}\n");
        }

        return builder.toString();
    }

    @Override
    public String generateJavaTarget() {
        var builder = new StringBuilder();

        builder.append("if (");
        builder.append(condition.generateJavaTarget());
        builder.append(") {\n");

        for (var node : thenBranch) {
            builder.append(node.generateJavaTarget());
        }

        builder.append("} ");

        if (!elseBranch.isEmpty()) {
            builder.append("else {\n");

            for (var node : elseBranch) {
                builder.append(node.generateJavaTarget());
            }

            builder.append("}\n");
        }

        return builder.toString();
    }
}
