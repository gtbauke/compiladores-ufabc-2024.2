package io.compiler.core.ast.literals;

import io.compiler.core.ast.AstNode;

public class FloatLiteralNode extends AstNode {
    private final float value;

    public FloatLiteralNode(float value) {
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
}
