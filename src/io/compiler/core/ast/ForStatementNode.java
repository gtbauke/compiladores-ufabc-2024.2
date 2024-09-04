package io.compiler.core.ast;

import io.interpreter.Value;

import java.util.List;

public class ForStatementNode extends AstNode {
    private final AstNode initialization;
    private final AstNode condition;
    private final AstNode increment;
    private final List<AstNode> body;

    public ForStatementNode(AstNode initialization, AstNode condition, AstNode increment, List<AstNode> body) {
        this.initialization = initialization;
        this.condition = condition;
        this.increment = increment;
        this.body = body;
    }

    public AstNode getInitialization() {
        return initialization;
    }

    public AstNode getCondition() {
        return condition;
    }

    public AstNode getIncrement() {
        return increment;
    }

    public List<AstNode> getBody() {
        return body;
    }

    @Override
    public String generateCTarget() {
        StringBuilder forStatement = new StringBuilder("for (");
        forStatement.append(initialization.generateCTarget());
        forStatement.append(";");
        forStatement.append(condition.generateCTarget());
        forStatement.append(";");
        forStatement.append(increment.generateCTarget());
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
        forStatement.append(";");
        forStatement.append(condition.generateJavaTarget());
        forStatement.append(";");
        forStatement.append(increment.generateJavaTarget());
        forStatement.append(") {\n");

        for (AstNode child : body) {
            forStatement.append(child.generateJavaTarget());
        }

        forStatement.append("}\n");
        return forStatement.toString();
    }

    @Override
    public Value interpret() throws Exception {
        throw new Exception("Not implemented");
    }
}
