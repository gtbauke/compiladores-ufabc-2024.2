package io.interpreter;

public interface IInterpretable {
    Value interpret(Interpreter interpreter) throws Exception;
}
