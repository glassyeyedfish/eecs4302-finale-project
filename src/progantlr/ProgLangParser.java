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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, TYPE=31, INT_LIT=32, 
		FLOAT_LIT=33, BOOL_LIT=34, ID=35, COMMENT=36, WS=37;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_assign = 2, RULE_print = 3, RULE_ifblock = 4, 
		RULE_elseifblock = 5, RULE_elseblock = 6, RULE_expr = 7, RULE_expr_and = 8, 
		RULE_expr_eq = 9, RULE_expr_ineq = 10, RULE_expr_addsub = 11, RULE_expr_muldiv = 12, 
		RULE_expr_exp = 13, RULE_expr_base = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "assign", "print", "ifblock", "elseifblock", "elseblock", 
			"expr", "expr_and", "expr_eq", "expr_ineq", "expr_addsub", "expr_muldiv", 
			"expr_exp", "expr_base"
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
			null, null, null, null, null, null, null, "TYPE", "INT_LIT", "FLOAT_LIT", 
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
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
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
			setState(30);
			match(T__0);
			setState(31);
			match(ID);
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				decl();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(37);
					assign();
					}
					break;
				case T__4:
					{
					setState(38);
					print();
					}
					break;
				case T__5:
					{
					setState(39);
					ifblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << ID))) != 0) );
			setState(44);
			match(T__1);
			setState(45);
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
		public TerminalNode INT_LIT() { return getToken(ProgLangParser.INT_LIT, 0); }
		public TerminalNode FLOAT_LIT() { return getToken(ProgLangParser.FLOAT_LIT, 0); }
		public TerminalNode BOOL_LIT() { return getToken(ProgLangParser.BOOL_LIT, 0); }
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
		int _la;
		try {
			_localctx = new PLDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(TYPE);
			setState(48);
			match(T__2);
			setState(49);
			match(ID);
			setState(50);
			match(T__3);
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LIT) | (1L << FLOAT_LIT) | (1L << BOOL_LIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			setState(53);
			match(ID);
			setState(54);
			match(T__3);
			setState(55);
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PLPrintContext extends PrintContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLPrintContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			_localctx = new PLPrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__4);
			setState(58);
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
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<IfblockContext> ifblock() {
			return getRuleContexts(IfblockContext.class);
		}
		public IfblockContext ifblock(int i) {
			return getRuleContext(IfblockContext.class,i);
		}
		public List<ElseifblockContext> elseifblock() {
			return getRuleContexts(ElseifblockContext.class);
		}
		public ElseifblockContext elseifblock(int i) {
			return getRuleContext(ElseifblockContext.class,i);
		}
		public ElseblockContext elseblock() {
			return getRuleContext(ElseblockContext.class,0);
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
		enterRule(_localctx, 8, RULE_ifblock);
		int _la;
		try {
			_localctx = new PLIfBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__5);
			setState(61);
			expr(0);
			setState(62);
			match(T__6);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(63);
					assign();
					}
					break;
				case T__4:
					{
					setState(64);
					print();
					}
					break;
				case T__5:
					{
					setState(65);
					ifblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << ID))) != 0) );
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(70);
				elseifblock();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(76);
				elseblock();
				}
			}

			setState(79);
			match(T__7);
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

	public static class ElseifblockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<IfblockContext> ifblock() {
			return getRuleContexts(IfblockContext.class);
		}
		public IfblockContext ifblock(int i) {
			return getRuleContext(IfblockContext.class,i);
		}
		public ElseifblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterElseifblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitElseifblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitElseifblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifblockContext elseifblock() throws RecognitionException {
		ElseifblockContext _localctx = new ElseifblockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseifblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__8);
			setState(82);
			expr(0);
			setState(83);
			match(T__6);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(87);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(84);
					assign();
					}
					break;
				case T__4:
					{
					setState(85);
					print();
					}
					break;
				case T__5:
					{
					setState(86);
					ifblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << ID))) != 0) );
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

	public static class ElseblockContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<IfblockContext> ifblock() {
			return getRuleContexts(IfblockContext.class);
		}
		public IfblockContext ifblock(int i) {
			return getRuleContext(IfblockContext.class,i);
		}
		public ElseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterElseblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitElseblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitElseblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseblockContext elseblock() throws RecognitionException {
		ElseblockContext _localctx = new ElseblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__9);
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(92);
					assign();
					}
					break;
				case T__4:
					{
					setState(93);
					print();
					}
					break;
				case T__5:
					{
					setState(94);
					ifblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << ID))) != 0) );
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLOrFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(100);
			expr_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PLOrContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(102);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(103);
					match(T__10);
					setState(104);
					expr_and(0);
					}
					} 
				}
				setState(109);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLAndFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(111);
			expr_eq(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PLAndContext(new Expr_andContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_and);
					setState(113);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(114);
					match(T__11);
					setState(115);
					expr_eq(0);
					}
					} 
				}
				setState(120);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr_eq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLEqFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(122);
			expr_ineq(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PLEqualsContext(new Expr_eqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_eq);
						setState(124);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(125);
						match(T__12);
						setState(126);
						expr_ineq(0);
						}
						break;
					case 2:
						{
						_localctx = new PLNotEqualsContext(new Expr_eqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_eq);
						setState(127);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(128);
						match(T__13);
						setState(129);
						expr_ineq(0);
						}
						break;
					}
					} 
				}
				setState(134);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr_ineq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLIneqFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(136);
			expr_addsub(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new PLLessThanContext(new Expr_ineqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_ineq);
						setState(138);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(139);
						match(T__14);
						setState(140);
						expr_addsub(0);
						}
						break;
					case 2:
						{
						_localctx = new PLGreaterThanContext(new Expr_ineqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_ineq);
						setState(141);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(142);
						match(T__15);
						setState(143);
						expr_addsub(0);
						}
						break;
					case 3:
						{
						_localctx = new PLLessEqualsContext(new Expr_ineqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_ineq);
						setState(144);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(145);
						match(T__16);
						setState(146);
						expr_addsub(0);
						}
						break;
					case 4:
						{
						_localctx = new PLGreaterEqualsContext(new Expr_ineqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_ineq);
						setState(147);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(148);
						match(T__17);
						setState(149);
						expr_addsub(0);
						}
						break;
					}
					} 
				}
				setState(154);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr_addsub, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLAddsubFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(156);
			expr_muldiv(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new PLAdditionContext(new Expr_addsubContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_addsub);
						setState(158);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(159);
						match(T__18);
						setState(160);
						expr_muldiv(0);
						}
						break;
					case 2:
						{
						_localctx = new PLSubtractionContext(new Expr_addsubContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_addsub);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162);
						match(T__19);
						setState(163);
						expr_muldiv(0);
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr_muldiv, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLMuldivFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(170);
			expr_exp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new PLMutiplicationContext(new Expr_muldivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_muldiv);
						setState(172);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(173);
						match(T__20);
						setState(174);
						expr_exp(0);
						}
						break;
					case 2:
						{
						_localctx = new PLDivisionContext(new Expr_muldivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_muldiv);
						setState(175);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(176);
						match(T__21);
						setState(177);
						expr_exp(0);
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PLExpFallthroughContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(184);
			expr_base();
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PLExponentContext(new Expr_expContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_exp);
					setState(186);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(187);
					match(T__22);
					setState(188);
					expr_base();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
	public static class PLFloatLiteralContext extends Expr_baseContext {
		public TerminalNode FLOAT_LIT() { return getToken(ProgLangParser.FLOAT_LIT, 0); }
		public PLFloatLiteralContext(Expr_baseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).enterPLFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgLangListener ) ((ProgLangListener)listener).exitPLFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgLangVisitor ) return ((ProgLangVisitor<? extends T>)visitor).visitPLFloatLiteral(this);
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
		enterRule(_localctx, 28, RULE_expr_base);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				_localctx = new PLBracketsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(T__23);
				setState(195);
				expr(0);
				setState(196);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new PLNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(T__25);
				setState(199);
				expr(0);
				}
				break;
			case T__26:
				_localctx = new PLLogContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(T__26);
				setState(201);
				match(T__23);
				setState(202);
				expr(0);
				setState(203);
				match(T__24);
				}
				break;
			case T__27:
				_localctx = new PLSinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(T__27);
				setState(206);
				match(T__23);
				setState(207);
				expr(0);
				setState(208);
				match(T__24);
				}
				break;
			case T__28:
				_localctx = new PLCosContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				match(T__28);
				setState(211);
				match(T__23);
				setState(212);
				expr(0);
				setState(213);
				match(T__24);
				}
				break;
			case T__29:
				_localctx = new PLTanContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				match(T__29);
				setState(216);
				match(T__23);
				setState(217);
				expr(0);
				setState(218);
				match(T__24);
				}
				break;
			case ID:
				_localctx = new PLVariableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				match(ID);
				}
				break;
			case INT_LIT:
				_localctx = new PLIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				match(INT_LIT);
				}
				break;
			case FLOAT_LIT:
				_localctx = new PLFloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(222);
				match(FLOAT_LIT);
				}
				break;
			case BOOL_LIT:
				_localctx = new PLBoolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(223);
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 8:
			return expr_and_sempred((Expr_andContext)_localctx, predIndex);
		case 9:
			return expr_eq_sempred((Expr_eqContext)_localctx, predIndex);
		case 10:
			return expr_ineq_sempred((Expr_ineqContext)_localctx, predIndex);
		case 11:
			return expr_addsub_sempred((Expr_addsubContext)_localctx, predIndex);
		case 12:
			return expr_muldiv_sempred((Expr_muldivContext)_localctx, predIndex);
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00e5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\6\2$\n\2"+
		"\r\2\16\2%\3\2\3\2\3\2\6\2+\n\2\r\2\16\2,\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6E\n\6"+
		"\r\6\16\6F\3\6\7\6J\n\6\f\6\16\6M\13\6\3\6\5\6P\n\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\6\7Z\n\7\r\7\16\7[\3\b\3\b\3\b\3\b\6\bb\n\b\r\b\16\bc\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\nw\n\n\f\n\16\nz\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u0085\n\13\f\13\16\13\u0088\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0099\n\f\f\f\16\f\u009c\13\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a7\n\r\f\r\16\r\u00aa\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b5\n\16\f\16\16\16\u00b8"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c0\n\17\f\17\16\17\u00c3"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00e3\n\20\3\20\2\t\20\22\24\26\30\32\34\21\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\"$\2\u00fa\2 \3\2\2\2\4\61\3"+
		"\2\2\2\6\67\3\2\2\2\b;\3\2\2\2\n>\3\2\2\2\fS\3\2\2\2\16]\3\2\2\2\20e\3"+
		"\2\2\2\22p\3\2\2\2\24{\3\2\2\2\26\u0089\3\2\2\2\30\u009d\3\2\2\2\32\u00ab"+
		"\3\2\2\2\34\u00b9\3\2\2\2\36\u00e2\3\2\2\2 !\7\3\2\2!#\7%\2\2\"$\5\4\3"+
		"\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&*\3\2\2\2\'+\5\6\4\2(+\5\b"+
		"\5\2)+\5\n\6\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3"+
		"\2\2\2-.\3\2\2\2./\7\4\2\2/\60\7\2\2\3\60\3\3\2\2\2\61\62\7!\2\2\62\63"+
		"\7\5\2\2\63\64\7%\2\2\64\65\7\6\2\2\65\66\t\2\2\2\66\5\3\2\2\2\678\7%"+
		"\2\289\7\6\2\29:\5\20\t\2:\7\3\2\2\2;<\7\7\2\2<=\5\20\t\2=\t\3\2\2\2>"+
		"?\7\b\2\2?@\5\20\t\2@D\7\t\2\2AE\5\6\4\2BE\5\b\5\2CE\5\n\6\2DA\3\2\2\2"+
		"DB\3\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GK\3\2\2\2HJ\5\f\7\2"+
		"IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NP\5\16\b"+
		"\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\n\2\2R\13\3\2\2\2ST\7\13\2\2TU\5"+
		"\20\t\2UY\7\t\2\2VZ\5\6\4\2WZ\5\b\5\2XZ\5\n\6\2YV\3\2\2\2YW\3\2\2\2YX"+
		"\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\r\3\2\2\2]a\7\f\2\2^b\5\6\4"+
		"\2_b\5\b\5\2`b\5\n\6\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2d\17\3\2\2\2ef\b\t\1\2fg\5\22\n\2gm\3\2\2\2hi\f\4\2\2ij\7"+
		"\r\2\2jl\5\22\n\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\21\3\2\2\2"+
		"om\3\2\2\2pq\b\n\1\2qr\5\24\13\2rx\3\2\2\2st\f\4\2\2tu\7\16\2\2uw\5\24"+
		"\13\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\23\3\2\2\2zx\3\2\2\2{|"+
		"\b\13\1\2|}\5\26\f\2}\u0086\3\2\2\2~\177\f\5\2\2\177\u0080\7\17\2\2\u0080"+
		"\u0085\5\26\f\2\u0081\u0082\f\4\2\2\u0082\u0083\7\20\2\2\u0083\u0085\5"+
		"\26\f\2\u0084~\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\25\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\b\f\1\2\u008a\u008b\5\30\r\2\u008b\u009a\3\2\2\2\u008c\u008d\f"+
		"\7\2\2\u008d\u008e\7\21\2\2\u008e\u0099\5\30\r\2\u008f\u0090\f\6\2\2\u0090"+
		"\u0091\7\22\2\2\u0091\u0099\5\30\r\2\u0092\u0093\f\5\2\2\u0093\u0094\7"+
		"\23\2\2\u0094\u0099\5\30\r\2\u0095\u0096\f\4\2\2\u0096\u0097\7\24\2\2"+
		"\u0097\u0099\5\30\r\2\u0098\u008c\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0092"+
		"\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\27\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\b\r\1"+
		"\2\u009e\u009f\5\32\16\2\u009f\u00a8\3\2\2\2\u00a0\u00a1\f\5\2\2\u00a1"+
		"\u00a2\7\25\2\2\u00a2\u00a7\5\32\16\2\u00a3\u00a4\f\4\2\2\u00a4\u00a5"+
		"\7\26\2\2\u00a5\u00a7\5\32\16\2\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3\2\2"+
		"\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\31"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\b\16\1\2\u00ac\u00ad\5\34\17"+
		"\2\u00ad\u00b6\3\2\2\2\u00ae\u00af\f\5\2\2\u00af\u00b0\7\27\2\2\u00b0"+
		"\u00b5\5\34\17\2\u00b1\u00b2\f\4\2\2\u00b2\u00b3\7\30\2\2\u00b3\u00b5"+
		"\5\34\17\2\u00b4\u00ae\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\33\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00ba\b\17\1\2\u00ba\u00bb\5\36\20\2\u00bb\u00c1\3\2\2"+
		"\2\u00bc\u00bd\f\4\2\2\u00bd\u00be\7\31\2\2\u00be\u00c0\5\36\20\2\u00bf"+
		"\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\35\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\32\2\2\u00c5\u00c6"+
		"\5\20\t\2\u00c6\u00c7\7\33\2\2\u00c7\u00e3\3\2\2\2\u00c8\u00c9\7\34\2"+
		"\2\u00c9\u00e3\5\20\t\2\u00ca\u00cb\7\35\2\2\u00cb\u00cc\7\32\2\2\u00cc"+
		"\u00cd\5\20\t\2\u00cd\u00ce\7\33\2\2\u00ce\u00e3\3\2\2\2\u00cf\u00d0\7"+
		"\36\2\2\u00d0\u00d1\7\32\2\2\u00d1\u00d2\5\20\t\2\u00d2\u00d3\7\33\2\2"+
		"\u00d3\u00e3\3\2\2\2\u00d4\u00d5\7\37\2\2\u00d5\u00d6\7\32\2\2\u00d6\u00d7"+
		"\5\20\t\2\u00d7\u00d8\7\33\2\2\u00d8\u00e3\3\2\2\2\u00d9\u00da\7 \2\2"+
		"\u00da\u00db\7\32\2\2\u00db\u00dc\5\20\t\2\u00dc\u00dd\7\33\2\2\u00dd"+
		"\u00e3\3\2\2\2\u00de\u00e3\7%\2\2\u00df\u00e3\7\"\2\2\u00e0\u00e3\7#\2"+
		"\2\u00e1\u00e3\7$\2\2\u00e2\u00c4\3\2\2\2\u00e2\u00c8\3\2\2\2\u00e2\u00ca"+
		"\3\2\2\2\u00e2\u00cf\3\2\2\2\u00e2\u00d4\3\2\2\2\u00e2\u00d9\3\2\2\2\u00e2"+
		"\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3\37\3\2\2\2\31%*,DFKOY[acmx\u0084\u0086\u0098\u009a\u00a6\u00a8"+
		"\u00b4\u00b6\u00c1\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}