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
		Elif=1, Else=2, False=3, For=4, If=5, In=6, Null=7, True=8, LeftParen=9, 
		RightParen=10, LeftBracket=11, RightBracket=12, LeftBrace=13, RightBrace=14, 
		Less=15, LessEqual=16, Greater=17, GreaterEqual=18, Plus=19, Minus=20, 
		Star=21, Div=22, Mod=23, And=24, Or=25, Not=26, Question=27, Colon=28, 
		Comma=29, Assign=30, Equal=31, NotEqual=32, Dot=33, Id=34, Number=35, 
		DigitSequence=36, FormatString=37, String=38, Whitespace=39, Newline=40, 
		BlockComment=41, LineComment=42;
	public static final int
		RULE_idExpr = 0, RULE_fnExpr = 1, RULE_baseExpr = 2, RULE_mulExpr = 3, 
		RULE_addExpr = 4, RULE_relExpr = 5, RULE_logAndExpr = 6, RULE_logOrExpr = 7, 
		RULE_expr = 8, RULE_jsonValue = 9, RULE_jsonPair = 10, RULE_jsonArr = 11, 
		RULE_jsonObj = 12, RULE_assignId = 13, RULE_assignValue = 14, RULE_assign = 15, 
		RULE_eos = 16, RULE_stmt = 17, RULE_assignStmt = 18, RULE_nestStmt = 19, 
		RULE_condStmt = 20, RULE_iterStmt = 21, RULE_script = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"idExpr", "fnExpr", "baseExpr", "mulExpr", "addExpr", "relExpr", "logAndExpr", 
			"logOrExpr", "expr", "jsonValue", "jsonPair", "jsonArr", "jsonObj", "assignId", 
			"assignValue", "assign", "eos", "stmt", "assignStmt", "nestStmt", "condStmt", 
			"iterStmt", "script"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'elif'", "'else'", "'false'", "'for'", "'if'", "'in'", "'null'", 
			"'true'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", 
			"'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'and'", "'or'", "'!'", "'?'", 
			"':'", "','", "'='", "'=='", "'!='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Elif", "Else", "False", "For", "If", "In", "Null", "True", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Less", "LessEqual", "Greater", "GreaterEqual", "Plus", "Minus", "Star", 
			"Div", "Mod", "And", "Or", "Not", "Question", "Colon", "Comma", "Assign", 
			"Equal", "NotEqual", "Dot", "Id", "Number", "DigitSequence", "FormatString", 
			"String", "Whitespace", "Newline", "BlockComment", "LineComment"
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdExprContext idExpr() throws RecognitionException {
		IdExprContext _localctx = new IdExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_idExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(Id);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(47);
				match(Dot);
				setState(48);
				match(Id);
				}
				}
				setState(53);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitFnExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnExprContext fnExpr() throws RecognitionException {
		FnExprContext _localctx = new FnExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fnExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(Id);
			setState(55);
			match(LeftParen);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << False) | (1L << Null) | (1L << True) | (1L << LeftParen) | (1L << Id) | (1L << Number) | (1L << FormatString) | (1L << String))) != 0)) {
				{
				setState(56);
				expr();
				}
			}

			setState(59);
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

	public static class BaseExprContext extends ParserRuleContext {
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public FnExprContext fnExpr() {
			return getRuleContext(FnExprContext.class,0);
		}
		public TerminalNode Number() { return getToken(DomsaScriptParser.Number, 0); }
		public TerminalNode String() { return getToken(DomsaScriptParser.String, 0); }
		public TerminalNode FormatString() { return getToken(DomsaScriptParser.FormatString, 0); }
		public TerminalNode True() { return getToken(DomsaScriptParser.True, 0); }
		public TerminalNode False() { return getToken(DomsaScriptParser.False, 0); }
		public TerminalNode Null() { return getToken(DomsaScriptParser.Null, 0); }
		public TerminalNode LeftParen() { return getToken(DomsaScriptParser.LeftParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DomsaScriptParser.RightParen, 0); }
		public BaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitBaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseExprContext baseExpr() throws RecognitionException {
		BaseExprContext _localctx = new BaseExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_baseExpr);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				idExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				fnExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(Number);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(String);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(FormatString);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				match(True);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				match(False);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				match(Null);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
				match(LeftParen);
				setState(70);
				expr();
				setState(71);
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
		public List<BaseExprContext> baseExpr() {
			return getRuleContexts(BaseExprContext.class);
		}
		public BaseExprContext baseExpr(int i) {
			return getRuleContext(BaseExprContext.class,i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExprContext mulExpr() throws RecognitionException {
		MulExprContext _localctx = new MulExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mulExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			baseExpr();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) {
				{
				{
				setState(76);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(77);
				baseExpr();
				}
				}
				setState(82);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			mulExpr();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(84);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(85);
				mulExpr();
				}
				}
				setState(90);
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
		public List<TerminalNode> Equal() { return getTokens(DomsaScriptParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(DomsaScriptParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(DomsaScriptParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(DomsaScriptParser.NotEqual, i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitRelExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExprContext relExpr() throws RecognitionException {
		RelExprContext _localctx = new RelExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			addExpr();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual) | (1L << Equal) | (1L << NotEqual))) != 0)) {
				{
				{
				setState(92);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual) | (1L << Equal) | (1L << NotEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(93);
				addExpr();
				}
				}
				setState(98);
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
		public List<RelExprContext> relExpr() {
			return getRuleContexts(RelExprContext.class);
		}
		public RelExprContext relExpr(int i) {
			return getRuleContext(RelExprContext.class,i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitLogAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogAndExprContext logAndExpr() throws RecognitionException {
		LogAndExprContext _localctx = new LogAndExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_logAndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			relExpr();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(100);
				match(And);
				setState(101);
				relExpr();
				}
				}
				setState(106);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitLogOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogOrExprContext logOrExpr() throws RecognitionException {
		LogOrExprContext _localctx = new LogOrExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logOrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			logAndExpr();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(108);
				match(Or);
				setState(109);
				logAndExpr();
				}
				}
				setState(114);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			logOrExpr();
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
		public JsonArrContext jsonArr() {
			return getRuleContext(JsonArrContext.class,0);
		}
		public JsonObjContext jsonObj() {
			return getRuleContext(JsonObjContext.class,0);
		}
		public JsonValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitJsonValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonValueContext jsonValue() throws RecognitionException {
		JsonValueContext _localctx = new JsonValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jsonValue);
		try {
			setState(120);
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
				setState(117);
				expr();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				jsonArr();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				jsonObj();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitJsonPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonPairContext jsonPair() throws RecognitionException {
		JsonPairContext _localctx = new JsonPairContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jsonPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(Id);
			setState(123);
			match(Colon);
			setState(124);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitJsonArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonArrContext jsonArr() throws RecognitionException {
		JsonArrContext _localctx = new JsonArrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jsonArr);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(LeftBracket);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(127);
					eos();
					}
				}

				setState(130);
				jsonValue();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(131);
					match(Comma);
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Newline) {
						{
						setState(132);
						eos();
						}
					}

					setState(135);
					jsonValue();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(141);
					eos();
					}
				}

				setState(144);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(LeftBracket);
				setState(147);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitJsonObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonObjContext jsonObj() throws RecognitionException {
		JsonObjContext _localctx = new JsonObjContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jsonObj);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(LeftBrace);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(151);
					eos();
					}
				}

				setState(154);
				jsonPair();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(155);
					match(Comma);
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Newline) {
						{
						setState(156);
						eos();
						}
					}

					setState(159);
					jsonPair();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(165);
					eos();
					}
				}

				setState(168);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(LeftBrace);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(171);
					eos();
					}
				}

				setState(174);
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

	public static class AssignIdContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(DomsaScriptParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(DomsaScriptParser.Id, i);
		}
		public List<TerminalNode> Dot() { return getTokens(DomsaScriptParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(DomsaScriptParser.Dot, i);
		}
		public AssignIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitAssignId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignIdContext assignId() throws RecognitionException {
		AssignIdContext _localctx = new AssignIdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(Id);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(178);
				match(Dot);
				setState(179);
				match(Id);
				}
				}
				setState(184);
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

	public static class AssignValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public JsonArrContext jsonArr() {
			return getRuleContext(JsonArrContext.class,0);
		}
		public JsonObjContext jsonObj() {
			return getRuleContext(JsonObjContext.class,0);
		}
		public AssignValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignValueContext assignValue() throws RecognitionException {
		AssignValueContext _localctx = new AssignValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignValue);
		try {
			setState(188);
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
				setState(185);
				expr();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				jsonArr();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				jsonObj();
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

	public static class AssignContext extends ParserRuleContext {
		public AssignIdContext assignId() {
			return getRuleContext(AssignIdContext.class,0);
		}
		public TerminalNode Assign() { return getToken(DomsaScriptParser.Assign, 0); }
		public AssignValueContext assignValue() {
			return getRuleContext(AssignValueContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			assignId();
			setState(191);
			match(Assign);
			setState(192);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(194);
					match(Newline);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(197); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(199);
				eos();
				}
				break;
			}
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(202);
				nestStmt();
				}
				break;
			case Id:
				{
				setState(203);
				assignStmt();
				}
				break;
			case If:
				{
				setState(204);
				condStmt();
				}
				break;
			case For:
				{
				setState(205);
				iterStmt();
				}
				break;
			case Newline:
				{
				setState(206);
				eos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(209);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public NestStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitNestStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestStmtContext nestStmt() throws RecognitionException {
		NestStmtContext _localctx = new NestStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nestStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(LeftBrace);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << For) | (1L << If) | (1L << LeftBrace) | (1L << Id) | (1L << Newline))) != 0)) {
				{
				{
				setState(215);
				stmt();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
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
		public TerminalNode If() { return getToken(DomsaScriptParser.If, 0); }
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
		public TerminalNode Elif() { return getToken(DomsaScriptParser.Elif, 0); }
		public TerminalNode Else() { return getToken(DomsaScriptParser.Else, 0); }
		public CondStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitCondStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondStmtContext condStmt() throws RecognitionException {
		CondStmtContext _localctx = new CondStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(If);
			setState(224);
			expr();
			setState(225);
			nestStmt();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Elif) {
				{
				setState(226);
				match(Elif);
				setState(227);
				expr();
				setState(228);
				nestStmt();
				}
			}

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(232);
				match(Else);
				setState(233);
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
		public TerminalNode For() { return getToken(DomsaScriptParser.For, 0); }
		public List<TerminalNode> Id() { return getTokens(DomsaScriptParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(DomsaScriptParser.Id, i);
		}
		public TerminalNode In() { return getToken(DomsaScriptParser.In, 0); }
		public NestStmtContext nestStmt() {
			return getRuleContext(NestStmtContext.class,0);
		}
		public IterStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitIterStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterStmtContext iterStmt() throws RecognitionException {
		IterStmtContext _localctx = new IterStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_iterStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(For);
			setState(237);
			match(Id);
			setState(238);
			match(In);
			setState(239);
			match(Id);
			setState(240);
			nestStmt();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << For) | (1L << If) | (1L << LeftBrace) | (1L << Id) | (1L << Newline))) != 0)) {
				{
				{
				setState(242);
				stmt();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\7\5Q\n\5\f"+
		"\5\16\5T\13\5\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\7\3\7\3\7\7\7a\n"+
		"\7\f\7\16\7d\13\7\3\b\3\b\3\b\7\bi\n\b\f\b\16\bl\13\b\3\t\3\t\3\t\7\t"+
		"q\n\t\f\t\16\tt\13\t\3\n\3\n\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\5\r\u0083\n\r\3\r\3\r\3\r\5\r\u0088\n\r\3\r\7\r\u008b\n\r\f\r"+
		"\16\r\u008e\13\r\3\r\5\r\u0091\n\r\3\r\3\r\3\r\3\r\5\r\u0097\n\r\3\16"+
		"\3\16\5\16\u009b\n\16\3\16\3\16\3\16\5\16\u00a0\n\16\3\16\7\16\u00a3\n"+
		"\16\f\16\16\16\u00a6\13\16\3\16\5\16\u00a9\n\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00af\n\16\3\16\5\16\u00b2\n\16\3\17\3\17\3\17\7\17\u00b7\n\17\f\17"+
		"\16\17\u00ba\13\17\3\20\3\20\3\20\5\20\u00bf\n\20\3\21\3\21\3\21\3\21"+
		"\3\22\6\22\u00c6\n\22\r\22\16\22\u00c7\3\23\5\23\u00cb\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00d2\n\23\3\23\5\23\u00d5\n\23\3\24\3\24\3\25\3"+
		"\25\7\25\u00db\n\25\f\25\16\25\u00de\13\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00e9\n\26\3\26\3\26\5\26\u00ed\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\7\30\u00f6\n\30\f\30\16\30\u00f9\13\30\3\30"+
		"\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\5"+
		"\3\2\27\31\3\2\25\26\4\2\21\24!\"\2\u010f\2\60\3\2\2\2\48\3\2\2\2\6K\3"+
		"\2\2\2\bM\3\2\2\2\nU\3\2\2\2\f]\3\2\2\2\16e\3\2\2\2\20m\3\2\2\2\22u\3"+
		"\2\2\2\24z\3\2\2\2\26|\3\2\2\2\30\u0096\3\2\2\2\32\u00b1\3\2\2\2\34\u00b3"+
		"\3\2\2\2\36\u00be\3\2\2\2 \u00c0\3\2\2\2\"\u00c5\3\2\2\2$\u00ca\3\2\2"+
		"\2&\u00d6\3\2\2\2(\u00d8\3\2\2\2*\u00e1\3\2\2\2,\u00ee\3\2\2\2.\u00f7"+
		"\3\2\2\2\60\65\7$\2\2\61\62\7#\2\2\62\64\7$\2\2\63\61\3\2\2\2\64\67\3"+
		"\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\67\65\3\2\2\289\7$\2\2"+
		"9;\7\13\2\2:<\5\22\n\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\f\2\2>\5\3\2"+
		"\2\2?L\5\2\2\2@L\5\4\3\2AL\7%\2\2BL\7(\2\2CL\7\'\2\2DL\7\n\2\2EL\7\5\2"+
		"\2FL\7\t\2\2GH\7\13\2\2HI\5\22\n\2IJ\7\f\2\2JL\3\2\2\2K?\3\2\2\2K@\3\2"+
		"\2\2KA\3\2\2\2KB\3\2\2\2KC\3\2\2\2KD\3\2\2\2KE\3\2\2\2KF\3\2\2\2KG\3\2"+
		"\2\2L\7\3\2\2\2MR\5\6\4\2NO\t\2\2\2OQ\5\6\4\2PN\3\2\2\2QT\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2S\t\3\2\2\2TR\3\2\2\2UZ\5\b\5\2VW\t\3\2\2WY\5\b\5\2XV"+
		"\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\Z\3\2\2\2]b\5\n\6"+
		"\2^_\t\4\2\2_a\5\n\6\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\r\3\2"+
		"\2\2db\3\2\2\2ej\5\f\7\2fg\7\32\2\2gi\5\f\7\2hf\3\2\2\2il\3\2\2\2jh\3"+
		"\2\2\2jk\3\2\2\2k\17\3\2\2\2lj\3\2\2\2mr\5\16\b\2no\7\33\2\2oq\5\16\b"+
		"\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\21\3\2\2\2tr\3\2\2\2uv\5\20"+
		"\t\2v\23\3\2\2\2w{\5\22\n\2x{\5\30\r\2y{\5\32\16\2zw\3\2\2\2zx\3\2\2\2"+
		"zy\3\2\2\2{\25\3\2\2\2|}\7$\2\2}~\7\36\2\2~\177\5\24\13\2\177\27\3\2\2"+
		"\2\u0080\u0082\7\r\2\2\u0081\u0083\5\"\22\2\u0082\u0081\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u008c\5\24\13\2\u0085\u0087\7"+
		"\37\2\2\u0086\u0088\5\"\22\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008b\5\24\13\2\u008a\u0085\3\2\2\2\u008b\u008e\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0091\5\"\22\2\u0090\u008f\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\16\2\2\u0093\u0097\3\2\2\2\u0094"+
		"\u0095\7\r\2\2\u0095\u0097\7\16\2\2\u0096\u0080\3\2\2\2\u0096\u0094\3"+
		"\2\2\2\u0097\31\3\2\2\2\u0098\u009a\7\17\2\2\u0099\u009b\5\"\22\2\u009a"+
		"\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a4\5\26"+
		"\f\2\u009d\u009f\7\37\2\2\u009e\u00a0\5\"\22\2\u009f\u009e\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\5\26\f\2\u00a2\u009d\3"+
		"\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\5\"\22\2\u00a8\u00a7\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\20\2\2\u00ab"+
		"\u00b2\3\2\2\2\u00ac\u00ae\7\17\2\2\u00ad\u00af\5\"\22\2\u00ae\u00ad\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\7\20\2\2\u00b1"+
		"\u0098\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b2\33\3\2\2\2\u00b3\u00b8\7$\2\2"+
		"\u00b4\u00b5\7#\2\2\u00b5\u00b7\7$\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\35\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bf\5\22\n\2\u00bc\u00bf\5\30\r\2\u00bd\u00bf\5"+
		"\32\16\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\37\3\2\2\2\u00c0\u00c1\5\34\17\2\u00c1\u00c2\7 \2\2\u00c2\u00c3\5\36"+
		"\20\2\u00c3!\3\2\2\2\u00c4\u00c6\7*\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8#\3\2\2\2\u00c9"+
		"\u00cb\5\"\22\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d1\3"+
		"\2\2\2\u00cc\u00d2\5(\25\2\u00cd\u00d2\5&\24\2\u00ce\u00d2\5*\26\2\u00cf"+
		"\u00d2\5,\27\2\u00d0\u00d2\5\"\22\2\u00d1\u00cc\3\2\2\2\u00d1\u00cd\3"+
		"\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d5\5\"\22\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3"+
		"\2\2\2\u00d5%\3\2\2\2\u00d6\u00d7\5 \21\2\u00d7\'\3\2\2\2\u00d8\u00dc"+
		"\7\17\2\2\u00d9\u00db\5$\23\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2"+
		"\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e0\7\20\2\2\u00e0)\3\2\2\2\u00e1\u00e2\7\7\2\2\u00e2"+
		"\u00e3\5\22\n\2\u00e3\u00e8\5(\25\2\u00e4\u00e5\7\3\2\2\u00e5\u00e6\5"+
		"\22\n\2\u00e6\u00e7\5(\25\2\u00e7\u00e9\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00eb\7\4\2\2\u00eb\u00ed\5("+
		"\25\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed+\3\2\2\2\u00ee\u00ef"+
		"\7\6\2\2\u00ef\u00f0\7$\2\2\u00f0\u00f1\7\b\2\2\u00f1\u00f2\7$\2\2\u00f2"+
		"\u00f3\5(\25\2\u00f3-\3\2\2\2\u00f4\u00f6\5$\23\2\u00f5\u00f4\3\2\2\2"+
		"\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\2\2\3\u00fb/\3\2\2\2 \65;K"+
		"RZbjrz\u0082\u0087\u008c\u0090\u0096\u009a\u009f\u00a4\u00a8\u00ae\u00b1"+
		"\u00b8\u00be\u00c7\u00ca\u00d1\u00d4\u00dc\u00e8\u00ec\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}