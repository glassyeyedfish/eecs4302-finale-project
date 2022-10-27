// Generated from ProgLang.g4 by ANTLR 4.9.3

	package antlr;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TYPE=9, 
		INT_LIT=10, BOOL_LIT=11, ID=12, COMMENT=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "TYPE", 
			"INT_LIT", "BOOL_LIT", "ID", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'END PROGRAM'", "'::'", "'='", "'IF'", "'THEN'", 
			"'END IF'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "TYPE", "INT_LIT", 
			"BOOL_LIT", "ID", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nQ\n\n\3\13\3\13\5\13U\n\13\3\13\3\13"+
		"\7\13Y\n\13\f\13\16\13\\\13\13\5\13^\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\fi\n\f\3\r\3\r\7\rm\n\r\f\r\16\rp\13\r\3\16\3\16\3\16\3\16"+
		"\7\16v\n\16\f\16\16\16y\13\16\3\16\3\16\3\17\6\17~\n\17\r\17\16\17\177"+
		"\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\3\2\b\3\2\63;\3\2\62;\3\2c|\5\2\62;aac|\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\2\u008a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37"+
		"\3\2\2\2\5\'\3\2\2\2\7\63\3\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r;\3\2\2\2"+
		"\17@\3\2\2\2\21G\3\2\2\2\23P\3\2\2\2\25]\3\2\2\2\27h\3\2\2\2\31j\3\2\2"+
		"\2\33q\3\2\2\2\35}\3\2\2\2\37 \7R\2\2 !\7T\2\2!\"\7Q\2\2\"#\7I\2\2#$\7"+
		"T\2\2$%\7C\2\2%&\7O\2\2&\4\3\2\2\2\'(\7G\2\2()\7P\2\2)*\7F\2\2*+\7\"\2"+
		"\2+,\7R\2\2,-\7T\2\2-.\7Q\2\2./\7I\2\2/\60\7T\2\2\60\61\7C\2\2\61\62\7"+
		"O\2\2\62\6\3\2\2\2\63\64\7<\2\2\64\65\7<\2\2\65\b\3\2\2\2\66\67\7?\2\2"+
		"\67\n\3\2\2\289\7K\2\29:\7H\2\2:\f\3\2\2\2;<\7V\2\2<=\7J\2\2=>\7G\2\2"+
		">?\7P\2\2?\16\3\2\2\2@A\7G\2\2AB\7P\2\2BC\7F\2\2CD\7\"\2\2DE\7K\2\2EF"+
		"\7H\2\2F\20\3\2\2\2GH\7-\2\2H\22\3\2\2\2IJ\7K\2\2JK\7P\2\2KQ\7V\2\2LM"+
		"\7D\2\2MN\7Q\2\2NO\7Q\2\2OQ\7N\2\2PI\3\2\2\2PL\3\2\2\2Q\24\3\2\2\2R^\7"+
		"\62\2\2SU\7/\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VZ\t\2\2\2WY\t\3\2\2XW\3"+
		"\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]R\3\2\2\2]"+
		"T\3\2\2\2^\26\3\2\2\2_`\7V\2\2`a\7T\2\2ab\7W\2\2bi\7G\2\2cd\7H\2\2de\7"+
		"C\2\2ef\7N\2\2fg\7U\2\2gi\7G\2\2h_\3\2\2\2hc\3\2\2\2i\30\3\2\2\2jn\t\4"+
		"\2\2km\t\5\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\32\3\2\2\2pn\3"+
		"\2\2\2qr\7#\2\2rs\7#\2\2sw\3\2\2\2tv\n\6\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2"+
		"\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\b\16\2\2{\34\3\2\2\2|~\t\7\2\2}|"+
		"\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0082\b\17\2\2\u0082\36\3\2\2\2\13\2PTZ]hnw\177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}