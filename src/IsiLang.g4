grammar IsiLang;

@header {
    import io.compiler.core.ast.*;
    import io.compiler.core.ast.expressions.*;
    import io.compiler.core.ast.statements.*;
    import io.compiler.core.ast.expressions.literals.*;
    import io.compiler.core.ast.operators.*;
    import io.compiler.core.messages.exceptions.*;
    import io.compiler.core.messages.warnings.*;
    import io.compiler.core.program.*;
    import io.compiler.core.symbols.*;
    import io.compiler.core.symbols.types.*;
    import java.util.Stack;
    import java.util.ArrayList;
    import java.util.HashMap;
}

@members {
    private Program program;
    private HashMap<String, Symbol> symbols = new HashMap<String, Symbol>();

    private Stack<ExpressionAstNode> stack = new Stack<ExpressionAstNode>();
    private AstNode root = null;

    private ArrayList<StatementNode> statements = new ArrayList<StatementNode>();
    private ArrayList<DeclarationNode> declarations = new ArrayList<DeclarationNode>();

    private boolean isInitializingVariable = false;
    private boolean hasElseBranch = false;
    private boolean isInsideAnyLoop = false;

    public AstNode getRoot(){
        if (root == null) {
            root = stack.pop();
        }

        return root;
    }

    public ArrayList<StatementNode> getStatements() {
        return statements;
    }

    public ArrayList<DeclarationNode> getDeclarations() {
        return declarations;
    }

    private void addStatement(StatementNode statement) {
        statements.add(statement);
    }

    private void addDeclaration(DeclarationNode declaration) {
        declarations.add(declaration);
    }

    public Program getProgram() {
        return program;
    }

    public void setSymbols(HashMap<String, Symbol> symbols) {
        this.symbols = symbols;
    }

    public HashMap<String, Symbol> getSymbols() {
        return symbols;
    }
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

    var program_ = new Program(declarations, statements, symbols);
    this.program = program_;
};

declaration : variable_declaration*;
block : statement+;

statement : print | read | if | attribution | for | while | do_while | continue | break;

repl_line : {
    statements.clear();
    declarations.clear();
} variable_declaration {
    var lastDeclaration = declarations.get(declarations.size() - 1);
    declarations.remove(declarations.size() - 1);

    var declarationStatement = new ExpressionStatementNode(lastDeclaration);
    statements.add(declarationStatement);
} | statement | expression {
    var expression = stack.pop();
    var expressionStatement = new ExpressionStatementNode(expression);

    addStatement(expressionStatement);
};

continue : 'continue' END_OF_LINE {
    if (!isInsideAnyLoop) {
        throw new ContinueOutsideLoopException();
    }

    var continueStatement = new ContinueStatementNode();
    addStatement(continueStatement);
};

break : 'pare' END_OF_LINE {
    if (!isInsideAnyLoop) {
        throw new BreakOutsideLoopException();
    }

    var breakStatement = new BreakStatementNode();
    addStatement(breakStatement);
};

do_while : 'faca' {
    var body = new ArrayList<StatementNode>();
    isInsideAnyLoop = true;
} OPEN_CURLY (statement {
    var lastStatement = statements.get(statements.size() - 1);
    statements.remove(statements.size() - 1);

    body.add(lastStatement);
})* CLOSE_CURLY 'enquanto' OPEN_PAREN expression {
    var condition = stack.pop();
} CLOSE_PAREN END_OF_LINE {
    var doWhileStatement = new DoWhileStatementNode(body, condition);
    addStatement(doWhileStatement);

    isInsideAnyLoop = false;
};

while : 'enquanto' OPEN_PAREN expression {
    var condition = stack.pop();
    var body = new ArrayList<StatementNode>();
    isInsideAnyLoop = true;
} CLOSE_PAREN OPEN_CURLY (statement {
    var lastStatement = statements.get(statements.size() - 1);
    statements.remove(statements.size() - 1);

    body.add(lastStatement);
})+ CLOSE_CURLY {
    var whileStatement = new WhileStatementNode(condition, body);
    addStatement(whileStatement);

    isInsideAnyLoop = false;
};

for : 'para' OPEN_PAREN attributionl {
    isInsideAnyLoop = true;

    var initializationStatement = statements.get(statements.size() - 1);
    statements.remove(statements.size() - 1);

    if (!(initializationStatement instanceof AssignmentStatementNode)) {
        throw new ExpectedAssignmentException("in for loop initialization");
    }

    var statement = (AssignmentStatementNode)initializationStatement;
    var initialization = new ForStatementNode.Initializer(statement.getIdentifier(), statement.getExpression());
} END_OF_LINE expression {
    var condition = stack.pop();
} END_OF_LINE attributionl {
    var incrementStatement = statements.get(statements.size() - 1);
    statements.remove(statements.size() - 1);

    if (!(incrementStatement instanceof AssignmentStatementNode)) {
        throw new ExpectedAssignmentException("in for loop increment");
    }

    var assignmentIncrementStatement = (AssignmentStatementNode)incrementStatement;
    var increment = new ForStatementNode.Increment(assignmentIncrementStatement.getIdentifier(), assignmentIncrementStatement.getExpression());

    var body = new ArrayList<StatementNode>();
} CLOSE_PAREN OPEN_CURLY (statement {
    var lastStatement = statements.get(statements.size() - 1);
    statements.remove(statements.size() - 1);

    body.add(lastStatement);
})+ CLOSE_CURLY {
    var forStatement = new ForStatementNode(initialization, condition, increment, body);
    addStatement(forStatement);

    isInsideAnyLoop = false;
};

attribution : attributionl END_OF_LINE;

attributionl : IDENTIFIER {
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
};

print : 'escreva' OPEN_PAREN expression CLOSE_PAREN END_OF_LINE {
    var printStatement = new PrintStatementNode(stack.pop());
    addStatement(printStatement);
};

read : 'leia' OPEN_PAREN identifier {
    var identifier = (IdentifierNode)stack.pop();
    var symbol = symbols.get(identifier.getName());
    var symbolType = symbol.getType();
} CLOSE_PAREN END_OF_LINE {
    var readStatement = new ReadStatementNode(identifier.getName(), symbolType);
    addStatement(readStatement);
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

variable_declaration : TYPE_IDENTIFIER {
    var typeString = _input.LT(-1).getText();
    var type = Type.fromString(typeString);
} IDENTIFIER {
    var identifierString = _input.LT(-1).getText();
    var identifiers = new ArrayList<IdentifierNode>();
    var identifier = new IdentifierNode(identifierString);

    identifiers.add(identifier);

    if (symbols.containsKey(identifier.getName())) {
        throw new AlreadyDeclaredVariableException(identifier.getName());
    }
} (',' IDENTIFIER {
    identifierString = _input.LT(-1).getText();
    identifier = new IdentifierNode(identifierString);

    identifiers.add(identifier);
})* ('=' {
    isInitializingVariable = true;
} expression)? {
    var initializer = isInitializingVariable ? stack.pop() : null;

    for (var id : identifiers) {
        if (isInitializingVariable && initializer.getType() != type) {
            throw new DeclarationTypeMismatchException(id.getName(), type, initializer.getType());
        }

        var binding = new DeclarationNode(id.getName(), type, initializer);
        addDeclaration(binding);

        symbols.put(id.getName(), binding.asBinding());
    }

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

terml : (('+' | '-') {
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

unary : unary_op_expression | grouped_expression | boolean_literal | numeric_literal | identifier | string_literal;

unary_op_expression : ('!' | '-') {
    var operator = UnaryOperator.fromString(_input.LT(-1).getText());
    var unaryOperation = new UnaryExpressionNode(operator);
} (expression {
    var expression = stack.pop();

    unaryOperation.setOperand(expression);
    stack.push(unaryOperation);
});

grouped_expression : OPEN_PAREN expression CLOSE_PAREN {
    var groupedExpression = stack.pop();
    var group = new GroupedExpressionNode(groupedExpression);

    stack.push(group);
};

boolean_literal : (TRUE | FALSE) {
    var booleanLiteral = new BooleanLiteralNode(_input.LT(-1).getText().equals("verdadeiro"));
    stack.push(booleanLiteral);
};

string_literal : STRING {
    var text = _input.LT(-1).getText().substring(1, _input.LT(-1).getText().length() - 1);

    var stringLiteral = new StringLiteralNode(text);
    stack.push(stringLiteral);
};

numeric_literal : NUM {
    if (_input.LT(-1).getText().contains(".")) {
      var floatLiteral = new FloatLiteralNode(Float.parseFloat(_input.LT(-1).getText()));
      stack.push(floatLiteral);
    } else {
      var intLiteral = new IntegerLiteralNode(Integer.parseInt(_input.LT(-1).getText()));
      stack.push(intLiteral);
    }
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

END_OF_LINE : ';';

TRUE : 'verdadeiro';
FALSE : 'falso';

TYPE_IDENTIFIER : 'int' | 'float' | 'string' | 'boolean';
IDENTIFIER : [a-zA-Z_]([a-zA-Z_0-9])*;
NUM : [0-9]+('.'[0-9]+)?;
STRING : '"' ~[\r\n"]* '"';

OP_OR : '||';
OP_AND : '&&';
OP_COMP : '==' | '!=';
OP_REL : '<' | '>' | '<=' | '>=';
OP_TERM : '+' | '-';
OP_FACTOR : '*' | '/' | '%';

DOT : '.';

OPEN_PAREN : '(';
CLOSE_PAREN : ')';

OPEN_CURLY : '{';
CLOSE_CURLY : '}';

WS			: (' ' | '\n' | '\r' | '\t' ) -> skip
			;
