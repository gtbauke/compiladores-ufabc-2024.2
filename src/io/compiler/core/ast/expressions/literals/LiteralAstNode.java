package io.compiler.core.ast.expressions.literals;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.expressions.ExpressionAstNode;
import io.compiler.core.symbols.types.Type;

public abstract class LiteralAstNode extends ExpressionAstNode {
    public LiteralAstNode(Type type) {
        super(type);
    }

    @Override
    public boolean isLiteral() {
        return true;
    }
}
