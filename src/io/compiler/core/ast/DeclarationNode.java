package io.compiler.core.ast;

import io.compiler.core.symbols.Symbol;
import io.compiler.core.symbols.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

public class DeclarationNode extends AstNode {
    private final String identifier;
    private final AstNode initializer;

    public DeclarationNode(String identifier, Type type, AstNode initializer) {
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

    public Symbol asBinding() {
        return new Symbol(identifier, type, initializer != null);
    }

    @Override
    public String generateCTarget(int indent) {
        var builder = new StringBuilder();

        if (type == Type.String) {
            builder.append("    ".repeat(indent)).append("char ").append(identifier).append("[256];\n");

            if (initializer != null) {
                builder.append("    ".repeat(indent)).append("strcpy(").append(identifier).append(", ").append(initializer.generateCTarget(0)).append(");\n");
            }
        } else {
            var typeString = type.generateCTarget(0);

            builder.append("    ".repeat(indent)).append(typeString).append(" ").append(identifier);
            if (initializer != null) {
                builder.append(" = ").append(initializer.generateCTarget(0));
            }

            builder.append(";\n");
        }

        return builder.toString();
    }

    @Override
    public String generateJavaTarget(int indent) {
        var builder = new StringBuilder();
        var typeString = type.generateJavaTarget(0);

        builder.append("    ".repeat(indent)).append(typeString).append(" ").append(identifier);
        if (initializer != null) {
            builder.append(" = ").append(initializer.generateJavaTarget(0));
        }

        builder.append(";\n");
        return builder.toString();
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        var value = initializer == null
            ? new Value(type, null)
            : initializer.interpret(interpreter);

        interpreter.addValue(identifier, value);
        return Value.VOID;
    }
}
