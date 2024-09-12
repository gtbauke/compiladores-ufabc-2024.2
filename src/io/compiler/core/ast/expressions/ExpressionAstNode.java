package io.compiler.core.ast.expressions;

import io.compiler.core.ast.AstNode;
import io.compiler.core.symbols.types.Type;

public abstract class ExpressionAstNode extends AstNode {
    public ExpressionAstNode(Type type) {
        super(type);
    }
}
