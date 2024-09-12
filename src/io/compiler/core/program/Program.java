package io.compiler.core.program;

import io.compiler.core.ast.BindingNode;
import io.compiler.core.ast.StatementNode;
import io.compiler.targets.c.CTargetable;
import io.compiler.targets.java.JavaTargetable;
import io.compiler.core.symbols.Symbol;

import java.util.HashMap;
import java.util.List;

public class Program implements JavaTargetable, CTargetable {
    public static final String SCANNER_NAME = "__scanner";

    private final List<BindingNode> declarations;
    private final List<StatementNode> statements;

    private final HashMap<String, Symbol> symbols;

    public Program(List<BindingNode> declarations, List<StatementNode> statements, HashMap<String, Symbol> symbols) {
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

    public HashMap<String, Symbol> getSymbols() {
        return symbols;
    }

    @Override
    public String generateCTarget() {
        var builder = new StringBuilder();

        builder.append("#include <stdio.h>\n#include <string.h>\n#include <stdlib.h>\n");
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

        builder.append("import java.util.Scanner;\n\n");

        builder.append("public class Main {\n");
        builder.append("    public static void main(String[] args) {\n");
        builder.append("        Scanner " + SCANNER_NAME + " = new Scanner(System.in);\n");

        for (var declaration : declarations) {
            builder.append(declaration.generateJavaTarget());
        }

        for (var statement : statements) {
            builder.append(statement.generateJavaTarget());
        }

        builder.append("        " + SCANNER_NAME + ".close();\n");
        builder.append("    }\n");
        builder.append("}\n");

        return builder.toString();
    }
}
