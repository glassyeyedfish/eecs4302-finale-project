// Generated from TestLang.g4 by ANTLR 4.9.3

	package testlang.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, TYPE=12, INT_LIT=13, BOOL_LIT=14, ID=15, COMMENT=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "TYPE", "INT_LIT", "BOOL_LIT", "ID", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TEST'", "'END TEST'", "'@Test'", "'FUNC'", "'()'", "'END FUNC'", 
			"'('", "','", "')'", "'ASSERTEQUALS'", "'ASSERT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"TYPE", "INT_LIT", "BOOL_LIT", "ID", "COMMENT", "WS"
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


	public TestLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TestLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\rl\n\r\3\16\3\16\5\16p\n\16\3\16\3\16\7\16t\n\16"+
		"\f\16\16\16w\13\16\5\16y\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0084\n\17\3\20\3\20\7\20\u0088\n\20\f\20\16\20\u008b\13\20"+
		"\3\21\3\21\3\21\3\21\7\21\u0091\n\21\f\21\16\21\u0094\13\21\3\21\3\21"+
		"\3\22\6\22\u0099\n\22\r\22\16\22\u009a\3\22\3\22\2\2\23\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"\3\2\b\3\2\63;\3\2\62;\3\2c|\5\2\62;aac|\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\2\u00a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\3%\3\2\2\2\5*\3\2\2\2\7\63\3\2\2\2\t9\3\2\2\2\13>\3\2"+
		"\2\2\rA\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25P\3\2\2\2\27]\3"+
		"\2\2\2\31k\3\2\2\2\33x\3\2\2\2\35\u0083\3\2\2\2\37\u0085\3\2\2\2!\u008c"+
		"\3\2\2\2#\u0098\3\2\2\2%&\7V\2\2&\'\7G\2\2\'(\7U\2\2()\7V\2\2)\4\3\2\2"+
		"\2*+\7G\2\2+,\7P\2\2,-\7F\2\2-.\7\"\2\2./\7V\2\2/\60\7G\2\2\60\61\7U\2"+
		"\2\61\62\7V\2\2\62\6\3\2\2\2\63\64\7B\2\2\64\65\7V\2\2\65\66\7g\2\2\66"+
		"\67\7u\2\2\678\7v\2\28\b\3\2\2\29:\7H\2\2:;\7W\2\2;<\7P\2\2<=\7E\2\2="+
		"\n\3\2\2\2>?\7*\2\2?@\7+\2\2@\f\3\2\2\2AB\7G\2\2BC\7P\2\2CD\7F\2\2DE\7"+
		"\"\2\2EF\7H\2\2FG\7W\2\2GH\7P\2\2HI\7E\2\2I\16\3\2\2\2JK\7*\2\2K\20\3"+
		"\2\2\2LM\7.\2\2M\22\3\2\2\2NO\7+\2\2O\24\3\2\2\2PQ\7C\2\2QR\7U\2\2RS\7"+
		"U\2\2ST\7G\2\2TU\7T\2\2UV\7V\2\2VW\7G\2\2WX\7S\2\2XY\7W\2\2YZ\7C\2\2Z"+
		"[\7N\2\2[\\\7U\2\2\\\26\3\2\2\2]^\7C\2\2^_\7U\2\2_`\7U\2\2`a\7G\2\2ab"+
		"\7T\2\2bc\7V\2\2c\30\3\2\2\2de\7K\2\2ef\7P\2\2fl\7V\2\2gh\7D\2\2hi\7Q"+
		"\2\2ij\7Q\2\2jl\7N\2\2kd\3\2\2\2kg\3\2\2\2l\32\3\2\2\2my\7\62\2\2np\7"+
		"/\2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qu\t\2\2\2rt\t\3\2\2sr\3\2\2\2tw\3"+
		"\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xm\3\2\2\2xo\3\2\2\2y\34"+
		"\3\2\2\2z{\7V\2\2{|\7T\2\2|}\7W\2\2}\u0084\7G\2\2~\177\7H\2\2\177\u0080"+
		"\7C\2\2\u0080\u0081\7N\2\2\u0081\u0082\7U\2\2\u0082\u0084\7G\2\2\u0083"+
		"z\3\2\2\2\u0083~\3\2\2\2\u0084\36\3\2\2\2\u0085\u0089\t\4\2\2\u0086\u0088"+
		"\t\5\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a \3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7#\2\2\u008d"+
		"\u008e\7#\2\2\u008e\u0092\3\2\2\2\u008f\u0091\n\6\2\2\u0090\u008f\3\2"+
		"\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\b\21\2\2\u0096\"\3\2\2"+
		"\2\u0097\u0099\t\7\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\22\2\2"+
		"\u009d$\3\2\2\2\13\2koux\u0083\u0089\u0092\u009a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}