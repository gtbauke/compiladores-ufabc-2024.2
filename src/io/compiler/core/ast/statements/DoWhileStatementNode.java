package io.compiler.core.ast.statements;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.StatementNode;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

import java.util.List;

public class DoWhileStatementNode extends StatementNode {
    private final List<StatementNode> body;
    private final AstNode condition;

    public DoWhileStatementNode(List<StatementNode> body, AstNode condition) {
        this.body = body;
        this.condition = condition;
    }

    public List<StatementNode> getBody() {
        return body;
    }

    public AstNode getCondition() {
        return condition;
    }

    @Override
    public String generateCTarget(int indent) {
        var builder = new StringBuilder();

        builder.append("do {\n");

        for (var statement : body) {
            builder.append("    ").append(statement.generateCTarget(0));
        }

        builder.append("} while (");
        builder.append(condition.generateCTarget(0));
        builder.append(");\n");

        return builder.toString();
    }

    @Override
    public String generateJavaTarget(int indent) {
        var builder = new StringBuilder();

        builder.append("do {\n");

        for (var statement : body) {
            builder.append("    ").append(statement.generateJavaTarget(0));
        }

        builder.append("} while (");
        builder.append(condition.generateJavaTarget(0));
        builder.append(");\n");

        return builder.toString();
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        do {
            for (var statement : body) {
                statement.interpret(interpreter);
            }
        } while (condition.interpret(interpreter).asBoolean());

        return Value.VOID;
    }
}
