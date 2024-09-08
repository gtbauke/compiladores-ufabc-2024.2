package io.cli;

import io.compiler.core.generated.IsiLangLexer;
import io.compiler.core.generated.IsiLangParser;
import io.compiler.targets.c.CGenerator;
import io.compiler.targets.java.JavaGenerator;
import io.interpreter.Interpreter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class CLI {
    public enum Target {
        Java,
        C,
        Interpret
    }

    private final Target target;
    private final String input;
    private final String output;

    public CLI(Target target, String input, String output) {
        this.target = target;
        this.input = input;
        this.output = output;
    }

    public void run() {
        try {
            IsiLangLexer lexer;
            IsiLangParser parser;

            lexer = new IsiLangLexer(CharStreams.fromFileName(input));
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            parser = new IsiLangParser(tokenStream);

            parser.program();
            var program = parser.getProgram();

            switch (target) {
                case Java: {
                    var javaGenerator = new JavaGenerator();
                    javaGenerator.writeToFile(program, output);

                    break;
                }
                case C: {
                    var cGenerator = new CGenerator();
                    cGenerator.writeToFile(program, output);

                    break;
                }
                case Interpret: {
                    var interpreter = new Interpreter(program);
                    interpreter.run();
                }
            }
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
            System.out.println("Stack trace:");
            exception.printStackTrace();
        }
    }
}
