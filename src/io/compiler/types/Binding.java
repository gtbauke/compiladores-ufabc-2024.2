package io.compiler.types;

public class Binding {
    private final String identifier;
    private final Type type;
    private boolean isInitialized;

    public Binding(String identifier, Type type, boolean isInitialized) {
        this.identifier = identifier;
        this.type = type;
        this.isInitialized = isInitialized;
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

    @Override
    public String toString() {
        return identifier + " : " + type;
    }
}
