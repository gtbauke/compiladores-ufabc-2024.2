package io.compiler.core.program;

import io.compiler.core.ast.BindingNode;
import io.compiler.core.ast.StatementNode;
import io.compiler.core.targets.ICTarget;
import io.compiler.core.targets.IJavaTarget;
import io.compiler.types.Binding;

import java.util.HashMap;
import java.util.List;

public class Program implements IJavaTarget, ICTarget {
    private final List<BindingNode> declarations;
    private final List<StatementNode> statements;

    private final HashMap<String, Binding> symbols;

    public Program(List<BindingNode> declarations, List<StatementNode> statements, HashMap<String, Binding> symbols) {
        this.declarations = declarations;
        this.statements = statements;

        this.symbols = symbols;
    }

    public List<BindingNode> getDeclarations() {
        return declarations;
    }

    public List<StatementNode> getStatements() {
        return statements;
    }

    public HashMap<String, Binding> getSymbols() {
        return symbols;
    }

    @Override
    public String generateCTarget() {
        var builder = new StringBuilder();

        builder.append("#include <stdio.h>\n\n");
        builder.append("int main() {\n");

        for (var declaration : declarations) {
            builder.append(declaration.generateCTarget());
        }

        for (var statement : statements) {
            builder.append(statement.generateCTarget());
        }

        builder.append("    return 0;\n");
        builder.append("}\n");

        return builder.toString();
    }

    @Override
    public String generateJavaTarget() {
        var builder = new StringBuilder();

        // TODO: import scanner

        builder.append("public class Main {\n");
        builder.append("    public static void main(String[] args) {\n");

        for (var declaration : declarations) {
            builder.append(declaration.generateJavaTarget());
        }

        for (var statement : statements) {
            builder.append(statement.generateJavaTarget());
        }

        builder.append("    }\n");
        builder.append("}\n");

        return builder.toString();
    }
}
