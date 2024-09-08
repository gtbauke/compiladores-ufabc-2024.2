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
		T__9=10, END_OF_LINE=11, IDENTIFIER=12, NUM=13, STRING=14, OP_OR=15, OP_AND=16, 
		OP_COMP=17, OP_REL=18, OP_TERM=19, OP_FACTOR=20, OPEN_PAREN=21, CLOSE_PAREN=22, 
		WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "END_OF_LINE", "IDENTIFIER", "NUM", "STRING", "OP_OR", "OP_AND", 
			"OP_COMP", "OP_REL", "OP_TERM", "OP_FACTOR", "OPEN_PAREN", "CLOSE_PAREN", 
			"WS"
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
		"\u0004\u0000\u0017\u00ac\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0005\u000bp\b\u000b\n\u000b\f\u000bs\t\u000b"+
		"\u0001\f\u0003\fv\b\f\u0001\f\u0004\fy\b\f\u000b\f\f\fz\u0001\f\u0001"+
		"\f\u0004\f\u007f\b\f\u000b\f\f\f\u0080\u0003\f\u0083\b\f\u0001\r\u0001"+
		"\r\u0005\r\u0087\b\r\n\r\f\r\u008a\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0098\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u009f\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0000"+
		"\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017\u0001\u0000\b\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u0000"+
		"09\u0003\u0000\n\n\r\r\"\"\u0002\u0000<<>>\u0002\u0000++--\u0002\u0000"+
		"**//\u0003\u0000\t\n\r\r  \u00b4\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00037\u0001\u0000"+
		"\u0000\u0000\u0005@\u0001\u0000\u0000\u0000\u0007F\u0001\u0000\u0000\u0000"+
		"\tJ\u0001\u0000\u0000\u0000\u000bL\u0001\u0000\u0000\u0000\rR\u0001\u0000"+
		"\u0000\u0000\u000fV\u0001\u0000\u0000\u0000\u0011\\\u0001\u0000\u0000"+
		"\u0000\u0013c\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000\u0000\u0017"+
		"m\u0001\u0000\u0000\u0000\u0019u\u0001\u0000\u0000\u0000\u001b\u0084\u0001"+
		"\u0000\u0000\u0000\u001d\u008d\u0001\u0000\u0000\u0000\u001f\u0090\u0001"+
		"\u0000\u0000\u0000!\u0097\u0001\u0000\u0000\u0000#\u009e\u0001\u0000\u0000"+
		"\u0000%\u00a0\u0001\u0000\u0000\u0000\'\u00a2\u0001\u0000\u0000\u0000"+
		")\u00a4\u0001\u0000\u0000\u0000+\u00a6\u0001\u0000\u0000\u0000-\u00a8"+
		"\u0001\u0000\u0000\u0000/0\u0005p\u0000\u000001\u0005r\u0000\u000012\u0005"+
		"o\u0000\u000023\u0005g\u0000\u000034\u0005r\u0000\u000045\u0005a\u0000"+
		"\u000056\u0005m\u0000\u00006\u0002\u0001\u0000\u0000\u000078\u0005d\u0000"+
		"\u000089\u0005e\u0000\u00009:\u0005c\u0000\u0000:;\u0005l\u0000\u0000"+
		";<\u0005a\u0000\u0000<=\u0005r\u0000\u0000=>\u0005e\u0000\u0000>?\u0005"+
		"s\u0000\u0000?\u0004\u0001\u0000\u0000\u0000@A\u0005b\u0000\u0000AB\u0005"+
		"e\u0000\u0000BC\u0005g\u0000\u0000CD\u0005i\u0000\u0000DE\u0005n\u0000"+
		"\u0000E\u0006\u0001\u0000\u0000\u0000FG\u0005e\u0000\u0000GH\u0005n\u0000"+
		"\u0000HI\u0005d\u0000\u0000I\b\u0001\u0000\u0000\u0000JK\u0005=\u0000"+
		"\u0000K\n\u0001\u0000\u0000\u0000LM\u0005p\u0000\u0000MN\u0005r\u0000"+
		"\u0000NO\u0005i\u0000\u0000OP\u0005n\u0000\u0000PQ\u0005t\u0000\u0000"+
		"Q\f\u0001\u0000\u0000\u0000RS\u0005i\u0000\u0000ST\u0005n\u0000\u0000"+
		"TU\u0005t\u0000\u0000U\u000e\u0001\u0000\u0000\u0000VW\u0005f\u0000\u0000"+
		"WX\u0005l\u0000\u0000XY\u0005o\u0000\u0000YZ\u0005a\u0000\u0000Z[\u0005"+
		"t\u0000\u0000[\u0010\u0001\u0000\u0000\u0000\\]\u0005s\u0000\u0000]^\u0005"+
		"t\u0000\u0000^_\u0005r\u0000\u0000_`\u0005i\u0000\u0000`a\u0005n\u0000"+
		"\u0000ab\u0005g\u0000\u0000b\u0012\u0001\u0000\u0000\u0000cd\u0005b\u0000"+
		"\u0000de\u0005o\u0000\u0000ef\u0005o\u0000\u0000fg\u0005l\u0000\u0000"+
		"gh\u0005e\u0000\u0000hi\u0005a\u0000\u0000ij\u0005n\u0000\u0000j\u0014"+
		"\u0001\u0000\u0000\u0000kl\u0005;\u0000\u0000l\u0016\u0001\u0000\u0000"+
		"\u0000mq\u0007\u0000\u0000\u0000np\u0007\u0001\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000r\u0018\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000tv\u0005-\u0000\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vx\u0001\u0000\u0000\u0000wy\u0007\u0002\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{\u0082\u0001\u0000\u0000\u0000|~\u0005.\u0000\u0000"+
		"}\u007f\u0007\u0002\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082|\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u001a\u0001\u0000"+
		"\u0000\u0000\u0084\u0088\u0005\"\u0000\u0000\u0085\u0087\b\u0003\u0000"+
		"\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005\"\u0000\u0000\u008c\u001c\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005|\u0000\u0000\u008e\u008f\u0005|\u0000\u0000\u008f\u001e"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005&\u0000\u0000\u0091\u0092\u0005"+
		"&\u0000\u0000\u0092 \u0001\u0000\u0000\u0000\u0093\u0094\u0005=\u0000"+
		"\u0000\u0094\u0098\u0005=\u0000\u0000\u0095\u0096\u0005!\u0000\u0000\u0096"+
		"\u0098\u0005=\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0098\"\u0001\u0000\u0000\u0000\u0099\u009f\u0007"+
		"\u0004\u0000\u0000\u009a\u009b\u0005<\u0000\u0000\u009b\u009f\u0005=\u0000"+
		"\u0000\u009c\u009d\u0005>\u0000\u0000\u009d\u009f\u0005=\u0000\u0000\u009e"+
		"\u0099\u0001\u0000\u0000\u0000\u009e\u009a\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009f$\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0007\u0005\u0000\u0000\u00a1&\u0001\u0000\u0000\u0000\u00a2\u00a3\u0007"+
		"\u0006\u0000\u0000\u00a3(\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005(\u0000"+
		"\u0000\u00a5*\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005)\u0000\u0000\u00a7"+
		",\u0001\u0000\u0000\u0000\u00a8\u00a9\u0007\u0007\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0006\u0016\u0000\u0000\u00ab.\u0001"+
		"\u0000\u0000\u0000\t\u0000quz\u0080\u0082\u0088\u0097\u009e\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}