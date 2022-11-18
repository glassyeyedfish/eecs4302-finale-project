// Generated from TestLang.g4 by ANTLR 4.9.3

	package testlang.antlr;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TYPE=10, INT_LIT=11, BOOL_LIT=12, ID=13, COMMENT=14, WS=15;
	public static final int
		RULE_prog = 0, RULE_test_func = 1, RULE_func_call = 2, RULE_expr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "test_func", "func_call", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TEST'", "'END TEST'", "'@Test'", "'FUNC'", "'()'", "'END FUNC'", 
			"'('", "','", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "TYPE", "INT_LIT", 
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
		public List<Test_funcContext> test_func() {
			return getRuleContexts(Test_funcContext.class);
		}
		public Test_funcContext test_func(int i) {
			return getRuleContext(Test_funcContext.class,i);
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
			setState(8);
			match(T__0);
			setState(9);
			match(ID);
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				test_func();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(15);
			match(T__1);
			setState(16);
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

	public static class Test_funcContext extends ParserRuleContext {
		public Test_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_func; }
	 
		public Test_funcContext() { }
		public void copyFrom(Test_funcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TLTestFuncContext extends Test_funcContext {
		public TerminalNode ID() { return getToken(TestLangParser.ID, 0); }
		public List<Func_callContext> func_call() {
			return getRuleContexts(Func_callContext.class);
		}
		public Func_callContext func_call(int i) {
			return getRuleContext(Func_callContext.class,i);
		}
		public TLTestFuncContext(Test_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).enterTLTestFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).exitTLTestFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestLangVisitor ) return ((TestLangVisitor<? extends T>)visitor).visitTLTestFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_funcContext test_func() throws RecognitionException {
		Test_funcContext _localctx = new Test_funcContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_test_func);
		int _la;
		try {
			_localctx = new TLTestFuncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__2);
			setState(19);
			match(T__3);
			setState(20);
			match(ID);
			setState(21);
			match(T__4);
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				func_call();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(27);
			match(T__5);
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

	public static class Func_callContext extends ParserRuleContext {
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	 
		public Func_callContext() { }
		public void copyFrom(Func_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TLFunctionCallContext extends Func_callContext {
		public TerminalNode ID() { return getToken(TestLangParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TLFunctionCallContext(Func_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).enterTLFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).exitTLFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestLangVisitor ) return ((TestLangVisitor<? extends T>)visitor).visitTLFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func_call);
		int _la;
		try {
			_localctx = new TLFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(ID);
			setState(30);
			match(T__6);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_LIT || _la==BOOL_LIT) {
				{
				setState(31);
				expr();
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(32);
					match(T__7);
					setState(33);
					expr();
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(41);
			match(T__8);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TLBooleanContext extends ExprContext {
		public TerminalNode BOOL_LIT() { return getToken(TestLangParser.BOOL_LIT, 0); }
		public TLBooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).enterTLBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).exitTLBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestLangVisitor ) return ((TestLangVisitor<? extends T>)visitor).visitTLBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TLIntegerContext extends ExprContext {
		public TerminalNode INT_LIT() { return getToken(TestLangParser.INT_LIT, 0); }
		public TLIntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).enterTLInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).exitTLInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestLangVisitor ) return ((TestLangVisitor<? extends T>)visitor).visitTLInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				_localctx = new TLIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(INT_LIT);
				}
				break;
			case BOOL_LIT:
				_localctx = new TLBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(BOOL_LIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\6\3\32\n\3\r\3\16\3\33\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\7\4%\n\4\f\4\16\4(\13\4\5\4*\n\4\3\4\3\4\3\5\3\5\5\5\60\n\5\3\5\2\2\6"+
		"\2\4\6\b\2\2\2\62\2\n\3\2\2\2\4\24\3\2\2\2\6\37\3\2\2\2\b/\3\2\2\2\n\13"+
		"\7\3\2\2\13\r\7\17\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2"+
		"\2\2\17\20\3\2\2\2\20\21\3\2\2\2\21\22\7\4\2\2\22\23\7\2\2\3\23\3\3\2"+
		"\2\2\24\25\7\5\2\2\25\26\7\6\2\2\26\27\7\17\2\2\27\31\7\7\2\2\30\32\5"+
		"\6\4\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3"+
		"\2\2\2\35\36\7\b\2\2\36\5\3\2\2\2\37 \7\17\2\2 )\7\t\2\2!&\5\b\5\2\"#"+
		"\7\n\2\2#%\5\b\5\2$\"\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2"+
		"\2(&\3\2\2\2)!\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\13\2\2,\7\3\2\2\2-\60\7"+
		"\r\2\2.\60\7\16\2\2/-\3\2\2\2/.\3\2\2\2\60\t\3\2\2\2\7\17\33&)/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}