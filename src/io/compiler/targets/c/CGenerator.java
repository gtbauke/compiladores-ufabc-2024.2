package io.compiler.targets.c;

import io.compiler.core.program.Program;
import io.compiler.targets.IGenerator;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CGenerator implements IGenerator {
    @Override
    public String generate(Program program) {
        return program.generateCTarget();
    }

    @Override
    public void writeToFile(Program program, String path) {
        var cCode = generate(program);

        try {
            var writer = new BufferedWriter(new FileWriter(path));

            writer.write(cCode);
            writer.close();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
            System.out.println("Stack trace:");
            exception.printStackTrace();
        }
    }
}
