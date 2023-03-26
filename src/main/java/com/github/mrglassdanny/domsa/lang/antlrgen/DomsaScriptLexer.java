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
		Break=1, Case=2, Default=3, Elif=4, Else=5, False=6, For=7, If=8, In=9, 
		Loop=10, Null=11, Return=12, Switch=13, True=14, While=15, LeftParen=16, 
		RightParen=17, LeftBracket=18, RightBracket=19, LeftBrace=20, RightBrace=21, 
		Less=22, LessEqual=23, Greater=24, GreaterEqual=25, Plus=26, PlusPlus=27, 
		Minus=28, MinusMinus=29, Star=30, Div=31, Mod=32, And=33, Or=34, Not=35, 
		Question=36, Colon=37, Comma=38, Assign=39, Equal=40, NotEqual=41, Dot=42, 
		Id=43, Number=44, DigitSequence=45, FormatString=46, String=47, Whitespace=48, 
		Newline=49, BlockComment=50, LineComment=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Break", "Case", "Default", "Elif", "Else", "False", "For", "If", "In", 
			"Loop", "Null", "Return", "Switch", "True", "While", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", 
			"Greater", "GreaterEqual", "Plus", "PlusPlus", "Minus", "MinusMinus", 
			"Star", "Div", "Mod", "And", "Or", "Not", "Question", "Colon", "Comma", 
			"Assign", "Equal", "NotEqual", "Dot", "Id", "IdNondigit", "Nondigit", 
			"Number", "DigitSequence", "Digit", "FormatString", "String", "StringEsc", 
			"Unicode", "Hex", "SafeCodePoint", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'case'", "'default'", "'elif'", "'else'", "'false'", 
			"'for'", "'if'", "'in'", "'loop'", "'null'", "'return'", "'switch'", 
			"'true'", "'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", 
			"'<='", "'>'", "'>='", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", 
			"'and'", "'or'", "'!'", "'?'", "':'", "','", "'='", "'=='", "'!='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Break", "Case", "Default", "Elif", "Else", "False", "For", "If", 
			"In", "Loop", "Null", "Return", "Switch", "True", "While", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Less", "LessEqual", "Greater", "GreaterEqual", "Plus", "PlusPlus", "Minus", 
			"MinusMinus", "Star", "Div", "Mod", "And", "Or", "Not", "Question", "Colon", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0173\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\7,\u010a\n,\f,\16,\u010d"+
		"\13,\3-\3-\3.\3.\3/\5/\u0114\n/\3/\6/\u0117\n/\r/\16/\u0118\3/\3/\7/\u011d"+
		"\n/\f/\16/\u0120\13/\5/\u0122\n/\3\60\6\60\u0125\n\60\r\60\16\60\u0126"+
		"\3\61\3\61\3\62\3\62\7\62\u012d\n\62\f\62\16\62\u0130\13\62\3\62\3\62"+
		"\3\63\3\63\3\63\7\63\u0137\n\63\f\63\16\63\u013a\13\63\3\63\3\63\3\64"+
		"\3\64\3\64\5\64\u0141\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\68\u014e\n8\r8\168\u014f\38\38\39\39\59\u0156\n9\39\59\u0159"+
		"\n9\3:\3:\3:\3:\7:\u015f\n:\f:\16:\u0162\13:\3:\3:\3:\3:\3:\3;\3;\3;\3"+
		";\7;\u016d\n;\f;\16;\u0170\13;\3;\3;\3\u0160\2<\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y\2[\2]._/a\2c\60e\61g\2i\2k\2m\2o\62q\63s\64u\65\3\2\t\5\2C"+
		"\\aac|\3\2\62;\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\2!$$^^\4\2\13\13"+
		"\"\"\4\2\f\f\17\17\2\u017b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2c"+
		"\3\2\2\2\2e\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2"+
		"\2\2\5}\3\2\2\2\7\u0082\3\2\2\2\t\u008a\3\2\2\2\13\u008f\3\2\2\2\r\u0094"+
		"\3\2\2\2\17\u009a\3\2\2\2\21\u009e\3\2\2\2\23\u00a1\3\2\2\2\25\u00a4\3"+
		"\2\2\2\27\u00a9\3\2\2\2\31\u00ae\3\2\2\2\33\u00b5\3\2\2\2\35\u00bc\3\2"+
		"\2\2\37\u00c1\3\2\2\2!\u00c7\3\2\2\2#\u00c9\3\2\2\2%\u00cb\3\2\2\2\'\u00cd"+
		"\3\2\2\2)\u00cf\3\2\2\2+\u00d1\3\2\2\2-\u00d3\3\2\2\2/\u00d5\3\2\2\2\61"+
		"\u00d8\3\2\2\2\63\u00da\3\2\2\2\65\u00dd\3\2\2\2\67\u00df\3\2\2\29\u00e2"+
		"\3\2\2\2;\u00e4\3\2\2\2=\u00e7\3\2\2\2?\u00e9\3\2\2\2A\u00eb\3\2\2\2C"+
		"\u00ed\3\2\2\2E\u00f1\3\2\2\2G\u00f4\3\2\2\2I\u00f6\3\2\2\2K\u00f8\3\2"+
		"\2\2M\u00fa\3\2\2\2O\u00fc\3\2\2\2Q\u00fe\3\2\2\2S\u0101\3\2\2\2U\u0104"+
		"\3\2\2\2W\u0106\3\2\2\2Y\u010e\3\2\2\2[\u0110\3\2\2\2]\u0113\3\2\2\2_"+
		"\u0124\3\2\2\2a\u0128\3\2\2\2c\u012a\3\2\2\2e\u0133\3\2\2\2g\u013d\3\2"+
		"\2\2i\u0142\3\2\2\2k\u0148\3\2\2\2m\u014a\3\2\2\2o\u014d\3\2\2\2q\u0158"+
		"\3\2\2\2s\u015a\3\2\2\2u\u0168\3\2\2\2wx\7d\2\2xy\7t\2\2yz\7g\2\2z{\7"+
		"c\2\2{|\7m\2\2|\4\3\2\2\2}~\7e\2\2~\177\7c\2\2\177\u0080\7u\2\2\u0080"+
		"\u0081\7g\2\2\u0081\6\3\2\2\2\u0082\u0083\7f\2\2\u0083\u0084\7g\2\2\u0084"+
		"\u0085\7h\2\2\u0085\u0086\7c\2\2\u0086\u0087\7w\2\2\u0087\u0088\7n\2\2"+
		"\u0088\u0089\7v\2\2\u0089\b\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n"+
		"\2\2\u008c\u008d\7k\2\2\u008d\u008e\7h\2\2\u008e\n\3\2\2\2\u008f\u0090"+
		"\7g\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093"+
		"\f\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7c\2\2\u0096\u0097\7n\2\2\u0097"+
		"\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\16\3\2\2\2\u009a\u009b\7h\2\2\u009b"+
		"\u009c\7q\2\2\u009c\u009d\7t\2\2\u009d\20\3\2\2\2\u009e\u009f\7k\2\2\u009f"+
		"\u00a0\7h\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"\24\3\2\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7q\2\2\u00a7"+
		"\u00a8\7r\2\2\u00a8\26\3\2\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7w\2\2\u00ab"+
		"\u00ac\7n\2\2\u00ac\u00ad\7n\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7t\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7t\2\2"+
		"\u00b3\u00b4\7p\2\2\u00b4\32\3\2\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7"+
		"y\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb"+
		"\7j\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7t\2\2\u00be\u00bf"+
		"\7w\2\2\u00bf\u00c0\7g\2\2\u00c0\36\3\2\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3"+
		"\7j\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		" \3\2\2\2\u00c7\u00c8\7*\2\2\u00c8\"\3\2\2\2\u00c9\u00ca\7+\2\2\u00ca"+
		"$\3\2\2\2\u00cb\u00cc\7]\2\2\u00cc&\3\2\2\2\u00cd\u00ce\7_\2\2\u00ce("+
		"\3\2\2\2\u00cf\u00d0\7}\2\2\u00d0*\3\2\2\2\u00d1\u00d2\7\177\2\2\u00d2"+
		",\3\2\2\2\u00d3\u00d4\7>\2\2\u00d4.\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6\u00d7"+
		"\7?\2\2\u00d7\60\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9\62\3\2\2\2\u00da\u00db"+
		"\7@\2\2\u00db\u00dc\7?\2\2\u00dc\64\3\2\2\2\u00dd\u00de\7-\2\2\u00de\66"+
		"\3\2\2\2\u00df\u00e0\7-\2\2\u00e0\u00e1\7-\2\2\u00e18\3\2\2\2\u00e2\u00e3"+
		"\7/\2\2\u00e3:\3\2\2\2\u00e4\u00e5\7/\2\2\u00e5\u00e6\7/\2\2\u00e6<\3"+
		"\2\2\2\u00e7\u00e8\7,\2\2\u00e8>\3\2\2\2\u00e9\u00ea\7\61\2\2\u00ea@\3"+
		"\2\2\2\u00eb\u00ec\7\'\2\2\u00ecB\3\2\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef\u00f0\7f\2\2\u00f0D\3\2\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3"+
		"\7t\2\2\u00f3F\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7"+
		"A\2\2\u00f7J\3\2\2\2\u00f8\u00f9\7<\2\2\u00f9L\3\2\2\2\u00fa\u00fb\7."+
		"\2\2\u00fbN\3\2\2\2\u00fc\u00fd\7?\2\2\u00fdP\3\2\2\2\u00fe\u00ff\7?\2"+
		"\2\u00ff\u0100\7?\2\2\u0100R\3\2\2\2\u0101\u0102\7#\2\2\u0102\u0103\7"+
		"?\2\2\u0103T\3\2\2\2\u0104\u0105\7\60\2\2\u0105V\3\2\2\2\u0106\u010b\5"+
		"Y-\2\u0107\u010a\5Y-\2\u0108\u010a\5a\61\2\u0109\u0107\3\2\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"X\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\5[.\2\u010fZ\3\2\2\2\u0110\u0111"+
		"\t\2\2\2\u0111\\\3\2\2\2\u0112\u0114\59\35\2\u0113\u0112\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0117\5_\60\2\u0116\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u0121\3\2\2\2\u011a\u011e\5U+\2\u011b\u011d\5_\60\2\u011c\u011b\3\2\2"+
		"\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0122"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u011a\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"^\3\2\2\2\u0123\u0125\5a\61\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127`\3\2\2\2\u0128\u0129\t"+
		"\3\2\2\u0129b\3\2\2\2\u012a\u012e\7b\2\2\u012b\u012d\5m\67\2\u012c\u012b"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7b\2\2\u0132d\3\2\2\2\u0133"+
		"\u0138\7$\2\2\u0134\u0137\5g\64\2\u0135\u0137\5m\67\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7$"+
		"\2\2\u013cf\3\2\2\2\u013d\u0140\7^\2\2\u013e\u0141\t\4\2\2\u013f\u0141"+
		"\5i\65\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141h\3\2\2\2\u0142"+
		"\u0143\7w\2\2\u0143\u0144\5k\66\2\u0144\u0145\5k\66\2\u0145\u0146\5k\66"+
		"\2\u0146\u0147\5k\66\2\u0147j\3\2\2\2\u0148\u0149\t\5\2\2\u0149l\3\2\2"+
		"\2\u014a\u014b\n\6\2\2\u014bn\3\2\2\2\u014c\u014e\t\7\2\2\u014d\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\b8\2\2\u0152p\3\2\2\2\u0153\u0155\7\17\2\2"+
		"\u0154\u0156\7\f\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159"+
		"\3\2\2\2\u0157\u0159\7\f\2\2\u0158\u0153\3\2\2\2\u0158\u0157\3\2\2\2\u0159"+
		"r\3\2\2\2\u015a\u015b\7\61\2\2\u015b\u015c\7,\2\2\u015c\u0160\3\2\2\2"+
		"\u015d\u015f\13\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0164\7,\2\2\u0164\u0165\7\61\2\2\u0165\u0166\3\2\2\2\u0166\u0167\b:"+
		"\2\2\u0167t\3\2\2\2\u0168\u0169\7\61\2\2\u0169\u016a\7\61\2\2\u016a\u016e"+
		"\3\2\2\2\u016b\u016d\n\b\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0171\u0172\b;\2\2\u0172v\3\2\2\2\23\2\u0109\u010b\u0113\u0118\u011e"+
		"\u0121\u0126\u012e\u0136\u0138\u0140\u014f\u0155\u0158\u0160\u016e\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}