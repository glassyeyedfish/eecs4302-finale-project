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
		RULE_expr_or = 5, RULE_expr_and = 6, RULE_expr_eq = 7, RULE_expr_ineq = 8, 
		RULE_expr_addsub = 9, RULE_expr_muldiv = 10, RULE_expr_exp = 11, RULE_expr_base = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "assign", "ifblock", "expr", "expr_or", "expr_and", "expr_eq", 
			"expr_ineq", "expr_addsub", "expr_muldiv", "expr_exp", "expr_base"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'END PROGRAM'", "'::'", "'='", "'IF'", "'THEN'", 
			"'END IF'", "'~'", "'LOG'", "'('", "')'", "'SIN'", "'COS'", "'TAN'", 
			"'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", 
			"'-'", "'*'", "'/'", "'**'"
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
			setState(26);
			match(T__0);
			setState(27);
			match(ID);
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				decl();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(33);
					assign();
					}
					break;
				case T__4:
					{
					setState(34);
					ifblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 || _la==ID );
			setState(39);
			match(T__1);
			setState(40);
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
			setState(42);
			match(TYPE);
			setState(43);
			match(T__2);
			setState(44);
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
			setState(46);
			match(ID);
			setState(47);
			match(T__3);
			setState(48);
			expr();
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
			setState(50);
			match(T__4);
			setState(51);
			expr();
			setState(52);
			match(T__5);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(53);
					assign();
					}
					break;
				case T__4:
					{
					setState(54);
					ifblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 || _la==ID );
			setState(59);
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
	public static class PLCosContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLCosContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class PLExprFallthroughContext extends ExprContext {
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public PLExprFallthroughContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLExprFallthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLExprFallthrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLExprFallthrough(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLLogContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLLogContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class PLSinContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLSinContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class PLNotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLNotContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class PLTanContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLTanContext(ExprContext ctx) { copyFrom(ctx); }
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

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new PLNotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__7);
				setState(62);
				expr();
				}
				break;
			case T__8:
				_localctx = new PLLogContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(T__8);
				setState(64);
				match(T__9);
				setState(65);
				expr();
				setState(66);
				match(T__10);
				}
				break;
			case T__11:
				_localctx = new PLSinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(T__11);
				setState(69);
				match(T__9);
				setState(70);
				expr();
				setState(71);
				match(T__10);
				}
				break;
			case T__12:
				_localctx = new PLCosContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(T__12);
				setState(74);
				match(T__9);
				setState(75);
				expr();
				setState(76);
				match(T__10);
				}
				break;
			case T__13:
				_localctx = new PLTanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(T__13);
				setState(79);
				match(T__9);
				setState(80);
				expr();
				setState(81);
				match(T__10);
				}
				break;
			case T__9:
			case INT_LIT:
			case BOOL_LIT:
			case ID:
				_localctx = new PLExprFallthroughContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				expr_or(0);
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

	public static class Expr_orContext extends ParserRuleContext {
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
	 
		public Expr_orContext() { }
		public void copyFrom(Expr_orContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PLOrFallthroughContext extends Expr_orContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public PLOrFallthroughContext(Expr_orContext ctx) { copyFrom(ctx); }
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
	public static class PLOrContext extends Expr_orContext {
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public PLOrContext(Expr_orContext ctx) { copyFrom(ctx); }
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

	public final Expr_orContext expr_or() throws RecognitionException {
		return expr_or(0);
	}

	private Expr_orContext expr_or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_orContext _localctx = new Expr_orContext(_ctx, _parentState);
		Expr_orContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLOrFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(87);
			expr_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PLOrContext(new Expr_orContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_or);
					setState(89);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(90);
					match(T__14);
					setState(91);
					expr_and(0);
					}
					} 
				}
				setState(96);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLAndFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(98);
			expr_eq(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PLAndContext(new Expr_andContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_and);
					setState(100);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(101);
					match(T__15);
					setState(102);
					expr_eq(0);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr_eq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLEqFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(109);
			expr_ineq(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new PLEqualsContext(new Expr_eqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_eq);
						setState(111);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(112);
						match(T__16);
						setState(113);
						expr_ineq(0);
						}
						break;
					case 2:
						{
						_localctx = new PLNotEqualsContext(new Expr_eqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_eq);
						setState(114);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(115);
						match(T__17);
						setState(116);
						expr_ineq(0);
						}
						break;
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr_ineq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLIneqFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(123);
			expr_addsub(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new PLLessThanContext(new Expr_ineqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_ineq);
						setState(125);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(126);
						match(T__18);
						setState(127);
						expr_addsub(0);
						}
						break;
					case 2:
						{
						_localctx = new PLGreaterThanContext(new Expr_ineqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_ineq);
						setState(128);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(129);
						match(T__19);
						setState(130);
						expr_addsub(0);
						}
						break;
					case 3:
						{
						_localctx = new PLLessEqualsContext(new Expr_ineqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_ineq);
						setState(131);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(132);
						match(T__20);
						setState(133);
						expr_addsub(0);
						}
						break;
					case 4:
						{
						_localctx = new PLGreaterEqualsContext(new Expr_ineqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_ineq);
						setState(134);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(135);
						match(T__21);
						setState(136);
						expr_addsub(0);
						}
						break;
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr_addsub, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLAddsubFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(143);
			expr_muldiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new PLAdditionContext(new Expr_addsubContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_addsub);
						setState(145);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(146);
						match(T__22);
						setState(147);
						expr_muldiv(0);
						}
						break;
					case 2:
						{
						_localctx = new PLSubtractionContext(new Expr_addsubContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_addsub);
						setState(148);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(149);
						match(T__23);
						setState(150);
						expr_muldiv(0);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr_muldiv, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLMuldivFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(157);
			expr_exp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new PLMutiplicationContext(new Expr_muldivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_muldiv);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160);
						match(T__24);
						setState(161);
						expr_exp(0);
						}
						break;
					case 2:
						{
						_localctx = new PLDivisionContext(new Expr_muldivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_muldiv);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						match(T__25);
						setState(164);
						expr_exp(0);
						}
						break;
					}
					} 
				}
				setState(169);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLExpFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(171);
			expr_base();
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PLExponentContext(new Expr_expContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_exp);
					setState(173);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(174);
					match(T__26);
					setState(175);
					expr_base();
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 24, RULE_expr_base);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new PLBracketsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__9);
				setState(182);
				expr();
				setState(183);
				match(T__10);
				}
				break;
			case ID:
				_localctx = new PLVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(ID);
				}
				break;
			case INT_LIT:
				_localctx = new PLIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(INT_LIT);
				}
				break;
			case BOOL_LIT:
				_localctx = new PLBoolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
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
		case 5:
			return expr_or_sempred((Expr_orContext)_localctx, predIndex);
		case 6:
			return expr_and_sempred((Expr_andContext)_localctx, predIndex);
		case 7:
			return expr_eq_sempred((Expr_eqContext)_localctx, predIndex);
		case 8:
			return expr_ineq_sempred((Expr_ineqContext)_localctx, predIndex);
		case 9:
			return expr_addsub_sempred((Expr_addsubContext)_localctx, predIndex);
		case 10:
			return expr_muldiv_sempred((Expr_muldivContext)_localctx, predIndex);
		case 11:
			return expr_exp_sempred((Expr_expContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_or_sempred(Expr_orContext _localctx, int predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\6\2 \n\2\r\2\16\2!\3\2\3\2\6"+
		"\2&\n\2\r\2\16\2\'\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\6\5:\n\5\r\5\16\5;\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6W\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\bj\n\b\f\b\16\bm\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tx"+
		"\n\t\f\t\16\t{\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u009a\n\13\f\13\16\13\u009d\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a8\n\f\f\f\16\f\u00ab\13\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u00b3\n\r\f\r\16\r\u00b6\13\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00bf\n\16\3\16\2\t\f\16\20\22\24\26\30\17\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\2\2\2\u00cd\2\34\3\2\2\2\4,\3\2\2\2\6\60\3\2"+
		"\2\2\b\64\3\2\2\2\nV\3\2\2\2\fX\3\2\2\2\16c\3\2\2\2\20n\3\2\2\2\22|\3"+
		"\2\2\2\24\u0090\3\2\2\2\26\u009e\3\2\2\2\30\u00ac\3\2\2\2\32\u00be\3\2"+
		"\2\2\34\35\7\3\2\2\35\37\7!\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37"+
		"\3\2\2\2!\"\3\2\2\2\"%\3\2\2\2#&\5\6\4\2$&\5\b\5\2%#\3\2\2\2%$\3\2\2\2"+
		"&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\7\4\2\2*+\7\2\2\3+\3\3\2"+
		"\2\2,-\7\36\2\2-.\7\5\2\2./\7!\2\2/\5\3\2\2\2\60\61\7!\2\2\61\62\7\6\2"+
		"\2\62\63\5\n\6\2\63\7\3\2\2\2\64\65\7\7\2\2\65\66\5\n\6\2\669\7\b\2\2"+
		"\67:\5\6\4\28:\5\b\5\29\67\3\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2"+
		"\2\2<=\3\2\2\2=>\7\t\2\2>\t\3\2\2\2?@\7\n\2\2@W\5\n\6\2AB\7\13\2\2BC\7"+
		"\f\2\2CD\5\n\6\2DE\7\r\2\2EW\3\2\2\2FG\7\16\2\2GH\7\f\2\2HI\5\n\6\2IJ"+
		"\7\r\2\2JW\3\2\2\2KL\7\17\2\2LM\7\f\2\2MN\5\n\6\2NO\7\r\2\2OW\3\2\2\2"+
		"PQ\7\20\2\2QR\7\f\2\2RS\5\n\6\2ST\7\r\2\2TW\3\2\2\2UW\5\f\7\2V?\3\2\2"+
		"\2VA\3\2\2\2VF\3\2\2\2VK\3\2\2\2VP\3\2\2\2VU\3\2\2\2W\13\3\2\2\2XY\b\7"+
		"\1\2YZ\5\16\b\2Z`\3\2\2\2[\\\f\4\2\2\\]\7\21\2\2]_\5\16\b\2^[\3\2\2\2"+
		"_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\r\3\2\2\2b`\3\2\2\2cd\b\b\1\2de\5\20\t"+
		"\2ek\3\2\2\2fg\f\4\2\2gh\7\22\2\2hj\5\20\t\2if\3\2\2\2jm\3\2\2\2ki\3\2"+
		"\2\2kl\3\2\2\2l\17\3\2\2\2mk\3\2\2\2no\b\t\1\2op\5\22\n\2py\3\2\2\2qr"+
		"\f\5\2\2rs\7\23\2\2sx\5\22\n\2tu\f\4\2\2uv\7\24\2\2vx\5\22\n\2wq\3\2\2"+
		"\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\21\3\2\2\2{y\3\2\2\2|}\b\n"+
		"\1\2}~\5\24\13\2~\u008d\3\2\2\2\177\u0080\f\7\2\2\u0080\u0081\7\25\2\2"+
		"\u0081\u008c\5\24\13\2\u0082\u0083\f\6\2\2\u0083\u0084\7\26\2\2\u0084"+
		"\u008c\5\24\13\2\u0085\u0086\f\5\2\2\u0086\u0087\7\27\2\2\u0087\u008c"+
		"\5\24\13\2\u0088\u0089\f\4\2\2\u0089\u008a\7\30\2\2\u008a\u008c\5\24\13"+
		"\2\u008b\177\3\2\2\2\u008b\u0082\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0088"+
		"\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\23\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\b\13\1\2\u0091\u0092\5\26"+
		"\f\2\u0092\u009b\3\2\2\2\u0093\u0094\f\5\2\2\u0094\u0095\7\31\2\2\u0095"+
		"\u009a\5\26\f\2\u0096\u0097\f\4\2\2\u0097\u0098\7\32\2\2\u0098\u009a\5"+
		"\26\f\2\u0099\u0093\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\25\3\2\2\2\u009d\u009b\3\2\2"+
		"\2\u009e\u009f\b\f\1\2\u009f\u00a0\5\30\r\2\u00a0\u00a9\3\2\2\2\u00a1"+
		"\u00a2\f\5\2\2\u00a2\u00a3\7\33\2\2\u00a3\u00a8\5\30\r\2\u00a4\u00a5\f"+
		"\4\2\2\u00a5\u00a6\7\34\2\2\u00a6\u00a8\5\30\r\2\u00a7\u00a1\3\2\2\2\u00a7"+
		"\u00a4\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\27\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\r\1\2\u00ad\u00ae"+
		"\5\32\16\2\u00ae\u00b4\3\2\2\2\u00af\u00b0\f\4\2\2\u00b0\u00b1\7\35\2"+
		"\2\u00b1\u00b3\5\32\16\2\u00b2\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b4\3\2\2"+
		"\2\u00b7\u00b8\7\f\2\2\u00b8\u00b9\5\n\6\2\u00b9\u00ba\7\r\2\2\u00ba\u00bf"+
		"\3\2\2\2\u00bb\u00bf\7!\2\2\u00bc\u00bf\7\37\2\2\u00bd\u00bf\7 \2\2\u00be"+
		"\u00b7\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2"+
		"\2\2\u00bf\33\3\2\2\2\24!%\'9;V`kwy\u008b\u008d\u0099\u009b\u00a7\u00a9"+
		"\u00b4\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}