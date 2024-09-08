package io.compiler.core.ast.literals;

import io.compiler.core.ast.AstNode;

public abstract class LiteralAstNode extends AstNode {
    @Override
    public boolean isLiteral() {
        return true;
    }
}
