package io.interpreter;

public interface IInterpretable {
    Value interpret() throws Exception;
}
