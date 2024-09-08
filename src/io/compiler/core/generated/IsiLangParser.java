// Generated from C:/Users/gusta/dev/compildores-2024-2-ufabc/src/IsiLang.g4 by ANTLR 4.13.1
package io.compiler.core.generated;

    import io.compiler.core.ast.*;
    import io.compiler.core.ast.literals.*;
    import io.compiler.core.ast.statements.*;
    import io.compiler.core.operators.*;
    import io.compiler.core.exceptions.*;
    import io.compiler.core.warnings.*;
    import io.compiler.core.program.*;
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
		T__9=10, T__10=11, T__11=12, T__12=13, END_OF_LINE=14, TRUE=15, FALSE=16, 
		IDENTIFIER=17, NUM=18, STRING=19, OP_OR=20, OP_AND=21, OP_COMP=22, OP_REL=23, 
		OP_TERM=24, OP_FACTOR=25, OP_NOT=26, DOT=27, OPEN_PAREN=28, CLOSE_PAREN=29, 
		OPEN_CURLY=30, CLOSE_CURLY=31, WS=32;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_for = 4, RULE_attribution = 5, RULE_attributionl = 6, RULE_print = 7, 
		RULE_if = 8, RULE_assignment = 9, RULE_expression = 10, RULE_logical_or = 11, 
		RULE_logical_orl = 12, RULE_logical_and = 13, RULE_logical_andl = 14, 
		RULE_equality = 15, RULE_equalityl = 16, RULE_comparison = 17, RULE_comparisonl = 18, 
		RULE_term = 19, RULE_terml = 20, RULE_factor = 21, RULE_factorl = 22, 
		RULE_unary = 23, RULE_boolean_literal = 24, RULE_identifier = 25, RULE_unary_op = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "block", "statement", "for", "attribution", 
			"attributionl", "print", "if", "assignment", "expression", "logical_or", 
			"logical_orl", "logical_and", "logical_andl", "equality", "equalityl", 
			"comparison", "comparisonl", "term", "terml", "factor", "factorl", "unary", 
			"boolean_literal", "identifier", "unary_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'fimprog'", "'para'", "'='", "'escreva'", 
			"'se'", "'entao'", "'senao'", "'int'", "'float'", "'string'", "'boolean'", 
			"';'", "'verdadeiro'", "'falso'", null, null, null, "'||'", "'&&'", null, 
			null, null, null, "'!'", "'.'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "END_OF_LINE", "TRUE", "FALSE", "IDENTIFIER", "NUM", "STRING", 
			"OP_OR", "OP_AND", "OP_COMP", "OP_REL", "OP_TERM", "OP_FACTOR", "OP_NOT", 
			"DOT", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_CURLY", "CLOSE_CURLY", "WS"
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

	    public Program getProgram() {
	        return program;
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
			setState(54);
			match(T__0);
			setState(55);
			declaration();
			setState(56);
			match(T__1);
			setState(57);
			block();
			setState(58);
			match(T__2);
			setState(59);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) {
				{
				{
				setState(62);
				assignment();
				}
				}
				setState(67);
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
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 131280L) != 0) );
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
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				print();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				if_();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				attribution();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				for_();
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
		enterRule(_localctx, 8, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__3);
			setState(80);
			match(OPEN_PAREN);
			setState(81);
			attributionl();

			    var initialization = statements.get(statements.size() - 1);
			    statements.remove(statements.size() - 1);

			setState(83);
			match(END_OF_LINE);
			setState(84);
			expression();

			    var condition = stack.pop();

			setState(86);
			match(END_OF_LINE);
			setState(87);
			attributionl();

			    var increment = statements.get(statements.size() - 1);
			    statements.remove(statements.size() - 1);

			    var body = new ArrayList<StatementNode>();

			setState(89);
			match(CLOSE_PAREN);
			setState(90);
			match(OPEN_CURLY);
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				statement();

				    var lastStatement = statements.get(statements.size() - 1);
				    statements.remove(statements.size() - 1);

				    body.add(lastStatement);

				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 131280L) != 0) );
			setState(98);
			match(CLOSE_CURLY);

			    var forStatement = new ForStatementNode(initialization, condition, increment, body);
			    addStatement(forStatement);

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
		enterRule(_localctx, 10, RULE_attribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			attributionl();
			setState(102);
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
		enterRule(_localctx, 12, RULE_attributionl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IDENTIFIER);

			    var identifierString = _input.LT(-1).getText();
			    var identifier = new IdentifierNode(identifierString);

			    if (!symbols.containsKey(identifier.getName())) {
			       throw new UndeclaredVariableException(identifier.getName());
			    }

			    var symbol = symbols.get(identifier.getName());
			    var symbolType = symbol.getType();
			    
			setState(106);
			match(T__4);
			setState(107);
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
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__5);
			setState(111);
			match(OPEN_PAREN);
			setState(112);
			expression();
			setState(113);
			match(CLOSE_PAREN);
			setState(114);
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
		enterRule(_localctx, 16, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__6);
			setState(118);
			match(OPEN_PAREN);
			setState(119);
			expression();

			    var condition = stack.pop();

			    var thenBranch = new ArrayList<StatementNode>();
			    var elseBranch = new ArrayList<StatementNode>();

			setState(121);
			match(CLOSE_PAREN);
			setState(122);
			match(T__7);
			setState(123);
			match(OPEN_CURLY);
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				statement();

				    var lastStatement = statements.get(statements.size() - 1);
				    statements.remove(statements.size() - 1);

				    thenBranch.add(lastStatement);

				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 131280L) != 0) );
			setState(131);
			match(CLOSE_CURLY);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(132);
				match(T__8);

				    hasElseBranch = true;

				setState(134);
				match(OPEN_CURLY);
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(135);
					statement();

					    if (hasElseBranch) {
					        var lastStatement = statements.get(statements.size() - 1);
					        statements.remove(statements.size() - 1);

					        elseBranch.add(lastStatement);
					    }

					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 131280L) != 0) );
				setState(142);
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
		enterRule(_localctx, 18, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

			    var typeString = _input.LT(-1).getText();
			    var type = Type.fromString(typeString);

			setState(150);
			match(IDENTIFIER);

			    var identifierString = _input.LT(-1).getText();
			    var identifier = new IdentifierNode(identifierString);

			    if (symbols.containsKey(identifier.getName())) {
			        throw new AlreadyDeclaredVariableException(identifier.getName());
			    }

			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(152);
				match(T__4);

				    isInitializingVariable = true;

				setState(154);
				expression();
				}
			}


			    var initializer = isInitializingVariable ? stack.pop() : null;

			    if (isInitializingVariable && initializer.getType() != type) {
			        throw new DeclarationTypeMismatchException(identifier.getName(), type, initializer.getType());
			    }

			    var binding = new BindingNode(identifier.getName(), type, initializer);
			    addDeclaration(binding);

			    symbols.put(identifier.getName(), binding.asBinding());
			    isInitializingVariable = false;

			setState(158);
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
		enterRule(_localctx, 20, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		enterRule(_localctx, 22, RULE_logical_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			logical_and();
			setState(163);
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
		enterRule(_localctx, 24, RULE_logical_orl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				{
				setState(165);
				match(OP_OR);
				}

				    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
				    var binaryOperation = new BinaryExpressionNode(operator);

				    binaryOperation.setLeft(stack.pop());

				setState(167);
				equality();

				    binaryOperation.setRight(stack.pop());
				    stack.push(binaryOperation);

				}
				}
				setState(174);
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
		enterRule(_localctx, 26, RULE_logical_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			equality();
			setState(176);
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
		enterRule(_localctx, 28, RULE_logical_andl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				{
				setState(178);
				match(OP_AND);
				}

				    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
				    var binaryOperation = new BinaryExpressionNode(operator);

				    binaryOperation.setLeft(stack.pop());

				setState(180);
				equality();

				    binaryOperation.setRight(stack.pop());
				    stack.push(binaryOperation);

				}
				}
				setState(187);
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
		enterRule(_localctx, 30, RULE_equality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			comparison();
			setState(189);
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
		enterRule(_localctx, 32, RULE_equalityl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMP) {
				{
				{
				{
				setState(191);
				match(OP_COMP);
				}

				    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
				    var binaryOperation = new BinaryExpressionNode(operator);

				    binaryOperation.setLeft(stack.pop());

				setState(193);
				comparison();

				    binaryOperation.setRight(stack.pop());
				    stack.push(binaryOperation);

				}
				}
				setState(200);
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
		enterRule(_localctx, 34, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			term();
			setState(202);
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
		enterRule(_localctx, 36, RULE_comparisonl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_REL) {
				{
				{
				{
				setState(204);
				match(OP_REL);
				}

				    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
				    var binaryOperation = new BinaryExpressionNode(operator);

				    binaryOperation.setLeft(stack.pop());

				setState(206);
				term();

				    binaryOperation.setRight(stack.pop());
				    stack.push(binaryOperation);

				}
				}
				setState(213);
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
		enterRule(_localctx, 38, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			factor();
			setState(215);
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
		enterRule(_localctx, 40, RULE_terml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_TERM) {
				{
				{
				{
				setState(217);
				match(OP_TERM);
				}

				    var operator = BinaryOperator.fromString(_input.LT(-1).getText());
				    var binaryOperation = new BinaryExpressionNode(operator);

				    binaryOperation.setLeft(stack.pop());

				setState(219);
				factor();

				    binaryOperation.setRight(stack.pop());
				    stack.push(binaryOperation);

				}
				}
				setState(226);
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
		enterRule(_localctx, 42, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			unary();
			setState(228);
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
		enterRule(_localctx, 44, RULE_factorl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_FACTOR) {
				{
				{
				{
				setState(230);
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

				setState(232);
				unary();

				    binaryOperation.setRight(stack.pop());
				    stack.push(binaryOperation);

				}
				}
				setState(239);
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
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public TerminalNode NUM() { return getToken(IsiLangParser.NUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_unary);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				boolean_literal();
				}
				break;
			case OP_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				unary_op();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
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
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				identifier();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
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
		enterRule(_localctx, 48, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 50, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_opContext extends ParserRuleContext {
		public TerminalNode OP_NOT() { return getToken(IsiLangParser.OP_NOT, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitUnary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IsiLangVisitor ) return ((IsiLangVisitor<? extends T>)visitor).visitUnary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unary_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(OP_NOT);

			    var operator = UnaryOperator.fromString(_input.LT(-1).getText());
			    var unaryOperation = new UnaryExpressionNode(operator);

			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				{
				setState(257);
				boolean_literal();
				}
				break;
			case IDENTIFIER:
				{
				setState(258);
				identifier();

				    unaryOperation.setOperand(stack.pop());
				    stack.push(unaryOperation);

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\u0004\u0001 \u0108\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0005\u0001@\b\u0001\n\u0001\f\u0001C\t\u0001\u0001\u0002"+
		"\u0004\u0002F\b\u0002\u000b\u0002\f\u0002G\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003N\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0004\u0004_\b\u0004\u000b\u0004\f\u0004`\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004"+
		"\b\u0080\b\b\u000b\b\f\b\u0081\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0004\b\u008b\b\b\u000b\b\f\b\u008c\u0001\b\u0001\b\u0003"+
		"\b\u0091\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u009c\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0005\f\u00ab\b\f\n\f\f\f\u00ae\t\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b8\b\u000e"+
		"\n\u000e\f\u000e\u00bb\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00c5"+
		"\b\u0010\n\u0010\f\u0010\u00c8\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00d2\b\u0012\n\u0012\f\u0012\u00d5\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00df\b\u0014\n\u0014\f\u0014\u00e2\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u00ec\b\u0016\n\u0016\f\u0016\u00ef\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u00f8\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0106\b\u001a\u0001\u001a\u0000\u0000\u001b"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.024\u0000\u0002\u0001\u0000\n\r\u0001\u0000\u000f"+
		"\u0010\u0101\u00006\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000"+
		"\u0004E\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\bO\u0001"+
		"\u0000\u0000\u0000\ne\u0001\u0000\u0000\u0000\fh\u0001\u0000\u0000\u0000"+
		"\u000en\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000\u0012\u0094"+
		"\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000\u0000\u0000\u0016\u00a2"+
		"\u0001\u0000\u0000\u0000\u0018\u00ac\u0001\u0000\u0000\u0000\u001a\u00af"+
		"\u0001\u0000\u0000\u0000\u001c\u00b9\u0001\u0000\u0000\u0000\u001e\u00bc"+
		"\u0001\u0000\u0000\u0000 \u00c6\u0001\u0000\u0000\u0000\"\u00c9\u0001"+
		"\u0000\u0000\u0000$\u00d3\u0001\u0000\u0000\u0000&\u00d6\u0001\u0000\u0000"+
		"\u0000(\u00e0\u0001\u0000\u0000\u0000*\u00e3\u0001\u0000\u0000\u0000,"+
		"\u00ed\u0001\u0000\u0000\u0000.\u00f7\u0001\u0000\u0000\u00000\u00f9\u0001"+
		"\u0000\u0000\u00002\u00fc\u0001\u0000\u0000\u00004\u00ff\u0001\u0000\u0000"+
		"\u000067\u0005\u0001\u0000\u000078\u0003\u0002\u0001\u000089\u0005\u0002"+
		"\u0000\u00009:\u0003\u0004\u0002\u0000:;\u0005\u0003\u0000\u0000;<\u0005"+
		"\u001b\u0000\u0000<=\u0006\u0000\uffff\uffff\u0000=\u0001\u0001\u0000"+
		"\u0000\u0000>@\u0003\u0012\t\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\u0003"+
		"\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DF\u0003\u0006\u0003"+
		"\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0005\u0001\u0000\u0000\u0000"+
		"IN\u0003\u000e\u0007\u0000JN\u0003\u0010\b\u0000KN\u0003\n\u0005\u0000"+
		"LN\u0003\b\u0004\u0000MI\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000N\u0007\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0004\u0000\u0000PQ\u0005\u001c\u0000\u0000QR\u0003"+
		"\f\u0006\u0000RS\u0006\u0004\uffff\uffff\u0000ST\u0005\u000e\u0000\u0000"+
		"TU\u0003\u0014\n\u0000UV\u0006\u0004\uffff\uffff\u0000VW\u0005\u000e\u0000"+
		"\u0000WX\u0003\f\u0006\u0000XY\u0006\u0004\uffff\uffff\u0000YZ\u0005\u001d"+
		"\u0000\u0000Z^\u0005\u001e\u0000\u0000[\\\u0003\u0006\u0003\u0000\\]\u0006"+
		"\u0004\uffff\uffff\u0000]_\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005\u001f\u0000\u0000cd\u0006"+
		"\u0004\uffff\uffff\u0000d\t\u0001\u0000\u0000\u0000ef\u0003\f\u0006\u0000"+
		"fg\u0005\u000e\u0000\u0000g\u000b\u0001\u0000\u0000\u0000hi\u0005\u0011"+
		"\u0000\u0000ij\u0006\u0006\uffff\uffff\u0000jk\u0005\u0005\u0000\u0000"+
		"kl\u0003\u0014\n\u0000lm\u0006\u0006\uffff\uffff\u0000m\r\u0001\u0000"+
		"\u0000\u0000no\u0005\u0006\u0000\u0000op\u0005\u001c\u0000\u0000pq\u0003"+
		"\u0014\n\u0000qr\u0005\u001d\u0000\u0000rs\u0005\u000e\u0000\u0000st\u0006"+
		"\u0007\uffff\uffff\u0000t\u000f\u0001\u0000\u0000\u0000uv\u0005\u0007"+
		"\u0000\u0000vw\u0005\u001c\u0000\u0000wx\u0003\u0014\n\u0000xy\u0006\b"+
		"\uffff\uffff\u0000yz\u0005\u001d\u0000\u0000z{\u0005\b\u0000\u0000{\u007f"+
		"\u0005\u001e\u0000\u0000|}\u0003\u0006\u0003\u0000}~\u0006\b\uffff\uffff"+
		"\u0000~\u0080\u0001\u0000\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0090\u0005\u001f\u0000\u0000\u0084\u0085\u0005\t\u0000\u0000\u0085\u0086"+
		"\u0006\b\uffff\uffff\u0000\u0086\u008a\u0005\u001e\u0000\u0000\u0087\u0088"+
		"\u0003\u0006\u0003\u0000\u0088\u0089\u0006\b\uffff\uffff\u0000\u0089\u008b"+
		"\u0001\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005\u001f\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u0084"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0006\b\uffff\uffff\u0000\u0093\u0011"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0007\u0000\u0000\u0000\u0095\u0096"+
		"\u0006\t\uffff\uffff\u0000\u0096\u0097\u0005\u0011\u0000\u0000\u0097\u009b"+
		"\u0006\t\uffff\uffff\u0000\u0098\u0099\u0005\u0005\u0000\u0000\u0099\u009a"+
		"\u0006\t\uffff\uffff\u0000\u009a\u009c\u0003\u0014\n\u0000\u009b\u0098"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0006\t\uffff\uffff\u0000\u009e\u009f"+
		"\u0005\u000e\u0000\u0000\u009f\u0013\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0003\u0016\u000b\u0000\u00a1\u0015\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0003\u001a\r\u0000\u00a3\u00a4\u0003\u0018\f\u0000\u00a4\u0017\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005\u0014\u0000\u0000\u00a6\u00a7\u0006"+
		"\f\uffff\uffff\u0000\u00a7\u00a8\u0003\u001e\u000f\u0000\u00a8\u00a9\u0006"+
		"\f\uffff\uffff\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a5\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u0019\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0003"+
		"\u001e\u000f\u0000\u00b0\u00b1\u0003\u001c\u000e\u0000\u00b1\u001b\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005\u0015\u0000\u0000\u00b3\u00b4\u0006"+
		"\u000e\uffff\uffff\u0000\u00b4\u00b5\u0003\u001e\u000f\u0000\u00b5\u00b6"+
		"\u0006\u000e\uffff\uffff\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u001d\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0003\"\u0011\u0000\u00bd\u00be\u0003 \u0010\u0000\u00be\u001f"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0016\u0000\u0000\u00c0\u00c1"+
		"\u0006\u0010\uffff\uffff\u0000\u00c1\u00c2\u0003\"\u0011\u0000\u00c2\u00c3"+
		"\u0006\u0010\uffff\uffff\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"!\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0003&\u0013\u0000\u00ca\u00cb\u0003$\u0012\u0000\u00cb#\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0005\u0017\u0000\u0000\u00cd\u00ce\u0006\u0012"+
		"\uffff\uffff\u0000\u00ce\u00cf\u0003&\u0013\u0000\u00cf\u00d0\u0006\u0012"+
		"\uffff\uffff\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cc\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4%\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003*\u0015"+
		"\u0000\u00d7\u00d8\u0003(\u0014\u0000\u00d8\'\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0005\u0018\u0000\u0000\u00da\u00db\u0006\u0014\uffff\uffff"+
		"\u0000\u00db\u00dc\u0003*\u0015\u0000\u00dc\u00dd\u0006\u0014\uffff\uffff"+
		"\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00d9\u0001\u0000\u0000"+
		"\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1)\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003.\u0017\u0000\u00e4"+
		"\u00e5\u0003,\u0016\u0000\u00e5+\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"\u0019\u0000\u0000\u00e7\u00e8\u0006\u0016\uffff\uffff\u0000\u00e8\u00e9"+
		"\u0003.\u0017\u0000\u00e9\u00ea\u0006\u0016\uffff\uffff\u0000\u00ea\u00ec"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000\u00ec\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee-\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f8\u00030\u0018\u0000\u00f1\u00f8\u00034\u001a"+
		"\u0000\u00f2\u00f3\u0005\u0012\u0000\u0000\u00f3\u00f8\u0006\u0017\uffff"+
		"\uffff\u0000\u00f4\u00f8\u00032\u0019\u0000\u00f5\u00f6\u0005\u0013\u0000"+
		"\u0000\u00f6\u00f8\u0006\u0017\uffff\uffff\u0000\u00f7\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f1\u0001\u0000\u0000\u0000\u00f7\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f8/\u0001\u0000\u0000\u0000\u00f9\u00fa\u0007\u0001\u0000"+
		"\u0000\u00fa\u00fb\u0006\u0018\uffff\uffff\u0000\u00fb1\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005\u0011\u0000\u0000\u00fd\u00fe\u0006\u0019\uffff"+
		"\uffff\u0000\u00fe3\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u001a\u0000"+
		"\u0000\u0100\u0105\u0006\u001a\uffff\uffff\u0000\u0101\u0106\u00030\u0018"+
		"\u0000\u0102\u0103\u00032\u0019\u0000\u0103\u0104\u0006\u001a\uffff\uffff"+
		"\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0101\u0001\u0000\u0000"+
		"\u0000\u0105\u0102\u0001\u0000\u0000\u0000\u01065\u0001\u0000\u0000\u0000"+
		"\u0010AGM`\u0081\u008c\u0090\u009b\u00ac\u00b9\u00c6\u00d3\u00e0\u00ed"+
		"\u00f7\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}