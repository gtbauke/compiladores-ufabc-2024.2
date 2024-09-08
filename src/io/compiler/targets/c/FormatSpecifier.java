package io.compiler.targets.c;

import io.compiler.types.Type;

public class FormatSpecifier {
    public static final String INTEGER = "%d";
    public static final String FLOAT = "%f";
    public static final String CHAR = "%c";
    public static final String STRING = "%s";

    private FormatSpecifier() {
    }

    public static String getSpecifier(Type type) {
        return switch (type) {
            case Integer, Boolean -> INTEGER;
            case Float -> FLOAT;
            case String -> STRING;
            default -> throw new IllegalArgumentException("Invalid type (" + type.toString() + ") for format specifier");
        };
    }
}
