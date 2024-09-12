package io.interpreter.exceptions;

import io.compiler.core.ast.operators.BinaryOperator;
import io.compiler.core.symbols.types.BinarySignature;
import io.compiler.core.symbols.types.Type;

public abstract class OperationNotDefinedForException extends IsiLangRuntimeException {
    private final BinarySignature[] signatures;

    private final Type gotLeft;
    private final Type gotRight;

    private final BinaryOperator operator;

    public OperationNotDefinedForException(BinarySignature[] signatures, Type gotLeft, Type gotRight, BinaryOperator operator, String message) {
        super(message);

        this.signatures = signatures;
        this.gotLeft = gotLeft;
        this.gotRight = gotRight;
        this.operator = operator;
    }

    public BinarySignature[] getSignature() {
        return signatures;
    }

    public Type getGotLeft() {
        return gotLeft;
    }

    public Type getGotRight() {
        return gotRight;
    }

    public BinaryOperator getOperator() {
        return operator;
    }

    public static class Addition extends OperationNotDefinedForException {
        private static final BinarySignature[] ADDITION_SIGNATURES = {
                new BinarySignature(Type.Integer, Type.Integer),
                new BinarySignature(Type.Float, Type.Float),
        };

        public Addition(Type gotLeft, Type gotRight) {
            super(ADDITION_SIGNATURES, gotLeft, gotRight, BinaryOperator.Addition,
                    "Addition is not defined for types " + gotLeft + " and " + gotRight + ".\n"
                    + "Addition is only defined for:\n" + BinarySignature.generateMessage(ADDITION_SIGNATURES)
            );
        }
    }

    public static class Subtraction extends OperationNotDefinedForException {
        private static final BinarySignature[] SUBTRACTION_SIGNATURES = {
                new BinarySignature(Type.Integer, Type.Integer),
                new BinarySignature(Type.Float, Type.Float),
        };

        public Subtraction(Type gotLeft, Type gotRight) {
            super(SUBTRACTION_SIGNATURES, gotLeft, gotRight, BinaryOperator.Subtraction,
                    "Subtraction is not defined for types " + gotLeft + " and " + gotRight + ".\n"
                    + "Subtraction is only defined for:\n" + BinarySignature.generateMessage(SUBTRACTION_SIGNATURES)
            );
        }
    }

    public static class Multiplication extends OperationNotDefinedForException {
        private static final BinarySignature[] MULTIPLICATION_SIGNATURES = {
                new BinarySignature(Type.Integer, Type.Integer),
                new BinarySignature(Type.Float, Type.Float),
        };

        public Multiplication(Type gotLeft, Type gotRight) {
            super(MULTIPLICATION_SIGNATURES, gotLeft, gotRight, BinaryOperator.Multiplication,
                    "Multiplication is not defined for types " + gotLeft + " and " + gotRight + ".\n"
                    + "Multiplication is only defined for:\n" + BinarySignature.generateMessage(MULTIPLICATION_SIGNATURES)
            );
        }
    }

    public static class Division extends OperationNotDefinedForException {
        private static final BinarySignature[] DIVISION_SIGNATURES = {
                new BinarySignature(Type.Integer, Type.Integer),
                new BinarySignature(Type.Float, Type.Float),
        };

        public Division(Type gotLeft, Type gotRight) {
            super(DIVISION_SIGNATURES, gotLeft, gotRight, BinaryOperator.Division,
                    "Division is not defined for types " + gotLeft + " and " + gotRight + ".\n"
                    + "Division is only defined for:\n" + BinarySignature.generateMessage(DIVISION_SIGNATURES)
            );
        }
    }

    public static class LessThan extends OperationNotDefinedForException {
        private static final BinarySignature[] LESS_THAN_SIGNATURES = {
                new BinarySignature(Type.Integer, Type.Integer),
                new BinarySignature(Type.Float, Type.Float),
        };

        public LessThan(Type gotLeft, Type gotRight) {
            super(LESS_THAN_SIGNATURES, gotLeft, gotRight, BinaryOperator.LessThan,
                    "Less than is not defined for types " + gotLeft + " and " + gotRight + ".\n"
                    + "Less than is only defined for:\n" + BinarySignature.generateMessage(LESS_THAN_SIGNATURES)
            );
        }
    }

    public static class LessThanOrEqual extends OperationNotDefinedForException {
        private static final BinarySignature[] LESS_THAN_OR_EQUAL_SIGNATURES = {
                new BinarySignature(Type.Integer, Type.Integer),
                new BinarySignature(Type.Float, Type.Float),
        };

        public LessThanOrEqual(Type gotLeft, Type gotRight) {
            super(LESS_THAN_OR_EQUAL_SIGNATURES, gotLeft, gotRight, BinaryOperator.LessThanOrEqual,
                    "Less than or equal is not defined for types " + gotLeft + " and " + gotRight + ".\n"
                    + "Less than or equal is only defined for:\n" + BinarySignature.generateMessage(LESS_THAN_OR_EQUAL_SIGNATURES)
            );
        }
    }

    public static class GreaterThan extends OperationNotDefinedForException {
        private static final BinarySignature[] GREATER_THAN_SIGNATURES = {
                new BinarySignature(Type.Integer, Type.Integer),
                new BinarySignature(Type.Float, Type.Float),
        };

        public GreaterThan(Type gotLeft, Type gotRight) {
            super(GREATER_THAN_SIGNATURES, gotLeft, gotRight, BinaryOperator.GreaterThan,
                    "Greater than is not defined for types " + gotLeft + " and " + gotRight + ".\n"
                    + "Greater than is only defined for:\n" + BinarySignature.generateMessage(GREATER_THAN_SIGNATURES)
            );
        }
    }

    public static class GreaterThanOrEqual extends OperationNotDefinedForException {
        private static final BinarySignature[] GREATER_THAN_OR_EQUAL_SIGNATURES = {
                new BinarySignature(Type.Integer, Type.Integer),
                new BinarySignature(Type.Float, Type.Float),
        };

        public GreaterThanOrEqual(Type gotLeft, Type gotRight) {
            super(GREATER_THAN_OR_EQUAL_SIGNATURES, gotLeft, gotRight, BinaryOperator.GreaterThanOrEqual,
                    "Greater than or equal is not defined for types " + gotLeft + " and " + gotRight + ".\n"
                    + "Greater than or equal is only defined for:\n" + BinarySignature.generateMessage(GREATER_THAN_OR_EQUAL_SIGNATURES)
            );
        }
    }

    public static class And extends OperationNotDefinedForException {
        private static final BinarySignature[] AND_SIGNATURES = {
                new BinarySignature(Type.Boolean, Type.Boolean),
        };

        public And(Type gotLeft, Type gotRight) {
            super(AND_SIGNATURES, gotLeft, gotRight, BinaryOperator.And,
                    "And is not defined for types " + gotLeft + " and " + gotRight + ".\n"
                    + "And is only defined for:\n" + BinarySignature.generateMessage(AND_SIGNATURES)
            );
        }
    }

    public static class Or extends OperationNotDefinedForException {
        private static final BinarySignature[] OR_SIGNATURES = {
                new BinarySignature(Type.Boolean, Type.Boolean),
        };

        public Or(Type gotLeft, Type gotRight) {
            super(OR_SIGNATURES, gotLeft, gotRight, BinaryOperator.Or,
                    "Or is not defined for types " + gotLeft + " and " + gotRight + ".\n"
                    + "Or is only defined for:\n" + BinarySignature.generateMessage(OR_SIGNATURES)
            );
        }
    }
}
