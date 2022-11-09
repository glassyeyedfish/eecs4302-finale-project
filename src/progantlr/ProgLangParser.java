// Generated from ProgLang.g4 by ANTLR 4.9.3

	package progantlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, TYPE=28, INT_LIT=29, BOOL_LIT=30, ID=31, 
		COMMENT=32, WS=33;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_assign = 2, RULE_ifblock = 3, RULE_expr = 4, 
		RULE_expr_and = 5, RULE_expr_eq = 6, RULE_expr_ineq = 7, RULE_expr_addsub = 8, 
		RULE_expr_muldiv = 9, RULE_expr_exp = 10, RULE_expr_base = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "assign", "ifblock", "expr", "expr_and", "expr_eq", "expr_ineq", 
			"expr_addsub", "expr_muldiv", "expr_exp", "expr_base"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'END PROGRAM'", "'::'", "'='", "'IF'", "'THEN'", 
			"'END IF'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
			"'+'", "'-'", "'*'", "'/'", "'**'", "'('", "')'", "'!'", "'LOG'", "'SIN'", 
			"'COS'", "'TAN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TYPE", "INT_LIT", "BOOL_LIT", "ID", "COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "ProgLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProgLangParser(TokenStream input) {
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
	public static class PLProgramContext extends ProgContext {
		public TerminalNode ID() { return getToken(ProgLangParser.ID, 0); }
		public TerminalNode EOF() { return getToken(ProgLangParser.EOF, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<IfblockContext> ifblock() {
			return getRuleContexts(IfblockContext.class);
		}
		public IfblockContext ifblock(int i) {
			return getRuleContext(IfblockContext.class,i);
		}
		public PLProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new PLProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			match(ID);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				decl();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(31);
					assign();
					}
					break;
				case T__4:
					{
					setState(32);
					ifblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 || _la==ID );
			setState(37);
			match(T__1);
			setState(38);
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

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PLDeclarationContext extends DeclContext {
		public TerminalNode TYPE() { return getToken(ProgLangParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(ProgLangParser.ID, 0); }
		public PLDeclarationContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			_localctx = new PLDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(TYPE);
			setState(41);
			match(T__2);
			setState(42);
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

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PLAssignmnetContext extends AssignContext {
		public TerminalNode ID() { return getToken(ProgLangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLAssignmnetContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLAssignmnet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLAssignmnet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLAssignmnet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		try {
			_localctx = new PLAssignmnetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ID);
			setState(45);
			match(T__3);
			setState(46);
			expr(0);
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

	public static class IfblockContext extends ParserRuleContext {
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
	 
		public IfblockContext() { }
		public void copyFrom(IfblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PLIfBlockContext extends IfblockContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<IfblockContext> ifblock() {
			return getRuleContexts(IfblockContext.class);
		}
		public IfblockContext ifblock(int i) {
			return getRuleContext(IfblockContext.class,i);
		}
		public PLIfBlockContext(IfblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifblock);
		int _la;
		try {
			_localctx = new PLIfBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__4);
			setState(49);
			expr(0);
			setState(50);
			match(T__5);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(51);
					assign();
					}
					break;
				case T__4:
					{
					setState(52);
					ifblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 || _la==ID );
			setState(57);
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
	public static class PLOrFallthroughContext extends ExprContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public PLOrFallthroughContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLOrFallthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLOrFallthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLOrFallthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLOrContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public PLOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLOrFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(60);
			expr_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PLOrContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(62);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(63);
					match(T__7);
					setState(64);
					expr_and(0);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_andContext extends ParserRuleContext {
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
	 
		public Expr_andContext() { }
		public void copyFrom(Expr_andContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PLAndContext extends Expr_andContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public PLAndContext(Expr_andContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLAndFallthroughContext extends Expr_andContext {
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public PLAndFallthroughContext(Expr_andContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLAndFallthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLAndFallthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLAndFallthrough(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		return expr_and(0);
	}

	private Expr_andContext expr_and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_andContext _localctx = new Expr_andContext(_ctx, _parentState);
		Expr_andContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLAndFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(71);
			expr_eq(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PLAndContext(new Expr_andContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_and);
					setState(73);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(74);
					match(T__8);
					setState(75);
					expr_eq(0);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_eqContext extends ParserRuleContext {
		public Expr_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq; }
	 
		public Expr_eqContext() { }
		public void copyFrom(Expr_eqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PLEqFallthroughContext extends Expr_eqContext {
		public Expr_ineqContext expr_ineq() {
			return getRuleContext(Expr_ineqContext.class,0);
		}
		public PLEqFallthroughContext(Expr_eqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLEqFallthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLEqFallthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLEqFallthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLNotEqualsContext extends Expr_eqContext {
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_ineqContext expr_ineq() {
			return getRuleContext(Expr_ineqContext.class,0);
		}
		public PLNotEqualsContext(Expr_eqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLNotEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLNotEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLEqualsContext extends Expr_eqContext {
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_ineqContext expr_ineq() {
			return getRuleContext(Expr_ineqContext.class,0);
		}
		public PLEqualsContext(Expr_eqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		return expr_eq(0);
	}

	private Expr_eqContext expr_eq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, _parentState);
		Expr_eqContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr_eq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLEqFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(82);
			expr_ineq(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new PLEqualsContext(new Expr_eqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_eq);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85);
						match(T__9);
						setState(86);
						expr_ineq(0);
						}
						break;
					case 2:
						{
						_localctx = new PLNotEqualsContext(new Expr_eqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_eq);
						setState(87);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(88);
						match(T__10);
						setState(89);
						expr_ineq(0);
						}
						break;
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_ineqContext extends ParserRuleContext {
		public Expr_ineqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_ineq; }
	 
		public Expr_ineqContext() { }
		public void copyFrom(Expr_ineqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PLIneqFallthroughContext extends Expr_ineqContext {
		public Expr_addsubContext expr_addsub() {
			return getRuleContext(Expr_addsubContext.class,0);
		}
		public PLIneqFallthroughContext(Expr_ineqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLIneqFallthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLIneqFallthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLIneqFallthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLGreaterThanContext extends Expr_ineqContext {
		public Expr_ineqContext expr_ineq() {
			return getRuleContext(Expr_ineqContext.class,0);
		}
		public Expr_addsubContext expr_addsub() {
			return getRuleContext(Expr_addsubContext.class,0);
		}
		public PLGreaterThanContext(Expr_ineqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLLessEqualsContext extends Expr_ineqContext {
		public Expr_ineqContext expr_ineq() {
			return getRuleContext(Expr_ineqContext.class,0);
		}
		public Expr_addsubContext expr_addsub() {
			return getRuleContext(Expr_addsubContext.class,0);
		}
		public PLLessEqualsContext(Expr_ineqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLLessEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLLessEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLLessEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLLessThanContext extends Expr_ineqContext {
		public Expr_ineqContext expr_ineq() {
			return getRuleContext(Expr_ineqContext.class,0);
		}
		public Expr_addsubContext expr_addsub() {
			return getRuleContext(Expr_addsubContext.class,0);
		}
		public PLLessThanContext(Expr_ineqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLGreaterEqualsContext extends Expr_ineqContext {
		public Expr_ineqContext expr_ineq() {
			return getRuleContext(Expr_ineqContext.class,0);
		}
		public Expr_addsubContext expr_addsub() {
			return getRuleContext(Expr_addsubContext.class,0);
		}
		public PLGreaterEqualsContext(Expr_ineqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLGreaterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLGreaterEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLGreaterEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_ineqContext expr_ineq() throws RecognitionException {
		return expr_ineq(0);
	}

	private Expr_ineqContext expr_ineq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_ineqContext _localctx = new Expr_ineqContext(_ctx, _parentState);
		Expr_ineqContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr_ineq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLIneqFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(96);
			expr_addsub(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new PLLessThanContext(new Expr_ineqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_ineq);
						setState(98);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(99);
						match(T__11);
						setState(100);
						expr_addsub(0);
						}
						break;
					case 2:
						{
						_localctx = new PLGreaterThanContext(new Expr_ineqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_ineq);
						setState(101);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(102);
						match(T__12);
						setState(103);
						expr_addsub(0);
						}
						break;
					case 3:
						{
						_localctx = new PLLessEqualsContext(new Expr_ineqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_ineq);
						setState(104);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(105);
						match(T__13);
						setState(106);
						expr_addsub(0);
						}
						break;
					case 4:
						{
						_localctx = new PLGreaterEqualsContext(new Expr_ineqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_ineq);
						setState(107);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(108);
						match(T__14);
						setState(109);
						expr_addsub(0);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_addsubContext extends ParserRuleContext {
		public Expr_addsubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_addsub; }
	 
		public Expr_addsubContext() { }
		public void copyFrom(Expr_addsubContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PLAdditionContext extends Expr_addsubContext {
		public Expr_addsubContext expr_addsub() {
			return getRuleContext(Expr_addsubContext.class,0);
		}
		public Expr_muldivContext expr_muldiv() {
			return getRuleContext(Expr_muldivContext.class,0);
		}
		public PLAdditionContext(Expr_addsubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLAddsubFallthroughContext extends Expr_addsubContext {
		public Expr_muldivContext expr_muldiv() {
			return getRuleContext(Expr_muldivContext.class,0);
		}
		public PLAddsubFallthroughContext(Expr_addsubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLAddsubFallthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLAddsubFallthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLAddsubFallthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLSubtractionContext extends Expr_addsubContext {
		public Expr_addsubContext expr_addsub() {
			return getRuleContext(Expr_addsubContext.class,0);
		}
		public Expr_muldivContext expr_muldiv() {
			return getRuleContext(Expr_muldivContext.class,0);
		}
		public PLSubtractionContext(Expr_addsubContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_addsubContext expr_addsub() throws RecognitionException {
		return expr_addsub(0);
	}

	private Expr_addsubContext expr_addsub(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_addsubContext _localctx = new Expr_addsubContext(_ctx, _parentState);
		Expr_addsubContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr_addsub, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLAddsubFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(116);
			expr_muldiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PLAdditionContext(new Expr_addsubContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_addsub);
						setState(118);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(119);
						match(T__15);
						setState(120);
						expr_muldiv(0);
						}
						break;
					case 2:
						{
						_localctx = new PLSubtractionContext(new Expr_addsubContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_addsub);
						setState(121);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(122);
						match(T__16);
						setState(123);
						expr_muldiv(0);
						}
						break;
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_muldivContext extends ParserRuleContext {
		public Expr_muldivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_muldiv; }
	 
		public Expr_muldivContext() { }
		public void copyFrom(Expr_muldivContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PLMuldivFallthroughContext extends Expr_muldivContext {
		public Expr_expContext expr_exp() {
			return getRuleContext(Expr_expContext.class,0);
		}
		public PLMuldivFallthroughContext(Expr_muldivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLMuldivFallthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLMuldivFallthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLMuldivFallthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLDivisionContext extends Expr_muldivContext {
		public Expr_muldivContext expr_muldiv() {
			return getRuleContext(Expr_muldivContext.class,0);
		}
		public Expr_expContext expr_exp() {
			return getRuleContext(Expr_expContext.class,0);
		}
		public PLDivisionContext(Expr_muldivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLMutiplicationContext extends Expr_muldivContext {
		public Expr_muldivContext expr_muldiv() {
			return getRuleContext(Expr_muldivContext.class,0);
		}
		public Expr_expContext expr_exp() {
			return getRuleContext(Expr_expContext.class,0);
		}
		public PLMutiplicationContext(Expr_muldivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLMutiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLMutiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLMutiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_muldivContext expr_muldiv() throws RecognitionException {
		return expr_muldiv(0);
	}

	private Expr_muldivContext expr_muldiv(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_muldivContext _localctx = new Expr_muldivContext(_ctx, _parentState);
		Expr_muldivContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr_muldiv, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLMuldivFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(130);
			expr_exp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PLMutiplicationContext(new Expr_muldivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_muldiv);
						setState(132);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(133);
						match(T__17);
						setState(134);
						expr_exp(0);
						}
						break;
					case 2:
						{
						_localctx = new PLDivisionContext(new Expr_muldivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_muldiv);
						setState(135);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(136);
						match(T__18);
						setState(137);
						expr_exp(0);
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_expContext extends ParserRuleContext {
		public Expr_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_exp; }
	 
		public Expr_expContext() { }
		public void copyFrom(Expr_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PLExponentContext extends Expr_expContext {
		public Expr_expContext expr_exp() {
			return getRuleContext(Expr_expContext.class,0);
		}
		public Expr_baseContext expr_base() {
			return getRuleContext(Expr_baseContext.class,0);
		}
		public PLExponentContext(Expr_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLExponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLExponent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLExpFallthroughContext extends Expr_expContext {
		public Expr_baseContext expr_base() {
			return getRuleContext(Expr_baseContext.class,0);
		}
		public PLExpFallthroughContext(Expr_expContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLExpFallthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLExpFallthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLExpFallthrough(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_expContext expr_exp() throws RecognitionException {
		return expr_exp(0);
	}

	private Expr_expContext expr_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_expContext _localctx = new Expr_expContext(_ctx, _parentState);
		Expr_expContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLExpFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(144);
			expr_base();
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PLExponentContext(new Expr_expContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_exp);
					setState(146);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(147);
					match(T__19);
					setState(148);
					expr_base();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_baseContext extends ParserRuleContext {
		public Expr_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_base; }
	 
		public Expr_baseContext() { }
		public void copyFrom(Expr_baseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PLCosContext extends Expr_baseContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLCosContext(Expr_baseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLCos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLLogContext extends Expr_baseContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLLogContext(Expr_baseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLBracketsContext extends Expr_baseContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLBracketsContext(Expr_baseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLSinContext extends Expr_baseContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLSinContext(Expr_baseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLSin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLSin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLBoolLiteralContext extends Expr_baseContext {
		public TerminalNode BOOL_LIT() { return getToken(ProgLangParser.BOOL_LIT, 0); }
		public PLBoolLiteralContext(Expr_baseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLVariableContext extends Expr_baseContext {
		public TerminalNode ID() { return getToken(ProgLangParser.ID, 0); }
		public PLVariableContext(Expr_baseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLNotContext extends Expr_baseContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLNotContext(Expr_baseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLTanContext extends Expr_baseContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLTanContext(Expr_baseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLTan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLTan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLTan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLIntLiteralContext extends Expr_baseContext {
		public TerminalNode INT_LIT() { return getToken(ProgLangParser.INT_LIT, 0); }
		public PLIntLiteralContext(Expr_baseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_baseContext expr_base() throws RecognitionException {
		Expr_baseContext _localctx = new Expr_baseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_base);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new PLBracketsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__20);
				setState(155);
				expr(0);
				setState(156);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new PLNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(T__22);
				setState(159);
				expr(0);
				}
				break;
			case T__23:
				_localctx = new PLLogContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(T__23);
				setState(161);
				match(T__20);
				setState(162);
				expr(0);
				setState(163);
				match(T__21);
				}
				break;
			case T__24:
				_localctx = new PLSinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(T__24);
				setState(166);
				match(T__20);
				setState(167);
				expr(0);
				setState(168);
				match(T__21);
				}
				break;
			case T__25:
				_localctx = new PLCosContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(T__25);
				setState(171);
				match(T__20);
				setState(172);
				expr(0);
				setState(173);
				match(T__21);
				}
				break;
			case T__26:
				_localctx = new PLTanContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				match(T__26);
				setState(176);
				match(T__20);
				setState(177);
				expr(0);
				setState(178);
				match(T__21);
				}
				break;
			case ID:
				_localctx = new PLVariableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(180);
				match(ID);
				}
				break;
			case INT_LIT:
				_localctx = new PLIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(181);
				match(INT_LIT);
				}
				break;
			case BOOL_LIT:
				_localctx = new PLBoolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(182);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 5:
			return expr_and_sempred((Expr_andContext)_localctx, predIndex);
		case 6:
			return expr_eq_sempred((Expr_eqContext)_localctx, predIndex);
		case 7:
			return expr_ineq_sempred((Expr_ineqContext)_localctx, predIndex);
		case 8:
			return expr_addsub_sempred((Expr_addsubContext)_localctx, predIndex);
		case 9:
			return expr_muldiv_sempred((Expr_muldivContext)_localctx, predIndex);
		case 10:
			return expr_exp_sempred((Expr_expContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_and_sempred(Expr_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_eq_sempred(Expr_eqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_ineq_sempred(Expr_ineqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_addsub_sempred(Expr_addsubContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_muldiv_sempred(Expr_muldivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_exp_sempred(Expr_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\6\2\36\n\2\r\2\16\2\37\3\2\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\6\58\n\5\r\5\16\59\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6D\n\6\f\6"+
		"\16\6G\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7O\n\7\f\7\16\7R\13\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b]\n\b\f\b\16\b`\13\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tq\n\t\f\t\16\tt\13\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\177\n\n\f\n\16\n\u0082\13\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008d\n\13\f\13\16\13\u0090"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0098\n\f\f\f\16\f\u009b\13\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ba\n\r\3\r\2\t\n\f\16"+
		"\20\22\24\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u00c9\2\32\3\2\2\2"+
		"\4*\3\2\2\2\6.\3\2\2\2\b\62\3\2\2\2\n=\3\2\2\2\fH\3\2\2\2\16S\3\2\2\2"+
		"\20a\3\2\2\2\22u\3\2\2\2\24\u0083\3\2\2\2\26\u0091\3\2\2\2\30\u00b9\3"+
		"\2\2\2\32\33\7\3\2\2\33\35\7!\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36\37\3"+
		"\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 #\3\2\2\2!$\5\6\4\2\"$\5\b\5\2#!\3\2"+
		"\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\4\2\2()"+
		"\7\2\2\3)\3\3\2\2\2*+\7\36\2\2+,\7\5\2\2,-\7!\2\2-\5\3\2\2\2./\7!\2\2"+
		"/\60\7\6\2\2\60\61\5\n\6\2\61\7\3\2\2\2\62\63\7\7\2\2\63\64\5\n\6\2\64"+
		"\67\7\b\2\2\658\5\6\4\2\668\5\b\5\2\67\65\3\2\2\2\67\66\3\2\2\289\3\2"+
		"\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\t\2\2<\t\3\2\2\2=>\b\6\1\2>?"+
		"\5\f\7\2?E\3\2\2\2@A\f\4\2\2AB\7\n\2\2BD\5\f\7\2C@\3\2\2\2DG\3\2\2\2E"+
		"C\3\2\2\2EF\3\2\2\2F\13\3\2\2\2GE\3\2\2\2HI\b\7\1\2IJ\5\16\b\2JP\3\2\2"+
		"\2KL\f\4\2\2LM\7\13\2\2MO\5\16\b\2NK\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2"+
		"\2\2Q\r\3\2\2\2RP\3\2\2\2ST\b\b\1\2TU\5\20\t\2U^\3\2\2\2VW\f\5\2\2WX\7"+
		"\f\2\2X]\5\20\t\2YZ\f\4\2\2Z[\7\r\2\2[]\5\20\t\2\\V\3\2\2\2\\Y\3\2\2\2"+
		"]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\17\3\2\2\2`^\3\2\2\2ab\b\t\1\2bc\5\22"+
		"\n\2cr\3\2\2\2de\f\7\2\2ef\7\16\2\2fq\5\22\n\2gh\f\6\2\2hi\7\17\2\2iq"+
		"\5\22\n\2jk\f\5\2\2kl\7\20\2\2lq\5\22\n\2mn\f\4\2\2no\7\21\2\2oq\5\22"+
		"\n\2pd\3\2\2\2pg\3\2\2\2pj\3\2\2\2pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2"+
		"\2\2s\21\3\2\2\2tr\3\2\2\2uv\b\n\1\2vw\5\24\13\2w\u0080\3\2\2\2xy\f\5"+
		"\2\2yz\7\22\2\2z\177\5\24\13\2{|\f\4\2\2|}\7\23\2\2}\177\5\24\13\2~x\3"+
		"\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\23\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\b\13\1\2\u0084\u0085"+
		"\5\26\f\2\u0085\u008e\3\2\2\2\u0086\u0087\f\5\2\2\u0087\u0088\7\24\2\2"+
		"\u0088\u008d\5\26\f\2\u0089\u008a\f\4\2\2\u008a\u008b\7\25\2\2\u008b\u008d"+
		"\5\26\f\2\u008c\u0086\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\25\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0091\u0092\b\f\1\2\u0092\u0093\5\30\r\2\u0093\u0099\3\2\2\2"+
		"\u0094\u0095\f\4\2\2\u0095\u0096\7\26\2\2\u0096\u0098\5\30\r\2\u0097\u0094"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\27\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\27\2\2\u009d\u009e\5\n\6"+
		"\2\u009e\u009f\7\30\2\2\u009f\u00ba\3\2\2\2\u00a0\u00a1\7\31\2\2\u00a1"+
		"\u00ba\5\n\6\2\u00a2\u00a3\7\32\2\2\u00a3\u00a4\7\27\2\2\u00a4\u00a5\5"+
		"\n\6\2\u00a5\u00a6\7\30\2\2\u00a6\u00ba\3\2\2\2\u00a7\u00a8\7\33\2\2\u00a8"+
		"\u00a9\7\27\2\2\u00a9\u00aa\5\n\6\2\u00aa\u00ab\7\30\2\2\u00ab\u00ba\3"+
		"\2\2\2\u00ac\u00ad\7\34\2\2\u00ad\u00ae\7\27\2\2\u00ae\u00af\5\n\6\2\u00af"+
		"\u00b0\7\30\2\2\u00b0\u00ba\3\2\2\2\u00b1\u00b2\7\35\2\2\u00b2\u00b3\7"+
		"\27\2\2\u00b3\u00b4\5\n\6\2\u00b4\u00b5\7\30\2\2\u00b5\u00ba\3\2\2\2\u00b6"+
		"\u00ba\7!\2\2\u00b7\u00ba\7\37\2\2\u00b8\u00ba\7 \2\2\u00b9\u009c\3\2"+
		"\2\2\u00b9\u00a0\3\2\2\2\u00b9\u00a2\3\2\2\2\u00b9\u00a7\3\2\2\2\u00b9"+
		"\u00ac\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00b8\3\2\2\2\u00ba\31\3\2\2\2\23\37#%\679EP\\^pr~\u0080\u008c"+
		"\u008e\u0099\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}