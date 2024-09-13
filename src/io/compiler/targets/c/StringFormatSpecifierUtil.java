package io.compiler.targets.c;

import io.compiler.core.symbols.types.Type;

public class StringFormatSpecifierUtil {
    public static final String INTEGER = "%d";
    public static final String FLOAT = "%lf";
    public static final String STRING = "%s";

    private StringFormatSpecifierUtil() {}

    public static String getTypeSpecifierFor(Type type) {
        return switch (type) {
            case Integer, Boolean -> INTEGER;
            case Float -> FLOAT;
            case String -> STRING;
            default -> throw new IllegalArgumentException("Invalid type (" + type.toString() + ") for format specifier");
        };
    }
}
