package io.compiler.core.ast.expressions;

import io.compiler.core.symbols.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

public class IdentifierNode extends ExpressionAstNode {
    private final String name;

    public IdentifierNode(String name) {
        super(Type.Void);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isIdentifier() {
        return true;
    }

    @Override
    public String generateCTarget(int indent) {
        return name;
    }

    @Override
    public String generateJavaTarget(int indent) {
        return name;
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        return interpreter.getValue(name);
    }
}
