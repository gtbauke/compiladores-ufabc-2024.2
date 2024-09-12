package io.compiler.core.ast.statements;

import io.compiler.core.ast.StatementNode;
import io.compiler.core.ast.expressions.ExpressionAstNode;
import io.compiler.core.symbols.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

public class AssignmentStatementNode extends StatementNode {
    private final String identifier;
    private final ExpressionAstNode expression;

    public AssignmentStatementNode(String identifier, ExpressionAstNode expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ExpressionAstNode getExpression() {
        return expression;
    }

    @Override
    public String generateCTarget(int indent) {
        if (expression.getType() == Type.String) {
            return "strcpy(" + identifier + ", " + expression.generateCTarget(0) + ");\n";
        } else {
            return identifier + " = " + expression.generateCTarget(0) + ";\n";
        }
    }

    @Override
    public String generateJavaTarget(int indent) {
        return identifier + " = " + expression.generateJavaTarget(0) + ";\n";
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        var value = expression.interpret(interpreter);
        interpreter.updateValue(identifier, value);

        return Value.VOID;
    }
}
