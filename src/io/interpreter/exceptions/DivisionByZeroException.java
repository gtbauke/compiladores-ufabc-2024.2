package io.interpreter.exceptions;

public class DivisionByZeroException extends IsiLangRuntimeException{
    public DivisionByZeroException() {
        super("Division by zero is not allowed.");
    }
}
