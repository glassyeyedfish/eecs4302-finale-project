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
		T__9=10, TYPE=11, INT_LIT=12, BOOL_LIT=13, ID=14, COMMENT=15, WS=16;
	public static final int
		RULE_prog = 0, RULE_test_func = 1, RULE_func_call = 2, RULE_assrt = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "test_func", "func_call", "assrt", "expr"
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
			setState(10);
			match(T__0);
			setState(11);
			match(ID);
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				test_func();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(17);
			match(T__1);
			setState(18);
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
		public List<AssrtContext> assrt() {
			return getRuleContexts(AssrtContext.class);
		}
		public AssrtContext assrt(int i) {
			return getRuleContext(AssrtContext.class,i);
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
			setState(20);
			match(T__2);
			setState(21);
			match(T__3);
			setState(22);
			match(ID);
			setState(23);
			match(T__4);
			setState(24);
			match(T__5);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(27);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(25);
					func_call();
					}
					break;
				case T__8:
				case T__9:
					{
					setState(26);
					assrt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(31);
			match(T__6);
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
			int _alt;
			_localctx = new TLFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(ID);
			setState(34);
			match(T__4);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_LIT || _la==BOOL_LIT) {
				{
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(35);
						expr();
						setState(36);
						match(T__7);
						}
						} 
					}
					setState(42);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(43);
				expr();
				}
			}

			setState(46);
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

	public static class AssrtContext extends ParserRuleContext {
		public AssrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assrt; }
	 
		public AssrtContext() { }
		public void copyFrom(AssrtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TLAssertEqualsContext extends AssrtContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TLAssertEqualsContext(AssrtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).enterTLAssertEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).exitTLAssertEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestLangVisitor ) return ((TestLangVisitor<? extends T>)visitor).visitTLAssertEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TLAssertContext extends AssrtContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TLAssertContext(AssrtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).enterTLAssert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestLangListener ) ((TestLangListener)listener).exitTLAssert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestLangVisitor ) return ((TestLangVisitor<? extends T>)visitor).visitTLAssert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssrtContext assrt() throws RecognitionException {
		AssrtContext _localctx = new AssrtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assrt);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new TLAssertEqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(T__8);
				setState(49);
				match(T__4);
				setState(50);
				func_call();
				setState(51);
				match(T__7);
				setState(52);
				expr();
				setState(53);
				match(T__5);
				}
				break;
			case T__9:
				_localctx = new TLAssertContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(T__9);
				setState(56);
				match(T__4);
				setState(57);
				func_call();
				setState(58);
				match(T__5);
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
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LIT:
				_localctx = new TLIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(INT_LIT);
				}
				break;
			case BOOL_LIT:
				_localctx = new TLBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\36\n\3\r\3\16\3\37\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\5\4/\n\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\5\6C\n\6\3\6\2"+
		"\2\7\2\4\6\b\n\2\2\2F\2\f\3\2\2\2\4\26\3\2\2\2\6#\3\2\2\2\b>\3\2\2\2\n"+
		"B\3\2\2\2\f\r\7\3\2\2\r\17\7\20\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21"+
		"\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\7\4\2\2\24\25"+
		"\7\2\2\3\25\3\3\2\2\2\26\27\7\5\2\2\27\30\7\6\2\2\30\31\7\20\2\2\31\32"+
		"\7\7\2\2\32\35\7\b\2\2\33\36\5\6\4\2\34\36\5\b\5\2\35\33\3\2\2\2\35\34"+
		"\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\t\2\2"+
		"\"\5\3\2\2\2#$\7\20\2\2$.\7\7\2\2%&\5\n\6\2&\'\7\n\2\2\')\3\2\2\2(%\3"+
		"\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-/\5\n\6\2.*\3"+
		"\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\b\2\2\61\7\3\2\2\2\62\63\7\13\2\2"+
		"\63\64\7\7\2\2\64\65\5\6\4\2\65\66\7\n\2\2\66\67\5\n\6\2\678\7\b\2\28"+
		"?\3\2\2\29:\7\f\2\2:;\7\7\2\2;<\5\6\4\2<=\7\b\2\2=?\3\2\2\2>\62\3\2\2"+
		"\2>9\3\2\2\2?\t\3\2\2\2@C\7\16\2\2AC\7\17\2\2B@\3\2\2\2BA\3\2\2\2C\13"+
		"\3\2\2\2\t\21\35\37*.>B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}