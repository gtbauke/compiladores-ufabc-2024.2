package io.compiler.targets;

import io.compiler.core.program.Program;

public interface IGenerator {
    String generate(Program program);
    void write(Program program, String path);
}
