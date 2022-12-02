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
		T__9=10, TYPE=11, INT_LIT=12, BOOL_LIT=13, ID=14, COMMENT=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "TYPE", "INT_LIT", "BOOL_LIT", "ID", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TEST'", "'END TEST'", "'@Test'", "'FUNC'", "'('", "')'", "'END FUNC'", 
			"','", "'ASSERTEQUALS'", "'ASSERT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "TYPE", 
			"INT_LIT", "BOOL_LIT", "ID", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fg\n\f\3"+
		"\r\3\r\5\rk\n\r\3\r\3\r\7\ro\n\r\f\r\16\rr\13\r\5\rt\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\177\n\16\3\17\3\17\7\17\u0083\n\17"+
		"\f\17\16\17\u0086\13\17\3\20\3\20\3\20\3\20\7\20\u008c\n\20\f\20\16\20"+
		"\u008f\13\20\3\20\3\20\3\21\6\21\u0094\n\21\r\21\16\21\u0095\3\21\3\21"+
		"\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22\3\2\b\3\2\63;\3\2\62;\3\2c|\5\2\62;aac|\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\2\u00a0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5(\3\2\2\2\7\61\3\2\2\2\t\67\3\2\2\2\13"+
		"<\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25X\3\2\2\2\27"+
		"f\3\2\2\2\31s\3\2\2\2\33~\3\2\2\2\35\u0080\3\2\2\2\37\u0087\3\2\2\2!\u0093"+
		"\3\2\2\2#$\7V\2\2$%\7G\2\2%&\7U\2\2&\'\7V\2\2\'\4\3\2\2\2()\7G\2\2)*\7"+
		"P\2\2*+\7F\2\2+,\7\"\2\2,-\7V\2\2-.\7G\2\2./\7U\2\2/\60\7V\2\2\60\6\3"+
		"\2\2\2\61\62\7B\2\2\62\63\7V\2\2\63\64\7g\2\2\64\65\7u\2\2\65\66\7v\2"+
		"\2\66\b\3\2\2\2\678\7H\2\289\7W\2\29:\7P\2\2:;\7E\2\2;\n\3\2\2\2<=\7*"+
		"\2\2=\f\3\2\2\2>?\7+\2\2?\16\3\2\2\2@A\7G\2\2AB\7P\2\2BC\7F\2\2CD\7\""+
		"\2\2DE\7H\2\2EF\7W\2\2FG\7P\2\2GH\7E\2\2H\20\3\2\2\2IJ\7.\2\2J\22\3\2"+
		"\2\2KL\7C\2\2LM\7U\2\2MN\7U\2\2NO\7G\2\2OP\7T\2\2PQ\7V\2\2QR\7G\2\2RS"+
		"\7S\2\2ST\7W\2\2TU\7C\2\2UV\7N\2\2VW\7U\2\2W\24\3\2\2\2XY\7C\2\2YZ\7U"+
		"\2\2Z[\7U\2\2[\\\7G\2\2\\]\7T\2\2]^\7V\2\2^\26\3\2\2\2_`\7K\2\2`a\7P\2"+
		"\2ag\7V\2\2bc\7D\2\2cd\7Q\2\2de\7Q\2\2eg\7N\2\2f_\3\2\2\2fb\3\2\2\2g\30"+
		"\3\2\2\2ht\7\62\2\2ik\7/\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lp\t\2\2\2m"+
		"o\t\3\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2"+
		"sh\3\2\2\2sj\3\2\2\2t\32\3\2\2\2uv\7V\2\2vw\7T\2\2wx\7W\2\2x\177\7G\2"+
		"\2yz\7H\2\2z{\7C\2\2{|\7N\2\2|}\7U\2\2}\177\7G\2\2~u\3\2\2\2~y\3\2\2\2"+
		"\177\34\3\2\2\2\u0080\u0084\t\4\2\2\u0081\u0083\t\5\2\2\u0082\u0081\3"+
		"\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\36\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7#\2\2\u0088\u0089\7#\2\2"+
		"\u0089\u008d\3\2\2\2\u008a\u008c\n\6\2\2\u008b\u008a\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\b\20\2\2\u0091 \3\2\2\2\u0092\u0094\t\7\2\2"+
		"\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\21\2\2\u0098\"\3\2\2\2\13\2"+
		"fjps~\u0084\u008d\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}