package io.compiler.core.ast;

import io.compiler.targets.c.CTargetable;
import io.compiler.targets.java.JavaTargetable;
import io.compiler.core.symbols.types.Type;
import io.interpreter.Interpretable;

public abstract class AstNode implements JavaTargetable, CTargetable, Interpretable {
    protected Type type;

    public AstNode(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isLiteral() {
        return false;
    }

    public boolean isIdentifier() {
        return false;
    }

    public boolean isGroup() {
        return false;
    }
}
