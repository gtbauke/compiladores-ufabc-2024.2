// Generated from C:/Users/gusta/dev/compildores-2024-2-ufabc/src/IsiLang.g4 by ANTLR 4.13.1
package io.compiler.core.generated;

    import io.compiler.core.ast.*;
    import io.compiler.core.ast.literals.*;
    import io.compiler.core.ast.statements.*;
    import io.compiler.core.operators.*;
    import io.compiler.core.exceptions.*;
    import io.compiler.types.*;
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
		T__9=10, END_OF_LINE=11, IDENTIFIER=12, NUM=13, STRING=14, OP_OR=15, OP_AND=16, 
		OP_COMP=17, OP_REL=18, OP_TERM=19, OP_FACTOR=20, OPEN_PAREN=21, CLOSE_PAREN=22, 
		WS=23;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_statement = 2, RULE_attribution = 3, 
		RULE_print = 4, RULE_assignment = 5, RULE_expression = 6, RULE_logical_or = 7, 
		RULE_logical_orl = 8, RULE_logical_and = 9, RULE_logical_andl = 10, RULE_equality = 11, 
		RULE_equalityl = 12, RULE_comparison = 13, RULE_comparisonl = 14, RULE_term = 15, 
		RULE_terml = 16, RULE_factor = 17, RULE_factorl = 18, RULE_unary = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "statement", "attribution", "print", "assignment", 
			"expression", "logical_or", "logical_orl", "logical_and", "logical_andl", 
			"equality", "equalityl", "comparison", "comparisonl", "term", "terml", 
			"factor", "factorl", "unary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'declares'", "'begin'", "'end'", "'='", "'print'", 
			"'int'", "'float'", "'string'", "'boolean'", "';'", null, null, null, 
			"'||'", "'&&'", null, null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "END_OF_LINE", 
			"IDENTIFIER", "NUM", "STRING", "OP_OR", "OP_AND", "OP_COMP", "OP_REL", 
			"OP_TERM", "OP_FACTOR", "OPEN_PAREN", "CLOSE_PAREN", "WS"
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

	public IsiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IsiLangParser.IDENTIFIER, 0); }
		public TerminalNode END_OF_LINE() { return getToken(IsiLangParser.END_OF_LINE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			match(IDENTIFIER);
			setState(42);
			match(T__1);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				declaration();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0) );
			setState(48);
			match(T__2);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 || _la==IDENTIFIER );
			setState(54);
			match(T__3);
			setState(55);
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
	public static class DeclarationContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(57);
					assignment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(60); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				attribution();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				print();
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
	public static class AttributionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IsiLangParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 6, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(IDENTIFIER);
			setState(67);
			match(T__4);
			setState(68);
			expression();
			setState(69);
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
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__5);
			setState(72);
			match(OPEN_PAREN);
			setState(73);
			expression();
			setState(74);
			match(CLOSE_PAREN);
			setState(75);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IsiLangParser.IDENTIFIER, 0); }
		public TerminalNode END_OF_LINE() { return getToken(IsiLangParser.END_OF_LINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			    var typeString = _input.LT(-1).getText();
			    var type = Type.fromString(typeString);

			setState(80);
			match(IDENTIFIER);

			    var identifierString = _input.LT(-1).getText();
			    var identifier = new IdentifierNode(identifierString);

			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(82);
				match(T__4);

				    isInitializingVariable = true;

				setState(84);
				expression();
				}
			}


			    var initializer = isInitializingVariable ? stack.pop() : null;

			    if (isInitializingVariable && initializer.getType() != type) {
			        throw new DeclarationTypeMismatchException(type, initializer.getType());
			    }

			    var binding = new BindingNode(identifier.getName(), type, initializer);
			    addDeclaration(binding);

			    symbols.put(identifier.getName(), binding.asBinding());
			    isInitializingVariable = false;

			setState(88);
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
		enterRule(_localctx, 12, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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
		enterRule(_localctx, 14, RULE_logical_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			logical_and();
			setState(93);
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
		enterRule(_localctx, 16, RULE_logical_orl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				{
				setState(95);
				match(OP_OR);
				}

				    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
				    var binaryOperation = new BinaryExpressionNode(operator);

				    binaryOperation.setLeft(stack.pop());

				setState(97);
				equality();

				    binaryOperation.setRight(stack.pop());
				    stack.push(binaryOperation);

				}
				}
				setState(104);
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
		enterRule(_localctx, 18, RULE_logical_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			equality();
			setState(106);
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
		enterRule(_localctx, 20, RULE_logical_andl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				{
				setState(108);
				match(OP_AND);
				}

				    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
				    var binaryOperation = new BinaryExpressionNode(operator);

				    binaryOperation.setLeft(stack.pop());

				setState(110);
				equality();

				    binaryOperation.setRight(stack.pop());
				    stack.push(binaryOperation);

				}
				}
				setState(117);
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
		enterRule(_localctx, 22, RULE_equality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			comparison();
			setState(119);
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
		enterRule(_localctx, 24, RULE_equalityl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMP) {
				{
				{
				{
				setState(121);
				match(OP_COMP);
				}

				    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
				    var binaryOperation = new BinaryExpressionNode(operator);

				    binaryOperation.setLeft(stack.pop());

				setState(123);
				comparison();

				    binaryOperation.setRight(stack.pop());
				    stack.push(binaryOperation);

				}
				}
				setState(130);
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
		enterRule(_localctx, 26, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			term();
			setState(132);
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
		enterRule(_localctx, 28, RULE_comparisonl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_REL) {
				{
				{
				{
				setState(134);
				match(OP_REL);
				}

				    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
				    var binaryOperation = new BinaryExpressionNode(operator);

				    binaryOperation.setLeft(stack.pop());

				setState(136);
				term();

				    binaryOperation.setRight(stack.pop());
				    stack.push(binaryOperation);

				}
				}
				setState(143);
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
		enterRule(_localctx, 30, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			factor();
			setState(145);
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
		public List<TerminalNode> OP_TERM() { return getTokens(IsiLangParser.OP_TERM); }
		public TerminalNode OP_TERM(int i) {
			return getToken(IsiLangParser.OP_TERM, i);
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
		enterRule(_localctx, 32, RULE_terml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_TERM) {
				{
				{
				{
				setState(147);
				match(OP_TERM);
				}

				    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
				    var binaryOperation = new BinaryExpressionNode(operator);

				    binaryOperation.setLeft(stack.pop());

				setState(149);
				factor();

				    binaryOperation.setRight(stack.pop());
				    stack.push(binaryOperation);

				}
				}
				setState(156);
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
		enterRule(_localctx, 34, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			unary();
			setState(158);
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
		enterRule(_localctx, 36, RULE_factorl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_FACTOR) {
				{
				{
				{
				setState(160);
				match(OP_FACTOR);
				}

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

				setState(162);
				unary();

				    binaryOperation.setRight(stack.pop());
				    stack.push(binaryOperation);

				}
				}
				setState(169);
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
	public static class UnaryContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(IsiLangParser.NUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(IsiLangParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(IsiLangParser.STRING, 0); }
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
		enterRule(_localctx, 38, RULE_unary);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(NUM);

				    if (_input.LT(-1).getText().contains(".")) {
				        var floatLiteral = new FloatLiteralNode(Float.parseFloat(_input.LT(-1).getText()));
				        stack.push(floatLiteral);
				    } else {
				        var intLiteral = new IntegerLiteralNode(Integer.parseInt(_input.LT(-1).getText()));
				        stack.push(intLiteral);
				    }

				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(IDENTIFIER);

				    var identifier = new IdentifierNode(_input.LT(-1).getText());

				    if (symbols.containsKey(identifier.getName())) {
				        var binding = symbols.get(identifier.getName());
				        identifier.setType(binding.getType());
				    }

				    stack.push(identifier);

				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(STRING);

				    var stringLiteral = new StringLiteralNode(_input.LT(-1).getText());
				    stack.push(stringLiteral);

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

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u00b3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0004\u0000-\b\u0000\u000b\u0000\f\u0000.\u0001\u0000\u0001\u0000"+
		"\u0004\u00003\b\u0000\u000b\u0000\f\u00004\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0004\u0001;\b\u0001\u000b\u0001\f\u0001<\u0001\u0002"+
		"\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005V\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\be\b\b\n\b\f\bh\t\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\nr\b\n\n\n\f\nu\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u007f\b\f\n\f\f\f\u0082"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u008c\b\u000e\n\u000e\f\u000e\u008f\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0099\b\u0010\n\u0010\f\u0010\u009c"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00a6\b\u0012\n\u0012\f\u0012"+
		"\u00a9\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00b1\b\u0013\u0001\u0013\u0000\u0000\u0014\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&\u0000\u0001\u0001\u0000\u0007\n\u00ab\u0000(\u0001\u0000\u0000"+
		"\u0000\u0002:\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006"+
		"B\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000"+
		"\u0000\fZ\u0001\u0000\u0000\u0000\u000e\\\u0001\u0000\u0000\u0000\u0010"+
		"f\u0001\u0000\u0000\u0000\u0012i\u0001\u0000\u0000\u0000\u0014s\u0001"+
		"\u0000\u0000\u0000\u0016v\u0001\u0000\u0000\u0000\u0018\u0080\u0001\u0000"+
		"\u0000\u0000\u001a\u0083\u0001\u0000\u0000\u0000\u001c\u008d\u0001\u0000"+
		"\u0000\u0000\u001e\u0090\u0001\u0000\u0000\u0000 \u009a\u0001\u0000\u0000"+
		"\u0000\"\u009d\u0001\u0000\u0000\u0000$\u00a7\u0001\u0000\u0000\u0000"+
		"&\u00b0\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000)*\u0005\f\u0000"+
		"\u0000*,\u0005\u0002\u0000\u0000+-\u0003\u0002\u0001\u0000,+\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0005\u0003\u0000\u0000"+
		"13\u0003\u0004\u0002\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000067\u0005\u0004\u0000\u000078\u0005\u000b\u0000\u00008\u0001"+
		"\u0001\u0000\u0000\u00009;\u0003\n\u0005\u0000:9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=\u0003\u0001\u0000\u0000\u0000>A\u0003\u0006\u0003\u0000?A\u0003"+
		"\b\u0004\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0005"+
		"\u0001\u0000\u0000\u0000BC\u0005\f\u0000\u0000CD\u0005\u0005\u0000\u0000"+
		"DE\u0003\f\u0006\u0000EF\u0005\u000b\u0000\u0000F\u0007\u0001\u0000\u0000"+
		"\u0000GH\u0005\u0006\u0000\u0000HI\u0005\u0015\u0000\u0000IJ\u0003\f\u0006"+
		"\u0000JK\u0005\u0016\u0000\u0000KL\u0005\u000b\u0000\u0000LM\u0006\u0004"+
		"\uffff\uffff\u0000M\t\u0001\u0000\u0000\u0000NO\u0007\u0000\u0000\u0000"+
		"OP\u0006\u0005\uffff\uffff\u0000PQ\u0005\f\u0000\u0000QU\u0006\u0005\uffff"+
		"\uffff\u0000RS\u0005\u0005\u0000\u0000ST\u0006\u0005\uffff\uffff\u0000"+
		"TV\u0003\f\u0006\u0000UR\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WX\u0006\u0005\uffff\uffff\u0000XY\u0005\u000b"+
		"\u0000\u0000Y\u000b\u0001\u0000\u0000\u0000Z[\u0003\u000e\u0007\u0000"+
		"[\r\u0001\u0000\u0000\u0000\\]\u0003\u0012\t\u0000]^\u0003\u0010\b\u0000"+
		"^\u000f\u0001\u0000\u0000\u0000_`\u0005\u000f\u0000\u0000`a\u0006\b\uffff"+
		"\uffff\u0000ab\u0003\u0016\u000b\u0000bc\u0006\b\uffff\uffff\u0000ce\u0001"+
		"\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0011\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0003\u0016\u000b\u0000jk\u0003"+
		"\u0014\n\u0000k\u0013\u0001\u0000\u0000\u0000lm\u0005\u0010\u0000\u0000"+
		"mn\u0006\n\uffff\uffff\u0000no\u0003\u0016\u000b\u0000op\u0006\n\uffff"+
		"\uffff\u0000pr\u0001\u0000\u0000\u0000ql\u0001\u0000\u0000\u0000ru\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"t\u0015\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0003\u001a"+
		"\r\u0000wx\u0003\u0018\f\u0000x\u0017\u0001\u0000\u0000\u0000yz\u0005"+
		"\u0011\u0000\u0000z{\u0006\f\uffff\uffff\u0000{|\u0003\u001a\r\u0000|"+
		"}\u0006\f\uffff\uffff\u0000}\u007f\u0001\u0000\u0000\u0000~y\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0019\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0003\u001e\u000f"+
		"\u0000\u0084\u0085\u0003\u001c\u000e\u0000\u0085\u001b\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\u0012\u0000\u0000\u0087\u0088\u0006\u000e\uffff"+
		"\uffff\u0000\u0088\u0089\u0003\u001e\u000f\u0000\u0089\u008a\u0006\u000e"+
		"\uffff\uffff\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0086\u0001"+
		"\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u001d\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0003"+
		"\"\u0011\u0000\u0091\u0092\u0003 \u0010\u0000\u0092\u001f\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005\u0013\u0000\u0000\u0094\u0095\u0006\u0010"+
		"\uffff\uffff\u0000\u0095\u0096\u0003\"\u0011\u0000\u0096\u0097\u0006\u0010"+
		"\uffff\uffff\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0093\u0001"+
		"\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b!\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0003&\u0013"+
		"\u0000\u009e\u009f\u0003$\u0012\u0000\u009f#\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0014\u0000\u0000\u00a1\u00a2\u0006\u0012\uffff\uffff\u0000"+
		"\u00a2\u00a3\u0003&\u0013\u0000\u00a3\u00a4\u0006\u0012\uffff\uffff\u0000"+
		"\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8%\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\r\u0000\u0000\u00ab\u00b1"+
		"\u0006\u0013\uffff\uffff\u0000\u00ac\u00ad\u0005\f\u0000\u0000\u00ad\u00b1"+
		"\u0006\u0013\uffff\uffff\u0000\u00ae\u00af\u0005\u000e\u0000\u0000\u00af"+
		"\u00b1\u0006\u0013\uffff\uffff\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b1\'\u0001\u0000\u0000\u0000\f.4<@Ufs\u0080\u008d\u009a\u00a7\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}