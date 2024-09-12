package io.compiler.core.ast.expressions.literals;

import io.compiler.core.symbols.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;

public class IntegerLiteralNode extends LiteralAstNode {
    private final int value;

    public IntegerLiteralNode(int value) {
        super(Type.Integer);
        this.value = value;
    }

    @Override
    public String generateCTarget(int indent) {
        return String.valueOf(value);
    }

    @Override
    public String generateJavaTarget(int indent) {
        return String.valueOf(value);
    }

    @Override
    public Value interpret(Interpreter interpreter) {
        return new Value(Type.Integer, value);
    }
}
