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

            parser.program();

            var statements = parser.getStatements();

            for (var statement : statements) {
                System.out.println(statement.generateCTarget());
            }
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
            System.out.println("Stack trace:");
            ex.printStackTrace();
        }
    }
}