package io.compiler.core.ast.statements;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.StatementNode;
import io.compiler.targets.c.FormatSpecifier;
import io.compiler.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;

public class PrintStatementNode extends StatementNode {
    private final AstNode value;

    public PrintStatementNode(AstNode value) {
        this.value = value;
    }

    public AstNode getValue() {
        return value;
    }

    @Override
    public String generateCTarget() {
        var formatSpecifier = FormatSpecifier.getSpecifier(value.getType());

        return "printf(\"" +
                formatSpecifier +
                "\\n\", " +
                value.generateCTarget() +
                ");\n";
    }

    @Override
    public String generateJavaTarget() {
        return "System.out.println(" + value.generateJavaTarget() + ");\n";
    }

    @Override
    public Value interpret(Interpreter interpreter) throws Exception {
        var value = this.value.interpret(interpreter);
        System.out.println(value);

        return new Value(Type.Void, null);
    }
}
