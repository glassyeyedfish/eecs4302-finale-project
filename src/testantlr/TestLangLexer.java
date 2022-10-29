// Generated from TestLang.g4 by ANTLR 4.9.3

	package testantlr;

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
		T__0=1, T__1=2, T__2=3, ID=4, COMMENT=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ID", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TEST PROGRAM'", "'END TEST PROGRAM'", "'RUN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ID", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bJ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5\64\n\5\f\5\16\5\67\13\5"+
		"\3\6\3\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\6\3\6\3\7\6\7E\n\7\r\7\16\7"+
		"F\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\6\3\2c|\5\2\62;aac|\4\2\f"+
		"\f\17\17\5\2\13\f\17\17\"\"\2L\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5\34\3\2\2\2\7-\3\2\2\2"+
		"\t\61\3\2\2\2\138\3\2\2\2\rD\3\2\2\2\17\20\7V\2\2\20\21\7G\2\2\21\22\7"+
		"U\2\2\22\23\7V\2\2\23\24\7\"\2\2\24\25\7R\2\2\25\26\7T\2\2\26\27\7Q\2"+
		"\2\27\30\7I\2\2\30\31\7T\2\2\31\32\7C\2\2\32\33\7O\2\2\33\4\3\2\2\2\34"+
		"\35\7G\2\2\35\36\7P\2\2\36\37\7F\2\2\37 \7\"\2\2 !\7V\2\2!\"\7G\2\2\""+
		"#\7U\2\2#$\7V\2\2$%\7\"\2\2%&\7R\2\2&\'\7T\2\2\'(\7Q\2\2()\7I\2\2)*\7"+
		"T\2\2*+\7C\2\2+,\7O\2\2,\6\3\2\2\2-.\7T\2\2./\7W\2\2/\60\7P\2\2\60\b\3"+
		"\2\2\2\61\65\t\2\2\2\62\64\t\3\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3"+
		"\2\2\2\65\66\3\2\2\2\66\n\3\2\2\2\67\65\3\2\2\289\7#\2\29:\7#\2\2:>\3"+
		"\2\2\2;=\n\4\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3"+
		"\2\2\2AB\b\6\2\2B\f\3\2\2\2CE\t\5\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG"+
		"\3\2\2\2GH\3\2\2\2HI\b\7\2\2I\16\3\2\2\2\6\2\65>F\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}