package io.compiler.core.ast;

import io.compiler.types.Type;

public class BindingNode extends AstNode {
    private final String identifier;
    private final Type type;
    private final AstNode initializer;

    public BindingNode(String identifier, Type type, AstNode initializer) {
        this.identifier = identifier;
        this.type = type;
        this.initializer = initializer;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Type getType() {
        return type;
    }

    public AstNode getInitializer() {
        return initializer;
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
}
