package io.compiler.core.ast.statements;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.StatementNode;
import io.compiler.core.symbols.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

public class AssignmentStatementNode extends StatementNode {
    private final String identifier;
    private final AstNode expression;

    public AssignmentStatementNode(String identifier, AstNode expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    @Override
    public String generateCTarget() {
        if (expression.getType() == Type.String) {
            return "strcpy(" + identifier + ", " + expression.generateCTarget() + ");\n";
        } else {
            return identifier + " = " + expression.generateCTarget() + ";\n";
        }
    }

    @Override
    public String generateJavaTarget() {
        return identifier + " = " + expression.generateJavaTarget() + ";\n";
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        var value = expression.interpret(interpreter);
        interpreter.updateValue(identifier, value);

        return new Value(Type.Void, null);
    }
}
