package io.compiler.core.ast.literals;

import io.compiler.core.ast.AstNode;
import io.compiler.types.Type;

public abstract class LiteralAstNode extends AstNode {
    public LiteralAstNode(Type type) {
        super(type);
    }

    @Override
    public boolean isLiteral() {
        return true;
    }
}
