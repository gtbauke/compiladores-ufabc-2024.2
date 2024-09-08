grammar IsiLang;

/*@header {
	import java.util.ArrayList;
	import java.util.Stack;
	import java.util.HashMap;
	import io.compiler.types.*;
	import io.compiler.core.exceptions.*;
	import io.compiler.core.ast.*;
}

@members {
    private HashMap<String,Var> symbolTable = new HashMap<String, Var>();
    private ArrayList<Var> currentDecl = new ArrayList<Var>();
    private Types currentType;
    private Types leftType=null, rightType=null;
    private Program program = new Program();
    private String strExpr = "";
    private IfCommand currentIfCommand;

    private Stack<ArrayList<Command>> stack = new Stack<ArrayList<Command>>();


    public void updateType(){
    	for(Var v: currentDecl){
    	   v.setType(currentType);
    	   symbolTable.put(v.getId(), v);
    	}
    }
    public void exibirVar(){
        for (String id: symbolTable.keySet()){
        	System.out.println(symbolTable.get(id));
        }
    }

    public Program getProgram(){
    	return this.program;
    	}

    public boolean isDeclared(String id){
    	return symbolTable.get(id) != null;
    }
}

programa	: 'programa' ID  { program.setName(_input.LT(-1).getText());
                               stack.push(new ArrayList<Command>());
                             }
               declaravar+
               'inicio'
               comando+
               'fim'
               'fimprog'

               {
                  program.setSymbolTable(symbolTable);
                  program.setCommandList(stack.pop());
               }
			;

declaravar	: 'declare' { currentDecl.clear(); }
               ID  { currentDecl.add(new Var(_input.LT(-1).getText()));}
               ( VIRG ID
              		 { currentDecl.add(new Var(_input.LT(-1).getText()));}
               )*
               DP
               (
               'number' {currentType = Types.NUMBER;}
               |
               'text' {currentType = Types.TEXT;}
               )

               { updateType(); }
               PV
			;

comando     :  cmdAttrib
			|  cmdLeitura
			|  cmdEscrita
			|  cmdIF
			;

cmdIF		: 'se'  { stack.push(new ArrayList<Command>());
                      strExpr = "";
                      currentIfCommand = new IfCommand();
                    }
               AP
               expr
               OPREL  { strExpr += _input.LT(-1).getText(); }
               expr
               FP  { currentIfCommand.setExpression(strExpr); }
               'entao'
               comando+
               {
                  currentIfCommand.setTrueList(stack.pop());
               }
               ( 'senao'
                  { stack.push(new ArrayList<Command>()); }
                 comando+
                 {
                   currentIfCommand.setFalseList(stack.pop());
                 }
               )?
               'fimse'
               {
               	   stack.peek().add(currentIfCommand);
               }
			;

cmdAttrib   : ID { if (!isDeclared(_input.LT(-1).getText())) {
                       throw new UFABCSemanticException("Undeclared Variable: "+_input.LT(-1).getText());
                   }
                   symbolTable.get(_input.LT(-1).getText()).setInitialized(true);
                   leftType = symbolTable.get(_input.LT(-1).getText()).getType();
                 }
              OP_AT
              expr
              PV

              {
                 System.out.println("Left  Side Expression Type = "+leftType);
                 System.out.println("Right Side Expression Type = "+rightType);
                 if (leftType.getValue() < rightType.getValue()){
                    throw new UFABCSemanticException("Type Mismatchig on Assignment");
                 }
              }
			;

cmdLeitura  : 'leia' AP
               ID { if (!isDeclared(_input.LT(-1).getText())) {
                       throw new UFABCSemanticException("Undeclared Variable: "+_input.LT(-1).getText());
                    }
                    symbolTable.get(_input.LT(-1).getText()).setInitialized(true);
                    Command cmdRead = new ReadCommand(symbolTable.get(_input.LT(-1).getText()));
                    stack.peek().add(cmdRead);
                  }
               FP
               PV
			;

cmdEscrita  : 'escreva' AP
              ( termo  { Command cmdWrite = new WriteCommand(_input.LT(-1).getText());
                         stack.peek().add(cmdWrite);
                       }
              )
              FP PV { rightType = null;}
			;


expr		:  termo  { strExpr += _input.LT(-1).getText(); } exprl
			;

termo		: ID  { if (!isDeclared(_input.LT(-1).getText())) {
                       throw new UFABCSemanticException("Undeclared Variable: "+_input.LT(-1).getText());
                    }
                    if (!symbolTable.get(_input.LT(-1).getText()).isInitialized()){
                       throw new UFABCSemanticException("Variable "+_input.LT(-1).getText()+" has no value assigned");
                    }
                    if (rightType == null){
                       rightType = symbolTable.get(_input.LT(-1).getText()).getType();
                       //System.out.println("Encontrei pela 1a vez uma variavel = "+rightType);
                    }
                    else{
                       if (symbolTable.get(_input.LT(-1).getText()).getType().getValue() > rightType.getValue()){
                          rightType = symbolTable.get(_input.LT(-1).getText()).getType();
                          //System.out.println("Ja havia tipo declarado e mudou para = "+rightType);

                       }
                    }
                  }
			| NUM    {  if (rightType == null) {
			 				rightType = Types.NUMBER;
			 				//System.out.println("Encontrei um numero pela 1a vez "+rightType);
			            }
			            else{
			                if (rightType.getValue() < Types.NUMBER.getValue()){
			                	rightType = Types.NUMBER;
			                	//System.out.println("Mudei o tipo para Number = "+rightType);
			                }
			            }
			         }
			| TEXTO  {  if (rightType == null) {
			 				rightType = Types.TEXT;
			 				//System.out.println("Encontrei pela 1a vez um texto ="+ rightType);
			            }
			            else{
			                if (rightType.getValue() < Types.TEXT.getValue()){
			                	rightType = Types.TEXT;
			                	//System.out.println("Mudei o tipo para TEXT = "+rightType);

			                }
			            }
			         }
			;

exprl		: ( OP { strExpr += _input.LT(-1).getText(); }
                termo { strExpr += _input.LT(-1).getText(); }
              ) *
			;*/

@header {
    import io.compiler.core.ast.*;
    import io.compiler.core.ast.literals.*;
    import io.compiler.types.*;
    import java.util.Stack;
    import io.compiler.core.operators.*;
}

@members {
    private Stack<AstNode> stack = new Stack<AstNode>();
    private AstNode root = null;

    public AstNode getRoot(){
        if (root == null) {
            root = stack.pop();
        }

        return root;
    }
}

/* TODO: handle assingmnts, check for undeclared variables or already declared variables */
expression : assignment END_OF_LINE;
assignment : (IDENTIFIER '=' assignment) | logical_or;

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

    if (stack.peek().isLiteral()) {
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

unary : NUM {
    if (_input.LT(-1).getText().contains(".")) {
        var floatLiteral = new FloatLiteralNode(Float.parseFloat(_input.LT(-1).getText()));
        stack.push(floatLiteral);
    } else {
        var intLiteral = new IntegerLiteralNode(Integer.parseInt(_input.LT(-1).getText()));
        stack.push(intLiteral);
    }
};

END_OF_LINE : ';';
IDENTIFIER : [a-zA-Z_]([a-zA-Z_0-9])*;
NUM : ('-')?[0-9]+('.'[0-9]+)?;

OP_OR : '||';
OP_AND : '&&';
OP_COMP : '==' | '!=';
OP_REL : '<' | '>' | '<=' | '>=';
OP_TERM : '+' | '-';
OP_FACTOR : '*' | '/';

WS			: (' ' | '\n' | '\r' | '\t' ) -> skip
			;
