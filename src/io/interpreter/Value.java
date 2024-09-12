package io.interpreter;

import io.compiler.core.symbols.types.Type;
import io.interpreter.exceptions.ExpectedValueOfTypeException;
import io.interpreter.exceptions.IsiLangRuntimeException;

public record Value(Type type, Object value) {
    public static final Value VOID = new Value(Type.Void, null);
    public static final Value TRUE = new Value(Type.Boolean, true);
    public static final Value FALSE = new Value(Type.Boolean, false);

    public boolean asBoolean() throws IsiLangRuntimeException {
        if (!is(Type.Boolean)) {
            throw new ExpectedValueOfTypeException(Type.Boolean, type);
        }

        return (boolean) value;
    }

    public boolean is(Type type) {
        return this.type.equals(type);
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Value other) {
            return type.equals(other.type) && value.equals(other.value);
        }

        return false;
    }
}
