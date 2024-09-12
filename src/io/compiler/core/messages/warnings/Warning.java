package io.compiler.core.messages.warnings;

public abstract class Warning {
    protected final String message;

    public Warning(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
