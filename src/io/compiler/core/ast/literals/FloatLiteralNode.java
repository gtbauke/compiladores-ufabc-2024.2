package io.compiler.core.ast.literals;

import io.compiler.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;

public class FloatLiteralNode extends LiteralAstNode {
    private final float value;

    public FloatLiteralNode(float value) {
        super(Type.Float);
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
    public Value interpret(Interpreter interpreter) {
        return new Value(Type.Float, value);
    }
}
