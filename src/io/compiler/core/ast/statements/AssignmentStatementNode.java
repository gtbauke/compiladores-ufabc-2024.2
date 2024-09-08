package io.compiler.core.ast.statements;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.StatementNode;
import io.interpreter.Value;

public class AssignmentStatementNode extends StatementNode {
    private final String identifier;
    private final AstNode expression;

    public AssignmentStatementNode(String identifier, AstNode expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    @Override
    public String generateCTarget() {
        return identifier + " = " + expression.generateCTarget() + ";";
    }

    @Override
    public String generateJavaTarget() {
        return identifier + " = " + expression.generateJavaTarget() + ";";
    }

    @Override
    public Value interpret() throws Exception {
        throw new Exception("AssignmentStatementNode.interpret() not implemented");
    }
}
