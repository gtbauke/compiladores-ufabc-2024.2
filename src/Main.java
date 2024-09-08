import io.cli.ArgumentParser;
import io.cli.CLI;

public class Main {
    public static void main(String[] args) {
        try {
            var argumentParser = new ArgumentParser();
            var arguments = argumentParser.parse(args);
            var cli = new CLI(arguments.target, arguments.input, arguments.output);

            cli.run();
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
            System.out.println("Stack trace:");
            ex.printStackTrace();
        }
    }
}