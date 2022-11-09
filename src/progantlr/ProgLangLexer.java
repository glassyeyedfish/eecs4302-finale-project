// Generated from ProgLang.g4 by ANTLR 4.9.3

	package progantlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, TYPE=31, INT_LIT=32, 
		BOOL_LIT=33, ID=34, COMMENT=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "TYPE", "INT_LIT", "BOOL_LIT", 
			"ID", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'END PROGRAM'", "'::'", "'='", "'PRINT'", "'IF'", 
			"'THEN'", "'END IF'", "'ELSE IF'", "'ELSE'", "'||'", "'&&'", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'**'", 
			"'('", "')'", "'!'", "'LOG'", "'SIN'", "'COS'", "'TAN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TYPE", "INT_LIT", "BOOL_LIT", 
			"ID", "COMMENT", "WS"
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


	public ProgLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProgLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00f7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \5 \u00c5\n \3!\3!\5!\u00c9\n!\3!\3!\7!\u00cd\n!\f!\16!\u00d0\13!\5!"+
		"\u00d2\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00dd\n\"\3#\3#\7#\u00e1"+
		"\n#\f#\16#\u00e4\13#\3$\3$\3$\3$\7$\u00ea\n$\f$\16$\u00ed\13$\3$\3$\3"+
		"%\6%\u00f2\n%\r%\16%\u00f3\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\b\3\2\63;\3\2"+
		"\62;\3\2c|\5\2\62;aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00fe\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\3K\3\2\2\2\5S\3\2\2\2\7_\3\2\2\2\tb\3\2\2\2\13d\3\2\2\2\rj\3"+
		"\2\2\2\17m\3\2\2\2\21r\3\2\2\2\23y\3\2\2\2\25\u0081\3\2\2\2\27\u0086\3"+
		"\2\2\2\31\u0089\3\2\2\2\33\u008c\3\2\2\2\35\u008f\3\2\2\2\37\u0092\3\2"+
		"\2\2!\u0094\3\2\2\2#\u0096\3\2\2\2%\u0099\3\2\2\2\'\u009c\3\2\2\2)\u009e"+
		"\3\2\2\2+\u00a0\3\2\2\2-\u00a2\3\2\2\2/\u00a4\3\2\2\2\61\u00a7\3\2\2\2"+
		"\63\u00a9\3\2\2\2\65\u00ab\3\2\2\2\67\u00ad\3\2\2\29\u00b1\3\2\2\2;\u00b5"+
		"\3\2\2\2=\u00b9\3\2\2\2?\u00c4\3\2\2\2A\u00d1\3\2\2\2C\u00dc\3\2\2\2E"+
		"\u00de\3\2\2\2G\u00e5\3\2\2\2I\u00f1\3\2\2\2KL\7R\2\2LM\7T\2\2MN\7Q\2"+
		"\2NO\7I\2\2OP\7T\2\2PQ\7C\2\2QR\7O\2\2R\4\3\2\2\2ST\7G\2\2TU\7P\2\2UV"+
		"\7F\2\2VW\7\"\2\2WX\7R\2\2XY\7T\2\2YZ\7Q\2\2Z[\7I\2\2[\\\7T\2\2\\]\7C"+
		"\2\2]^\7O\2\2^\6\3\2\2\2_`\7<\2\2`a\7<\2\2a\b\3\2\2\2bc\7?\2\2c\n\3\2"+
		"\2\2de\7R\2\2ef\7T\2\2fg\7K\2\2gh\7P\2\2hi\7V\2\2i\f\3\2\2\2jk\7K\2\2"+
		"kl\7H\2\2l\16\3\2\2\2mn\7V\2\2no\7J\2\2op\7G\2\2pq\7P\2\2q\20\3\2\2\2"+
		"rs\7G\2\2st\7P\2\2tu\7F\2\2uv\7\"\2\2vw\7K\2\2wx\7H\2\2x\22\3\2\2\2yz"+
		"\7G\2\2z{\7N\2\2{|\7U\2\2|}\7G\2\2}~\7\"\2\2~\177\7K\2\2\177\u0080\7H"+
		"\2\2\u0080\24\3\2\2\2\u0081\u0082\7G\2\2\u0082\u0083\7N\2\2\u0083\u0084"+
		"\7U\2\2\u0084\u0085\7G\2\2\u0085\26\3\2\2\2\u0086\u0087\7~\2\2\u0087\u0088"+
		"\7~\2\2\u0088\30\3\2\2\2\u0089\u008a\7(\2\2\u008a\u008b\7(\2\2\u008b\32"+
		"\3\2\2\2\u008c\u008d\7?\2\2\u008d\u008e\7?\2\2\u008e\34\3\2\2\2\u008f"+
		"\u0090\7#\2\2\u0090\u0091\7?\2\2\u0091\36\3\2\2\2\u0092\u0093\7>\2\2\u0093"+
		" \3\2\2\2\u0094\u0095\7@\2\2\u0095\"\3\2\2\2\u0096\u0097\7>\2\2\u0097"+
		"\u0098\7?\2\2\u0098$\3\2\2\2\u0099\u009a\7@\2\2\u009a\u009b\7?\2\2\u009b"+
		"&\3\2\2\2\u009c\u009d\7-\2\2\u009d(\3\2\2\2\u009e\u009f\7/\2\2\u009f*"+
		"\3\2\2\2\u00a0\u00a1\7,\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3"+
		".\3\2\2\2\u00a4\u00a5\7,\2\2\u00a5\u00a6\7,\2\2\u00a6\60\3\2\2\2\u00a7"+
		"\u00a8\7*\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\7+\2\2\u00aa\64\3\2\2\2\u00ab"+
		"\u00ac\7#\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\7N\2\2\u00ae\u00af\7Q\2\2\u00af"+
		"\u00b0\7I\2\2\u00b08\3\2\2\2\u00b1\u00b2\7U\2\2\u00b2\u00b3\7K\2\2\u00b3"+
		"\u00b4\7P\2\2\u00b4:\3\2\2\2\u00b5\u00b6\7E\2\2\u00b6\u00b7\7Q\2\2\u00b7"+
		"\u00b8\7U\2\2\u00b8<\3\2\2\2\u00b9\u00ba\7V\2\2\u00ba\u00bb\7C\2\2\u00bb"+
		"\u00bc\7P\2\2\u00bc>\3\2\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7P\2\2\u00bf"+
		"\u00c5\7V\2\2\u00c0\u00c1\7D\2\2\u00c1\u00c2\7Q\2\2\u00c2\u00c3\7Q\2\2"+
		"\u00c3\u00c5\7N\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5@\3\2"+
		"\2\2\u00c6\u00d2\7\62\2\2\u00c7\u00c9\7/\2\2\u00c8\u00c7\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce\t\2\2\2\u00cb\u00cd\t\3"+
		"\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00c6\3\2"+
		"\2\2\u00d1\u00c8\3\2\2\2\u00d2B\3\2\2\2\u00d3\u00d4\7V\2\2\u00d4\u00d5"+
		"\7T\2\2\u00d5\u00d6\7W\2\2\u00d6\u00dd\7G\2\2\u00d7\u00d8\7H\2\2\u00d8"+
		"\u00d9\7C\2\2\u00d9\u00da\7N\2\2\u00da\u00db\7U\2\2\u00db\u00dd\7G\2\2"+
		"\u00dc\u00d3\3\2\2\2\u00dc\u00d7\3\2\2\2\u00ddD\3\2\2\2\u00de\u00e2\t"+
		"\4\2\2\u00df\u00e1\t\5\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3F\3\2\2\2\u00e4\u00e2\3\2\2\2"+
		"\u00e5\u00e6\7#\2\2\u00e6\u00e7\7#\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00ea"+
		"\n\6\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\b$"+
		"\2\2\u00efH\3\2\2\2\u00f0\u00f2\t\7\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\b%\2\2\u00f6J\3\2\2\2\13\2\u00c4\u00c8\u00ce\u00d1\u00dc\u00e2"+
		"\u00eb\u00f3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}