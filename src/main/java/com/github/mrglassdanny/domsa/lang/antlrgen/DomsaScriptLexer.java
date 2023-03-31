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
		Elif=1, Else=2, False=3, For=4, If=5, In=6, Null=7, True=8, Sql=9, LeftParen=10, 
		RightParen=11, LeftBracket=12, RightBracket=13, LeftBrace=14, RightBrace=15, 
		Less=16, LessEqual=17, Greater=18, GreaterEqual=19, Plus=20, Minus=21, 
		Star=22, Div=23, Mod=24, And=25, Or=26, Not=27, Question=28, Colon=29, 
		ColonColon=30, Comma=31, Assign=32, Equal=33, NotEqual=34, Dot=35, Id=36, 
		Number=37, DigitSequence=38, FormatString=39, String=40, Whitespace=41, 
		Newline=42, BlockComment=43, LineComment=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Elif", "Else", "False", "For", "If", "In", "Null", "True", "Sql", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Less", "LessEqual", "Greater", "GreaterEqual", "Plus", "Minus", "Star", 
			"Div", "Mod", "And", "Or", "Not", "Question", "Colon", "ColonColon", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u013c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\7%\u00d1\n%\f%\16%\u00d4\13%\3&\3&\3\'\3"+
		"\'\3(\5(\u00db\n(\3(\6(\u00de\n(\r(\16(\u00df\3(\3(\7(\u00e4\n(\f(\16"+
		"(\u00e7\13(\5(\u00e9\n(\3)\6)\u00ec\n)\r)\16)\u00ed\3*\3*\3+\3+\3+\3+"+
		"\7+\u00f6\n+\f+\16+\u00f9\13+\3+\3+\3,\3,\3,\7,\u0100\n,\f,\16,\u0103"+
		"\13,\3,\3,\3-\3-\3-\5-\u010a\n-\3.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\6\61\u0117\n\61\r\61\16\61\u0118\3\61\3\61\3\62\3\62\5\62\u011f\n\62"+
		"\3\62\5\62\u0122\n\62\3\63\3\63\3\63\3\63\7\63\u0128\n\63\f\63\16\63\u012b"+
		"\13\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u0136\n\64\f"+
		"\64\16\64\u0139\13\64\3\64\3\64\3\u0129\2\65\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\'Q"+
		"(S\2U)W*Y\2[\2]\2_\2a+c,e-g.\3\2\n\5\2C\\aac|\3\2\62;\3\2bb\n\2$$\61\61"+
		"^^ddhhppttvv\5\2\62;CHch\5\2\2!$$^^\4\2\13\13\"\"\4\2\f\f\17\17\2\u0145"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5n\3\2\2\2\7s\3\2\2\2\ty\3"+
		"\2\2\2\13}\3\2\2\2\r\u0080\3\2\2\2\17\u0083\3\2\2\2\21\u0088\3\2\2\2\23"+
		"\u008d\3\2\2\2\25\u0091\3\2\2\2\27\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u0097"+
		"\3\2\2\2\35\u0099\3\2\2\2\37\u009b\3\2\2\2!\u009d\3\2\2\2#\u009f\3\2\2"+
		"\2%\u00a2\3\2\2\2\'\u00a4\3\2\2\2)\u00a7\3\2\2\2+\u00a9\3\2\2\2-\u00ab"+
		"\3\2\2\2/\u00ad\3\2\2\2\61\u00af\3\2\2\2\63\u00b1\3\2\2\2\65\u00b5\3\2"+
		"\2\2\67\u00b8\3\2\2\29\u00ba\3\2\2\2;\u00bc\3\2\2\2=\u00be\3\2\2\2?\u00c1"+
		"\3\2\2\2A\u00c3\3\2\2\2C\u00c5\3\2\2\2E\u00c8\3\2\2\2G\u00cb\3\2\2\2I"+
		"\u00cd\3\2\2\2K\u00d5\3\2\2\2M\u00d7\3\2\2\2O\u00da\3\2\2\2Q\u00eb\3\2"+
		"\2\2S\u00ef\3\2\2\2U\u00f1\3\2\2\2W\u00fc\3\2\2\2Y\u0106\3\2\2\2[\u010b"+
		"\3\2\2\2]\u0111\3\2\2\2_\u0113\3\2\2\2a\u0116\3\2\2\2c\u0121\3\2\2\2e"+
		"\u0123\3\2\2\2g\u0131\3\2\2\2ij\7g\2\2jk\7n\2\2kl\7k\2\2lm\7h\2\2m\4\3"+
		"\2\2\2no\7g\2\2op\7n\2\2pq\7u\2\2qr\7g\2\2r\6\3\2\2\2st\7h\2\2tu\7c\2"+
		"\2uv\7n\2\2vw\7u\2\2wx\7g\2\2x\b\3\2\2\2yz\7h\2\2z{\7q\2\2{|\7t\2\2|\n"+
		"\3\2\2\2}~\7k\2\2~\177\7h\2\2\177\f\3\2\2\2\u0080\u0081\7k\2\2\u0081\u0082"+
		"\7p\2\2\u0082\16\3\2\2\2\u0083\u0084\7p\2\2\u0084\u0085\7w\2\2\u0085\u0086"+
		"\7n\2\2\u0086\u0087\7n\2\2\u0087\20\3\2\2\2\u0088\u0089\7v\2\2\u0089\u008a"+
		"\7t\2\2\u008a\u008b\7w\2\2\u008b\u008c\7g\2\2\u008c\22\3\2\2\2\u008d\u008e"+
		"\7u\2\2\u008e\u008f\7s\2\2\u008f\u0090\7n\2\2\u0090\24\3\2\2\2\u0091\u0092"+
		"\7*\2\2\u0092\26\3\2\2\2\u0093\u0094\7+\2\2\u0094\30\3\2\2\2\u0095\u0096"+
		"\7]\2\2\u0096\32\3\2\2\2\u0097\u0098\7_\2\2\u0098\34\3\2\2\2\u0099\u009a"+
		"\7}\2\2\u009a\36\3\2\2\2\u009b\u009c\7\177\2\2\u009c \3\2\2\2\u009d\u009e"+
		"\7>\2\2\u009e\"\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1\7?\2\2\u00a1$\3"+
		"\2\2\2\u00a2\u00a3\7@\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5\u00a6"+
		"\7?\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8*\3\2\2\2\u00a9\u00aa\7"+
		"/\2\2\u00aa,\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac.\3\2\2\2\u00ad\u00ae\7\61"+
		"\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7\'\2\2\u00b0\62\3\2\2\2\u00b1\u00b2"+
		"\7c\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7f\2\2\u00b4\64\3\2\2\2\u00b5\u00b6"+
		"\7q\2\2\u00b6\u00b7\7t\2\2\u00b7\66\3\2\2\2\u00b8\u00b9\7#\2\2\u00b98"+
		"\3\2\2\2\u00ba\u00bb\7A\2\2\u00bb:\3\2\2\2\u00bc\u00bd\7<\2\2\u00bd<\3"+
		"\2\2\2\u00be\u00bf\7<\2\2\u00bf\u00c0\7<\2\2\u00c0>\3\2\2\2\u00c1\u00c2"+
		"\7.\2\2\u00c2@\3\2\2\2\u00c3\u00c4\7?\2\2\u00c4B\3\2\2\2\u00c5\u00c6\7"+
		"?\2\2\u00c6\u00c7\7?\2\2\u00c7D\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca"+
		"\7?\2\2\u00caF\3\2\2\2\u00cb\u00cc\7\60\2\2\u00ccH\3\2\2\2\u00cd\u00d2"+
		"\5K&\2\u00ce\u00d1\5K&\2\u00cf\u00d1\5S*\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"J\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\5M\'\2\u00d6L\3\2\2\2\u00d7"+
		"\u00d8\t\2\2\2\u00d8N\3\2\2\2\u00d9\u00db\5+\26\2\u00da\u00d9\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00de\5Q)\2\u00dd\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e8\3\2\2\2\u00e1\u00e5\5G$\2\u00e2\u00e4\5Q)\2\u00e3\u00e2\3\2\2\2"+
		"\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"P\3\2\2\2\u00ea\u00ec\5S*\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00eeR\3\2\2\2\u00ef\u00f0\t\3\2\2"+
		"\u00f0T\3\2\2\2\u00f1\u00f7\7b\2\2\u00f2\u00f3\7^\2\2\u00f3\u00f6\7b\2"+
		"\2\u00f4\u00f6\n\4\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fb\7b\2\2\u00fbV\3\2\2\2\u00fc\u0101\7$\2\2\u00fd"+
		"\u0100\5Y-\2\u00fe\u0100\5_\60\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2"+
		"\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7$\2\2\u0105X\3\2\2\2\u0106\u0109"+
		"\7^\2\2\u0107\u010a\t\5\2\2\u0108\u010a\5[.\2\u0109\u0107\3\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010aZ\3\2\2\2\u010b\u010c\7w\2\2\u010c\u010d\5]/\2\u010d"+
		"\u010e\5]/\2\u010e\u010f\5]/\2\u010f\u0110\5]/\2\u0110\\\3\2\2\2\u0111"+
		"\u0112\t\6\2\2\u0112^\3\2\2\2\u0113\u0114\n\7\2\2\u0114`\3\2\2\2\u0115"+
		"\u0117\t\b\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\b\61\2\2\u011b"+
		"b\3\2\2\2\u011c\u011e\7\17\2\2\u011d\u011f\7\f\2\2\u011e\u011d\3\2\2\2"+
		"\u011e\u011f\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u0122\7\f\2\2\u0121\u011c"+
		"\3\2\2\2\u0121\u0120\3\2\2\2\u0122d\3\2\2\2\u0123\u0124\7\61\2\2\u0124"+
		"\u0125\7,\2\2\u0125\u0129\3\2\2\2\u0126\u0128\13\2\2\2\u0127\u0126\3\2"+
		"\2\2\u0128\u012b\3\2\2\2\u0129\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7,\2\2\u012d\u012e\7\61"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b\63\2\2\u0130f\3\2\2\2\u0131\u0132"+
		"\7\61\2\2\u0132\u0133\7\61\2\2\u0133\u0137\3\2\2\2\u0134\u0136\n\t\2\2"+
		"\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\b\64\2\2"+
		"\u013bh\3\2\2\2\24\2\u00d0\u00d2\u00da\u00df\u00e5\u00e8\u00ed\u00f5\u00f7"+
		"\u00ff\u0101\u0109\u0118\u011e\u0121\u0129\u0137\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}