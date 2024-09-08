package io.compiler.core.ast.literals;

import io.compiler.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;

public class BooleanLiteralNode extends LiteralAstNode {
    private final boolean value;

    public BooleanLiteralNode(boolean value) {
        super(Type.Boolean);
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String generateCTarget() {
        if (value) {
            return "1";
        } else {
            return "0";
        }
    }

    @Override
    public String generateJavaTarget() {
        return String.valueOf(value);
    }

    @Override
    public Value interpret(Interpreter interpreter) throws Exception {
        return new Value(Type.Boolean, value);
    }
}
