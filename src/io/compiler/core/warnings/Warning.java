package io.compiler.core.warnings;

public abstract class Warning {
    protected final String message;

    public Warning(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
