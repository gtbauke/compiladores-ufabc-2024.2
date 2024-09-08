package io.compiler.core.exceptions;

public class ExpectedIdentifierInAssignmentDeclaration extends SemanticException {
    public ExpectedIdentifierInAssignmentDeclaration() {
        super("Expected an identifier in assignment declaration");
    }
}
