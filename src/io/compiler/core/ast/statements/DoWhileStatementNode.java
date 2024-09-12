package io.compiler.core.ast.statements;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.StatementNode;
import io.compiler.core.symbols.types.Type;
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

                if (interpreter.shouldBreak()) {
                    interpreter.setShouldBreak(false);
                    return Value.VOID;
                }

                if (interpreter.shouldContinue()) {
                    interpreter.setShouldContinue(false);
                    break;
                }
            }
        } while (condition.interpret(interpreter).asBoolean());

        return Value.VOID;
    }
}
