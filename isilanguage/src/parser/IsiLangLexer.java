// Generated from IsiLang.g4 by ANTLR 4.10.1
package isilanguage.src.parser;

    import isilanguage.src.datastructures.*;
    import isilanguage.src.ast.*;
    import isilanguage.src.exceptions.IsiSemanticException;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Stack;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, SINGLETERMOPERATOR=12, OPENPARENTHESIS=13, CLOSEPARENTHESIS=14, 
		OPENBRACKETS=15, CLOSEBRACKETS=16, SEMICOLON=17, OPERATOR=18, ATTRIBUTION=19, 
		RELATIONALOPERATOR=20, BOOLEAN=21, IDENTIFIER=22, NUMBER=23, TEXT=24, 
		COMMA=25, DOUBLEQUOTE=26, WHITESPACE=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "SINGLETERMOPERATOR", "OPENPARENTHESIS", "CLOSEPARENTHESIS", 
			"OPENBRACKETS", "CLOSEBRACKETS", "SEMICOLON", "OPERATOR", "ATTRIBUTION", 
			"RELATIONALOPERATOR", "BOOLEAN", "IDENTIFIER", "NUMBER", "TEXT", "COMMA", 
			"DOUBLEQUOTE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'declara'", "'leia'", "'escreva'", 
			"'se'", "'senao'", "'enquanto'", "'texto'", "'numero'", "'booleano'", 
			null, "'('", "')'", "'{'", "'}'", "';'", null, "'='", null, null, null, 
			null, null, "','", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"SINGLETERMOPERATOR", "OPENPARENTHESIS", "CLOSEPARENTHESIS", "OPENBRACKETS", 
			"CLOSEBRACKETS", "SEMICOLON", "OPERATOR", "ATTRIBUTION", "RELATIONALOPERATOR", 
			"BOOLEAN", "IDENTIFIER", "NUMBER", "TEXT", "COMMA", "DOUBLEQUOTE", "WHITESPACE"
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


	    private int _type;
	    private String _varName;
	    private String _varValue;
	    private List<String> _unusedVariables = new ArrayList<String>();
	    private IsiSymbol symbol;
	    private IsiSymbolTable symbolTable = new IsiSymbolTable();

	    //Generate code variables start

	    private IsiProgram program = new IsiProgram();
	    private ArrayList<AbstractCommand> currentThread;

	    private Stack<ArrayList<AbstractCommand>> allCommands = new Stack<ArrayList<AbstractCommand>>();

	    private String _commandId;
	    private String _expressionId;
	    private String _expressionContent;
	    private Stack<String> _expressionConditionStack = new Stack<String>();
	    private String _expressionCondition;
	    private String _expressionWhileCondition;
	    private Stack<String> _expressionWhileConditionStack = new Stack<String>();
	    private ArrayList<AbstractCommand> ifList;
	    private ArrayList<AbstractCommand> elseList;
	    private ArrayList<AbstractCommand> whileList;

	    //Generate code variables end


	    public void exibeComandos(){
	        for (AbstractCommand c : program.getCommands()){
	             System.out.println(c);
	        }
	    }
	    public void generateCode(){
	        program.generateTarget();
	    }

	    public void verifyID(String id){
	       if (!symbolTable.exists(id)){
	           throw new IsiSemanticException("Symbol "+id+" not declared");
	       }
	    }
	    public void verifyType(String id, int type){
	       if (((IsiVariable) symbolTable.get(id)).getType() != type){
	           throw new IsiSemanticException("Symbol "+id+" has wrong type");
	       }
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
		"\u0004\u0000\u001b\u00da\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u008e\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u009d\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00aa\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00b5\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u00b9\b\u0015\n\u0015\f\u0015\u00bc\t\u0015\u0001\u0016"+
		"\u0004\u0016\u00bf\b\u0016\u000b\u0016\f\u0016\u00c0\u0001\u0016\u0001"+
		"\u0016\u0004\u0016\u00c5\b\u0016\u000b\u0016\f\u0016\u00c6\u0003\u0016"+
		"\u00c9\b\u0016\u0001\u0017\u0001\u0017\u0004\u0017\u00cd\b\u0017\u000b"+
		"\u0017\f\u0017\u00ce\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0000"+
		"\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b\u0001\u0000\u0007\u0003\u0000*+--"+
		"//\u0002\u0000<<>>\u0001\u0000az\u0003\u000009AZaz\u0001\u000009\u0004"+
		"\u0000  09AZaz\u0003\u0000\t\n\r\r  \u00e5\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u0003@\u0001\u0000\u0000\u0000"+
		"\u0005I\u0001\u0000\u0000\u0000\u0007Q\u0001\u0000\u0000\u0000\tV\u0001"+
		"\u0000\u0000\u0000\u000b^\u0001\u0000\u0000\u0000\ra\u0001\u0000\u0000"+
		"\u0000\u000fg\u0001\u0000\u0000\u0000\u0011p\u0001\u0000\u0000\u0000\u0013"+
		"v\u0001\u0000\u0000\u0000\u0015}\u0001\u0000\u0000\u0000\u0017\u008d\u0001"+
		"\u0000\u0000\u0000\u0019\u008f\u0001\u0000\u0000\u0000\u001b\u0091\u0001"+
		"\u0000\u0000\u0000\u001d\u0093\u0001\u0000\u0000\u0000\u001f\u0095\u0001"+
		"\u0000\u0000\u0000!\u0097\u0001\u0000\u0000\u0000#\u009c\u0001\u0000\u0000"+
		"\u0000%\u009e\u0001\u0000\u0000\u0000\'\u00a9\u0001\u0000\u0000\u0000"+
		")\u00b4\u0001\u0000\u0000\u0000+\u00b6\u0001\u0000\u0000\u0000-\u00be"+
		"\u0001\u0000\u0000\u0000/\u00ca\u0001\u0000\u0000\u00001\u00d2\u0001\u0000"+
		"\u0000\u00003\u00d4\u0001\u0000\u0000\u00005\u00d6\u0001\u0000\u0000\u0000"+
		"78\u0005p\u0000\u000089\u0005r\u0000\u00009:\u0005o\u0000\u0000:;\u0005"+
		"g\u0000\u0000;<\u0005r\u0000\u0000<=\u0005a\u0000\u0000=>\u0005m\u0000"+
		"\u0000>?\u0005a\u0000\u0000?\u0002\u0001\u0000\u0000\u0000@A\u0005f\u0000"+
		"\u0000AB\u0005i\u0000\u0000BC\u0005m\u0000\u0000CD\u0005p\u0000\u0000"+
		"DE\u0005r\u0000\u0000EF\u0005o\u0000\u0000FG\u0005g\u0000\u0000GH\u0005"+
		";\u0000\u0000H\u0004\u0001\u0000\u0000\u0000IJ\u0005d\u0000\u0000JK\u0005"+
		"e\u0000\u0000KL\u0005c\u0000\u0000LM\u0005l\u0000\u0000MN\u0005a\u0000"+
		"\u0000NO\u0005r\u0000\u0000OP\u0005a\u0000\u0000P\u0006\u0001\u0000\u0000"+
		"\u0000QR\u0005l\u0000\u0000RS\u0005e\u0000\u0000ST\u0005i\u0000\u0000"+
		"TU\u0005a\u0000\u0000U\b\u0001\u0000\u0000\u0000VW\u0005e\u0000\u0000"+
		"WX\u0005s\u0000\u0000XY\u0005c\u0000\u0000YZ\u0005r\u0000\u0000Z[\u0005"+
		"e\u0000\u0000[\\\u0005v\u0000\u0000\\]\u0005a\u0000\u0000]\n\u0001\u0000"+
		"\u0000\u0000^_\u0005s\u0000\u0000_`\u0005e\u0000\u0000`\f\u0001\u0000"+
		"\u0000\u0000ab\u0005s\u0000\u0000bc\u0005e\u0000\u0000cd\u0005n\u0000"+
		"\u0000de\u0005a\u0000\u0000ef\u0005o\u0000\u0000f\u000e\u0001\u0000\u0000"+
		"\u0000gh\u0005e\u0000\u0000hi\u0005n\u0000\u0000ij\u0005q\u0000\u0000"+
		"jk\u0005u\u0000\u0000kl\u0005a\u0000\u0000lm\u0005n\u0000\u0000mn\u0005"+
		"t\u0000\u0000no\u0005o\u0000\u0000o\u0010\u0001\u0000\u0000\u0000pq\u0005"+
		"t\u0000\u0000qr\u0005e\u0000\u0000rs\u0005x\u0000\u0000st\u0005t\u0000"+
		"\u0000tu\u0005o\u0000\u0000u\u0012\u0001\u0000\u0000\u0000vw\u0005n\u0000"+
		"\u0000wx\u0005u\u0000\u0000xy\u0005m\u0000\u0000yz\u0005e\u0000\u0000"+
		"z{\u0005r\u0000\u0000{|\u0005o\u0000\u0000|\u0014\u0001\u0000\u0000\u0000"+
		"}~\u0005b\u0000\u0000~\u007f\u0005o\u0000\u0000\u007f\u0080\u0005o\u0000"+
		"\u0000\u0080\u0081\u0005l\u0000\u0000\u0081\u0082\u0005e\u0000\u0000\u0082"+
		"\u0083\u0005a\u0000\u0000\u0083\u0084\u0005n\u0000\u0000\u0084\u0085\u0005"+
		"o\u0000\u0000\u0085\u0016\u0001\u0000\u0000\u0000\u0086\u0087\u0005r\u0000"+
		"\u0000\u0087\u0088\u0005a\u0000\u0000\u0088\u0089\u0005i\u0000\u0000\u0089"+
		"\u008e\u0005z\u0000\u0000\u008a\u008b\u0005l\u0000\u0000\u008b\u008c\u0005"+
		"o\u0000\u0000\u008c\u008e\u0005g\u0000\u0000\u008d\u0086\u0001\u0000\u0000"+
		"\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008e\u0018\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005(\u0000\u0000\u0090\u001a\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0005)\u0000\u0000\u0092\u001c\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005{\u0000\u0000\u0094\u001e\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005}\u0000\u0000\u0096 \u0001\u0000\u0000\u0000\u0097\u0098\u0005;"+
		"\u0000\u0000\u0098\"\u0001\u0000\u0000\u0000\u0099\u009d\u0007\u0000\u0000"+
		"\u0000\u009a\u009b\u0005*\u0000\u0000\u009b\u009d\u0005*\u0000\u0000\u009c"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d"+
		"$\u0001\u0000\u0000\u0000\u009e\u009f\u0005=\u0000\u0000\u009f&\u0001"+
		"\u0000\u0000\u0000\u00a0\u00aa\u0007\u0001\u0000\u0000\u00a1\u00a2\u0005"+
		">\u0000\u0000\u00a2\u00aa\u0005=\u0000\u0000\u00a3\u00a4\u0005<\u0000"+
		"\u0000\u00a4\u00aa\u0005=\u0000\u0000\u00a5\u00a6\u0005=\u0000\u0000\u00a6"+
		"\u00aa\u0005=\u0000\u0000\u00a7\u00a8\u0005!\u0000\u0000\u00a8\u00aa\u0005"+
		"=\u0000\u0000\u00a9\u00a0\u0001\u0000\u0000\u0000\u00a9\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000\u0000\u00a9\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa(\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005t\u0000\u0000\u00ac\u00ad\u0005r\u0000\u0000\u00ad"+
		"\u00ae\u0005u\u0000\u0000\u00ae\u00b5\u0005e\u0000\u0000\u00af\u00b0\u0005"+
		"f\u0000\u0000\u00b0\u00b1\u0005a\u0000\u0000\u00b1\u00b2\u0005l\u0000"+
		"\u0000\u00b2\u00b3\u0005s\u0000\u0000\u00b3\u00b5\u0005e\u0000\u0000\u00b4"+
		"\u00ab\u0001\u0000\u0000\u0000\u00b4\u00af\u0001\u0000\u0000\u0000\u00b5"+
		"*\u0001\u0000\u0000\u0000\u00b6\u00ba\u0007\u0002\u0000\u0000\u00b7\u00b9"+
		"\u0007\u0003\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb,\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bf\u0007\u0004\u0000\u0000\u00be\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c4\u0005.\u0000\u0000\u00c3\u00c5\u0007\u0004"+
		"\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9.\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cc\u00033\u0019\u0000\u00cb\u00cd\u0007\u0005\u0000\u0000"+
		"\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u00033\u0019\u0000\u00d1"+
		"0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005,\u0000\u0000\u00d32\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005\"\u0000\u0000\u00d54\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0007\u0006\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0006\u001a\u0000\u0000\u00d96\u0001\u0000\u0000"+
		"\u0000\f\u0000\u008d\u009c\u00a9\u00b4\u00b8\u00ba\u00c0\u00c6\u00c8\u00cc"+
		"\u00ce\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}