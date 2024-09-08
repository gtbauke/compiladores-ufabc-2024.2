import io.compiler.core.generated.IsiLangLexer;
import io.compiler.core.generated.IsiLangParser;
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

            parser.expression();

            var root = parser.getRoot();
            var javaCode = root.generateJavaTarget();
            var cCode = root.generateCTarget();

            System.out.println(javaCode);
            System.out.println("\n\n\n");
            System.out.println(cCode);

            var value = root.interpret();
            System.out.println("Interpretation result: " + value);
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
            System.out.println("Stack trace:");
            ex.printStackTrace();
        }
    }
}