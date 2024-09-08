// Generated from C:/Users/gusta/dev/compildores-2024-2-ufabc/src/IsiLang.g4 by ANTLR 4.13.1
package io.compiler.core.generated;

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
		T__9=10, T__10=11, T__11=12, END_OF_LINE=13, IDENTIFIER=14, NUM=15, STRING=16, 
		OP_OR=17, OP_AND=18, OP_COMP=19, OP_REL=20, OP_TERM=21, OP_FACTOR=22, 
		DOT=23, OPEN_PAREN=24, CLOSE_PAREN=25, OPEN_CURLY=26, CLOSE_CURLY=27, 
		WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "END_OF_LINE", "IDENTIFIER", "NUM", "STRING", 
			"OP_OR", "OP_AND", "OP_COMP", "OP_REL", "OP_TERM", "OP_FACTOR", "DOT", 
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_CURLY", "CLOSE_CURLY", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'fimprog'", "'='", "'escreva'", "'se'", 
			"'entao'", "'senao'", "'int'", "'float'", "'string'", "'boolean'", "';'", 
			null, null, null, "'||'", "'&&'", null, null, null, null, "'.'", "'('", 
			"')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "END_OF_LINE", "IDENTIFIER", "NUM", "STRING", "OP_OR", "OP_AND", 
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
		"\u0004\u0000\u001c\u00ca\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0005\r\u0088\b\r\n\r\f\r\u008b\t\r\u0001\u000e\u0003\u000e"+
		"\u008e\b\u000e\u0001\u000e\u0004\u000e\u0091\b\u000e\u000b\u000e\f\u000e"+
		"\u0092\u0001\u000e\u0001\u000e\u0004\u000e\u0097\b\u000e\u000b\u000e\f"+
		"\u000e\u0098\u0003\u000e\u009b\b\u000e\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u009f\b\u000f\n\u000f\f\u000f\u00a2\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00b0\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00b7"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0000\u0000\u001c\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c\u0001\u0000"+
		"\b\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\n\n"+
		"\r\r\"\"\u0002\u0000<<>>\u0002\u0000++--\u0002\u0000**//\u0003\u0000\t"+
		"\n\r\r  \u00d2\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
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
		"\u0000\u0000\u0000\u00019\u0001\u0000\u0000\u0000\u0003B\u0001\u0000\u0000"+
		"\u0000\u0005I\u0001\u0000\u0000\u0000\u0007Q\u0001\u0000\u0000\u0000\t"+
		"S\u0001\u0000\u0000\u0000\u000b[\u0001\u0000\u0000\u0000\r^\u0001\u0000"+
		"\u0000\u0000\u000fd\u0001\u0000\u0000\u0000\u0011j\u0001\u0000\u0000\u0000"+
		"\u0013n\u0001\u0000\u0000\u0000\u0015t\u0001\u0000\u0000\u0000\u0017{"+
		"\u0001\u0000\u0000\u0000\u0019\u0083\u0001\u0000\u0000\u0000\u001b\u0085"+
		"\u0001\u0000\u0000\u0000\u001d\u008d\u0001\u0000\u0000\u0000\u001f\u009c"+
		"\u0001\u0000\u0000\u0000!\u00a5\u0001\u0000\u0000\u0000#\u00a8\u0001\u0000"+
		"\u0000\u0000%\u00af\u0001\u0000\u0000\u0000\'\u00b6\u0001\u0000\u0000"+
		"\u0000)\u00b8\u0001\u0000\u0000\u0000+\u00ba\u0001\u0000\u0000\u0000-"+
		"\u00bc\u0001\u0000\u0000\u0000/\u00be\u0001\u0000\u0000\u00001\u00c0\u0001"+
		"\u0000\u0000\u00003\u00c2\u0001\u0000\u0000\u00005\u00c4\u0001\u0000\u0000"+
		"\u00007\u00c6\u0001\u0000\u0000\u00009:\u0005p\u0000\u0000:;\u0005r\u0000"+
		"\u0000;<\u0005o\u0000\u0000<=\u0005g\u0000\u0000=>\u0005r\u0000\u0000"+
		">?\u0005a\u0000\u0000?@\u0005m\u0000\u0000@A\u0005a\u0000\u0000A\u0002"+
		"\u0001\u0000\u0000\u0000BC\u0005i\u0000\u0000CD\u0005n\u0000\u0000DE\u0005"+
		"i\u0000\u0000EF\u0005c\u0000\u0000FG\u0005i\u0000\u0000GH\u0005o\u0000"+
		"\u0000H\u0004\u0001\u0000\u0000\u0000IJ\u0005f\u0000\u0000JK\u0005i\u0000"+
		"\u0000KL\u0005m\u0000\u0000LM\u0005p\u0000\u0000MN\u0005r\u0000\u0000"+
		"NO\u0005o\u0000\u0000OP\u0005g\u0000\u0000P\u0006\u0001\u0000\u0000\u0000"+
		"QR\u0005=\u0000\u0000R\b\u0001\u0000\u0000\u0000ST\u0005e\u0000\u0000"+
		"TU\u0005s\u0000\u0000UV\u0005c\u0000\u0000VW\u0005r\u0000\u0000WX\u0005"+
		"e\u0000\u0000XY\u0005v\u0000\u0000YZ\u0005a\u0000\u0000Z\n\u0001\u0000"+
		"\u0000\u0000[\\\u0005s\u0000\u0000\\]\u0005e\u0000\u0000]\f\u0001\u0000"+
		"\u0000\u0000^_\u0005e\u0000\u0000_`\u0005n\u0000\u0000`a\u0005t\u0000"+
		"\u0000ab\u0005a\u0000\u0000bc\u0005o\u0000\u0000c\u000e\u0001\u0000\u0000"+
		"\u0000de\u0005s\u0000\u0000ef\u0005e\u0000\u0000fg\u0005n\u0000\u0000"+
		"gh\u0005a\u0000\u0000hi\u0005o\u0000\u0000i\u0010\u0001\u0000\u0000\u0000"+
		"jk\u0005i\u0000\u0000kl\u0005n\u0000\u0000lm\u0005t\u0000\u0000m\u0012"+
		"\u0001\u0000\u0000\u0000no\u0005f\u0000\u0000op\u0005l\u0000\u0000pq\u0005"+
		"o\u0000\u0000qr\u0005a\u0000\u0000rs\u0005t\u0000\u0000s\u0014\u0001\u0000"+
		"\u0000\u0000tu\u0005s\u0000\u0000uv\u0005t\u0000\u0000vw\u0005r\u0000"+
		"\u0000wx\u0005i\u0000\u0000xy\u0005n\u0000\u0000yz\u0005g\u0000\u0000"+
		"z\u0016\u0001\u0000\u0000\u0000{|\u0005b\u0000\u0000|}\u0005o\u0000\u0000"+
		"}~\u0005o\u0000\u0000~\u007f\u0005l\u0000\u0000\u007f\u0080\u0005e\u0000"+
		"\u0000\u0080\u0081\u0005a\u0000\u0000\u0081\u0082\u0005n\u0000\u0000\u0082"+
		"\u0018\u0001\u0000\u0000\u0000\u0083\u0084\u0005;\u0000\u0000\u0084\u001a"+
		"\u0001\u0000\u0000\u0000\u0085\u0089\u0007\u0000\u0000\u0000\u0086\u0088"+
		"\u0007\u0001\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u001c\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u008e\u0005-\u0000\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0007\u0002\u0000\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u009a\u0001"+
		"\u0000\u0000\u0000\u0094\u0096\u0005.\u0000\u0000\u0095\u0097\u0007\u0002"+
		"\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0094\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u001e\u0001\u0000"+
		"\u0000\u0000\u009c\u00a0\u0005\"\u0000\u0000\u009d\u009f\b\u0003\u0000"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005\"\u0000\u0000\u00a4 \u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0005|\u0000\u0000\u00a6\u00a7\u0005|\u0000\u0000\u00a7\""+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005&\u0000\u0000\u00a9\u00aa\u0005"+
		"&\u0000\u0000\u00aa$\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005=\u0000"+
		"\u0000\u00ac\u00b0\u0005=\u0000\u0000\u00ad\u00ae\u0005!\u0000\u0000\u00ae"+
		"\u00b0\u0005=\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b0&\u0001\u0000\u0000\u0000\u00b1\u00b7\u0007"+
		"\u0004\u0000\u0000\u00b2\u00b3\u0005<\u0000\u0000\u00b3\u00b7\u0005=\u0000"+
		"\u0000\u00b4\u00b5\u0005>\u0000\u0000\u00b5\u00b7\u0005=\u0000\u0000\u00b6"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b7(\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0007\u0005\u0000\u0000\u00b9*\u0001\u0000\u0000\u0000\u00ba\u00bb\u0007"+
		"\u0006\u0000\u0000\u00bb,\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005.\u0000"+
		"\u0000\u00bd.\u0001\u0000\u0000\u0000\u00be\u00bf\u0005(\u0000\u0000\u00bf"+
		"0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005)\u0000\u0000\u00c12\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0005{\u0000\u0000\u00c34\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005}\u0000\u0000\u00c56\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0007\u0007\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0006\u001b\u0000\u0000\u00c98\u0001\u0000\u0000\u0000\t\u0000"+
		"\u0089\u008d\u0092\u0098\u009a\u00a0\u00af\u00b6\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}