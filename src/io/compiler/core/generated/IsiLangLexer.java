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

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IsiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, END_OF_LINE=16, 
		TRUE=17, FALSE=18, TYPE_IDENTIFIER=19, IDENTIFIER=20, NUM=21, STRING=22, 
		OP_OR=23, OP_AND=24, OP_COMP=25, OP_REL=26, OP_TERM=27, OP_FACTOR=28, 
		DOT=29, OPEN_PAREN=30, CLOSE_PAREN=31, OPEN_CURLY=32, CLOSE_CURLY=33, 
		WS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "END_OF_LINE", "TRUE", 
			"FALSE", "TYPE_IDENTIFIER", "IDENTIFIER", "NUM", "STRING", "OP_OR", "OP_AND", 
			"OP_COMP", "OP_REL", "OP_TERM", "OP_FACTOR", "DOT", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_CURLY", "CLOSE_CURLY", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'fimprog'", "'faca'", "'enquanto'", 
			"'para'", "'='", "'escreva'", "'leia'", "'se'", "'entao'", "'senao'", 
			"','", "'!'", "'-'", "';'", "'verdadeiro'", "'falso'", null, null, null, 
			null, "'||'", "'&&'", null, null, null, null, "'.'", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "END_OF_LINE", "TRUE", "FALSE", "TYPE_IDENTIFIER", 
			"IDENTIFIER", "NUM", "STRING", "OP_OR", "OP_AND", "OP_COMP", "OP_REL", 
			"OP_TERM", "OP_FACTOR", "DOT", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_CURLY", 
			"CLOSE_CURLY", "WS"
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


	    private Program program;
	    private HashMap<String, Symbol> symbols = new HashMap<String, Symbol>();

	    private Stack<ExpressionAstNode> stack = new Stack<ExpressionAstNode>();
	    private AstNode root = null;

	    private ArrayList<StatementNode> statements = new ArrayList<StatementNode>();
	    private ArrayList<DeclarationNode> declarations = new ArrayList<DeclarationNode>();

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

	    private boolean isInitializingVariable = false;
	    private boolean hasElseBranch = false;

	    public Program getProgram() {
	        return program;
	    }

	    public void setSymbols(HashMap<String, Symbol> symbols) {
	        this.symbols = symbols;
	    }

	    public HashMap<String, Symbol> getSymbols() {
	        return symbols;
	    }


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\"\u0100\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00bd"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u00c1\b\u0013\n\u0013\f\u0013"+
		"\u00c4\t\u0013\u0001\u0014\u0004\u0014\u00c7\b\u0014\u000b\u0014\f\u0014"+
		"\u00c8\u0001\u0014\u0001\u0014\u0004\u0014\u00cd\b\u0014\u000b\u0014\f"+
		"\u0014\u00ce\u0003\u0014\u00d1\b\u0014\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u00d5\b\u0015\n\u0015\f\u0015\u00d8\t\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00e6\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00ed"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0000\u0000\"\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"\u0001\u0000\b"+
		"\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\n\n\r"+
		"\r\"\"\u0002\u0000<<>>\u0002\u0000++--\u0002\u0000**//\u0003\u0000\t\n"+
		"\r\r  \u010a\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0001E\u0001"+
		"\u0000\u0000\u0000\u0003N\u0001\u0000\u0000\u0000\u0005U\u0001\u0000\u0000"+
		"\u0000\u0007]\u0001\u0000\u0000\u0000\tb\u0001\u0000\u0000\u0000\u000b"+
		"k\u0001\u0000\u0000\u0000\rp\u0001\u0000\u0000\u0000\u000fr\u0001\u0000"+
		"\u0000\u0000\u0011z\u0001\u0000\u0000\u0000\u0013\u007f\u0001\u0000\u0000"+
		"\u0000\u0015\u0082\u0001\u0000\u0000\u0000\u0017\u0088\u0001\u0000\u0000"+
		"\u0000\u0019\u008e\u0001\u0000\u0000\u0000\u001b\u0090\u0001\u0000\u0000"+
		"\u0000\u001d\u0092\u0001\u0000\u0000\u0000\u001f\u0094\u0001\u0000\u0000"+
		"\u0000!\u0096\u0001\u0000\u0000\u0000#\u00a1\u0001\u0000\u0000\u0000%"+
		"\u00bc\u0001\u0000\u0000\u0000\'\u00be\u0001\u0000\u0000\u0000)\u00c6"+
		"\u0001\u0000\u0000\u0000+\u00d2\u0001\u0000\u0000\u0000-\u00db\u0001\u0000"+
		"\u0000\u0000/\u00de\u0001\u0000\u0000\u00001\u00e5\u0001\u0000\u0000\u0000"+
		"3\u00ec\u0001\u0000\u0000\u00005\u00ee\u0001\u0000\u0000\u00007\u00f0"+
		"\u0001\u0000\u0000\u00009\u00f2\u0001\u0000\u0000\u0000;\u00f4\u0001\u0000"+
		"\u0000\u0000=\u00f6\u0001\u0000\u0000\u0000?\u00f8\u0001\u0000\u0000\u0000"+
		"A\u00fa\u0001\u0000\u0000\u0000C\u00fc\u0001\u0000\u0000\u0000EF\u0005"+
		"p\u0000\u0000FG\u0005r\u0000\u0000GH\u0005o\u0000\u0000HI\u0005g\u0000"+
		"\u0000IJ\u0005r\u0000\u0000JK\u0005a\u0000\u0000KL\u0005m\u0000\u0000"+
		"LM\u0005a\u0000\u0000M\u0002\u0001\u0000\u0000\u0000NO\u0005i\u0000\u0000"+
		"OP\u0005n\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005c\u0000\u0000RS\u0005"+
		"i\u0000\u0000ST\u0005o\u0000\u0000T\u0004\u0001\u0000\u0000\u0000UV\u0005"+
		"f\u0000\u0000VW\u0005i\u0000\u0000WX\u0005m\u0000\u0000XY\u0005p\u0000"+
		"\u0000YZ\u0005r\u0000\u0000Z[\u0005o\u0000\u0000[\\\u0005g\u0000\u0000"+
		"\\\u0006\u0001\u0000\u0000\u0000]^\u0005f\u0000\u0000^_\u0005a\u0000\u0000"+
		"_`\u0005c\u0000\u0000`a\u0005a\u0000\u0000a\b\u0001\u0000\u0000\u0000"+
		"bc\u0005e\u0000\u0000cd\u0005n\u0000\u0000de\u0005q\u0000\u0000ef\u0005"+
		"u\u0000\u0000fg\u0005a\u0000\u0000gh\u0005n\u0000\u0000hi\u0005t\u0000"+
		"\u0000ij\u0005o\u0000\u0000j\n\u0001\u0000\u0000\u0000kl\u0005p\u0000"+
		"\u0000lm\u0005a\u0000\u0000mn\u0005r\u0000\u0000no\u0005a\u0000\u0000"+
		"o\f\u0001\u0000\u0000\u0000pq\u0005=\u0000\u0000q\u000e\u0001\u0000\u0000"+
		"\u0000rs\u0005e\u0000\u0000st\u0005s\u0000\u0000tu\u0005c\u0000\u0000"+
		"uv\u0005r\u0000\u0000vw\u0005e\u0000\u0000wx\u0005v\u0000\u0000xy\u0005"+
		"a\u0000\u0000y\u0010\u0001\u0000\u0000\u0000z{\u0005l\u0000\u0000{|\u0005"+
		"e\u0000\u0000|}\u0005i\u0000\u0000}~\u0005a\u0000\u0000~\u0012\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005s\u0000\u0000\u0080\u0081\u0005e\u0000\u0000"+
		"\u0081\u0014\u0001\u0000\u0000\u0000\u0082\u0083\u0005e\u0000\u0000\u0083"+
		"\u0084\u0005n\u0000\u0000\u0084\u0085\u0005t\u0000\u0000\u0085\u0086\u0005"+
		"a\u0000\u0000\u0086\u0087\u0005o\u0000\u0000\u0087\u0016\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005s\u0000\u0000\u0089\u008a\u0005e\u0000\u0000\u008a"+
		"\u008b\u0005n\u0000\u0000\u008b\u008c\u0005a\u0000\u0000\u008c\u008d\u0005"+
		"o\u0000\u0000\u008d\u0018\u0001\u0000\u0000\u0000\u008e\u008f\u0005,\u0000"+
		"\u0000\u008f\u001a\u0001\u0000\u0000\u0000\u0090\u0091\u0005!\u0000\u0000"+
		"\u0091\u001c\u0001\u0000\u0000\u0000\u0092\u0093\u0005-\u0000\u0000\u0093"+
		"\u001e\u0001\u0000\u0000\u0000\u0094\u0095\u0005;\u0000\u0000\u0095 \u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005v\u0000\u0000\u0097\u0098\u0005e\u0000"+
		"\u0000\u0098\u0099\u0005r\u0000\u0000\u0099\u009a\u0005d\u0000\u0000\u009a"+
		"\u009b\u0005a\u0000\u0000\u009b\u009c\u0005d\u0000\u0000\u009c\u009d\u0005"+
		"e\u0000\u0000\u009d\u009e\u0005i\u0000\u0000\u009e\u009f\u0005r\u0000"+
		"\u0000\u009f\u00a0\u0005o\u0000\u0000\u00a0\"\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0005f\u0000\u0000\u00a2\u00a3\u0005a\u0000\u0000\u00a3\u00a4"+
		"\u0005l\u0000\u0000\u00a4\u00a5\u0005s\u0000\u0000\u00a5\u00a6\u0005o"+
		"\u0000\u0000\u00a6$\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005i\u0000\u0000"+
		"\u00a8\u00a9\u0005n\u0000\u0000\u00a9\u00bd\u0005t\u0000\u0000\u00aa\u00ab"+
		"\u0005f\u0000\u0000\u00ab\u00ac\u0005l\u0000\u0000\u00ac\u00ad\u0005o"+
		"\u0000\u0000\u00ad\u00ae\u0005a\u0000\u0000\u00ae\u00bd\u0005t\u0000\u0000"+
		"\u00af\u00b0\u0005s\u0000\u0000\u00b0\u00b1\u0005t\u0000\u0000\u00b1\u00b2"+
		"\u0005r\u0000\u0000\u00b2\u00b3\u0005i\u0000\u0000\u00b3\u00b4\u0005n"+
		"\u0000\u0000\u00b4\u00bd\u0005g\u0000\u0000\u00b5\u00b6\u0005b\u0000\u0000"+
		"\u00b6\u00b7\u0005o\u0000\u0000\u00b7\u00b8\u0005o\u0000\u0000\u00b8\u00b9"+
		"\u0005l\u0000\u0000\u00b9\u00ba\u0005e\u0000\u0000\u00ba\u00bb\u0005a"+
		"\u0000\u0000\u00bb\u00bd\u0005n\u0000\u0000\u00bc\u00a7\u0001\u0000\u0000"+
		"\u0000\u00bc\u00aa\u0001\u0000\u0000\u0000\u00bc\u00af\u0001\u0000\u0000"+
		"\u0000\u00bc\u00b5\u0001\u0000\u0000\u0000\u00bd&\u0001\u0000\u0000\u0000"+
		"\u00be\u00c2\u0007\u0000\u0000\u0000\u00bf\u00c1\u0007\u0001\u0000\u0000"+
		"\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3(\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c7\u0007\u0002\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00d0\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cc\u0005.\u0000\u0000\u00cb\u00cd\u0007\u0002\u0000\u0000\u00cc\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1*\u0001\u0000\u0000\u0000\u00d2\u00d6\u0005"+
		"\"\u0000\u0000\u00d3\u00d5\b\u0003\u0000\u0000\u00d4\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\"\u0000"+
		"\u0000\u00da,\u0001\u0000\u0000\u0000\u00db\u00dc\u0005|\u0000\u0000\u00dc"+
		"\u00dd\u0005|\u0000\u0000\u00dd.\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"&\u0000\u0000\u00df\u00e0\u0005&\u0000\u0000\u00e00\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0005=\u0000\u0000\u00e2\u00e6\u0005=\u0000\u0000\u00e3"+
		"\u00e4\u0005!\u0000\u0000\u00e4\u00e6\u0005=\u0000\u0000\u00e5\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e62\u0001\u0000"+
		"\u0000\u0000\u00e7\u00ed\u0007\u0004\u0000\u0000\u00e8\u00e9\u0005<\u0000"+
		"\u0000\u00e9\u00ed\u0005=\u0000\u0000\u00ea\u00eb\u0005>\u0000\u0000\u00eb"+
		"\u00ed\u0005=\u0000\u0000\u00ec\u00e7\u0001\u0000\u0000\u0000\u00ec\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed4\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0007\u0005\u0000\u0000\u00ef6\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0007\u0006\u0000\u0000\u00f18\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0005.\u0000\u0000\u00f3:\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0005(\u0000\u0000\u00f5<\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		")\u0000\u0000\u00f7>\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005{\u0000"+
		"\u0000\u00f9@\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005}\u0000\u0000\u00fb"+
		"B\u0001\u0000\u0000\u0000\u00fc\u00fd\u0007\u0007\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0006!\u0000\u0000\u00ffD\u0001\u0000"+
		"\u0000\u0000\t\u0000\u00bc\u00c2\u00c8\u00ce\u00d0\u00d6\u00e5\u00ec\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}