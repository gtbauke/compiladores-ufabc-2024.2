package io.cli;

import io.compiler.core.ast.StatementNode;
import io.compiler.core.ast.expressions.IdentifierNode;
import io.compiler.core.ast.statements.ExpressionStatementNode;
import io.compiler.core.generated.IsiLangLexer;
import io.compiler.core.generated.IsiLangParser;
import io.compiler.core.program.Program;
import io.compiler.targets.c.CGenerator;
import io.compiler.targets.java.JavaGenerator;
import io.compiler.core.symbols.Symbol;
import io.interpreter.Interpreter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.HashMap;
import java.util.Scanner;

public class CLI {
    public enum Target {
        Java,
        C,
        Interpret,
        REPL,
    }

    private final Target target;
    private final String input;
    private final String output;

    public CLI(Target target, String input, String output) {
        this.target = target;
        this.input = input;
        this.output = output;
    }

    private boolean checkReplExit(StatementNode lastStatement) {
        if (lastStatement instanceof ExpressionStatementNode expressionStatementNode) {
            if (expressionStatementNode.getExpression() instanceof IdentifierNode identifierNode) {
                return identifierNode.getName().equals("__exit__");
            }

            return false;
        }

        return false;
    }

    private void runReplMode() {
        System.out.println("REPL mode enabled. Type __exit__ to exit.");

        var scanner = new Scanner(System.in);
        var interpreter = new Interpreter(null);

        var sessionSymbols = new HashMap<String, Symbol>();

        while (true) {
            try {
                var line = scanner.nextLine();
                var lexer = new IsiLangLexer(CharStreams.fromString(line));
                var parser = new IsiLangParser(new CommonTokenStream(lexer));

                parser.setSymbols(sessionSymbols);
                parser.repl_line();
                sessionSymbols = parser.getSymbols();

                var input = parser.getStatements().getFirst();
                var shouldExit = checkReplExit(input);
                if (shouldExit) {
                    break;
                }

                interpreter.cliRun(input);
            } catch (Exception exception) {
                System.err.println("Error: " + exception.getMessage());
            }
        }

        scanner.close();
    }

    private void runJava(Program program) {
        var javaGenerator = new JavaGenerator();

        if (output == null) {
            var code = javaGenerator.generate(program);
            System.out.println(code);

            return;
        }

        javaGenerator.write(program, output);
    }

    public void runC(Program program) {
        var cGenerator = new CGenerator();

        if (output == null) {
            var code = cGenerator.generate(program);
            System.out.println(code);

            return;
        }

        cGenerator.write(program, output);
    }

    public void run() {
        try {
            if (target == Target.REPL) {
                runReplMode();
                return;
            }

            if (input == null) {
                System.out.println("Input file not specified, defaulting to ./input.isi");
            }

            var lexer = new IsiLangLexer(CharStreams.fromFileName(input));
            var parser = new IsiLangParser(new CommonTokenStream(lexer));

            parser.program();
            var program = parser.getProgram();

            switch (target) {
                case Java: {
                    runJava(program);
                    break;
                }
                case C: {
                    runC(program);
                    break;
                }
                case Interpret: {
                    var interpreter = new Interpreter(program);
                    interpreter.run();
                    break;
                }
            }
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }
}
