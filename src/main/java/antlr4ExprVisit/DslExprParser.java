// Generated from E:/Ideljava/githubWork/antlr4-demo/src/main/resources\DslExpr.g4 by ANTLR 4.8
        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package antlr4ExprVisit;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DslExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ADD=7, SUB=8, LTRIM=9, 
		LENGTH=10, REPLACE=11, EQUALS=12, ISNULL=13, ID=14, INT=15, MDM=16, STRING=17, 
		IDENTIFIER=18, NUMBER=19, BACKQUOTED_IDENTIFIER=20, SIMPLE_COMMENT=21, 
		BRACKETED_EMPTY_COMMENT=22, BRACKETED_COMMENT=23, WS=24, UNRECOGNIZED=25;
	public static final int
		RULE_sta = 0, RULE_ender = 1, RULE_expr = 2, RULE_funtype = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"sta", "ender", "expr", "funtype"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'+'", "'-'", "'('", "','", "')'", "'add'", "'sub'", "'ltrim'", 
			"'length'", "'replace'", "'equals'", null, null, null, null, null, null, 
			null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ADD", "SUB", "LTRIM", "LENGTH", 
			"REPLACE", "EQUALS", "ISNULL", "ID", "INT", "MDM", "STRING", "IDENTIFIER", 
			"NUMBER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
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
	public String getGrammarFileName() { return "DslExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DslExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StaContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<EnderContext> ender() {
			return getRuleContexts(EnderContext.class);
		}
		public EnderContext ender(int i) {
			return getRuleContext(EnderContext.class,i);
		}
		public StaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sta; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslExprVisitor ) return ((DslExprVisitor<? extends T>)visitor).visitSta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaContext sta() throws RecognitionException {
		StaContext _localctx = new StaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << LTRIM) | (1L << LENGTH) | (1L << REPLACE) | (1L << EQUALS) | (1L << ISNULL) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(8);
				expr(0);
				setState(9);
				ender();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EnderContext extends ParserRuleContext {
		public EnderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ender; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslExprVisitor ) return ((DslExprVisitor<? extends T>)visitor).visitEnder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnderContext ender() throws RecognitionException {
		EnderContext _localctx = new EnderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ender);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
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
	public static class MdmTagContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MDM() { return getToken(DslExprParser.MDM, 0); }
		public MdmTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslExprVisitor ) return ((DslExprVisitor<? extends T>)visitor).visitMdmTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallFunTagContext extends ExprContext {
		public FuntypeContext funtype() {
			return getRuleContext(FuntypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallFunTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslExprVisitor ) return ((DslExprVisitor<? extends T>)visitor).visitCallFunTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarTagContext extends ExprContext {
		public TerminalNode ID() { return getToken(DslExprParser.ID, 0); }
		public VarTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslExprVisitor ) return ((DslExprVisitor<? extends T>)visitor).visitVarTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubTagContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslExprVisitor ) return ((DslExprVisitor<? extends T>)visitor).visitAddSubTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTagContext extends ExprContext {
		public TerminalNode INT() { return getToken(DslExprParser.INT, 0); }
		public IntTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslExprVisitor ) return ((DslExprVisitor<? extends T>)visitor).visitIntTag(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringTagContext extends ExprContext {
		public TerminalNode STRING() { return getToken(DslExprParser.STRING, 0); }
		public StringTagContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslExprVisitor ) return ((DslExprVisitor<? extends T>)visitor).visitStringTag(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case LTRIM:
			case LENGTH:
			case REPLACE:
			case EQUALS:
			case ISNULL:
				{
				_localctx = new CallFunTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				funtype();
				setState(33);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					{
					setState(20);
					match(T__3);
					setState(21);
					expr(0);
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(22);
						match(T__4);
						setState(23);
						expr(0);
						}
						}
						setState(28);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(29);
					match(T__5);
					}
					}
					break;
				case 2:
					{
					{
					setState(31);
					match(T__3);
					setState(32);
					match(T__5);
					}
					}
					break;
				}
				}
				break;
			case ID:
				{
				_localctx = new VarTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new IntTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(INT);
				}
				break;
			case STRING:
				{
				_localctx = new StringTagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new AddSubTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(40);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(41);
						((AddSubTagContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__2) ) {
							((AddSubTagContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(42);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new MdmTagContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(43);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(44);
						match(MDM);
						setState(45);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(50);
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

	public static class FuntypeContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(DslExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(DslExprParser.SUB, 0); }
		public TerminalNode LTRIM() { return getToken(DslExprParser.LTRIM, 0); }
		public TerminalNode LENGTH() { return getToken(DslExprParser.LENGTH, 0); }
		public TerminalNode REPLACE() { return getToken(DslExprParser.REPLACE, 0); }
		public TerminalNode EQUALS() { return getToken(DslExprParser.EQUALS, 0); }
		public TerminalNode ISNULL() { return getToken(DslExprParser.ISNULL, 0); }
		public FuntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funtype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DslExprVisitor ) return ((DslExprVisitor<? extends T>)visitor).visitFuntype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuntypeContext funtype() throws RecognitionException {
		FuntypeContext _localctx = new FuntypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << LTRIM) | (1L << LENGTH) | (1L << REPLACE) | (1L << EQUALS) | (1L << ISNULL))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\338\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4\33\n\4\f\4\16\4\36\13\4\3\4\3\4\3\4\3\4\5\4$"+
		"\n\4\3\4\3\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4"+
		"\64\13\4\3\5\3\5\3\5\2\3\6\6\2\4\6\b\2\4\3\2\4\5\3\2\t\17\2;\2\17\3\2"+
		"\2\2\4\22\3\2\2\2\6(\3\2\2\2\b\65\3\2\2\2\n\13\5\6\4\2\13\f\5\4\3\2\f"+
		"\16\3\2\2\2\r\n\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3"+
		"\3\2\2\2\21\17\3\2\2\2\22\23\7\3\2\2\23\5\3\2\2\2\24\25\b\4\1\2\25#\5"+
		"\b\5\2\26\27\7\6\2\2\27\34\5\6\4\2\30\31\7\7\2\2\31\33\5\6\4\2\32\30\3"+
		"\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3"+
		"\2\2\2\37 \7\b\2\2 $\3\2\2\2!\"\7\6\2\2\"$\7\b\2\2#\26\3\2\2\2#!\3\2\2"+
		"\2$)\3\2\2\2%)\7\20\2\2&)\7\21\2\2\')\7\23\2\2(\24\3\2\2\2(%\3\2\2\2("+
		"&\3\2\2\2(\'\3\2\2\2)\62\3\2\2\2*+\f\b\2\2+,\t\2\2\2,\61\5\6\4\t-.\f\3"+
		"\2\2./\7\22\2\2/\61\5\6\4\4\60*\3\2\2\2\60-\3\2\2\2\61\64\3\2\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\7\3\2\2\2\64\62\3\2\2\2\65\66\t\3\2\2\66\t\3"+
		"\2\2\2\b\17\34#(\60\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}