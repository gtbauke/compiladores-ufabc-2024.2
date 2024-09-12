package io.compiler.core.ast.statements;

import io.compiler.core.ast.StatementNode;
import io.compiler.core.program.Program;
import io.compiler.core.symbols.types.Type;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

public class ReadStatementNode extends StatementNode {
    private final String target;
    private final Type targetType;

    public ReadStatementNode(String target, Type targetType) {
        this.target = target;
        this.targetType = targetType;
    }

    public String getTarget() {
        return target;
    }

    public Type getTargetType() {
        return targetType;
    }

    @Override
    public String generateCTarget(int indent) {
        var builder = new StringBuilder();

        switch (targetType) {
            case Integer, Boolean -> builder.append("scanf(\"%d\", &").append(target).append(");");
            case Float -> builder.append("scanf(\"%f\", &").append(target).append(");");
            case String -> builder.append("scanf(\"%s\", ").append(target).append(");");
        }

        return builder.toString();
    }

    @Override
    public String generateJavaTarget(int indent) {
        var builder = new StringBuilder();
        builder.append(target).append(" = ");

        switch (targetType) {
            case Integer -> builder.append(Program.SCANNER_NAME + ".nextInt()");
            case Float -> builder.append(Program.SCANNER_NAME + ".nextFloat()");
            case String -> builder.append(Program.SCANNER_NAME + ".nextLine()");
            case Boolean -> builder.append(Program.SCANNER_NAME + ".nextBoolean()");
        }

        builder.append(";\n");
        return builder.toString();
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        var value = interpreter.read(targetType);
        interpreter.updateValue(target, value);

        return Value.VOID;
    }
}
