import io.compiler.core.generated.IsiLangLexer;
import io.compiler.core.generated.IsiLangParser;
import io.interpreter.Interpreter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        try {
            IsiLangLexer lexer;
            IsiLangParser parser;

            lexer = new IsiLangLexer(CharStreams.fromFileName("input.isi"));
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            parser = new IsiLangParser(tokenStream);

            parser.program();
            var program = parser.getProgram();

            System.out.println("Java Target:\n" + program.generateJavaTarget());
            System.out.println("\n\n\n\n");
            System.out.println("C Target:\n" + program.generateCTarget());

            var interpreter = new Interpreter(program);
            interpreter.run();
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
            System.out.println("Stack trace:");
            ex.printStackTrace();
        }
    }
}