package io.compiler.core.ast.literals;

import io.compiler.core.ast.AstNode;
import io.compiler.types.Type;
import io.interpreter.Value;

public class IntegerLiteralNode extends LiteralAstNode {
    private final int value;

    public IntegerLiteralNode(int value) {
        super(Type.Integer);
        this.value = value;
    }

    @Override
    public String generateCTarget() {
        return String.valueOf(value);
    }

    @Override
    public String generateJavaTarget() {
        return String.valueOf(value);
    }

    @Override
    public Value interpret() {
        return new Value(Type.Integer, value);
    }
}
