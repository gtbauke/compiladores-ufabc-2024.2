package io.compiler.core.ast;

import io.compiler.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;

public class IdentifierNode extends AstNode {
    private final String name;

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

    @Override
    public Value interpret(Interpreter interpreter) throws Exception {
        return interpreter.getValue(name);
    }
}
