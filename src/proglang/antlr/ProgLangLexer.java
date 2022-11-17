// Generated from ProgLang.g4 by ANTLR 4.9.3

	package proglang.antlr;

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
		T__24=25, TYPE=26, INT=27, BOOL=28, ID=29, COMMENT=30, WS=31;
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
			"TYPE", "INT", "BOOL", "ID", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'END PROGRAM'", "'FUNC'", "'('", "','", "')'", "'::'", 
			"'return'", "'END'", "'='", "'PRINT'", "'IF'", "'THEN'", "'*'", "'+'", 
			"'-'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", 
			"'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TYPE", "INT", "BOOL", "ID", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00d6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u00a4\n\33\3\34\3\34\5\34\u00a8\n\34\3\34\3\34\7\34"+
		"\u00ac\n\34\f\34\16\34\u00af\13\34\5\34\u00b1\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u00bc\n\35\3\36\3\36\7\36\u00c0\n\36\f"+
		"\36\16\36\u00c3\13\36\3\37\3\37\3\37\3\37\7\37\u00c9\n\37\f\37\16\37\u00cc"+
		"\13\37\3\37\3\37\3 \6 \u00d1\n \r \16 \u00d2\3 \3 \2\2!\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\b\3"+
		"\2\63;\3\2\62;\3\2c|\5\2\62;aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00dd"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5I\3\2\2\2\7U\3\2\2\2\tZ\3\2\2"+
		"\2\13\\\3\2\2\2\r^\3\2\2\2\17`\3\2\2\2\21c\3\2\2\2\23j\3\2\2\2\25n\3\2"+
		"\2\2\27p\3\2\2\2\31v\3\2\2\2\33y\3\2\2\2\35~\3\2\2\2\37\u0080\3\2\2\2"+
		"!\u0082\3\2\2\2#\u0084\3\2\2\2%\u0086\3\2\2\2\'\u0088\3\2\2\2)\u008b\3"+
		"\2\2\2+\u008e\3\2\2\2-\u0091\3\2\2\2/\u0094\3\2\2\2\61\u0097\3\2\2\2\63"+
		"\u009a\3\2\2\2\65\u00a3\3\2\2\2\67\u00b0\3\2\2\29\u00bb\3\2\2\2;\u00bd"+
		"\3\2\2\2=\u00c4\3\2\2\2?\u00d0\3\2\2\2AB\7R\2\2BC\7T\2\2CD\7Q\2\2DE\7"+
		"I\2\2EF\7T\2\2FG\7C\2\2GH\7O\2\2H\4\3\2\2\2IJ\7G\2\2JK\7P\2\2KL\7F\2\2"+
		"LM\7\"\2\2MN\7R\2\2NO\7T\2\2OP\7Q\2\2PQ\7I\2\2QR\7T\2\2RS\7C\2\2ST\7O"+
		"\2\2T\6\3\2\2\2UV\7H\2\2VW\7W\2\2WX\7P\2\2XY\7E\2\2Y\b\3\2\2\2Z[\7*\2"+
		"\2[\n\3\2\2\2\\]\7.\2\2]\f\3\2\2\2^_\7+\2\2_\16\3\2\2\2`a\7<\2\2ab\7<"+
		"\2\2b\20\3\2\2\2cd\7t\2\2de\7g\2\2ef\7v\2\2fg\7w\2\2gh\7t\2\2hi\7p\2\2"+
		"i\22\3\2\2\2jk\7G\2\2kl\7P\2\2lm\7F\2\2m\24\3\2\2\2no\7?\2\2o\26\3\2\2"+
		"\2pq\7R\2\2qr\7T\2\2rs\7K\2\2st\7P\2\2tu\7V\2\2u\30\3\2\2\2vw\7K\2\2w"+
		"x\7H\2\2x\32\3\2\2\2yz\7V\2\2z{\7J\2\2{|\7G\2\2|}\7P\2\2}\34\3\2\2\2~"+
		"\177\7,\2\2\177\36\3\2\2\2\u0080\u0081\7-\2\2\u0081 \3\2\2\2\u0082\u0083"+
		"\7/\2\2\u0083\"\3\2\2\2\u0084\u0085\7@\2\2\u0085$\3\2\2\2\u0086\u0087"+
		"\7>\2\2\u0087&\3\2\2\2\u0088\u0089\7@\2\2\u0089\u008a\7?\2\2\u008a(\3"+
		"\2\2\2\u008b\u008c\7>\2\2\u008c\u008d\7?\2\2\u008d*\3\2\2\2\u008e\u008f"+
		"\7?\2\2\u008f\u0090\7?\2\2\u0090,\3\2\2\2\u0091\u0092\7#\2\2\u0092\u0093"+
		"\7?\2\2\u0093.\3\2\2\2\u0094\u0095\7(\2\2\u0095\u0096\7(\2\2\u0096\60"+
		"\3\2\2\2\u0097\u0098\7~\2\2\u0098\u0099\7~\2\2\u0099\62\3\2\2\2\u009a"+
		"\u009b\7#\2\2\u009b\64\3\2\2\2\u009c\u009d\7K\2\2\u009d\u009e\7P\2\2\u009e"+
		"\u00a4\7V\2\2\u009f\u00a0\7D\2\2\u00a0\u00a1\7Q\2\2\u00a1\u00a2\7Q\2\2"+
		"\u00a2\u00a4\7N\2\2\u00a3\u009c\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\66\3"+
		"\2\2\2\u00a5\u00b1\7\62\2\2\u00a6\u00a8\7/\2\2\u00a7\u00a6\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ad\t\2\2\2\u00aa\u00ac\t\3"+
		"\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00a5\3\2"+
		"\2\2\u00b0\u00a7\3\2\2\2\u00b18\3\2\2\2\u00b2\u00b3\7V\2\2\u00b3\u00b4"+
		"\7T\2\2\u00b4\u00b5\7W\2\2\u00b5\u00bc\7G\2\2\u00b6\u00b7\7H\2\2\u00b7"+
		"\u00b8\7C\2\2\u00b8\u00b9\7N\2\2\u00b9\u00ba\7U\2\2\u00ba\u00bc\7G\2\2"+
		"\u00bb\u00b2\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bc:\3\2\2\2\u00bd\u00c1\t"+
		"\4\2\2\u00be\u00c0\t\5\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2<\3\2\2\2\u00c3\u00c1\3\2\2\2"+
		"\u00c4\u00c5\7#\2\2\u00c5\u00c6\7#\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c9"+
		"\n\6\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\b\37"+
		"\2\2\u00ce>\3\2\2\2\u00cf\u00d1\t\7\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\b \2\2\u00d5@\3\2\2\2\13\2\u00a3\u00a7\u00ad\u00b0\u00bb\u00c1"+
		"\u00ca\u00d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}