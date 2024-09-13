// Generated from C:/Users/gusta/dev/compiladores-ufabc-2024.2/src/IsiLang.g4 by ANTLR 4.13.1
package io.compiler.core.generated;

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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IsiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, END_OF_LINE=19, TRUE=20, FALSE=21, TYPE_IDENTIFIER=22, IDENTIFIER=23, 
		NUM=24, STRING=25, OP_OR=26, OP_AND=27, OP_COMP=28, OP_REL=29, OP_TERM=30, 
		OP_FACTOR=31, DOT=32, OPEN_PAREN=33, CLOSE_PAREN=34, OPEN_CURLY=35, CLOSE_CURLY=36, 
		WS=37;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_repl_line = 4, RULE_continue = 5, RULE_break = 6, RULE_do_while = 7, 
		RULE_while = 8, RULE_for = 9, RULE_attribution = 10, RULE_attributionl = 11, 
		RULE_print = 12, RULE_read = 13, RULE_if = 14, RULE_variable_declaration = 15, 
		RULE_expression = 16, RULE_logical_or = 17, RULE_logical_orl = 18, RULE_logical_and = 19, 
		RULE_logical_andl = 20, RULE_equality = 21, RULE_equalityl = 22, RULE_comparison = 23, 
		RULE_comparisonl = 24, RULE_term = 25, RULE_terml = 26, RULE_factor = 27, 
		RULE_factorl = 28, RULE_unary = 29, RULE_unary_op_expression = 30, RULE_grouped_expression = 31, 
		RULE_boolean_literal = 32, RULE_string_literal = 33, RULE_numeric_literal = 34, 
		RULE_identifier = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "block", "statement", "repl_line", "continue", 
			"break", "do_while", "while", "for", "attribution", "attributionl", "print", 
			"read", "if", "variable_declaration", "expression", "logical_or", "logical_orl", 
			"logical_and", "logical_andl", "equality", "equalityl", "comparison", 
			"comparisonl", "term", "terml", "factor", "factorl", "unary", "unary_op_expression", 
			"grouped_expression", "boolean_literal", "string_literal", "numeric_literal", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'fimprog'", "'continue'", "'pare'", 
			"'faca'", "'enquanto'", "'para'", "'='", "'escreva'", "'leia'", "'se'", 
			"'entao'", "'senao'", "','", "'+'", "'-'", "'!'", "';'", "'verdadeiro'", 
			"'falso'", null, null, null, null, "'||'", "'&&'", null, null, null, 
			null, "'.'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "END_OF_LINE", "TRUE", "FALSE", 
			"TYPE_IDENTIFIER", "IDENTIFIER", "NUM", "STRING", "OP_OR", "OP_AND", 
			"OP_COMP", "OP_REL", "OP_TERM", "OP_FACTOR", "DOT", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_CURLY", "CLOSE_CURLY", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public IsiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(IsiLangParser.DOT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__0);
			setState(73);
			declaration();
			setState(74);
			match(T__1);
			setState(75);
			block();
			setState(76);
			match(T__2);
			setState(77);
			match(DOT);

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

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE_IDENTIFIER) {
				{
				{
				setState(80);
				variable_declaration();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				statement();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8396272L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public ContinueContext continue_() {
			return getRuleContext(ContinueContext.class,0);
		}
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				print();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				read();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				if_();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				attribution();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				for_();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				while_();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				do_while();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				continue_();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
				break_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repl_lineContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Repl_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repl_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterRepl_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitRepl_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitRepl_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repl_lineContext repl_line() throws RecognitionException {
		Repl_lineContext _localctx = new Repl_lineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_repl_line);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{

				    statements.clear();
				    declarations.clear();

				setState(103);
				variable_declaration();

				    var lastDeclaration = declarations.get(declarations.size() - 1);
				    declarations.remove(declarations.size() - 1);

				    var declarationStatement = new ExpressionStatementNode(lastDeclaration);
				    statements.add(declarationStatement);

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				expression();

				    var expression = stack.pop();
				    var expressionStatement = new ExpressionStatementNode(expression);

				    addStatement(expressionStatement);

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueContext extends ParserRuleContext {
		public TerminalNode END_OF_LINE() { return getToken(IsiLangParser.END_OF_LINE, 0); }
		public ContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueContext continue_() throws RecognitionException {
		ContinueContext _localctx = new ContinueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__3);
			setState(113);
			match(END_OF_LINE);

			    if (!isInsideAnyLoop) {
			        throw new ContinueOutsideLoopException();
			    }

			    var continueStatement = new ContinueStatementNode();
			    addStatement(continueStatement);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends ParserRuleContext {
		public TerminalNode END_OF_LINE() { return getToken(IsiLangParser.END_OF_LINE, 0); }
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__4);
			setState(117);
			match(END_OF_LINE);

			    if (!isInsideAnyLoop) {
			        throw new BreakOutsideLoopException();
			    }

			    var breakStatement = new BreakStatementNode();
			    addStatement(breakStatement);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(IsiLangParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(IsiLangParser.CLOSE_CURLY, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(IsiLangParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(IsiLangParser.CLOSE_PAREN, 0); }
		public TerminalNode END_OF_LINE() { return getToken(IsiLangParser.END_OF_LINE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__5);

			    var body = new ArrayList<StatementNode>();
			    isInsideAnyLoop = true;

			setState(122);
			match(OPEN_CURLY);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8396272L) != 0)) {
				{
				{
				setState(123);
				statement();

				    var lastStatement = statements.get(statements.size() - 1);
				    statements.remove(statements.size() - 1);

				    body.add(lastStatement);

				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(CLOSE_CURLY);
			setState(132);
			match(T__6);
			setState(133);
			match(OPEN_PAREN);
			setState(134);
			expression();

			    var condition = stack.pop();

			setState(136);
			match(CLOSE_PAREN);
			setState(137);
			match(END_OF_LINE);

			    var doWhileStatement = new DoWhileStatementNode(body, condition);
			    addStatement(doWhileStatement);

			    isInsideAnyLoop = false;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(IsiLangParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(IsiLangParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(IsiLangParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(IsiLangParser.CLOSE_CURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__6);
			setState(141);
			match(OPEN_PAREN);
			setState(142);
			expression();

			    var condition = stack.pop();
			    var body = new ArrayList<StatementNode>();
			    isInsideAnyLoop = true;

			setState(144);
			match(CLOSE_PAREN);
			setState(145);
			match(OPEN_CURLY);
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				statement();

				    var lastStatement = statements.get(statements.size() - 1);
				    statements.remove(statements.size() - 1);

				    body.add(lastStatement);

				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8396272L) != 0) );
			setState(153);
			match(CLOSE_CURLY);

			    var whileStatement = new WhileStatementNode(condition, body);
			    addStatement(whileStatement);

			    isInsideAnyLoop = false;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(IsiLangParser.OPEN_PAREN, 0); }
		public List<AttributionlContext> attributionl() {
			return getRuleContexts(AttributionlContext.class);
		}
		public AttributionlContext attributionl(int i) {
			return getRuleContext(AttributionlContext.class,i);
		}
		public List<TerminalNode> END_OF_LINE() { return getTokens(IsiLangParser.END_OF_LINE); }
		public TerminalNode END_OF_LINE(int i) {
			return getToken(IsiLangParser.END_OF_LINE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(IsiLangParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(IsiLangParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(IsiLangParser.CLOSE_CURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__7);
			setState(157);
			match(OPEN_PAREN);
			setState(158);
			attributionl();

			    isInsideAnyLoop = true;

			    var initializationStatement = statements.get(statements.size() - 1);
			    statements.remove(statements.size() - 1);

			    if (!(initializationStatement instanceof AssignmentStatementNode)) {
			        throw new ExpectedAssignmentException("in for loop initialization");
			    }

			    var statement = (AssignmentStatementNode)initializationStatement;
			    var initialization = new ForStatementNode.Initializer(statement.getIdentifier(), statement.getExpression());

			setState(160);
			match(END_OF_LINE);
			setState(161);
			expression();

			    var condition = stack.pop();

			setState(163);
			match(END_OF_LINE);
			setState(164);
			attributionl();

			    var incrementStatement = statements.get(statements.size() - 1);
			    statements.remove(statements.size() - 1);

			    if (!(incrementStatement instanceof AssignmentStatementNode)) {
			        throw new ExpectedAssignmentException("in for loop increment");
			    }

			    var assignmentIncrementStatement = (AssignmentStatementNode)incrementStatement;
			    var increment = new ForStatementNode.Increment(assignmentIncrementStatement.getIdentifier(), assignmentIncrementStatement.getExpression());

			    var body = new ArrayList<StatementNode>();

			setState(166);
			match(CLOSE_PAREN);
			setState(167);
			match(OPEN_CURLY);
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				statement();

				    var lastStatement = statements.get(statements.size() - 1);
				    statements.remove(statements.size() - 1);

				    body.add(lastStatement);

				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8396272L) != 0) );
			setState(175);
			match(CLOSE_CURLY);

			    var forStatement = new ForStatementNode(initialization, condition, increment, body);
			    addStatement(forStatement);

			    isInsideAnyLoop = false;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributionContext extends ParserRuleContext {
		public AttributionlContext attributionl() {
			return getRuleContext(AttributionlContext.class,0);
		}
		public TerminalNode END_OF_LINE() { return getToken(IsiLangParser.END_OF_LINE, 0); }
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitAttribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitAttribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			attributionl();
			setState(179);
			match(END_OF_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributionlContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IsiLangParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributionlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributionl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterAttributionl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitAttributionl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitAttributionl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributionlContext attributionl() throws RecognitionException {
		AttributionlContext _localctx = new AttributionlContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributionl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(IDENTIFIER);

			    var identifierString = _input.LT(-1).getText();
			    var identifier = new IdentifierNode(identifierString);

			    if (!symbols.containsKey(identifier.getName())) {
			       throw new UndeclaredVariableException(identifier.getName());
			    }

			    var symbol = symbols.get(identifier.getName());
			    var symbolType = symbol.getType();

			setState(183);
			match(T__8);
			setState(184);
			expression();

			    var expression = stack.pop();

			    if (symbolType != expression.getType()) {
			       throw new AssignmentTypeMismatchException(symbolType, expression.getType());
			    }

			    var assignment = new AssignmentStatementNode(identifier.getName(), expression);
			    symbol.setInitialized();

			    addStatement(assignment);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(IsiLangParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(IsiLangParser.CLOSE_PAREN, 0); }
		public TerminalNode END_OF_LINE() { return getToken(IsiLangParser.END_OF_LINE, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__9);
			setState(188);
			match(OPEN_PAREN);
			setState(189);
			expression();
			setState(190);
			match(CLOSE_PAREN);
			setState(191);
			match(END_OF_LINE);

			    var printStatement = new PrintStatementNode(stack.pop());
			    addStatement(printStatement);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(IsiLangParser.OPEN_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(IsiLangParser.CLOSE_PAREN, 0); }
		public TerminalNode END_OF_LINE() { return getToken(IsiLangParser.END_OF_LINE, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__10);
			setState(195);
			match(OPEN_PAREN);
			setState(196);
			identifier();

			    var identifier = (IdentifierNode)stack.pop();
			    var symbol = symbols.get(identifier.getName());
			    var symbolType = symbol.getType();

			setState(198);
			match(CLOSE_PAREN);
			setState(199);
			match(END_OF_LINE);

			    var readStatement = new ReadStatementNode(identifier.getName(), symbolType);
			    addStatement(readStatement);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(IsiLangParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(IsiLangParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> OPEN_CURLY() { return getTokens(IsiLangParser.OPEN_CURLY); }
		public TerminalNode OPEN_CURLY(int i) {
			return getToken(IsiLangParser.OPEN_CURLY, i);
		}
		public List<TerminalNode> CLOSE_CURLY() { return getTokens(IsiLangParser.CLOSE_CURLY); }
		public TerminalNode CLOSE_CURLY(int i) {
			return getToken(IsiLangParser.CLOSE_CURLY, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__11);
			setState(203);
			match(OPEN_PAREN);
			setState(204);
			expression();

			    var condition = stack.pop();

			    var thenBranch = new ArrayList<StatementNode>();
			    var elseBranch = new ArrayList<StatementNode>();

			setState(206);
			match(CLOSE_PAREN);
			setState(207);
			match(T__12);
			setState(208);
			match(OPEN_CURLY);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
				statement();

				    var lastStatement = statements.get(statements.size() - 1);
				    statements.remove(statements.size() - 1);

				    thenBranch.add(lastStatement);

				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8396272L) != 0) );
			setState(216);
			match(CLOSE_CURLY);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(217);
				match(T__13);

				    hasElseBranch = true;

				setState(219);
				match(OPEN_CURLY);
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(220);
					statement();

					    if (hasElseBranch) {
					        var lastStatement = statements.get(statements.size() - 1);
					        statements.remove(statements.size() - 1);

					        elseBranch.add(lastStatement);
					    }

					}
					}
					setState(225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8396272L) != 0) );
				setState(227);
				match(CLOSE_CURLY);
				}
			}


			    var ifStatement = new IfStatementNode(condition, thenBranch, elseBranch);
			    addStatement(ifStatement);

			    hasElseBranch = false;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode TYPE_IDENTIFIER() { return getToken(IsiLangParser.TYPE_IDENTIFIER, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(IsiLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(IsiLangParser.IDENTIFIER, i);
		}
		public TerminalNode END_OF_LINE() { return getToken(IsiLangParser.END_OF_LINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(TYPE_IDENTIFIER);

			    var typeString = _input.LT(-1).getText();
			    var type = Type.fromString(typeString);

			setState(235);
			match(IDENTIFIER);

			    var identifierString = _input.LT(-1).getText();
			    var identifiers = new ArrayList<IdentifierNode>();
			    var identifier = new IdentifierNode(identifierString);

			    identifiers.add(identifier);

			    if (symbols.containsKey(identifier.getName())) {
			        throw new AlreadyDeclaredVariableException(identifier.getName());
			    }

			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(237);
				match(T__14);
				setState(238);
				match(IDENTIFIER);

				    identifierString = _input.LT(-1).getText();
				    identifier = new IdentifierNode(identifierString);

				    identifiers.add(identifier);

				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(245);
				match(T__8);

				    isInitializingVariable = true;

				setState(247);
				expression();
				}
			}


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

			setState(251);
			match(END_OF_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Logical_orContext logical_or() {
			return getRuleContext(Logical_orContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			logical_or();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_orContext extends ParserRuleContext {
		public Logical_andContext logical_and() {
			return getRuleContext(Logical_andContext.class,0);
		}
		public Logical_orlContext logical_orl() {
			return getRuleContext(Logical_orlContext.class,0);
		}
		public Logical_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterLogical_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitLogical_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitLogical_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_orContext logical_or() throws RecognitionException {
		Logical_orContext _localctx = new Logical_orContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logical_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			logical_and();
			setState(256);
			logical_orl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_orlContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(IsiLangParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(IsiLangParser.OP_OR, i);
		}
		public Logical_orlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_orl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterLogical_orl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitLogical_orl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitLogical_orl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_orlContext logical_orl() throws RecognitionException {
		Logical_orlContext _localctx = new Logical_orlContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logical_orl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(258);
					match(OP_OR);
					}

					    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
					    var binaryOperation = new BinaryExpressionNode(operator);

					    binaryOperation.setLeft(stack.pop());

					setState(260);
					equality();

					    binaryOperation.setRight(stack.pop());
					    stack.push(binaryOperation);

					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_andContext extends ParserRuleContext {
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public Logical_andlContext logical_andl() {
			return getRuleContext(Logical_andlContext.class,0);
		}
		public Logical_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterLogical_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitLogical_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitLogical_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_andContext logical_and() throws RecognitionException {
		Logical_andContext _localctx = new Logical_andContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logical_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			equality();
			setState(269);
			logical_andl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_andlContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(IsiLangParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(IsiLangParser.OP_AND, i);
		}
		public Logical_andlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_andl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterLogical_andl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitLogical_andl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitLogical_andl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_andlContext logical_andl() throws RecognitionException {
		Logical_andlContext _localctx = new Logical_andlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logical_andl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(271);
					match(OP_AND);
					}

					    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
					    var binaryOperation = new BinaryExpressionNode(operator);

					    binaryOperation.setLeft(stack.pop());

					setState(273);
					equality();

					    binaryOperation.setRight(stack.pop());
					    stack.push(binaryOperation);

					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public EqualitylContext equalityl() {
			return getRuleContext(EqualitylContext.class,0);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_equality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			comparison();
			setState(282);
			equalityl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualitylContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> OP_COMP() { return getTokens(IsiLangParser.OP_COMP); }
		public TerminalNode OP_COMP(int i) {
			return getToken(IsiLangParser.OP_COMP, i);
		}
		public EqualitylContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterEqualityl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitEqualityl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitEqualityl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualitylContext equalityl() throws RecognitionException {
		EqualitylContext _localctx = new EqualitylContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_equalityl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(284);
					match(OP_COMP);
					}

					    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
					    var binaryOperation = new BinaryExpressionNode(operator);

					    binaryOperation.setLeft(stack.pop());

					setState(286);
					comparison();

					    binaryOperation.setRight(stack.pop());
					    stack.push(binaryOperation);

					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ComparisonlContext comparisonl() {
			return getRuleContext(ComparisonlContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			term();
			setState(295);
			comparisonl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonlContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> OP_REL() { return getTokens(IsiLangParser.OP_REL); }
		public TerminalNode OP_REL(int i) {
			return getToken(IsiLangParser.OP_REL, i);
		}
		public ComparisonlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterComparisonl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitComparisonl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitComparisonl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonlContext comparisonl() throws RecognitionException {
		ComparisonlContext _localctx = new ComparisonlContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comparisonl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(297);
					match(OP_REL);
					}

					    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
					    var binaryOperation = new BinaryExpressionNode(operator);

					    binaryOperation.setLeft(stack.pop());

					setState(299);
					term();

					    binaryOperation.setRight(stack.pop());
					    stack.push(binaryOperation);

					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermlContext terml() {
			return getRuleContext(TermlContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			factor();
			setState(308);
			terml();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermlContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTerml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTerml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitTerml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermlContext terml() throws RecognitionException {
		TermlContext _localctx = new TermlContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_terml);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					_la = _input.LA(1);
					if ( !(_la==T__15 || _la==T__16) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}

					    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
					    var binaryOperation = new BinaryExpressionNode(operator);

					    binaryOperation.setLeft(stack.pop());

					setState(312);
					factor();

					    binaryOperation.setRight(stack.pop());
					    stack.push(binaryOperation);

					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public FactorlContext factorl() {
			return getRuleContext(FactorlContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			unary();
			setState(321);
			factorl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorlContext extends ParserRuleContext {
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> OP_FACTOR() { return getTokens(IsiLangParser.OP_FACTOR); }
		public TerminalNode OP_FACTOR(int i) {
			return getToken(IsiLangParser.OP_FACTOR, i);
		}
		public FactorlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterFactorl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitFactorl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitFactorl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorlContext factorl() throws RecognitionException {
		FactorlContext _localctx = new FactorlContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_factorl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(323);
					match(OP_FACTOR);
					}

					    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
					    var binaryOperation = new BinaryExpressionNode(operator);

					    if (stack.peek().isLiteral() || stack.peek().isIdentifier() || stack.peek().isGroup()) {
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

					setState(325);
					unary();

					    binaryOperation.setRight(stack.pop());
					    stack.push(binaryOperation);

					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ParserRuleContext {
		public Unary_op_expressionContext unary_op_expression() {
			return getRuleContext(Unary_op_expressionContext.class,0);
		}
		public Grouped_expressionContext grouped_expression() {
			return getRuleContext(Grouped_expressionContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unary);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				unary_op_expression();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				grouped_expression();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				boolean_literal();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				numeric_literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				identifier();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				string_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_op_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Unary_op_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterUnary_op_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitUnary_op_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitUnary_op_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_op_expressionContext unary_op_expression() throws RecognitionException {
		Unary_op_expressionContext _localctx = new Unary_op_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unary_op_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			    var operator = UnaryOperator.fromString(_input.LT(-1).getText());
			    var unaryOperation = new UnaryExpressionNode(operator);

			{
			setState(343);
			expression();

			    var expression = stack.pop();

			    unaryOperation.setOperand(expression);
			    stack.push(unaryOperation);

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Grouped_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(IsiLangParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(IsiLangParser.CLOSE_PAREN, 0); }
		public Grouped_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouped_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterGrouped_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitGrouped_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitGrouped_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouped_expressionContext grouped_expression() throws RecognitionException {
		Grouped_expressionContext _localctx = new Grouped_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_grouped_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(OPEN_PAREN);
			setState(347);
			expression();
			setState(348);
			match(CLOSE_PAREN);

			    var groupedExpression = stack.pop();
			    var group = new GroupedExpressionNode(groupedExpression);

			    stack.push(group);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(IsiLangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(IsiLangParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			    var booleanLiteral = new BooleanLiteralNode(_input.LT(-1).getText().equals("verdadeiro"));
			    stack.push(booleanLiteral);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(IsiLangParser.STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(STRING);

			    var text = _input.LT(-1).getText().substring(1, _input.LT(-1).getText().length() - 1);

			    var stringLiteral = new StringLiteralNode(text);
			    stack.push(stringLiteral);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_literalContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(IsiLangParser.NUM, 0); }
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_numeric_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(NUM);

			    if (_input.LT(-1).getText().contains(".")) {
			      var floatLiteral = new FloatLiteralNode(Float.parseFloat(_input.LT(-1).getText()));
			      stack.push(floatLiteral);
			    } else {
			      var intLiteral = new IntegerLiteralNode(Integer.parseInt(_input.LT(-1).getText()));
			      stack.push(intLiteral);
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IsiLangParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(IDENTIFIER);

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

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u016c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001R\b\u0001\n\u0001"+
		"\f\u0001U\t\u0001\u0001\u0002\u0004\u0002X\b\u0002\u000b\u0002\f\u0002"+
		"Y\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003e\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004o\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u007f\b\u0007\n\u0007\f\u0007\u0082\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0004\b\u0096\b\b\u000b\b\f\b\u0097\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00ac\b\t\u000b\t\f"+
		"\t\u00ad\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u00d5\b\u000e\u000b\u000e\f\u000e\u00d6\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0004\u000e\u00e0\b\u000e\u000b\u000e\f\u000e\u00e1\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00e6\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00f1\b\u000f\n\u000f\f\u000f\u00f4\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00f9\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0108"+
		"\b\u0012\n\u0012\f\u0012\u010b\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0115\b\u0014\n\u0014\f\u0014\u0118\t\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0122\b\u0016\n\u0016\f\u0016\u0125\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u012f\b\u0018\n\u0018\f\u0018\u0132\t\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u013c\b\u001a\n\u001a\f\u001a\u013f\t\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u0149\b\u001c\n\u001c\f\u001c\u014c\t\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0154\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0000\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000"+
		"\u0003\u0001\u0000\u0010\u0011\u0001\u0000\u0011\u0012\u0001\u0000\u0014"+
		"\u0015\u0166\u0000H\u0001\u0000\u0000\u0000\u0002S\u0001\u0000\u0000\u0000"+
		"\u0004W\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\bn\u0001"+
		"\u0000\u0000\u0000\np\u0001\u0000\u0000\u0000\ft\u0001\u0000\u0000\u0000"+
		"\u000ex\u0001\u0000\u0000\u0000\u0010\u008c\u0001\u0000\u0000\u0000\u0012"+
		"\u009c\u0001\u0000\u0000\u0000\u0014\u00b2\u0001\u0000\u0000\u0000\u0016"+
		"\u00b5\u0001\u0000\u0000\u0000\u0018\u00bb\u0001\u0000\u0000\u0000\u001a"+
		"\u00c2\u0001\u0000\u0000\u0000\u001c\u00ca\u0001\u0000\u0000\u0000\u001e"+
		"\u00e9\u0001\u0000\u0000\u0000 \u00fd\u0001\u0000\u0000\u0000\"\u00ff"+
		"\u0001\u0000\u0000\u0000$\u0109\u0001\u0000\u0000\u0000&\u010c\u0001\u0000"+
		"\u0000\u0000(\u0116\u0001\u0000\u0000\u0000*\u0119\u0001\u0000\u0000\u0000"+
		",\u0123\u0001\u0000\u0000\u0000.\u0126\u0001\u0000\u0000\u00000\u0130"+
		"\u0001\u0000\u0000\u00002\u0133\u0001\u0000\u0000\u00004\u013d\u0001\u0000"+
		"\u0000\u00006\u0140\u0001\u0000\u0000\u00008\u014a\u0001\u0000\u0000\u0000"+
		":\u0153\u0001\u0000\u0000\u0000<\u0155\u0001\u0000\u0000\u0000>\u015a"+
		"\u0001\u0000\u0000\u0000@\u015f\u0001\u0000\u0000\u0000B\u0162\u0001\u0000"+
		"\u0000\u0000D\u0165\u0001\u0000\u0000\u0000F\u0168\u0001\u0000\u0000\u0000"+
		"HI\u0005\u0001\u0000\u0000IJ\u0003\u0002\u0001\u0000JK\u0005\u0002\u0000"+
		"\u0000KL\u0003\u0004\u0002\u0000LM\u0005\u0003\u0000\u0000MN\u0005 \u0000"+
		"\u0000NO\u0006\u0000\uffff\uffff\u0000O\u0001\u0001\u0000\u0000\u0000"+
		"PR\u0003\u001e\u000f\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u0003\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VX\u0003\u0006\u0003\u0000"+
		"WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z\u0005\u0001\u0000\u0000\u0000[e\u0003"+
		"\u0018\f\u0000\\e\u0003\u001a\r\u0000]e\u0003\u001c\u000e\u0000^e\u0003"+
		"\u0014\n\u0000_e\u0003\u0012\t\u0000`e\u0003\u0010\b\u0000ae\u0003\u000e"+
		"\u0007\u0000be\u0003\n\u0005\u0000ce\u0003\f\u0006\u0000d[\u0001\u0000"+
		"\u0000\u0000d\\\u0001\u0000\u0000\u0000d]\u0001\u0000\u0000\u0000d^\u0001"+
		"\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000"+
		"da\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000e\u0007\u0001\u0000\u0000\u0000fg\u0006\u0004\uffff\uffff\u0000"+
		"gh\u0003\u001e\u000f\u0000hi\u0006\u0004\uffff\uffff\u0000io\u0001\u0000"+
		"\u0000\u0000jo\u0003\u0006\u0003\u0000kl\u0003 \u0010\u0000lm\u0006\u0004"+
		"\uffff\uffff\u0000mo\u0001\u0000\u0000\u0000nf\u0001\u0000\u0000\u0000"+
		"nj\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000o\t\u0001\u0000\u0000"+
		"\u0000pq\u0005\u0004\u0000\u0000qr\u0005\u0013\u0000\u0000rs\u0006\u0005"+
		"\uffff\uffff\u0000s\u000b\u0001\u0000\u0000\u0000tu\u0005\u0005\u0000"+
		"\u0000uv\u0005\u0013\u0000\u0000vw\u0006\u0006\uffff\uffff\u0000w\r\u0001"+
		"\u0000\u0000\u0000xy\u0005\u0006\u0000\u0000yz\u0006\u0007\uffff\uffff"+
		"\u0000z\u0080\u0005#\u0000\u0000{|\u0003\u0006\u0003\u0000|}\u0006\u0007"+
		"\uffff\uffff\u0000}\u007f\u0001\u0000\u0000\u0000~{\u0001\u0000\u0000"+
		"\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0005$\u0000\u0000\u0084"+
		"\u0085\u0005\u0007\u0000\u0000\u0085\u0086\u0005!\u0000\u0000\u0086\u0087"+
		"\u0003 \u0010\u0000\u0087\u0088\u0006\u0007\uffff\uffff\u0000\u0088\u0089"+
		"\u0005\"\u0000\u0000\u0089\u008a\u0005\u0013\u0000\u0000\u008a\u008b\u0006"+
		"\u0007\uffff\uffff\u0000\u008b\u000f\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\u0007\u0000\u0000\u008d\u008e\u0005!\u0000\u0000\u008e\u008f\u0003"+
		" \u0010\u0000\u008f\u0090\u0006\b\uffff\uffff\u0000\u0090\u0091\u0005"+
		"\"\u0000\u0000\u0091\u0095\u0005#\u0000\u0000\u0092\u0093\u0003\u0006"+
		"\u0003\u0000\u0093\u0094\u0006\b\uffff\uffff\u0000\u0094\u0096\u0001\u0000"+
		"\u0000\u0000\u0095\u0092\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0005$\u0000"+
		"\u0000\u009a\u009b\u0006\b\uffff\uffff\u0000\u009b\u0011\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\b\u0000\u0000\u009d\u009e\u0005!\u0000\u0000"+
		"\u009e\u009f\u0003\u0016\u000b\u0000\u009f\u00a0\u0006\t\uffff\uffff\u0000"+
		"\u00a0\u00a1\u0005\u0013\u0000\u0000\u00a1\u00a2\u0003 \u0010\u0000\u00a2"+
		"\u00a3\u0006\t\uffff\uffff\u0000\u00a3\u00a4\u0005\u0013\u0000\u0000\u00a4"+
		"\u00a5\u0003\u0016\u000b\u0000\u00a5\u00a6\u0006\t\uffff\uffff\u0000\u00a6"+
		"\u00a7\u0005\"\u0000\u0000\u00a7\u00ab\u0005#\u0000\u0000\u00a8\u00a9"+
		"\u0003\u0006\u0003\u0000\u00a9\u00aa\u0006\t\uffff\uffff\u0000\u00aa\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005$\u0000\u0000\u00b0\u00b1\u0006\t\uffff\uffff\u0000\u00b1\u0013"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\u0016\u000b\u0000\u00b3\u00b4"+
		"\u0005\u0013\u0000\u0000\u00b4\u0015\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0017\u0000\u0000\u00b6\u00b7\u0006\u000b\uffff\uffff\u0000\u00b7"+
		"\u00b8\u0005\t\u0000\u0000\u00b8\u00b9\u0003 \u0010\u0000\u00b9\u00ba"+
		"\u0006\u000b\uffff\uffff\u0000\u00ba\u0017\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005\n\u0000\u0000\u00bc\u00bd\u0005!\u0000\u0000\u00bd\u00be"+
		"\u0003 \u0010\u0000\u00be\u00bf\u0005\"\u0000\u0000\u00bf\u00c0\u0005"+
		"\u0013\u0000\u0000\u00c0\u00c1\u0006\f\uffff\uffff\u0000\u00c1\u0019\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0005\u000b\u0000\u0000\u00c3\u00c4\u0005"+
		"!\u0000\u0000\u00c4\u00c5\u0003F#\u0000\u00c5\u00c6\u0006\r\uffff\uffff"+
		"\u0000\u00c6\u00c7\u0005\"\u0000\u0000\u00c7\u00c8\u0005\u0013\u0000\u0000"+
		"\u00c8\u00c9\u0006\r\uffff\uffff\u0000\u00c9\u001b\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005\f\u0000\u0000\u00cb\u00cc\u0005!\u0000\u0000\u00cc"+
		"\u00cd\u0003 \u0010\u0000\u00cd\u00ce\u0006\u000e\uffff\uffff\u0000\u00ce"+
		"\u00cf\u0005\"\u0000\u0000\u00cf\u00d0\u0005\r\u0000\u0000\u00d0\u00d4"+
		"\u0005#\u0000\u0000\u00d1\u00d2\u0003\u0006\u0003\u0000\u00d2\u00d3\u0006"+
		"\u000e\uffff\uffff\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00e5\u0005$\u0000\u0000\u00d9\u00da\u0005"+
		"\u000e\u0000\u0000\u00da\u00db\u0006\u000e\uffff\uffff\u0000\u00db\u00df"+
		"\u0005#\u0000\u0000\u00dc\u00dd\u0003\u0006\u0003\u0000\u00dd\u00de\u0006"+
		"\u000e\uffff\uffff\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005$\u0000\u0000\u00e4\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e5\u00d9\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0006"+
		"\u000e\uffff\uffff\u0000\u00e8\u001d\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0005\u0016\u0000\u0000\u00ea\u00eb\u0006\u000f\uffff\uffff\u0000\u00eb"+
		"\u00ec\u0005\u0017\u0000\u0000\u00ec\u00f2\u0006\u000f\uffff\uffff\u0000"+
		"\u00ed\u00ee\u0005\u000f\u0000\u0000\u00ee\u00ef\u0005\u0017\u0000\u0000"+
		"\u00ef\u00f1\u0006\u000f\uffff\uffff\u0000\u00f0\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\t\u0000\u0000"+
		"\u00f6\u00f7\u0006\u000f\uffff\uffff\u0000\u00f7\u00f9\u0003 \u0010\u0000"+
		"\u00f8\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0006\u000f\uffff\uffff"+
		"\u0000\u00fb\u00fc\u0005\u0013\u0000\u0000\u00fc\u001f\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0003\"\u0011\u0000\u00fe!\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0003&\u0013\u0000\u0100\u0101\u0003$\u0012\u0000\u0101#"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u001a\u0000\u0000\u0103\u0104"+
		"\u0006\u0012\uffff\uffff\u0000\u0104\u0105\u0003*\u0015\u0000\u0105\u0106"+
		"\u0006\u0012\uffff\uffff\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107"+
		"\u0102\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"%\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0003*\u0015\u0000\u010d\u010e\u0003(\u0014\u0000\u010e\'\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0005\u001b\u0000\u0000\u0110\u0111\u0006\u0014"+
		"\uffff\uffff\u0000\u0111\u0112\u0003*\u0015\u0000\u0112\u0113\u0006\u0014"+
		"\uffff\uffff\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u010f\u0001"+
		"\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117)\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a\u0003.\u0017"+
		"\u0000\u011a\u011b\u0003,\u0016\u0000\u011b+\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005\u001c\u0000\u0000\u011d\u011e\u0006\u0016\uffff\uffff\u0000"+
		"\u011e\u011f\u0003.\u0017\u0000\u011f\u0120\u0006\u0016\uffff\uffff\u0000"+
		"\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011c\u0001\u0000\u0000\u0000"+
		"\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124-\u0001\u0000\u0000\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0126\u0127\u00032\u0019\u0000\u0127\u0128"+
		"\u00030\u0018\u0000\u0128/\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u001d"+
		"\u0000\u0000\u012a\u012b\u0006\u0018\uffff\uffff\u0000\u012b\u012c\u0003"+
		"2\u0019\u0000\u012c\u012d\u0006\u0018\uffff\uffff\u0000\u012d\u012f\u0001"+
		"\u0000\u0000\u0000\u012e\u0129\u0001\u0000\u0000\u0000\u012f\u0132\u0001"+
		"\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u01311\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u00036\u001b\u0000\u0134\u0135\u00034\u001a\u0000"+
		"\u01353\u0001\u0000\u0000\u0000\u0136\u0137\u0007\u0000\u0000\u0000\u0137"+
		"\u0138\u0006\u001a\uffff\uffff\u0000\u0138\u0139\u00036\u001b\u0000\u0139"+
		"\u013a\u0006\u001a\uffff\uffff\u0000\u013a\u013c\u0001\u0000\u0000\u0000"+
		"\u013b\u0136\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000"+
		"\u013e5\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0003:\u001d\u0000\u0141\u0142\u00038\u001c\u0000\u01427\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0005\u001f\u0000\u0000\u0144\u0145\u0006"+
		"\u001c\uffff\uffff\u0000\u0145\u0146\u0003:\u001d\u0000\u0146\u0147\u0006"+
		"\u001c\uffff\uffff\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0143"+
		"\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b9\u0001"+
		"\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u0154\u0003"+
		"<\u001e\u0000\u014e\u0154\u0003>\u001f\u0000\u014f\u0154\u0003@ \u0000"+
		"\u0150\u0154\u0003D\"\u0000\u0151\u0154\u0003F#\u0000\u0152\u0154\u0003"+
		"B!\u0000\u0153\u014d\u0001\u0000\u0000\u0000\u0153\u014e\u0001\u0000\u0000"+
		"\u0000\u0153\u014f\u0001\u0000\u0000\u0000\u0153\u0150\u0001\u0000\u0000"+
		"\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0152\u0001\u0000\u0000"+
		"\u0000\u0154;\u0001\u0000\u0000\u0000\u0155\u0156\u0007\u0001\u0000\u0000"+
		"\u0156\u0157\u0006\u001e\uffff\uffff\u0000\u0157\u0158\u0003 \u0010\u0000"+
		"\u0158\u0159\u0006\u001e\uffff\uffff\u0000\u0159=\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0005!\u0000\u0000\u015b\u015c\u0003 \u0010\u0000\u015c\u015d"+
		"\u0005\"\u0000\u0000\u015d\u015e\u0006\u001f\uffff\uffff\u0000\u015e?"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0007\u0002\u0000\u0000\u0160\u0161"+
		"\u0006 \uffff\uffff\u0000\u0161A\u0001\u0000\u0000\u0000\u0162\u0163\u0005"+
		"\u0019\u0000\u0000\u0163\u0164\u0006!\uffff\uffff\u0000\u0164C\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0005\u0018\u0000\u0000\u0166\u0167\u0006\"\uffff"+
		"\uffff\u0000\u0167E\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u0017\u0000"+
		"\u0000\u0169\u016a\u0006#\uffff\uffff\u0000\u016aG\u0001\u0000\u0000\u0000"+
		"\u0013SYdn\u0080\u0097\u00ad\u00d6\u00e1\u00e5\u00f2\u00f8\u0109\u0116"+
		"\u0123\u0130\u013d\u014a\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}