// Generated from TestLang.g4 by ANTLR 4.9.3

	package testantlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, COMMENT=5, WS=6;
	public static final int
		RULE_prog = 0, RULE_run = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "run"
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

	@Override
	public String getGrammarFileName() { return "TestLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TestLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TLProgramContext extends ProgContext {
		public TerminalNode ID() { return getToken(TestLangParser.ID, 0); }
		public TerminalNode EOF() { return getToken(TestLangParser.EOF, 0); }
		public List<RunContext> run() {
			return getRuleContexts(RunContext.class);
		}
		public RunContext run(int i) {
			return getRuleContext(RunContext.class,i);
		}
		public TLProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).enterTLProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).exitTLProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestLangVisitor ) return ((TestLangVisitor<? extends T>)visitor).visitTLProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new TLProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(T__0);
			setState(5);
			match(ID);
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				run();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(11);
			match(T__1);
			setState(12);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RunContext extends ParserRuleContext {
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
	 
		public RunContext() { }
		public void copyFrom(RunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TLRunContext extends RunContext {
		public TerminalNode ID() { return getToken(TestLangParser.ID, 0); }
		public TLRunContext(RunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).enterTLRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).exitTLRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestLangVisitor ) return ((TestLangVisitor<? extends T>)visitor).visitTLRun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_run);
		try {
			_localctx = new TLRunContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__2);
			setState(15);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\24\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\6\2\n\n\2\r\2\16\2\13\3\2\3\2\3\2\3\3\3\3\3\3\3\3\2\2"+
		"\4\2\4\2\2\2\22\2\6\3\2\2\2\4\20\3\2\2\2\6\7\7\3\2\2\7\t\7\6\2\2\b\n\5"+
		"\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\r\3\2\2\2"+
		"\r\16\7\4\2\2\16\17\7\2\2\3\17\3\3\2\2\2\20\21\7\5\2\2\21\22\7\6\2\2\22"+
		"\5\3\2\2\2\3\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}