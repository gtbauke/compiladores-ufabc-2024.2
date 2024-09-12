package io.compiler.core.ast.expressions.literals;

import io.compiler.core.symbols.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

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
    public String generateCTarget(int indent) {
        if (value) {
            return "1";
        } else {
            return "0";
        }
    }

    @Override
    public String generateJavaTarget(int indent) {
        return String.valueOf(value);
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        return new Value(Type.Boolean, value);
    }
}
