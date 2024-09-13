package io.compiler.core.program;

import io.compiler.core.ast.DeclarationNode;
import io.compiler.core.ast.StatementNode;
import io.compiler.targets.c.CTargetable;
import io.compiler.targets.java.JavaTargetable;
import io.compiler.core.symbols.Symbol;

import java.util.HashMap;
import java.util.List;

public record Program(List<DeclarationNode> declarations, List<StatementNode> statements,
                      HashMap<String, Symbol> symbols) implements JavaTargetable, CTargetable {
    public static final String SCANNER_NAME = "__scanner";
    public static final int DEFAULT_C_ARRAY_SIZE = 100;

    @Override
    public String generateCTarget(int indent) {
        var builder = new StringBuilder();

        builder.append("#include <stdio.h>\n");
        builder.append("#include <string.h>\n");
        builder.append("#include <stdlib.h>\n");

        builder.append("int main() {\n");

        for (var declaration : declarations) {
            builder.append(declaration.generateCTarget(0));
        }

        for (var statement : statements) {
            builder.append(statement.generateCTarget(0));
        }

        builder.append("    return 0;\n");
        builder.append("}\n");

        return builder.toString();
    }

    @Override
    public String generateJavaTarget(int indent) {
        var builder = new StringBuilder();

        builder.append("import java.util.Scanner;\n\n");

        builder.append("public class Main {\n");
        builder.append("    public static void main(String[] args) {\n");
        builder.append("        Scanner " + SCANNER_NAME + " = new Scanner(System.in);\n\n");

        for (var declaration : declarations) {
            builder.append(declaration.generateJavaTarget(3));
        }

        builder.append("\n\n");

        for (var statement : statements) {
            builder.append(statement.generateJavaTarget(3));
        }

        builder.append("\n\n");

        builder.append("        " + SCANNER_NAME + ".close();\n");
        builder.append("    }\n");
        builder.append("}\n");

        return builder.toString();
    }
}
