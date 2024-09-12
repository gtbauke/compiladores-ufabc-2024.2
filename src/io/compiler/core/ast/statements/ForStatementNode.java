package io.compiler.core.ast.statements;

import io.compiler.core.ast.AstNode;
import io.compiler.core.ast.StatementNode;
import io.compiler.core.ast.expressions.ExpressionAstNode;
import io.compiler.core.symbols.types.Type;
import io.compiler.targets.c.CTargetable;
import io.compiler.targets.java.JavaTargetable;
import io.interpreter.Interpretable;
import io.interpreter.Interpreter;
import io.interpreter.Value;
import io.interpreter.exceptions.IsiLangRuntimeException;

import java.util.List;
import java.util.Objects;

public class ForStatementNode extends StatementNode {
    public record Initializer(String identifier,
                              ExpressionAstNode value) implements CTargetable, JavaTargetable, Interpretable {

        @Override
        public String generateCTarget(int indent) {
            return "    ".repeat(indent) + identifier + " = " + value.generateCTarget(0);
        }

        @Override
        public String generateJavaTarget(int indent) {
            return "    ".repeat(indent) + identifier + " = " + value.generateJavaTarget(0);
        }

        @Override
        public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
            var value = this.value.interpret(interpreter);
            interpreter.updateValue(identifier, value);

            return value;
        }
    }

    public record Increment(
            String identifier,
            ExpressionAstNode value
    ) implements CTargetable, JavaTargetable, Interpretable {

        @Override
        public String generateCTarget(int indent) {
            return "    ".repeat(indent) + identifier + " = " + value.generateCTarget(0);
        }

        @Override
        public String generateJavaTarget(int indent) {
            return "    ".repeat(indent) + identifier + " = " + value.generateJavaTarget(0);
        }

        @Override
        public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
            var value = this.value.interpret(interpreter);
            interpreter.updateValue(identifier, value);

            return value;
        }
    }

    private final Initializer initialization;
    private final ExpressionAstNode condition;
    private final Increment increment;

    private final List<StatementNode> body;

    public ForStatementNode(Initializer initialization, ExpressionAstNode condition, Increment increment, List<StatementNode> body) {
        this.initialization = initialization;
        this.condition = condition;
        this.increment = increment;
        this.body = body;
    }

    @Override
    public String generateCTarget(int indent) {
        StringBuilder forStatement = new StringBuilder();

        forStatement.append("   ".repeat(indent)).append("for (");
        forStatement.append(initialization.generateCTarget(0)).append("; ");
        forStatement.append(condition.generateCTarget(0)).append("; ");
        forStatement.append(increment.generateCTarget(0));
        forStatement.append(") {\n");

        for (AstNode child : body) {
            forStatement.append(child.generateCTarget(4));
        }

        forStatement.append("   ".repeat(indent)).append("}\n");
        return forStatement.toString();
    }

    @Override
    public String generateJavaTarget(int indent) {
        StringBuilder forStatement = new StringBuilder();

        forStatement.append("   ".repeat(indent)).append("for (");
        forStatement.append(initialization.generateJavaTarget(0)).append("; ");
        forStatement.append(condition.generateJavaTarget(0)).append("; ");
        forStatement.append(increment.generateJavaTarget(0));
        forStatement.append(") {\n");

        for (AstNode child : body) {
            forStatement.append(child.generateJavaTarget(4));
        }

        forStatement.append("   ".repeat(indent)).append("}\n");
        return forStatement.toString();
    }

    @Override
    public Value interpret(Interpreter interpreter) throws IsiLangRuntimeException {
        this.initialization.interpret(interpreter);

        while (this.condition.interpret(interpreter).asBoolean()) {
            for (StatementNode statement : this.body) {
                statement.interpret(interpreter);

                if (interpreter.shouldBreak()) {
                    interpreter.setShouldBreak(false);
                    return Value.VOID;
                }

                if (interpreter.shouldContinue()) {
                    interpreter.setShouldContinue(false);
                    break;
                }
            }

            this.increment.interpret(interpreter);
        }

        return Value.VOID;
    }
}
