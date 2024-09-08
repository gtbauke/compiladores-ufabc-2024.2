package io.compiler.core.ast.statements;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.StatementNode;
import io.compiler.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;

import java.util.List;

public class IfStatementNode extends StatementNode {
    private final AstNode condition;
    private final List<StatementNode> thenBranch;
    private final List<StatementNode> elseBranch;

    public IfStatementNode(AstNode condition, List<StatementNode> thenBranch, List<StatementNode> elseBranch) {
        this.condition = condition;
        this.thenBranch = thenBranch;
        this.elseBranch = elseBranch;
    }

    public AstNode getCondition() {
        return condition;
    }

    public List<StatementNode> getThenBranch() {
        return thenBranch;
    }

    public List<StatementNode> getElseBranch() {
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

    @Override
    public Value interpret(Interpreter interpreter) throws Exception {
        var condition = this.condition.interpret(interpreter);

        if (condition.is(Type.Boolean) && (boolean)condition.getValue()) {
            for (var node : thenBranch) {
                node.interpret(interpreter);
            }
        } else {
            for (var node : elseBranch) {
                node.interpret(interpreter);
            }
        }

        return new Value(Type.Void, null);
    }
}
