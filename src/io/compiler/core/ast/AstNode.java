package io.compiler.core.ast;

import io.compiler.core.targets.ICTarget;
import io.compiler.core.targets.IJavaTarget;
import io.compiler.types.Type;
import io.interpreter.IInterpretable;

public abstract class AstNode implements IJavaTarget, ICTarget, IInterpretable {
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
}
