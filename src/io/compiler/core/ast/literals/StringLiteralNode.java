package io.compiler.core.ast.literals;

import io.compiler.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;

public class StringLiteralNode extends LiteralAstNode {
    private final String value;

    public StringLiteralNode(String value) {
        super(Type.String);
        this.value = value;
    }

    @Override
    public String generateCTarget() {
        return value;
    }

    @Override
    public String generateJavaTarget() {
        return value;
    }

    @Override
    public Value interpret(Interpreter interpreter) {
        return new Value(Type.String, value);
    }
}
