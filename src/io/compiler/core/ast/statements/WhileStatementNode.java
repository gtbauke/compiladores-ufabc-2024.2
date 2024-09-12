package io.compiler.core.ast.statements;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.StatementNode;
import io.compiler.core.symbols.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

import java.util.List;

public class WhileStatementNode extends StatementNode {
    private final AstNode condition;
    private final List<StatementNode> body;

    public WhileStatementNode(AstNode condition, List<StatementNode> body) {
        this.condition = condition;
        this.body = body;
    }

    public AstNode getCondition() {
        return condition;
    }

    public List<StatementNode> getBody() {
        return body;
    }

    @Override
    public String generateCTarget(int indent) {
        StringBuilder builder = new StringBuilder();

        builder.append("while (");
        builder.append(condition.generateCTarget(0));
        builder.append(") {\n");

        for (AstNode node : body) {
            builder.append(node.generateCTarget(0));
        }

        builder.append("}\n");

        return builder.toString();
    }

    @Override
    public String generateJavaTarget(int indent) {
        StringBuilder builder = new StringBuilder();

        builder.append("while (");
        builder.append(condition.generateJavaTarget(0));
        builder.append(") {\n");

        for (AstNode node : body) {
            builder.append(node.generateJavaTarget(0));
        }

        builder.append("}\n");

        return builder.toString();
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        while (condition.interpret(interpreter).asBoolean()) {
            for (StatementNode node : body) {
                node.interpret(interpreter);

                if (interpreter.shouldBreak()) {
                    interpreter.setShouldBreak(false);
                    return Value.VOID;
                }

                if (interpreter.shouldContinue()) {
                    interpreter.setShouldContinue(false);
                    break;
                }
            }
        }

        return Value.VOID;
    }
}
