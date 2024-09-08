package io.compiler.types;

public class Binding {
    private final String identifier;
    private final Type type;
    private boolean isInitialized;
    private boolean isUsed;

    public Binding(String identifier, Type type, boolean isInitialized) {
        this.identifier = identifier;
        this.type = type;
        this.isInitialized = isInitialized;
        this.isUsed = false;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Type getType() {
        return type;
    }

    public boolean isInitialized() {
        return isInitialized;
    }

    public void setInitialized() {
        isInitialized = true;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed() {
        isUsed = true;
    }

    @Override
    public String toString() {
        return identifier + " : " + type;
    }
}
