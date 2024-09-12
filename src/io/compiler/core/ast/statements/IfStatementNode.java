package io.compiler.core.ast.statements;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.StatementNode;
import io.compiler.core.symbols.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

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
    public String generateCTarget(int indent) {
        var builder = new StringBuilder();

        builder.append("if (");
        builder.append(condition.generateCTarget(0));
        builder.append(") {\n");

        for (var node : thenBranch) {
            builder.append(node.generateCTarget(0));
        }

        builder.append("} ");

        if (!elseBranch.isEmpty()) {
            builder.append("else {\n");

            for (var node : elseBranch) {
                builder.append(node.generateCTarget(0));
            }

            builder.append("}\n");
        }

        return builder.toString();
    }

    @Override
    public String generateJavaTarget(int indent) {
        var builder = new StringBuilder();

        builder.append("if (");
        builder.append(condition.generateJavaTarget(0));
        builder.append(") {\n");

        for (var node : thenBranch) {
            builder.append(node.generateJavaTarget(0));
        }

        builder.append("} ");

        if (!elseBranch.isEmpty()) {
            builder.append("else {\n");

            for (var node : elseBranch) {
                builder.append(node.generateJavaTarget(0));
            }

            builder.append("}\n");
        }

        return builder.toString();
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        var condition = this.condition.interpret(interpreter);

        if (condition.is(Type.Boolean) && (boolean)condition.value()) {
            for (var node : thenBranch) {
                node.interpret(interpreter);
            }
        } else {
            for (var node : elseBranch) {
                node.interpret(interpreter);
            }
        }

        return Value.VOID;
    }
}
