package io.compiler.core.ast;

import io.compiler.types.Type;
import io.interpreter.Value;

public class IdentifierNode extends AstNode {
    private final String name;

    // TODO: when parsing an identifier, retrieve type from symbol table
    public IdentifierNode(String name) {
        super(Type.Void);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String generateCTarget() {
        return name;
    }

    @Override
    public String generateJavaTarget() {
        return name;
    }

    // TODO: interpret method should receive a context
    @Override
    public Value interpret() throws Exception {
        throw new Exception("Cannot interpret an identifier node (we need the interpretation context!)");
    }
}
