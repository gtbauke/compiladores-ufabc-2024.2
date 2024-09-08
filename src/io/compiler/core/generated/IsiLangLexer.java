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
		T__9=10, T__10=11, T__11=12, T__12=13, END_OF_LINE=14, TRUE=15, FALSE=16, 
		IDENTIFIER=17, NUM=18, STRING=19, OP_OR=20, OP_AND=21, OP_COMP=22, OP_REL=23, 
		OP_TERM=24, OP_FACTOR=25, OP_NOT=26, DOT=27, OPEN_PAREN=28, CLOSE_PAREN=29, 
		OPEN_CURLY=30, CLOSE_CURLY=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "END_OF_LINE", "TRUE", "FALSE", "IDENTIFIER", 
			"NUM", "STRING", "OP_OR", "OP_AND", "OP_COMP", "OP_REL", "OP_TERM", "OP_FACTOR", 
			"OP_NOT", "DOT", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_CURLY", "CLOSE_CURLY", 
			"WS"
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
		"\u0004\u0000 \u00ea\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u00a6"+
		"\b\u0010\n\u0010\f\u0010\u00a9\t\u0010\u0001\u0011\u0003\u0011\u00ac\b"+
		"\u0011\u0001\u0011\u0004\u0011\u00af\b\u0011\u000b\u0011\f\u0011\u00b0"+
		"\u0001\u0011\u0001\u0011\u0004\u0011\u00b5\b\u0011\u000b\u0011\f\u0011"+
		"\u00b6\u0003\u0011\u00b9\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u00bd"+
		"\b\u0012\n\u0012\f\u0012\u00c0\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00ce\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00d5\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0000\u0000 \u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e=\u001f? \u0001\u0000\b\u0003\u0000AZ__az\u0004\u000009"+
		"AZ__az\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0002\u0000<<>>\u0002\u0000"+
		"++--\u0002\u0000**//\u0003\u0000\t\n\r\r  \u00f2\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0001A\u0001\u0000\u0000\u0000\u0003J\u0001"+
		"\u0000\u0000\u0000\u0005Q\u0001\u0000\u0000\u0000\u0007Y\u0001\u0000\u0000"+
		"\u0000\t^\u0001\u0000\u0000\u0000\u000b`\u0001\u0000\u0000\u0000\rh\u0001"+
		"\u0000\u0000\u0000\u000fk\u0001\u0000\u0000\u0000\u0011q\u0001\u0000\u0000"+
		"\u0000\u0013w\u0001\u0000\u0000\u0000\u0015{\u0001\u0000\u0000\u0000\u0017"+
		"\u0081\u0001\u0000\u0000\u0000\u0019\u0088\u0001\u0000\u0000\u0000\u001b"+
		"\u0090\u0001\u0000\u0000\u0000\u001d\u0092\u0001\u0000\u0000\u0000\u001f"+
		"\u009d\u0001\u0000\u0000\u0000!\u00a3\u0001\u0000\u0000\u0000#\u00ab\u0001"+
		"\u0000\u0000\u0000%\u00ba\u0001\u0000\u0000\u0000\'\u00c3\u0001\u0000"+
		"\u0000\u0000)\u00c6\u0001\u0000\u0000\u0000+\u00cd\u0001\u0000\u0000\u0000"+
		"-\u00d4\u0001\u0000\u0000\u0000/\u00d6\u0001\u0000\u0000\u00001\u00d8"+
		"\u0001\u0000\u0000\u00003\u00da\u0001\u0000\u0000\u00005\u00dc\u0001\u0000"+
		"\u0000\u00007\u00de\u0001\u0000\u0000\u00009\u00e0\u0001\u0000\u0000\u0000"+
		";\u00e2\u0001\u0000\u0000\u0000=\u00e4\u0001\u0000\u0000\u0000?\u00e6"+
		"\u0001\u0000\u0000\u0000AB\u0005p\u0000\u0000BC\u0005r\u0000\u0000CD\u0005"+
		"o\u0000\u0000DE\u0005g\u0000\u0000EF\u0005r\u0000\u0000FG\u0005a\u0000"+
		"\u0000GH\u0005m\u0000\u0000HI\u0005a\u0000\u0000I\u0002\u0001\u0000\u0000"+
		"\u0000JK\u0005i\u0000\u0000KL\u0005n\u0000\u0000LM\u0005i\u0000\u0000"+
		"MN\u0005c\u0000\u0000NO\u0005i\u0000\u0000OP\u0005o\u0000\u0000P\u0004"+
		"\u0001\u0000\u0000\u0000QR\u0005f\u0000\u0000RS\u0005i\u0000\u0000ST\u0005"+
		"m\u0000\u0000TU\u0005p\u0000\u0000UV\u0005r\u0000\u0000VW\u0005o\u0000"+
		"\u0000WX\u0005g\u0000\u0000X\u0006\u0001\u0000\u0000\u0000YZ\u0005p\u0000"+
		"\u0000Z[\u0005a\u0000\u0000[\\\u0005r\u0000\u0000\\]\u0005a\u0000\u0000"+
		"]\b\u0001\u0000\u0000\u0000^_\u0005=\u0000\u0000_\n\u0001\u0000\u0000"+
		"\u0000`a\u0005e\u0000\u0000ab\u0005s\u0000\u0000bc\u0005c\u0000\u0000"+
		"cd\u0005r\u0000\u0000de\u0005e\u0000\u0000ef\u0005v\u0000\u0000fg\u0005"+
		"a\u0000\u0000g\f\u0001\u0000\u0000\u0000hi\u0005s\u0000\u0000ij\u0005"+
		"e\u0000\u0000j\u000e\u0001\u0000\u0000\u0000kl\u0005e\u0000\u0000lm\u0005"+
		"n\u0000\u0000mn\u0005t\u0000\u0000no\u0005a\u0000\u0000op\u0005o\u0000"+
		"\u0000p\u0010\u0001\u0000\u0000\u0000qr\u0005s\u0000\u0000rs\u0005e\u0000"+
		"\u0000st\u0005n\u0000\u0000tu\u0005a\u0000\u0000uv\u0005o\u0000\u0000"+
		"v\u0012\u0001\u0000\u0000\u0000wx\u0005i\u0000\u0000xy\u0005n\u0000\u0000"+
		"yz\u0005t\u0000\u0000z\u0014\u0001\u0000\u0000\u0000{|\u0005f\u0000\u0000"+
		"|}\u0005l\u0000\u0000}~\u0005o\u0000\u0000~\u007f\u0005a\u0000\u0000\u007f"+
		"\u0080\u0005t\u0000\u0000\u0080\u0016\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005s\u0000\u0000\u0082\u0083\u0005t\u0000\u0000\u0083\u0084\u0005r"+
		"\u0000\u0000\u0084\u0085\u0005i\u0000\u0000\u0085\u0086\u0005n\u0000\u0000"+
		"\u0086\u0087\u0005g\u0000\u0000\u0087\u0018\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005b\u0000\u0000\u0089\u008a\u0005o\u0000\u0000\u008a\u008b\u0005"+
		"o\u0000\u0000\u008b\u008c\u0005l\u0000\u0000\u008c\u008d\u0005e\u0000"+
		"\u0000\u008d\u008e\u0005a\u0000\u0000\u008e\u008f\u0005n\u0000\u0000\u008f"+
		"\u001a\u0001\u0000\u0000\u0000\u0090\u0091\u0005;\u0000\u0000\u0091\u001c"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005v\u0000\u0000\u0093\u0094\u0005"+
		"e\u0000\u0000\u0094\u0095\u0005r\u0000\u0000\u0095\u0096\u0005d\u0000"+
		"\u0000\u0096\u0097\u0005a\u0000\u0000\u0097\u0098\u0005d\u0000\u0000\u0098"+
		"\u0099\u0005e\u0000\u0000\u0099\u009a\u0005i\u0000\u0000\u009a\u009b\u0005"+
		"r\u0000\u0000\u009b\u009c\u0005o\u0000\u0000\u009c\u001e\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005f\u0000\u0000\u009e\u009f\u0005a\u0000\u0000\u009f"+
		"\u00a0\u0005l\u0000\u0000\u00a0\u00a1\u0005s\u0000\u0000\u00a1\u00a2\u0005"+
		"o\u0000\u0000\u00a2 \u0001\u0000\u0000\u0000\u00a3\u00a7\u0007\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0007\u0001\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\"\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005-\u0000\u0000\u00ab"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ad\u00af\u0007\u0002\u0000\u0000\u00ae"+
		"\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005.\u0000\u0000\u00b3\u00b5"+
		"\u0007\u0002\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9$\u0001"+
		"\u0000\u0000\u0000\u00ba\u00be\u0005\"\u0000\u0000\u00bb\u00bd\b\u0003"+
		"\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0005\"\u0000\u0000\u00c2&\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005|\u0000\u0000\u00c4\u00c5\u0005|\u0000\u0000\u00c5"+
		"(\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005&\u0000\u0000\u00c7\u00c8\u0005"+
		"&\u0000\u0000\u00c8*\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005=\u0000"+
		"\u0000\u00ca\u00ce\u0005=\u0000\u0000\u00cb\u00cc\u0005!\u0000\u0000\u00cc"+
		"\u00ce\u0005=\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ce,\u0001\u0000\u0000\u0000\u00cf\u00d5\u0007"+
		"\u0004\u0000\u0000\u00d0\u00d1\u0005<\u0000\u0000\u00d1\u00d5\u0005=\u0000"+
		"\u0000\u00d2\u00d3\u0005>\u0000\u0000\u00d3\u00d5\u0005=\u0000\u0000\u00d4"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d0\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d5.\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0007\u0005\u0000\u0000\u00d70\u0001\u0000\u0000\u0000\u00d8\u00d9\u0007"+
		"\u0006\u0000\u0000\u00d92\u0001\u0000\u0000\u0000\u00da\u00db\u0005!\u0000"+
		"\u0000\u00db4\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005.\u0000\u0000\u00dd"+
		"6\u0001\u0000\u0000\u0000\u00de\u00df\u0005(\u0000\u0000\u00df8\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0005)\u0000\u0000\u00e1:\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0005{\u0000\u0000\u00e3<\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0005}\u0000\u0000\u00e5>\u0001\u0000\u0000\u0000\u00e6\u00e7\u0007"+
		"\u0007\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0006"+
		"\u001f\u0000\u0000\u00e9@\u0001\u0000\u0000\u0000\t\u0000\u00a7\u00ab"+
		"\u00b0\u00b6\u00b8\u00be\u00cd\u00d4\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}