// Generated from DomsaScript.g4 by ANTLR 4.8

package com.github.mrglassdanny.domsa.lang.antlrgen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DomsaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Elif=1, Else=2, False=3, For=4, If=5, In=6, Null=7, True=8, LeftParen=9, 
		RightParen=10, LeftBracket=11, RightBracket=12, LeftBrace=13, RightBrace=14, 
		Less=15, LessEqual=16, Greater=17, GreaterEqual=18, Plus=19, Minus=20, 
		Star=21, Div=22, Mod=23, And=24, Or=25, Question=26, Exclamation=27, Colon=28, 
		ColonColon=29, Comma=30, Assign=31, Equal=32, NotEqual=33, Dot=34, Id=35, 
		Number=36, DigitSequence=37, FormatString=38, String=39, Whitespace=40, 
		Newline=41, BlockComment=42, LineComment=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Elif", "Else", "False", "For", "If", "In", "Null", "True", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Less", "LessEqual", "Greater", "GreaterEqual", "Plus", "Minus", "Star", 
			"Div", "Mod", "And", "Or", "Question", "Exclamation", "Colon", "ColonColon", 
			"Comma", "Assign", "Equal", "NotEqual", "Dot", "Id", "IdNondigit", "Nondigit", 
			"Number", "DigitSequence", "Digit", "FormatString", "String", "StringEsc", 
			"Unicode", "Hex", "SafeCodePoint", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'elif'", "'else'", "'false'", "'for'", "'if'", "'in'", "'null'", 
			"'true'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", 
			"'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'and'", "'or'", "'?'", "'!'", 
			"':'", "'::'", "','", "'='", "'=='", "'!='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Elif", "Else", "False", "For", "If", "In", "Null", "True", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Less", "LessEqual", "Greater", "GreaterEqual", "Plus", "Minus", "Star", 
			"Div", "Mod", "And", "Or", "Question", "Exclamation", "Colon", "ColonColon", 
			"Comma", "Assign", "Equal", "NotEqual", "Dot", "Id", "Number", "DigitSequence", 
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


	public DomsaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DomsaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0136\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$"+
		"\3$\7$\u00cb\n$\f$\16$\u00ce\13$\3%\3%\3&\3&\3\'\5\'\u00d5\n\'\3\'\6\'"+
		"\u00d8\n\'\r\'\16\'\u00d9\3\'\3\'\7\'\u00de\n\'\f\'\16\'\u00e1\13\'\5"+
		"\'\u00e3\n\'\3(\6(\u00e6\n(\r(\16(\u00e7\3)\3)\3*\3*\3*\3*\7*\u00f0\n"+
		"*\f*\16*\u00f3\13*\3*\3*\3+\3+\3+\7+\u00fa\n+\f+\16+\u00fd\13+\3+\3+\3"+
		",\3,\3,\5,\u0104\n,\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\6\60\u0111\n\60"+
		"\r\60\16\60\u0112\3\60\3\60\3\61\3\61\5\61\u0119\n\61\3\61\5\61\u011c"+
		"\n\61\3\62\3\62\3\62\3\62\7\62\u0122\n\62\f\62\16\62\u0125\13\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\7\63\u0130\n\63\f\63\16\63\u0133"+
		"\13\63\3\63\3\63\3\u0123\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K\2M&O\'Q\2S(U)W\2Y\2[\2"+
		"]\2_*a+c,e-\3\2\n\5\2C\\aac|\3\2\62;\3\2bb\n\2$$\61\61^^ddhhppttvv\5\2"+
		"\62;CHch\5\2\2!$$^^\4\2\13\13\"\"\4\2\f\f\17\17\2\u013f\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\3g\3\2\2\2\5l\3\2\2\2\7q\3\2\2\2\tw\3\2\2\2\13{\3\2\2\2\r~\3\2"+
		"\2\2\17\u0081\3\2\2\2\21\u0086\3\2\2\2\23\u008b\3\2\2\2\25\u008d\3\2\2"+
		"\2\27\u008f\3\2\2\2\31\u0091\3\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2\2\2"+
		"\37\u0097\3\2\2\2!\u0099\3\2\2\2#\u009c\3\2\2\2%\u009e\3\2\2\2\'\u00a1"+
		"\3\2\2\2)\u00a3\3\2\2\2+\u00a5\3\2\2\2-\u00a7\3\2\2\2/\u00a9\3\2\2\2\61"+
		"\u00ab\3\2\2\2\63\u00af\3\2\2\2\65\u00b2\3\2\2\2\67\u00b4\3\2\2\29\u00b6"+
		"\3\2\2\2;\u00b8\3\2\2\2=\u00bb\3\2\2\2?\u00bd\3\2\2\2A\u00bf\3\2\2\2C"+
		"\u00c2\3\2\2\2E\u00c5\3\2\2\2G\u00c7\3\2\2\2I\u00cf\3\2\2\2K\u00d1\3\2"+
		"\2\2M\u00d4\3\2\2\2O\u00e5\3\2\2\2Q\u00e9\3\2\2\2S\u00eb\3\2\2\2U\u00f6"+
		"\3\2\2\2W\u0100\3\2\2\2Y\u0105\3\2\2\2[\u010b\3\2\2\2]\u010d\3\2\2\2_"+
		"\u0110\3\2\2\2a\u011b\3\2\2\2c\u011d\3\2\2\2e\u012b\3\2\2\2gh\7g\2\2h"+
		"i\7n\2\2ij\7k\2\2jk\7h\2\2k\4\3\2\2\2lm\7g\2\2mn\7n\2\2no\7u\2\2op\7g"+
		"\2\2p\6\3\2\2\2qr\7h\2\2rs\7c\2\2st\7n\2\2tu\7u\2\2uv\7g\2\2v\b\3\2\2"+
		"\2wx\7h\2\2xy\7q\2\2yz\7t\2\2z\n\3\2\2\2{|\7k\2\2|}\7h\2\2}\f\3\2\2\2"+
		"~\177\7k\2\2\177\u0080\7p\2\2\u0080\16\3\2\2\2\u0081\u0082\7p\2\2\u0082"+
		"\u0083\7w\2\2\u0083\u0084\7n\2\2\u0084\u0085\7n\2\2\u0085\20\3\2\2\2\u0086"+
		"\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088\u0089\7w\2\2\u0089\u008a\7g\2\2"+
		"\u008a\22\3\2\2\2\u008b\u008c\7*\2\2\u008c\24\3\2\2\2\u008d\u008e\7+\2"+
		"\2\u008e\26\3\2\2\2\u008f\u0090\7]\2\2\u0090\30\3\2\2\2\u0091\u0092\7"+
		"_\2\2\u0092\32\3\2\2\2\u0093\u0094\7}\2\2\u0094\34\3\2\2\2\u0095\u0096"+
		"\7\177\2\2\u0096\36\3\2\2\2\u0097\u0098\7>\2\2\u0098 \3\2\2\2\u0099\u009a"+
		"\7>\2\2\u009a\u009b\7?\2\2\u009b\"\3\2\2\2\u009c\u009d\7@\2\2\u009d$\3"+
		"\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2\2\u00a0&\3\2\2\2\u00a1\u00a2"+
		"\7-\2\2\u00a2(\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4*\3\2\2\2\u00a5\u00a6\7"+
		",\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7\61\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7"+
		"\'\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae"+
		"\7f\2\2\u00ae\62\3\2\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7t\2\2\u00b1\64"+
		"\3\2\2\2\u00b2\u00b3\7A\2\2\u00b3\66\3\2\2\2\u00b4\u00b5\7#\2\2\u00b5"+
		"8\3\2\2\2\u00b6\u00b7\7<\2\2\u00b7:\3\2\2\2\u00b8\u00b9\7<\2\2\u00b9\u00ba"+
		"\7<\2\2\u00ba<\3\2\2\2\u00bb\u00bc\7.\2\2\u00bc>\3\2\2\2\u00bd\u00be\7"+
		"?\2\2\u00be@\3\2\2\2\u00bf\u00c0\7?\2\2\u00c0\u00c1\7?\2\2\u00c1B\3\2"+
		"\2\2\u00c2\u00c3\7#\2\2\u00c3\u00c4\7?\2\2\u00c4D\3\2\2\2\u00c5\u00c6"+
		"\7\60\2\2\u00c6F\3\2\2\2\u00c7\u00cc\5I%\2\u00c8\u00cb\5I%\2\u00c9\u00cb"+
		"\5Q)\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cdH\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00cf\u00d0\5K&\2\u00d0J\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2L\3\2\2\2\u00d3"+
		"\u00d5\5)\25\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2"+
		"\2\2\u00d6\u00d8\5O(\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e2\3\2\2\2\u00db\u00df\5E#\2\u00dc"+
		"\u00de\5O(\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2"+
		"\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00db"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3N\3\2\2\2\u00e4\u00e6\5Q)\2\u00e5\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"P\3\2\2\2\u00e9\u00ea\t\3\2\2\u00eaR\3\2\2\2\u00eb\u00f1\7b\2\2\u00ec"+
		"\u00ed\7^\2\2\u00ed\u00f0\7b\2\2\u00ee\u00f0\n\4\2\2\u00ef\u00ec\3\2\2"+
		"\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7b\2\2\u00f5"+
		"T\3\2\2\2\u00f6\u00fb\7$\2\2\u00f7\u00fa\5W,\2\u00f8\u00fa\5]/\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u00ff\7$\2\2\u00ffV\3\2\2\2\u0100\u0103\7^\2\2\u0101\u0104\t\5\2\2\u0102"+
		"\u0104\5Y-\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104X\3\2\2\2\u0105"+
		"\u0106\7w\2\2\u0106\u0107\5[.\2\u0107\u0108\5[.\2\u0108\u0109\5[.\2\u0109"+
		"\u010a\5[.\2\u010aZ\3\2\2\2\u010b\u010c\t\6\2\2\u010c\\\3\2\2\2\u010d"+
		"\u010e\n\7\2\2\u010e^\3\2\2\2\u010f\u0111\t\b\2\2\u0110\u010f\3\2\2\2"+
		"\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0115\b\60\2\2\u0115`\3\2\2\2\u0116\u0118\7\17\2\2\u0117"+
		"\u0119\7\f\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2"+
		"\2\2\u011a\u011c\7\f\2\2\u011b\u0116\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"b\3\2\2\2\u011d\u011e\7\61\2\2\u011e\u011f\7,\2\2\u011f\u0123\3\2\2\2"+
		"\u0120\u0122\13\2\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0127\7,\2\2\u0127\u0128\7\61\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b\62"+
		"\2\2\u012ad\3\2\2\2\u012b\u012c\7\61\2\2\u012c\u012d\7\61\2\2\u012d\u0131"+
		"\3\2\2\2\u012e\u0130\n\t\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0134\u0135\b\63\2\2\u0135f\3\2\2\2\24\2\u00ca\u00cc\u00d4\u00d9"+
		"\u00df\u00e2\u00e7\u00ef\u00f1\u00f9\u00fb\u0103\u0112\u0118\u011b\u0123"+
		"\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}