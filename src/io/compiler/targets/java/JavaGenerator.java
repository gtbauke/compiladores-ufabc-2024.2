package io.compiler.targets.java;

import io.compiler.core.program.Program;
import io.compiler.targets.IGenerator;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class JavaGenerator implements IGenerator {
    @Override
    public String generate(Program program) {
        return program.generateJavaTarget();
    }

    @Override
    public void write(Program program, String path) {
        var javaCode = generate(program);

        try {
            var writer = new BufferedWriter(new FileWriter(path));

            writer.write(javaCode);
            writer.close();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
            System.out.println("Stack trace:");
            exception.printStackTrace();
        }
    }
}
