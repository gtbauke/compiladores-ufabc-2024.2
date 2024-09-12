package io.interpreter;

import io.interpreter.exceptions.IsiLangRuntimeException;

public interface Interpretable {
    Value interpret(Interpreter interpreter) throws IsiLangRuntimeException;
}
