package io.compiler.core.ast.literals;

import io.compiler.core.ast.AstNode;

public class StringLiteralNode extends AstNode {
    private final String value;

    public StringLiteralNode(String value) {
        this.value = value;
    }

    @Override
    public String generateCTarget() {
        return "\"" + value + "\"";
    }

    @Override
    public String generateJavaTarget() {
        return "\"" + value + "\"";
    }
}
