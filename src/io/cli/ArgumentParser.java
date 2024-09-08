package io.cli;

import java.util.Arrays;

public class ArgumentParser {
    public static class Arguments {
        public final CLI.Target target;
        public final String input;
        public final String output;

        public Arguments(CLI.Target target, String input, String output) {
            this.target = target;
            this.input = input;
            this.output = output;
        }
    }

    public Arguments parse(String[] args) {
        var targetIndex = Arrays.stream(args).toList().indexOf("--target");
        var targetString = args[targetIndex + 1];

        var inputIndex = Arrays.stream(args).toList().indexOf("--input");
        var inputString = args[inputIndex + 1];

        var outputIndex = Arrays.stream(args).toList().contains("--output")
                ? Arrays.stream(args).toList().indexOf("--output")
                : -1;
        var outputString = outputIndex != -1 ? args[outputIndex + 1] : null;
        var target = switch (targetString) {
            case "java" -> CLI.Target.Java;
            case "c" -> CLI.Target.C;
            case "interpret" -> CLI.Target.Interpret;
            default -> throw new IllegalArgumentException("Invalid target");
        };

        return new Arguments(target, inputString, outputString);
    }
}
