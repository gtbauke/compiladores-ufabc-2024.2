package io.compiler.core.symbols.types;

public class BinarySignature {
    private final Type left;
    private final Type right;

    public BinarySignature(Type left, Type right) {
        this.left = left;
        this.right = right;
    }

    public static String generateMessage(BinarySignature[] signatures) {
        var builder = new StringBuilder();

        for (var signature : signatures) {
            builder.append(signature.getLeft()).append(" and ").append(signature.getRight()).append("\n");
        }

        return builder.toString();
    }

    public Type getLeft() {
        return left;
    }

    public Type getRight() {
        return right;
    }
}
