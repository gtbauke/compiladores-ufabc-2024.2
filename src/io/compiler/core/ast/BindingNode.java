package io.compiler.core.ast;

import io.compiler.types.Binding;
import io.compiler.types.Type;
import io.interpreter.Value;

public class BindingNode extends AstNode {
    private final String identifier;
    private final AstNode initializer;

    public BindingNode(String identifier, Type type, AstNode initializer) {
        super(type);
        this.identifier = identifier;
        this.initializer = initializer;
    }

    public String getIdentifier() {
        return identifier;
    }

    public AstNode getInitializer() {
        return initializer;
    }

    public Binding asBinding() {
        return new Binding(identifier, type, initializer != null);
    }

    @Override
    public String generateCTarget() {
        var builder = new StringBuilder();
        var typeString = type.generateCTarget();

        builder.append(typeString).append(" ").append(identifier);
        if (initializer != null) {
            builder.append(" = ").append(initializer.generateCTarget());
        }

        builder.append(";\n");
        return builder.toString();
    }

    @Override
    public String generateJavaTarget() {
        var builder = new StringBuilder();
        var typeString = type.generateJavaTarget();

        builder.append(typeString).append(" ").append(identifier);
        if (initializer != null) {
            builder.append(" = ").append(initializer.generateJavaTarget());
        }

        builder.append(";\n");
        return builder.toString();
    }

    @Override
    public Value interpret() throws Exception {
        throw new Exception("Not implemented");
    }
}
