package io.interpreter;

import io.compiler.core.exceptions.AlreadyDeclaredVariableException;
import io.compiler.core.exceptions.UndeclaredVariableException;
import io.compiler.core.program.Program;

import java.util.HashMap;

public class Interpreter {
    private final Program program;
    private final HashMap<String, Value> values;

    public Interpreter(Program program) {
        this.program = program;
        this.values = new HashMap<>();
    }

    public void addValue(String name, Value value) throws AlreadyDeclaredVariableException {
        if (values.containsKey(name)) {
            throw new AlreadyDeclaredVariableException(name);
        }

        values.put(name, value);
    }

    public void updateValue(String name, Value value) throws UndeclaredVariableException {
        if (!values.containsKey(name)) {
            throw new UndeclaredVariableException(name);
        }

        values.replace(name, value);
    }

    public Value getValue(String name) throws UndeclaredVariableException {
        if (!values.containsKey(name)) {
            throw new UndeclaredVariableException(name);
        }

        return values.get(name);
    }

    public void run() {
        try {
            for (var declaration : program.getDeclarations()) {
                declaration.interpret(this);
            }

            for (var statement : program.getStatements()) {
                statement.interpret(this);
            }
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
            System.out.println("Stack trace:");
            exception.printStackTrace();
        }
    }
}
