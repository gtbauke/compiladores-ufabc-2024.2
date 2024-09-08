package io.interpreter;

import io.compiler.types.Type;

public class Value {
    private final Type type;
    private final Object value;

    public Value(Type type, Object value) {
        this.type = type;
        this.value = value;
    }
    
    public Type getType() {
        return type;
    }

    public boolean is(Type type) {
        return this.type.equals(type);
    }

    public Object getValue() {
        return value;
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
