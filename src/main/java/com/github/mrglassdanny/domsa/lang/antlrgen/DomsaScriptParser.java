// Generated from DomsaScript.g4 by ANTLR 4.8

package com.github.mrglassdanny.domsa.lang.antlrgen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DomsaScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Break=1, Case=2, Default=3, Else=4, False=5, For=6, If=7, In=8, Loop=9, 
		Null=10, Return=11, Switch=12, True=13, While=14, LeftParen=15, RightParen=16, 
		LeftBracket=17, RightBracket=18, LeftBrace=19, RightBrace=20, Less=21, 
		LessEqual=22, Greater=23, GreaterEqual=24, Plus=25, PlusPlus=26, Minus=27, 
		MinusMinus=28, Star=29, Div=30, Mod=31, And=32, Or=33, Not=34, Question=35, 
		Colon=36, Comma=37, Assign=38, Equal=39, NotEqual=40, Dot=41, Id=42, Number=43, 
		DigitSequence=44, FormatString=45, String=46, Whitespace=47, Newline=48, 
		BlockComment=49, LineComment=50;
	public static final int
		RULE_idExpr = 0, RULE_fnExpr = 1, RULE_arithExpr = 2, RULE_mulExpr = 3, 
		RULE_addExpr = 4, RULE_relExpr = 5, RULE_eqValue = 6, RULE_eqExpr = 7, 
		RULE_logAndExpr = 8, RULE_logOrExpr = 9, RULE_expr = 10, RULE_assign = 11, 
		RULE_assignOper = 12, RULE_assignValue = 13, RULE_jsonObj = 14, RULE_jsonPair = 15, 
		RULE_jsonArr = 16, RULE_jsonValue = 17, RULE_eos = 18, RULE_stmt = 19, 
		RULE_assignStmt = 20, RULE_nestStmt = 21, RULE_condStmt = 22, RULE_iterStmt = 23, 
		RULE_retStmt = 24, RULE_script = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"idExpr", "fnExpr", "arithExpr", "mulExpr", "addExpr", "relExpr", "eqValue", 
			"eqExpr", "logAndExpr", "logOrExpr", "expr", "assign", "assignOper", 
			"assignValue", "jsonObj", "jsonPair", "jsonArr", "jsonValue", "eos", 
			"stmt", "assignStmt", "nestStmt", "condStmt", "iterStmt", "retStmt", 
			"script"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'case'", "'default'", "'else'", "'false'", "'for'", 
			"'if'", "'in'", "'loop'", "'null'", "'return'", "'switch'", "'true'", 
			"'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", 
			"'>='", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'and'", "'or'", 
			"'!'", "'?'", "':'", "','", "'='", "'=='", "'!='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Break", "Case", "Default", "Else", "False", "For", "If", "In", 
			"Loop", "Null", "Return", "Switch", "True", "While", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", 
			"Greater", "GreaterEqual", "Plus", "PlusPlus", "Minus", "MinusMinus", 
			"Star", "Div", "Mod", "And", "Or", "Not", "Question", "Colon", "Comma", 
			"Assign", "Equal", "NotEqual", "Dot", "Id", "Number", "DigitSequence", 
			"FormatString", "String", "Whitespace", "Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "DomsaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DomsaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IdExprContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(DomsaScriptParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(DomsaScriptParser.Id, i);
		}
		public List<TerminalNode> Dot() { return getTokens(DomsaScriptParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(DomsaScriptParser.Dot, i);
		}
		public IdExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitIdExpr(this);
		}
	}

	public final IdExprContext idExpr() throws RecognitionException {
		IdExprContext _localctx = new IdExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_idExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(Id);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(53);
				match(Dot);
				setState(54);
				match(Id);
				}
				}
				setState(59);
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

	public static class FnExprContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(DomsaScriptParser.Id, 0); }
		public TerminalNode LeftParen() { return getToken(DomsaScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(DomsaScriptParser.RightParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterFnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitFnExpr(this);
		}
	}

	public final FnExprContext fnExpr() throws RecognitionException {
		FnExprContext _localctx = new FnExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fnExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(Id);
			setState(61);
			match(LeftParen);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << False) | (1L << Null) | (1L << True) | (1L << LeftParen) | (1L << Id) | (1L << Number) | (1L << FormatString) | (1L << String))) != 0)) {
				{
				setState(62);
				expr();
				}
			}

			setState(65);
			match(RightParen);
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

	public static class ArithExprContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(DomsaScriptParser.Number, 0); }
		public FnExprContext fnExpr() {
			return getRuleContext(FnExprContext.class,0);
		}
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(DomsaScriptParser.LeftParen, 0); }
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DomsaScriptParser.RightParen, 0); }
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterArithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitArithExpr(this);
		}
	}

	public final ArithExprContext arithExpr() throws RecognitionException {
		ArithExprContext _localctx = new ArithExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arithExpr);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				fnExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				idExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(LeftParen);
				setState(71);
				addExpr();
				setState(72);
				match(RightParen);
				}
				break;
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

	public static class MulExprContext extends ParserRuleContext {
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(DomsaScriptParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(DomsaScriptParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(DomsaScriptParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(DomsaScriptParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(DomsaScriptParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(DomsaScriptParser.Mod, i);
		}
		public MulExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitMulExpr(this);
		}
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mulExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			arithExpr();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) {
				{
				{
				setState(77);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(78);
				arithExpr();
				}
				}
				setState(83);
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

	public static class AddExprContext extends ParserRuleContext {
		public List<MulExprContext> mulExpr() {
			return getRuleContexts(MulExprContext.class);
		}
		public MulExprContext mulExpr(int i) {
			return getRuleContext(MulExprContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(DomsaScriptParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(DomsaScriptParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(DomsaScriptParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(DomsaScriptParser.Minus, i);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitAddExpr(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			mulExpr();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(86);
				mulExpr();
				}
				}
				setState(91);
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

	public static class RelExprContext extends ParserRuleContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(DomsaScriptParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(DomsaScriptParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(DomsaScriptParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(DomsaScriptParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(DomsaScriptParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(DomsaScriptParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(DomsaScriptParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(DomsaScriptParser.GreaterEqual, i);
		}
		public RelExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterRelExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitRelExpr(this);
		}
	}

	public final RelExprContext relExpr() throws RecognitionException {
		RelExprContext _localctx = new RelExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			addExpr();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual))) != 0)) {
				{
				{
				setState(93);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(94);
				addExpr();
				}
				}
				setState(99);
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

	public static class EqValueContext extends ParserRuleContext {
		public RelExprContext relExpr() {
			return getRuleContext(RelExprContext.class,0);
		}
		public TerminalNode String() { return getToken(DomsaScriptParser.String, 0); }
		public TerminalNode FormatString() { return getToken(DomsaScriptParser.FormatString, 0); }
		public TerminalNode True() { return getToken(DomsaScriptParser.True, 0); }
		public TerminalNode False() { return getToken(DomsaScriptParser.False, 0); }
		public TerminalNode Null() { return getToken(DomsaScriptParser.Null, 0); }
		public EqValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterEqValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitEqValue(this);
		}
	}

	public final EqValueContext eqValue() throws RecognitionException {
		EqValueContext _localctx = new EqValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eqValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Id:
			case Number:
				{
				setState(100);
				relExpr();
				}
				break;
			case String:
				{
				setState(101);
				match(String);
				}
				break;
			case FormatString:
				{
				setState(102);
				match(FormatString);
				}
				break;
			case True:
				{
				setState(103);
				match(True);
				}
				break;
			case False:
				{
				setState(104);
				match(False);
				}
				break;
			case Null:
				{
				setState(105);
				match(Null);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EqExprContext extends ParserRuleContext {
		public List<EqValueContext> eqValue() {
			return getRuleContexts(EqValueContext.class);
		}
		public EqValueContext eqValue(int i) {
			return getRuleContext(EqValueContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(DomsaScriptParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(DomsaScriptParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(DomsaScriptParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(DomsaScriptParser.NotEqual, i);
		}
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitEqExpr(this);
		}
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		EqExprContext _localctx = new EqExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eqExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			eqValue();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(110);
				eqValue();
				}
				}
				setState(115);
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

	public static class LogAndExprContext extends ParserRuleContext {
		public List<EqExprContext> eqExpr() {
			return getRuleContexts(EqExprContext.class);
		}
		public EqExprContext eqExpr(int i) {
			return getRuleContext(EqExprContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(DomsaScriptParser.And); }
		public TerminalNode And(int i) {
			return getToken(DomsaScriptParser.And, i);
		}
		public LogAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logAndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterLogAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitLogAndExpr(this);
		}
	}

	public final LogAndExprContext logAndExpr() throws RecognitionException {
		LogAndExprContext _localctx = new LogAndExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logAndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			eqExpr();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(117);
				match(And);
				setState(118);
				eqExpr();
				}
				}
				setState(123);
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

	public static class LogOrExprContext extends ParserRuleContext {
		public List<LogAndExprContext> logAndExpr() {
			return getRuleContexts(LogAndExprContext.class);
		}
		public LogAndExprContext logAndExpr(int i) {
			return getRuleContext(LogAndExprContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(DomsaScriptParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(DomsaScriptParser.Or, i);
		}
		public LogOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterLogOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitLogOrExpr(this);
		}
	}

	public final LogOrExprContext logOrExpr() throws RecognitionException {
		LogOrExprContext _localctx = new LogOrExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logOrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			logAndExpr();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(125);
				match(Or);
				setState(126);
				logAndExpr();
				}
				}
				setState(131);
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

	public static class ExprContext extends ParserRuleContext {
		public LogOrExprContext logOrExpr() {
			return getRuleContext(LogOrExprContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(DomsaScriptParser.LeftParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DomsaScriptParser.RightParen, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				logOrExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(LeftParen);
				setState(134);
				expr();
				setState(135);
				match(RightParen);
				}
				break;
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
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public AssignOperContext assignOper() {
			return getRuleContext(AssignOperContext.class,0);
		}
		public AssignValueContext assignValue() {
			return getRuleContext(AssignValueContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			idExpr();
			setState(140);
			assignOper();
			setState(141);
			assignValue();
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

	public static class AssignOperContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(DomsaScriptParser.Assign, 0); }
		public AssignOperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterAssignOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitAssignOper(this);
		}
	}

	public final AssignOperContext assignOper() throws RecognitionException {
		AssignOperContext _localctx = new AssignOperContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignOper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(Assign);
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

	public static class AssignValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public JsonObjContext jsonObj() {
			return getRuleContext(JsonObjContext.class,0);
		}
		public JsonArrContext jsonArr() {
			return getRuleContext(JsonArrContext.class,0);
		}
		public AssignValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterAssignValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitAssignValue(this);
		}
	}

	public final AssignValueContext assignValue() throws RecognitionException {
		AssignValueContext _localctx = new AssignValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignValue);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case False:
			case Null:
			case True:
			case LeftParen:
			case Id:
			case Number:
			case FormatString:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				expr();
				}
				break;
			case LeftBracket:
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftBrace:
					{
					setState(146);
					jsonObj();
					}
					break;
				case LeftBracket:
					{
					setState(147);
					jsonArr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class JsonObjContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(DomsaScriptParser.LeftBrace, 0); }
		public List<JsonPairContext> jsonPair() {
			return getRuleContexts(JsonPairContext.class);
		}
		public JsonPairContext jsonPair(int i) {
			return getRuleContext(JsonPairContext.class,i);
		}
		public TerminalNode RightBrace() { return getToken(DomsaScriptParser.RightBrace, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DomsaScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DomsaScriptParser.Comma, i);
		}
		public JsonObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonObj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterJsonObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitJsonObj(this);
		}
	}

	public final JsonObjContext jsonObj() throws RecognitionException {
		JsonObjContext _localctx = new JsonObjContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jsonObj);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(LeftBrace);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(153);
					eos();
					}
				}

				setState(156);
				jsonPair();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(157);
					match(Comma);
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Newline) {
						{
						setState(158);
						eos();
						}
					}

					setState(161);
					jsonPair();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(167);
					eos();
					}
				}

				setState(170);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(LeftBrace);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(173);
					eos();
					}
				}

				setState(176);
				match(RightBrace);
				}
				break;
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

	public static class JsonPairContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(DomsaScriptParser.Id, 0); }
		public TerminalNode Colon() { return getToken(DomsaScriptParser.Colon, 0); }
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public JsonPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterJsonPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitJsonPair(this);
		}
	}

	public final JsonPairContext jsonPair() throws RecognitionException {
		JsonPairContext _localctx = new JsonPairContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jsonPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(Id);
			setState(180);
			match(Colon);
			setState(181);
			jsonValue();
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

	public static class JsonArrContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(DomsaScriptParser.LeftBracket, 0); }
		public List<JsonValueContext> jsonValue() {
			return getRuleContexts(JsonValueContext.class);
		}
		public JsonValueContext jsonValue(int i) {
			return getRuleContext(JsonValueContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(DomsaScriptParser.RightBracket, 0); }
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DomsaScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DomsaScriptParser.Comma, i);
		}
		public JsonArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterJsonArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitJsonArr(this);
		}
	}

	public final JsonArrContext jsonArr() throws RecognitionException {
		JsonArrContext _localctx = new JsonArrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jsonArr);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(LeftBracket);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(184);
					eos();
					}
				}

				setState(187);
				jsonValue();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(188);
					match(Comma);
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Newline) {
						{
						setState(189);
						eos();
						}
					}

					setState(192);
					jsonValue();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(198);
					eos();
					}
				}

				setState(201);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(LeftBracket);
				setState(204);
				match(RightBracket);
				}
				break;
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

	public static class JsonValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public JsonObjContext jsonObj() {
			return getRuleContext(JsonObjContext.class,0);
		}
		public JsonArrContext jsonArr() {
			return getRuleContext(JsonArrContext.class,0);
		}
		public JsonValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterJsonValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitJsonValue(this);
		}
	}

	public final JsonValueContext jsonValue() throws RecognitionException {
		JsonValueContext _localctx = new JsonValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jsonValue);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case False:
			case Null:
			case True:
			case LeftParen:
			case Id:
			case Number:
			case FormatString:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				expr();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				jsonObj();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				jsonArr();
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

	public static class EosContext extends ParserRuleContext {
		public List<TerminalNode> Newline() { return getTokens(DomsaScriptParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(DomsaScriptParser.Newline, i);
		}
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitEos(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_eos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(212);
					match(Newline);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(215); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class StmtContext extends ParserRuleContext {
		public NestStmtContext nestStmt() {
			return getRuleContext(NestStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public CondStmtContext condStmt() {
			return getRuleContext(CondStmtContext.class,0);
		}
		public IterStmtContext iterStmt() {
			return getRuleContext(IterStmtContext.class,0);
		}
		public RetStmtContext retStmt() {
			return getRuleContext(RetStmtContext.class,0);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(217);
				eos();
				}
				break;
			}
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(220);
				nestStmt();
				}
				break;
			case Id:
				{
				setState(221);
				assignStmt();
				}
				break;
			case If:
				{
				setState(222);
				condStmt();
				}
				break;
			case For:
			case Loop:
			case While:
				{
				setState(223);
				iterStmt();
				}
				break;
			case Return:
				{
				setState(224);
				retStmt();
				}
				break;
			case Newline:
				{
				setState(225);
				eos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(228);
				eos();
				}
				break;
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

	public static class AssignStmtContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitAssignStmt(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			assign();
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

	public static class NestStmtContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(DomsaScriptParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(DomsaScriptParser.RightBrace, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public NestStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterNestStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitNestStmt(this);
		}
	}

	public final NestStmtContext nestStmt() throws RecognitionException {
		NestStmtContext _localctx = new NestStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nestStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(LeftBrace);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << For) | (1L << If) | (1L << Loop) | (1L << Return) | (1L << While) | (1L << LeftBrace) | (1L << Id) | (1L << Newline))) != 0)) {
				{
				setState(234);
				stmt();
				}
			}

			setState(237);
			match(RightBrace);
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

	public static class CondStmtContext extends ParserRuleContext {
		public List<TerminalNode> If() { return getTokens(DomsaScriptParser.If); }
		public TerminalNode If(int i) {
			return getToken(DomsaScriptParser.If, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<NestStmtContext> nestStmt() {
			return getRuleContexts(NestStmtContext.class);
		}
		public NestStmtContext nestStmt(int i) {
			return getRuleContext(NestStmtContext.class,i);
		}
		public List<TerminalNode> Else() { return getTokens(DomsaScriptParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(DomsaScriptParser.Else, i);
		}
		public CondStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterCondStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitCondStmt(this);
		}
	}

	public final CondStmtContext condStmt() throws RecognitionException {
		CondStmtContext _localctx = new CondStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(If);
			setState(240);
			expr();
			setState(241);
			nestStmt();
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(242);
				match(Else);
				setState(243);
				match(If);
				setState(244);
				expr();
				setState(245);
				nestStmt();
				}
				break;
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(249);
				match(Else);
				setState(250);
				nestStmt();
				}
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

	public static class IterStmtContext extends ParserRuleContext {
		public TerminalNode Loop() { return getToken(DomsaScriptParser.Loop, 0); }
		public NestStmtContext nestStmt() {
			return getRuleContext(NestStmtContext.class,0);
		}
		public TerminalNode While() { return getToken(DomsaScriptParser.While, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode For() { return getToken(DomsaScriptParser.For, 0); }
		public List<TerminalNode> Id() { return getTokens(DomsaScriptParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(DomsaScriptParser.Id, i);
		}
		public TerminalNode In() { return getToken(DomsaScriptParser.In, 0); }
		public IterStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterIterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitIterStmt(this);
		}
	}

	public final IterStmtContext iterStmt() throws RecognitionException {
		IterStmtContext _localctx = new IterStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_iterStmt);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Loop:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(Loop);
				setState(254);
				nestStmt();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(While);
				setState(256);
				expr();
				setState(257);
				nestStmt();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(For);
				setState(260);
				match(Id);
				setState(261);
				match(In);
				setState(262);
				match(Id);
				setState(263);
				nestStmt();
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

	public static class RetStmtContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(DomsaScriptParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterRetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitRetStmt(this);
		}
	}

	public final RetStmtContext retStmt() throws RecognitionException {
		RetStmtContext _localctx = new RetStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_retStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(Return);
			setState(267);
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

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DomsaScriptParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DomsaScriptListener ) ((DomsaScriptListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << For) | (1L << If) | (1L << Loop) | (1L << Return) | (1L << While) | (1L << LeftBrace) | (1L << Id) | (1L << Newline))) != 0)) {
				{
				{
				setState(269);
				stmt();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0118\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\3\3\3\3\3\5"+
		"\3B\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\7\5R"+
		"\n\5\f\5\16\5U\13\5\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\7\3\7\3\7\7"+
		"\7b\n\7\f\7\16\7e\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\7"+
		"\tr\n\t\f\t\16\tu\13\t\3\n\3\n\3\n\7\nz\n\n\f\n\16\n}\13\n\3\13\3\13\3"+
		"\13\7\13\u0082\n\13\f\13\16\13\u0085\13\13\3\f\3\f\3\f\3\f\3\f\5\f\u008c"+
		"\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\5\17\u0097\n\17\5\17\u0099"+
		"\n\17\3\20\3\20\5\20\u009d\n\20\3\20\3\20\3\20\5\20\u00a2\n\20\3\20\7"+
		"\20\u00a5\n\20\f\20\16\20\u00a8\13\20\3\20\5\20\u00ab\n\20\3\20\3\20\3"+
		"\20\3\20\5\20\u00b1\n\20\3\20\5\20\u00b4\n\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\5\22\u00bc\n\22\3\22\3\22\3\22\5\22\u00c1\n\22\3\22\7\22\u00c4\n"+
		"\22\f\22\16\22\u00c7\13\22\3\22\5\22\u00ca\n\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00d0\n\22\3\23\3\23\3\23\5\23\u00d5\n\23\3\24\6\24\u00d8\n\24\r\24"+
		"\16\24\u00d9\3\25\5\25\u00dd\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e5"+
		"\n\25\3\25\5\25\u00e8\n\25\3\26\3\26\3\27\3\27\5\27\u00ee\n\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00fa\n\30\3\30\3\30"+
		"\5\30\u00fe\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u010b\n\31\3\32\3\32\3\32\3\33\7\33\u0111\n\33\f\33\16\33\u0114"+
		"\13\33\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\2\6\3\2\37!\4\2\33\33\35\35\3\2\27\32\3\2)*\2\u012b\2"+
		"\66\3\2\2\2\4>\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nV\3\2\2\2\f^\3\2\2\2\16"+
		"l\3\2\2\2\20n\3\2\2\2\22v\3\2\2\2\24~\3\2\2\2\26\u008b\3\2\2\2\30\u008d"+
		"\3\2\2\2\32\u0091\3\2\2\2\34\u0098\3\2\2\2\36\u00b3\3\2\2\2 \u00b5\3\2"+
		"\2\2\"\u00cf\3\2\2\2$\u00d4\3\2\2\2&\u00d7\3\2\2\2(\u00dc\3\2\2\2*\u00e9"+
		"\3\2\2\2,\u00eb\3\2\2\2.\u00f1\3\2\2\2\60\u010a\3\2\2\2\62\u010c\3\2\2"+
		"\2\64\u0112\3\2\2\2\66;\7,\2\2\678\7+\2\28:\7,\2\29\67\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2\2=;\3\2\2\2>?\7,\2\2?A\7\21\2\2@B\5\26"+
		"\f\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\22\2\2D\5\3\2\2\2EM\7-\2\2FM\5"+
		"\4\3\2GM\5\2\2\2HI\7\21\2\2IJ\5\n\6\2JK\7\22\2\2KM\3\2\2\2LE\3\2\2\2L"+
		"F\3\2\2\2LG\3\2\2\2LH\3\2\2\2M\7\3\2\2\2NS\5\6\4\2OP\t\2\2\2PR\5\6\4\2"+
		"QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\t\3\2\2\2US\3\2\2\2V[\5\b\5"+
		"\2WX\t\3\2\2XZ\5\b\5\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\13\3"+
		"\2\2\2][\3\2\2\2^c\5\n\6\2_`\t\4\2\2`b\5\n\6\2a_\3\2\2\2be\3\2\2\2ca\3"+
		"\2\2\2cd\3\2\2\2d\r\3\2\2\2ec\3\2\2\2fm\5\f\7\2gm\7\60\2\2hm\7/\2\2im"+
		"\7\17\2\2jm\7\7\2\2km\7\f\2\2lf\3\2\2\2lg\3\2\2\2lh\3\2\2\2li\3\2\2\2"+
		"lj\3\2\2\2lk\3\2\2\2m\17\3\2\2\2ns\5\16\b\2op\t\5\2\2pr\5\16\b\2qo\3\2"+
		"\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\21\3\2\2\2us\3\2\2\2v{\5\20\t\2wx"+
		"\7\"\2\2xz\5\20\t\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\23\3\2\2"+
		"\2}{\3\2\2\2~\u0083\5\22\n\2\177\u0080\7#\2\2\u0080\u0082\5\22\n\2\u0081"+
		"\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2"+
		"\2\u0084\25\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008c\5\24\13\2\u0087\u0088"+
		"\7\21\2\2\u0088\u0089\5\26\f\2\u0089\u008a\7\22\2\2\u008a\u008c\3\2\2"+
		"\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008c\27\3\2\2\2\u008d\u008e"+
		"\5\2\2\2\u008e\u008f\5\32\16\2\u008f\u0090\5\34\17\2\u0090\31\3\2\2\2"+
		"\u0091\u0092\7(\2\2\u0092\33\3\2\2\2\u0093\u0099\5\26\f\2\u0094\u0097"+
		"\5\36\20\2\u0095\u0097\5\"\22\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2"+
		"\2\u0097\u0099\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0096\3\2\2\2\u0099\35"+
		"\3\2\2\2\u009a\u009c\7\25\2\2\u009b\u009d\5&\24\2\u009c\u009b\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a6\5 \21\2\u009f\u00a1"+
		"\7\'\2\2\u00a0\u00a2\5&\24\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a5\5 \21\2\u00a4\u009f\3\2\2\2\u00a5\u00a8\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ab\5&\24\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\26\2\2\u00ad\u00b4\3\2\2\2\u00ae"+
		"\u00b0\7\25\2\2\u00af\u00b1\5&\24\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\7\26\2\2\u00b3\u009a\3\2\2\2\u00b3"+
		"\u00ae\3\2\2\2\u00b4\37\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6\u00b7\7&\2\2"+
		"\u00b7\u00b8\5$\23\2\u00b8!\3\2\2\2\u00b9\u00bb\7\23\2\2\u00ba\u00bc\5"+
		"&\24\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c5\5$\23\2\u00be\u00c0\7\'\2\2\u00bf\u00c1\5&\24\2\u00c0\u00bf\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\5$\23\2\u00c3"+
		"\u00be\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\5&\24\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\24"+
		"\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00ce\7\23\2\2\u00ce\u00d0\7\24\2\2\u00cf"+
		"\u00b9\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0#\3\2\2\2\u00d1\u00d5\5\26\f\2"+
		"\u00d2\u00d5\5\36\20\2\u00d3\u00d5\5\"\22\2\u00d4\u00d1\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5%\3\2\2\2\u00d6\u00d8\7\62\2\2"+
		"\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\'\3\2\2\2\u00db\u00dd\5&\24\2\u00dc\u00db\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00e4\3\2\2\2\u00de\u00e5\5,\27\2\u00df\u00e5\5*"+
		"\26\2\u00e0\u00e5\5.\30\2\u00e1\u00e5\5\60\31\2\u00e2\u00e5\5\62\32\2"+
		"\u00e3\u00e5\5&\24\2\u00e4\u00de\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e0"+
		"\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e8\5&\24\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8)\3\2\2\2\u00e9\u00ea\5\30\r\2\u00ea+\3\2\2\2\u00eb\u00ed\7"+
		"\25\2\2\u00ec\u00ee\5(\25\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\7\26\2\2\u00f0-\3\2\2\2\u00f1\u00f2\7\t\2\2"+
		"\u00f2\u00f3\5\26\f\2\u00f3\u00f9\5,\27\2\u00f4\u00f5\7\6\2\2\u00f5\u00f6"+
		"\7\t\2\2\u00f6\u00f7\5\26\f\2\u00f7\u00f8\5,\27\2\u00f8\u00fa\3\2\2\2"+
		"\u00f9\u00f4\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00fc"+
		"\7\6\2\2\u00fc\u00fe\5,\27\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"/\3\2\2\2\u00ff\u0100\7\13\2\2\u0100\u010b\5,\27\2\u0101\u0102\7\20\2"+
		"\2\u0102\u0103\5\26\f\2\u0103\u0104\5,\27\2\u0104\u010b\3\2\2\2\u0105"+
		"\u0106\7\b\2\2\u0106\u0107\7,\2\2\u0107\u0108\7\n\2\2\u0108\u0109\7,\2"+
		"\2\u0109\u010b\5,\27\2\u010a\u00ff\3\2\2\2\u010a\u0101\3\2\2\2\u010a\u0105"+
		"\3\2\2\2\u010b\61\3\2\2\2\u010c\u010d\7\r\2\2\u010d\u010e\5\26\f\2\u010e"+
		"\63\3\2\2\2\u010f\u0111\5(\25\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2"+
		"\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0115\u0116\7\2\2\3\u0116\65\3\2\2\2$;ALS[cls{\u0083\u008b\u0096"+
		"\u0098\u009c\u00a1\u00a6\u00aa\u00b0\u00b3\u00bb\u00c0\u00c5\u00c9\u00cf"+
		"\u00d4\u00d9\u00dc\u00e4\u00e7\u00ed\u00f9\u00fd\u010a\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}