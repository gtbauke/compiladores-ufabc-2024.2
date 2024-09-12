package io.compiler.core.ast.statements;

import io.compiler.core.ast.StatementNode;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

public class ContinueStatementNode extends StatementNode {
    @Override
    public String generateCTarget(int indent) {
        return "continue;\n";
    }

    @Override
    public String generateJavaTarget(int indent) {
        return "continue;\n";
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        interpreter.setShouldContinue(true);
        return Value.VOID;
    }
}
