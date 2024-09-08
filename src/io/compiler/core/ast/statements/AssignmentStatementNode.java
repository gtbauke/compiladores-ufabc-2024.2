package io.compiler.core.ast.statements;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.StatementNode;
import io.compiler.types.Type;
import io.interpreter.Interpreter;
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
        return identifier + " = " + expression.generateCTarget() + ";\n";
    }

    @Override
    public String generateJavaTarget() {
        return identifier + " = " + expression.generateJavaTarget() + ";\n";
    }

    @Override
    public Value interpret(Interpreter interpreter) throws Exception {
        var value = expression.interpret(interpreter);
        interpreter.updateValue(identifier, value);

        return new Value(Type.Void, null);
    }
}
