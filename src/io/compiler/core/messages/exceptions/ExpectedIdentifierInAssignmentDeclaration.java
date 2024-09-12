package io.compiler.core.messages.exceptions;

public class ExpectedIdentifierInAssignmentDeclaration extends SemanticException {
    public ExpectedIdentifierInAssignmentDeclaration() {
        super("Expected an identifier in assignment declaration");
    }
}
