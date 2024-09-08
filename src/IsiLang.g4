grammar IsiLang;

@header {
    import io.compiler.core.ast.*;
    import io.compiler.core.ast.literals.*;
    import io.compiler.core.ast.statements.*;
    import io.compiler.core.operators.*;
    import io.compiler.core.exceptions.*;
    import io.compiler.core.warnings.*;
    import io.compiler.types.*;
    import java.util.Stack;
    import java.util.ArrayList;
    import java.util.HashMap;
}

@members {
    private HashMap<String, Binding> symbols = new HashMap<String, Binding>();

    private Stack<AstNode> stack = new Stack<AstNode>();
    private AstNode root = null;

    public AstNode getRoot(){
        if (root == null) {
            root = stack.pop();
        }

        return root;
    }

    private ArrayList<StatementNode> statements = new ArrayList<StatementNode>();
    private ArrayList<BindingNode> declarations = new ArrayList<BindingNode>();

    public ArrayList<StatementNode> getStatements() {
        return statements;
    }

    public ArrayList<BindingNode> getDeclarations() {
        return declarations;
    }

    private void addStatement(StatementNode statement) {
        statements.add(statement);
    }

    private void addDeclaration(BindingNode declaration) {
        declarations.add(declaration);
    }

    private boolean isInitializingVariable = false;
    private boolean hasElseBranch = false;
}

program : 'programa' declaration 'inicio' block 'fimprog' DOT {
    for (var declaration : declarations) {
        var identifier = declaration.getIdentifier();
        var symbol = symbols.get(identifier);

        if (!symbol.isUsed()) {
            var warning = new UnusedVariableWarning(identifier);
            System.out.println("WARNING: " + warning.getMessage());
        }
    }
};

declaration : assignment*;
block : statement+;

statement : print | if | attribution;

attribution : IDENTIFIER {
    var identifierString = _input.LT(-1).getText();
    var identifier = new IdentifierNode(identifierString);

    if (!symbols.containsKey(identifier.getName())) {
        throw new UndeclaredVariableException(identifier.getName());
    }

    var symbol = symbols.get(identifier.getName());
    var symbolType = symbol.getType();
} '=' expression {
    var expression = stack.pop();

    if (symbolType != expression.getType()) {
        throw new AssignmentTypeMismatchException(symbolType, expression.getType());
    }

    var assignment = new AssignmentStatementNode(identifier.getName(), expression);
    symbol.setInitialized();

    addStatement(assignment);
} END_OF_LINE;

print : 'escreva' OPEN_PAREN expression CLOSE_PAREN END_OF_LINE {
    var printStatement = new PrintStatementNode(stack.pop());
    addStatement(printStatement);
};

if : 'se' OPEN_PAREN expression {
    var condition = stack.pop();

    var thenBranch = new ArrayList<StatementNode>();
    var elseBranch = new ArrayList<StatementNode>();
} CLOSE_PAREN 'entao' OPEN_CURLY (statement {
    var lastStatement = statements.get(statements.size() - 1);
    statements.remove(statements.size() - 1);

    thenBranch.add(lastStatement);
})+ CLOSE_CURLY ('senao' {
    hasElseBranch = true;
} OPEN_CURLY (statement {
    if (hasElseBranch) {
        var lastStatement = statements.get(statements.size() - 1);
        statements.remove(statements.size() - 1);

        elseBranch.add(lastStatement);
    }
})+ CLOSE_CURLY)? {
    var ifStatement = new IfStatementNode(condition, thenBranch, elseBranch);
    addStatement(ifStatement);

    hasElseBranch = false;
};

assignment : ('int' | 'float' | 'string' | 'boolean') {
    var typeString = _input.LT(-1).getText();
    var type = Type.fromString(typeString);
} IDENTIFIER {
    var identifierString = _input.LT(-1).getText();
    var identifier = new IdentifierNode(identifierString);

    if (symbols.containsKey(identifier.getName())) {
        throw new AlreadyDeclaredVariableException(identifier.getName());
    }
} ('=' {
    isInitializingVariable = true;
} expression)? {
    var initializer = isInitializingVariable ? stack.pop() : null;

    if (isInitializingVariable && initializer.getType() != type) {
        throw new DeclarationTypeMismatchException(identifier.getName(), type, initializer.getType());
    }

    var binding = new BindingNode(identifier.getName(), type, initializer);
    addDeclaration(binding);

    symbols.put(identifier.getName(), binding.asBinding());
    isInitializingVariable = false;
} END_OF_LINE;

expression : logical_or;
logical_or : logical_and logical_orl;

logical_orl : ((OP_OR) {
    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
    var binaryOperation = new BinaryExpressionNode(operator);

    binaryOperation.setLeft(stack.pop());
} equality {
    binaryOperation.setRight(stack.pop());
    stack.push(binaryOperation);
})*;

logical_and : equality logical_andl;

logical_andl : ((OP_AND) {
    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
    var binaryOperation = new BinaryExpressionNode(operator);

    binaryOperation.setLeft(stack.pop());
} equality {
    binaryOperation.setRight(stack.pop());
    stack.push(binaryOperation);
})*;

equality : comparison equalityl;

equalityl : ((OP_COMP) {
    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
    var binaryOperation = new BinaryExpressionNode(operator);

    binaryOperation.setLeft(stack.pop());
} comparison {
    binaryOperation.setRight(stack.pop());
    stack.push(binaryOperation);
})*;

comparison : term comparisonl;

comparisonl : ((OP_REL) {
    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
    var binaryOperation = new BinaryExpressionNode(operator);

    binaryOperation.setLeft(stack.pop());
} term {
    binaryOperation.setRight(stack.pop());
    stack.push(binaryOperation);
})*;

term : factor terml;

terml : ((OP_TERM) {
    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
    var binaryOperation = new BinaryExpressionNode(operator);

    binaryOperation.setLeft(stack.pop());
} factor {
    binaryOperation.setRight(stack.pop());
    stack.push(binaryOperation);
})*;

factor : unary factorl;

factorl : ((OP_FACTOR) {
    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
    var binaryOperation = new BinaryExpressionNode(operator);

    if (stack.peek().isLiteral() || stack.peek().isIdentifier()) {
        binaryOperation.setLeft(stack.pop());
    } else {
        var other = (BinaryExpressionNode)stack.pop();

        if (other.getOperator().getValue() < operator.getValue()) {
            binaryOperation.setLeft(other.getRight());
            other.setRight(binaryOperation);
        } else {
            binaryOperation.setLeft(other);
            stack.push(binaryOperation);
        }
    }
} unary {
    binaryOperation.setRight(stack.pop());
    stack.push(binaryOperation);
})*;

unary : boolean_literal | unary_op | NUM {
    if (_input.LT(-1).getText().contains(".")) {
        var floatLiteral = new FloatLiteralNode(Float.parseFloat(_input.LT(-1).getText()));
        stack.push(floatLiteral);
    } else {
        var intLiteral = new IntegerLiteralNode(Integer.parseInt(_input.LT(-1).getText()));
        stack.push(intLiteral);
    }
} | identifier | STRING {
    var stringLiteral = new StringLiteralNode(_input.LT(-1).getText());
    stack.push(stringLiteral);
};

boolean_literal : (TRUE | FALSE) {
    var booleanLiteral = new BooleanLiteralNode(_input.LT(-1).getText().equals("verdadeiro"));
    stack.push(booleanLiteral);
};

identifier : IDENTIFIER {
    var identifier = new IdentifierNode(_input.LT(-1).getText());

    if (symbols.containsKey(identifier.getName())) {
     var binding = symbols.get(identifier.getName());
     identifier.setType(binding.getType());

     var isInitialized = binding.isInitialized();
     if (!isInitialized) {
         var warning = new VariableUsedWithoutInitializationWarning(identifier.getName());
         System.out.println("WARNING: " + warning.getMessage());
     }

     binding.setUsed();
    }

    stack.push(identifier);
};

unary_op : OP_NOT {
    var operator = UnaryOperator.fromString(_input.LT(-1).getText());
    var unaryOperation = new UnaryExpressionNode(operator);
} (boolean_literal | identifier {
    unaryOperation.setOperand(stack.pop());
    stack.push(unaryOperation);
});

END_OF_LINE : ';';

TRUE : 'verdadeiro';
FALSE : 'falso';

IDENTIFIER : [a-zA-Z_]([a-zA-Z_0-9])*;
NUM : ('-')?[0-9]+('.'[0-9]+)?;
STRING : '"' ~[\r\n"]* '"';

OP_OR : '||';
OP_AND : '&&';
OP_COMP : '==' | '!=';
OP_REL : '<' | '>' | '<=' | '>=';
OP_TERM : '+' | '-';
OP_FACTOR : '*' | '/';
OP_NOT : '!';

DOT : '.';

OPEN_PAREN : '(';
CLOSE_PAREN : ')';

OPEN_CURLY : '{';
CLOSE_CURLY : '}';

WS			: (' ' | '\n' | '\r' | '\t' ) -> skip
			;
