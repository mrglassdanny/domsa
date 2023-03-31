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
		Elif=1, Else=2, False=3, For=4, If=5, In=6, Null=7, True=8, Sql=9, LeftParen=10, 
		RightParen=11, LeftBracket=12, RightBracket=13, LeftBrace=14, RightBrace=15, 
		Less=16, LessEqual=17, Greater=18, GreaterEqual=19, Plus=20, Minus=21, 
		Star=22, Div=23, Mod=24, And=25, Or=26, Not=27, Question=28, Colon=29, 
		ColonColon=30, Comma=31, Assign=32, Equal=33, NotEqual=34, Dot=35, Id=36, 
		Number=37, DigitSequence=38, FormatString=39, String=40, Whitespace=41, 
		Newline=42, BlockComment=43, LineComment=44;
	public static final int
		RULE_idExpr = 0, RULE_fnArgExpr = 1, RULE_fnExpr = 2, RULE_dsIdExpr = 3, 
		RULE_dsArgExpr = 4, RULE_dsExpr = 5, RULE_sqlExpr = 6, RULE_baseExpr = 7, 
		RULE_mulExpr = 8, RULE_addExpr = 9, RULE_relExpr = 10, RULE_logAndExpr = 11, 
		RULE_logOrExpr = 12, RULE_expr = 13, RULE_jsonValue = 14, RULE_jsonPair = 15, 
		RULE_jsonArr = 16, RULE_jsonObj = 17, RULE_assignId = 18, RULE_assignValue = 19, 
		RULE_assign = 20, RULE_eos = 21, RULE_stmt = 22, RULE_assignStmt = 23, 
		RULE_condStmt = 24, RULE_iterStmt = 25, RULE_fnStmt = 26, RULE_nestStmt = 27, 
		RULE_script = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"idExpr", "fnArgExpr", "fnExpr", "dsIdExpr", "dsArgExpr", "dsExpr", "sqlExpr", 
			"baseExpr", "mulExpr", "addExpr", "relExpr", "logAndExpr", "logOrExpr", 
			"expr", "jsonValue", "jsonPair", "jsonArr", "jsonObj", "assignId", "assignValue", 
			"assign", "eos", "stmt", "assignStmt", "condStmt", "iterStmt", "fnStmt", 
			"nestStmt", "script"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'elif'", "'else'", "'false'", "'for'", "'if'", "'in'", "'null'", 
			"'true'", "'sql'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", 
			"'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'and'", "'or'", "'!'", 
			"'?'", "':'", "'::'", "','", "'='", "'=='", "'!='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Elif", "Else", "False", "For", "If", "In", "Null", "True", "Sql", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "Plus", 
			"Minus", "Star", "Div", "Mod", "And", "Or", "Not", "Question", "Colon", 
			"ColonColon", "Comma", "Assign", "Equal", "NotEqual", "Dot", "Id", "Number", 
			"DigitSequence", "FormatString", "String", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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
			setState(58);
			match(Id);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(59);
				match(Dot);
				setState(60);
				match(Id);
				}
				}
				setState(65);
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

	public static class FnArgExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public JsonArrContext jsonArr() {
			return getRuleContext(JsonArrContext.class,0);
		}
		public JsonObjContext jsonObj() {
			return getRuleContext(JsonObjContext.class,0);
		}
		public FnArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnArgExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitFnArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnArgExprContext fnArgExpr() throws RecognitionException {
		FnArgExprContext _localctx = new FnArgExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fnArgExpr);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case False:
			case Null:
			case True:
			case Sql:
			case LeftParen:
			case Id:
			case Number:
			case FormatString:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				expr();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				jsonArr();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
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

	public static class FnExprContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(DomsaScriptParser.Id, 0); }
		public TerminalNode LeftParen() { return getToken(DomsaScriptParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(DomsaScriptParser.RightParen, 0); }
		public List<FnArgExprContext> fnArgExpr() {
			return getRuleContexts(FnArgExprContext.class);
		}
		public FnArgExprContext fnArgExpr(int i) {
			return getRuleContext(FnArgExprContext.class,i);
		}
		public TerminalNode Question() { return getToken(DomsaScriptParser.Question, 0); }
		public List<TerminalNode> Comma() { return getTokens(DomsaScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DomsaScriptParser.Comma, i);
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
		enterRule(_localctx, 4, RULE_fnExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(Id);
			setState(72);
			match(LeftParen);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << False) | (1L << Null) | (1L << True) | (1L << Sql) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Id) | (1L << Number) | (1L << FormatString) | (1L << String))) != 0)) {
				{
				setState(73);
				fnArgExpr();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(74);
					match(Comma);
					setState(75);
					fnArgExpr();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(83);
			match(RightParen);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(84);
				match(Question);
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

	public static class DsIdExprContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(DomsaScriptParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(DomsaScriptParser.Id, i);
		}
		public List<TerminalNode> ColonColon() { return getTokens(DomsaScriptParser.ColonColon); }
		public TerminalNode ColonColon(int i) {
			return getToken(DomsaScriptParser.ColonColon, i);
		}
		public DsIdExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsIdExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitDsIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DsIdExprContext dsIdExpr() throws RecognitionException {
		DsIdExprContext _localctx = new DsIdExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dsIdExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(Id);
			setState(88);
			match(ColonColon);
			setState(89);
			match(Id);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ColonColon) {
				{
				{
				setState(90);
				match(ColonColon);
				setState(91);
				match(Id);
				}
				}
				setState(96);
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

	public static class DsArgExprContext extends ParserRuleContext {
		public JsonObjContext jsonObj() {
			return getRuleContext(JsonObjContext.class,0);
		}
		public DsArgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsArgExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitDsArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DsArgExprContext dsArgExpr() throws RecognitionException {
		DsArgExprContext _localctx = new DsArgExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dsArgExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			jsonObj();
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

	public static class DsExprContext extends ParserRuleContext {
		public DsIdExprContext dsIdExpr() {
			return getRuleContext(DsIdExprContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(DomsaScriptParser.LeftParen, 0); }
		public DsArgExprContext dsArgExpr() {
			return getRuleContext(DsArgExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DomsaScriptParser.RightParen, 0); }
		public TerminalNode Question() { return getToken(DomsaScriptParser.Question, 0); }
		public DsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitDsExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DsExprContext dsExpr() throws RecognitionException {
		DsExprContext _localctx = new DsExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dsExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			dsIdExpr();
			setState(100);
			match(LeftParen);
			setState(101);
			dsArgExpr();
			setState(102);
			match(RightParen);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(103);
				match(Question);
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

	public static class SqlExprContext extends ParserRuleContext {
		public TerminalNode Sql() { return getToken(DomsaScriptParser.Sql, 0); }
		public TerminalNode FormatString() { return getToken(DomsaScriptParser.FormatString, 0); }
		public TerminalNode Question() { return getToken(DomsaScriptParser.Question, 0); }
		public SqlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitSqlExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExprContext sqlExpr() throws RecognitionException {
		SqlExprContext _localctx = new SqlExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sqlExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(Sql);
			setState(107);
			match(FormatString);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(108);
				match(Question);
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

	public static class BaseExprContext extends ParserRuleContext {
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
		public FnExprContext fnExpr() {
			return getRuleContext(FnExprContext.class,0);
		}
		public DsExprContext dsExpr() {
			return getRuleContext(DsExprContext.class,0);
		}
		public SqlExprContext sqlExpr() {
			return getRuleContext(SqlExprContext.class,0);
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
		enterRule(_localctx, 14, RULE_baseExpr);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				idExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				fnExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				dsExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				sqlExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(Number);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				match(String);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				match(FormatString);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				match(True);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(119);
				match(False);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(120);
				match(Null);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(121);
				match(LeftParen);
				setState(122);
				expr();
				setState(123);
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
		enterRule(_localctx, 16, RULE_mulExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			baseExpr();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) {
				{
				{
				setState(128);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(129);
				baseExpr();
				}
				}
				setState(134);
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
		enterRule(_localctx, 18, RULE_addExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			mulExpr();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(136);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(137);
				mulExpr();
				}
				}
				setState(142);
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
		enterRule(_localctx, 20, RULE_relExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			addExpr();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual) | (1L << Equal) | (1L << NotEqual))) != 0)) {
				{
				{
				setState(144);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual) | (1L << Equal) | (1L << NotEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(145);
				addExpr();
				}
				}
				setState(150);
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
		enterRule(_localctx, 22, RULE_logAndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			relExpr();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(152);
				match(And);
				setState(153);
				relExpr();
				}
				}
				setState(158);
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
		enterRule(_localctx, 24, RULE_logOrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			logAndExpr();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(160);
				match(Or);
				setState(161);
				logAndExpr();
				}
				}
				setState(166);
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
		enterRule(_localctx, 26, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		enterRule(_localctx, 28, RULE_jsonValue);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case False:
			case Null:
			case True:
			case Sql:
			case LeftParen:
			case Id:
			case Number:
			case FormatString:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				expr();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				jsonArr();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
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
		public TerminalNode Colon() { return getToken(DomsaScriptParser.Colon, 0); }
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public TerminalNode Id() { return getToken(DomsaScriptParser.Id, 0); }
		public TerminalNode String() { return getToken(DomsaScriptParser.String, 0); }
		public TerminalNode FormatString() { return getToken(DomsaScriptParser.FormatString, 0); }
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
		enterRule(_localctx, 30, RULE_jsonPair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Id) | (1L << FormatString) | (1L << String))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(175);
			match(Colon);
			setState(176);
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
		enterRule(_localctx, 32, RULE_jsonArr);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(LeftBracket);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(179);
					eos();
					}
				}

				setState(182);
				jsonValue();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(183);
					match(Comma);
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
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(193);
					eos();
					}
				}

				setState(196);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(LeftBracket);
				setState(199);
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
		enterRule(_localctx, 34, RULE_jsonObj);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(LeftBrace);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(203);
					eos();
					}
				}

				setState(206);
				jsonPair();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(207);
					match(Comma);
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Newline) {
						{
						setState(208);
						eos();
						}
					}

					setState(211);
					jsonPair();
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(217);
					eos();
					}
				}

				setState(220);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(LeftBrace);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Newline) {
					{
					setState(223);
					eos();
					}
				}

				setState(226);
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
		enterRule(_localctx, 36, RULE_assignId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(Id);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(230);
				match(Dot);
				setState(231);
				match(Id);
				}
				}
				setState(236);
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
		enterRule(_localctx, 38, RULE_assignValue);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case False:
			case Null:
			case True:
			case Sql:
			case LeftParen:
			case Id:
			case Number:
			case FormatString:
			case String:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				expr();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				jsonArr();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
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
		enterRule(_localctx, 40, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			assignId();
			setState(243);
			match(Assign);
			setState(244);
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
		enterRule(_localctx, 42, RULE_eos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(246);
					match(Newline);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(249); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public FnStmtContext fnStmt() {
			return getRuleContext(FnStmtContext.class,0);
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
		enterRule(_localctx, 44, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(251);
				eos();
				}
				break;
			}
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(254);
				nestStmt();
				}
				break;
			case 2:
				{
				setState(255);
				assignStmt();
				}
				break;
			case 3:
				{
				setState(256);
				condStmt();
				}
				break;
			case 4:
				{
				setState(257);
				iterStmt();
				}
				break;
			case 5:
				{
				setState(258);
				fnStmt();
				}
				break;
			case 6:
				{
				setState(259);
				eos();
				}
				break;
			}
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(262);
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
		enterRule(_localctx, 46, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		public List<TerminalNode> Elif() { return getTokens(DomsaScriptParser.Elif); }
		public TerminalNode Elif(int i) {
			return getToken(DomsaScriptParser.Elif, i);
		}
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
		enterRule(_localctx, 48, RULE_condStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(If);
			setState(268);
			expr();
			setState(269);
			nestStmt();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Elif) {
				{
				{
				setState(270);
				match(Elif);
				setState(271);
				expr();
				setState(272);
				nestStmt();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(279);
				match(Else);
				setState(280);
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
		public TerminalNode Id() { return getToken(DomsaScriptParser.Id, 0); }
		public TerminalNode In() { return getToken(DomsaScriptParser.In, 0); }
		public IdExprContext idExpr() {
			return getRuleContext(IdExprContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_iterStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(For);
			setState(284);
			match(Id);
			setState(285);
			match(In);
			setState(286);
			idExpr();
			setState(287);
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

	public static class FnStmtContext extends ParserRuleContext {
		public FnExprContext fnExpr() {
			return getRuleContext(FnExprContext.class,0);
		}
		public FnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DomsaScriptVisitor ) return ((DomsaScriptVisitor<? extends T>)visitor).visitFnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnStmtContext fnStmt() throws RecognitionException {
		FnStmtContext _localctx = new FnStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			fnExpr();
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
		enterRule(_localctx, 54, RULE_nestStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(LeftBrace);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << For) | (1L << If) | (1L << LeftBrace) | (1L << Id) | (1L << Newline))) != 0)) {
				{
				{
				setState(292);
				stmt();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
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
		enterRule(_localctx, 56, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << For) | (1L << If) | (1L << LeftBrace) | (1L << Id) | (1L << Newline))) != 0)) {
				{
				{
				setState(300);
				stmt();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0137\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\3\3\3\3\3\5\3H\n\3\3\4\3\4\3\4\3\4\3\4\7\4O\n\4\f"+
		"\4\16\4R\13\4\5\4T\n\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\7\5_\n\5\f"+
		"\5\16\5b\13\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\5\bp\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n"+
		"\t\3\n\3\n\3\n\7\n\u0085\n\n\f\n\16\n\u0088\13\n\3\13\3\13\3\13\7\13\u008d"+
		"\n\13\f\13\16\13\u0090\13\13\3\f\3\f\3\f\7\f\u0095\n\f\f\f\16\f\u0098"+
		"\13\f\3\r\3\r\3\r\7\r\u009d\n\r\f\r\16\r\u00a0\13\r\3\16\3\16\3\16\7\16"+
		"\u00a5\n\16\f\16\16\16\u00a8\13\16\3\17\3\17\3\20\3\20\3\20\5\20\u00af"+
		"\n\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00b7\n\22\3\22\3\22\3\22\5\22"+
		"\u00bc\n\22\3\22\7\22\u00bf\n\22\f\22\16\22\u00c2\13\22\3\22\5\22\u00c5"+
		"\n\22\3\22\3\22\3\22\3\22\5\22\u00cb\n\22\3\23\3\23\5\23\u00cf\n\23\3"+
		"\23\3\23\3\23\5\23\u00d4\n\23\3\23\7\23\u00d7\n\23\f\23\16\23\u00da\13"+
		"\23\3\23\5\23\u00dd\n\23\3\23\3\23\3\23\3\23\5\23\u00e3\n\23\3\23\5\23"+
		"\u00e6\n\23\3\24\3\24\3\24\7\24\u00eb\n\24\f\24\16\24\u00ee\13\24\3\25"+
		"\3\25\3\25\5\25\u00f3\n\25\3\26\3\26\3\26\3\26\3\27\6\27\u00fa\n\27\r"+
		"\27\16\27\u00fb\3\30\5\30\u00ff\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0107\n\30\3\30\5\30\u010a\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\7\32\u0115\n\32\f\32\16\32\u0118\13\32\3\32\3\32\5\32\u011c\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u0128\n\35"+
		"\f\35\16\35\u012b\13\35\3\35\3\35\3\36\7\36\u0130\n\36\f\36\16\36\u0133"+
		"\13\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:\2\6\3\2\30\32\3\2\26\27\4\2\22\25#$\4\2&&)*\2\u014d"+
		"\2<\3\2\2\2\4G\3\2\2\2\6I\3\2\2\2\bY\3\2\2\2\nc\3\2\2\2\fe\3\2\2\2\16"+
		"l\3\2\2\2\20\177\3\2\2\2\22\u0081\3\2\2\2\24\u0089\3\2\2\2\26\u0091\3"+
		"\2\2\2\30\u0099\3\2\2\2\32\u00a1\3\2\2\2\34\u00a9\3\2\2\2\36\u00ae\3\2"+
		"\2\2 \u00b0\3\2\2\2\"\u00ca\3\2\2\2$\u00e5\3\2\2\2&\u00e7\3\2\2\2(\u00f2"+
		"\3\2\2\2*\u00f4\3\2\2\2,\u00f9\3\2\2\2.\u00fe\3\2\2\2\60\u010b\3\2\2\2"+
		"\62\u010d\3\2\2\2\64\u011d\3\2\2\2\66\u0123\3\2\2\28\u0125\3\2\2\2:\u0131"+
		"\3\2\2\2<A\7&\2\2=>\7%\2\2>@\7&\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2B\3\3\2\2\2CA\3\2\2\2DH\5\34\17\2EH\5\"\22\2FH\5$\23\2GD\3\2\2\2"+
		"GE\3\2\2\2GF\3\2\2\2H\5\3\2\2\2IJ\7&\2\2JS\7\f\2\2KP\5\4\3\2LM\7!\2\2"+
		"MO\5\4\3\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2"+
		"SK\3\2\2\2ST\3\2\2\2TU\3\2\2\2UW\7\r\2\2VX\7\36\2\2WV\3\2\2\2WX\3\2\2"+
		"\2X\7\3\2\2\2YZ\7&\2\2Z[\7 \2\2[`\7&\2\2\\]\7 \2\2]_\7&\2\2^\\\3\2\2\2"+
		"_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\t\3\2\2\2b`\3\2\2\2cd\5$\23\2d\13\3\2"+
		"\2\2ef\5\b\5\2fg\7\f\2\2gh\5\n\6\2hj\7\r\2\2ik\7\36\2\2ji\3\2\2\2jk\3"+
		"\2\2\2k\r\3\2\2\2lm\7\13\2\2mo\7)\2\2np\7\36\2\2on\3\2\2\2op\3\2\2\2p"+
		"\17\3\2\2\2q\u0080\5\2\2\2r\u0080\5\6\4\2s\u0080\5\f\7\2t\u0080\5\16\b"+
		"\2u\u0080\7\'\2\2v\u0080\7*\2\2w\u0080\7)\2\2x\u0080\7\n\2\2y\u0080\7"+
		"\5\2\2z\u0080\7\t\2\2{|\7\f\2\2|}\5\34\17\2}~\7\r\2\2~\u0080\3\2\2\2\177"+
		"q\3\2\2\2\177r\3\2\2\2\177s\3\2\2\2\177t\3\2\2\2\177u\3\2\2\2\177v\3\2"+
		"\2\2\177w\3\2\2\2\177x\3\2\2\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2"+
		"\u0080\21\3\2\2\2\u0081\u0086\5\20\t\2\u0082\u0083\t\2\2\2\u0083\u0085"+
		"\5\20\t\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\23\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008e"+
		"\5\22\n\2\u008a\u008b\t\3\2\2\u008b\u008d\5\22\n\2\u008c\u008a\3\2\2\2"+
		"\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\25"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0096\5\24\13\2\u0092\u0093\t\4\2\2"+
		"\u0093\u0095\5\24\13\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\27\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009e\5\26\f\2\u009a\u009b\7\33\2\2\u009b\u009d\5\26\f\2\u009c\u009a"+
		"\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\31\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a6\5\30\r\2\u00a2\u00a3\7\34"+
		"\2\2\u00a3\u00a5\5\30\r\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00a6\3\2\2"+
		"\2\u00a9\u00aa\5\32\16\2\u00aa\35\3\2\2\2\u00ab\u00af\5\34\17\2\u00ac"+
		"\u00af\5\"\22\2\u00ad\u00af\5$\23\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3"+
		"\2\2\2\u00ae\u00ad\3\2\2\2\u00af\37\3\2\2\2\u00b0\u00b1\t\5\2\2\u00b1"+
		"\u00b2\7\37\2\2\u00b2\u00b3\5\36\20\2\u00b3!\3\2\2\2\u00b4\u00b6\7\16"+
		"\2\2\u00b5\u00b7\5,\27\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00c0\5\36\20\2\u00b9\u00bb\7!\2\2\u00ba\u00bc\5"+
		",\27\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bf\5\36\20\2\u00be\u00b9\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c5\5,\27\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c7\7\17\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00c9\7\16\2\2\u00c9"+
		"\u00cb\7\17\2\2\u00ca\u00b4\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb#\3\2\2\2"+
		"\u00cc\u00ce\7\20\2\2\u00cd\u00cf\5,\27\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d8\5 \21\2\u00d1\u00d3\7!\2\2\u00d2"+
		"\u00d4\5,\27\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\5 \21\2\u00d6\u00d1\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00dd\5,\27\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\7\21\2\2\u00df\u00e6\3\2\2\2\u00e0\u00e2\7"+
		"\20\2\2\u00e1\u00e3\5,\27\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e6\7\21\2\2\u00e5\u00cc\3\2\2\2\u00e5\u00e0\3"+
		"\2\2\2\u00e6%\3\2\2\2\u00e7\u00ec\7&\2\2\u00e8\u00e9\7%\2\2\u00e9\u00eb"+
		"\7&\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\'\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f3\5\34\17"+
		"\2\u00f0\u00f3\5\"\22\2\u00f1\u00f3\5$\23\2\u00f2\u00ef\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3)\3\2\2\2\u00f4\u00f5\5&\24\2"+
		"\u00f5\u00f6\7\"\2\2\u00f6\u00f7\5(\25\2\u00f7+\3\2\2\2\u00f8\u00fa\7"+
		",\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc-\3\2\2\2\u00fd\u00ff\5,\27\2\u00fe\u00fd\3\2\2\2"+
		"\u00fe\u00ff\3\2\2\2\u00ff\u0106\3\2\2\2\u0100\u0107\58\35\2\u0101\u0107"+
		"\5\60\31\2\u0102\u0107\5\62\32\2\u0103\u0107\5\64\33\2\u0104\u0107\5\66"+
		"\34\2\u0105\u0107\5,\27\2\u0106\u0100\3\2\2\2\u0106\u0101\3\2\2\2\u0106"+
		"\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2"+
		"\2\2\u0107\u0109\3\2\2\2\u0108\u010a\5,\27\2\u0109\u0108\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a/\3\2\2\2\u010b\u010c\5*\26\2\u010c\61\3\2\2\2\u010d"+
		"\u010e\7\7\2\2\u010e\u010f\5\34\17\2\u010f\u0116\58\35\2\u0110\u0111\7"+
		"\3\2\2\u0111\u0112\5\34\17\2\u0112\u0113\58\35\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0110\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u011b\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\4\2\2\u011a"+
		"\u011c\58\35\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\63\3\2\2"+
		"\2\u011d\u011e\7\6\2\2\u011e\u011f\7&\2\2\u011f\u0120\7\b\2\2\u0120\u0121"+
		"\5\2\2\2\u0121\u0122\58\35\2\u0122\65\3\2\2\2\u0123\u0124\5\6\4\2\u0124"+
		"\67\3\2\2\2\u0125\u0129\7\20\2\2\u0126\u0128\5.\30\2\u0127\u0126\3\2\2"+
		"\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7\21\2\2\u012d9\3\2\2\2\u012e"+
		"\u0130\5.\30\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0135\7\2\2\3\u0135;\3\2\2\2&AGPSW`jo\177\u0086\u008e\u0096\u009e\u00a6"+
		"\u00ae\u00b6\u00bb\u00c0\u00c4\u00ca\u00ce\u00d3\u00d8\u00dc\u00e2\u00e5"+
		"\u00ec\u00f2\u00fb\u00fe\u0106\u0109\u0116\u011b\u0129\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}