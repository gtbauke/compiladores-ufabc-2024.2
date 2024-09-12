package io.compiler.core.ast.statements;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.StatementNode;
import io.compiler.core.symbols.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

import java.util.List;

public class ForStatementNode extends StatementNode {
    private final StatementNode initialization;
    private final AstNode condition;
    private final StatementNode increment;
    private final List<StatementNode> body;

    public ForStatementNode(StatementNode initialization, AstNode condition, StatementNode increment, List<StatementNode> body) {
        this.initialization = initialization;
        this.condition = condition;
        this.increment = increment;
        this.body = body;
    }

    public StatementNode getInitialization() {
        return initialization;
    }

    public AstNode getCondition() {
        return condition;
    }

    public StatementNode getIncrement() {
        return increment;
    }

    public List<StatementNode> getBody() {
        return body;
    }

    @Override
    public String generateCTarget() {
        StringBuilder forStatement = new StringBuilder("for (");
        forStatement.append(initialization.generateCTarget());
        forStatement.append(condition.generateCTarget());
        forStatement.append(";");
        forStatement.append(increment.generateCTarget());
        forStatement.deleteCharAt(forStatement.length() - 1);
        forStatement.deleteCharAt(forStatement.length() - 1);
        forStatement.append(") {\n");

        for (AstNode child : body) {
            forStatement.append(child.generateCTarget());
        }

        forStatement.append("}\n");
        return forStatement.toString();
    }

    @Override
    public String generateJavaTarget() {
        StringBuilder forStatement = new StringBuilder("for (");
        forStatement.append(initialization.generateJavaTarget());
        forStatement.append(condition.generateJavaTarget());
        forStatement.append(";");
        forStatement.append(increment.generateJavaTarget());
        forStatement.deleteCharAt(forStatement.length() - 1);
        forStatement.deleteCharAt(forStatement.length() - 1);
        forStatement.append(") {\n");

        for (AstNode child : body) {
            forStatement.append(child.generateJavaTarget());
        }

        forStatement.append("}\n");
        return forStatement.toString();
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        this.initialization.interpret(interpreter);

        while (this.condition.interpret(interpreter).asBoolean()) {
            for (StatementNode statement : this.body) {
                statement.interpret(interpreter);
            }

            this.increment.interpret(interpreter);
        }

        return Value.VOID;
    }
}
