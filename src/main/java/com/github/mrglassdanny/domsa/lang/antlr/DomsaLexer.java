// Generated from Domsa.g4 by ANTLR 4.8

package com.github.mrglassdanny.domsa.lang.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DomsaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFT_PAREN=1, RIGHT_PAREN=2, LEFT_BRACE=3, RIGHT_BRACE=4, LEFT_BRACKET=5, 
		RIGHT_BRACKET=6, LESS=7, GREATER=8, LESS_EQUAL=9, GREATER_EQUAL=10, DOUBLE_LESS=11, 
		DOUBLE_GREATER=12, PLUS=13, MINUS=14, STAR=15, DIV=16, MOD=17, BACKSLASH=18, 
		AMPERSAND=19, CARET=20, BANG=21, QUESTION=22, COLON=23, SEMI_COLON=24, 
		COMMA=25, PIPE=26, DOUBLE_PIPE=27, POUND=28, AT=29, EQUAL=30, NOT_EQUAL=31, 
		DOT=32, DOLLAR_SIGN=33, NUMERIC_LITERAL=34, STRING_LITERAL=35, FMT_STRING_LITERAL=36, 
		WORD=37, BLOCK_COMMENT=38, WHITESPACE=39, NEWLINE=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LESS", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", "DOUBLE_LESS", 
			"DOUBLE_GREATER", "PLUS", "MINUS", "STAR", "DIV", "MOD", "BACKSLASH", 
			"AMPERSAND", "CARET", "BANG", "QUESTION", "COLON", "SEMI_COLON", "COMMA", 
			"PIPE", "DOUBLE_PIPE", "POUND", "AT", "EQUAL", "NOT_EQUAL", "DOT", "DOLLAR_SIGN", 
			"NUMERIC_LITERAL", "STRING_LITERAL", "FMT_STRING_LITERAL", "WORD", "BLOCK_COMMENT", 
			"WHITESPACE", "NEWLINE", "DIGIT", "A", "B", "C", "D", "E", "F", "G", 
			"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
			"V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", "'>'", "'<='", 
			"'>='", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'\\'", "'&'", 
			"'^'", "'!'", "'?'", "':'", "';'", "','", "'|'", "'||'", "'#'", "'@'", 
			"'='", null, "'.'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LESS", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", "DOUBLE_LESS", 
			"DOUBLE_GREATER", "PLUS", "MINUS", "STAR", "DIV", "MOD", "BACKSLASH", 
			"AMPERSAND", "CARET", "BANG", "QUESTION", "COLON", "SEMI_COLON", "COMMA", 
			"PIPE", "DOUBLE_PIPE", "POUND", "AT", "EQUAL", "NOT_EQUAL", "DOT", "DOLLAR_SIGN", 
			"NUMERIC_LITERAL", "STRING_LITERAL", "FMT_STRING_LITERAL", "WORD", "BLOCK_COMMENT", 
			"WHITESPACE", "NEWLINE"
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


	public DomsaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Domsa.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0176\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3 \3 \5 \u00cf\n \3!\3!\3\"\3\"\3#\6#\u00d6\n#\r#\16#\u00d7\3#\3#\7#"+
		"\u00dc\n#\f#\16#\u00df\13#\5#\u00e1\n#\3#\3#\5#\u00e5\n#\3#\6#\u00e8\n"+
		"#\r#\16#\u00e9\5#\u00ec\n#\3#\3#\6#\u00f0\n#\r#\16#\u00f1\3#\3#\5#\u00f6"+
		"\n#\3#\6#\u00f9\n#\r#\16#\u00fa\5#\u00fd\n#\5#\u00ff\n#\3$\3$\3$\3$\7"+
		"$\u0105\n$\f$\16$\u0108\13$\3$\3$\3$\3$\3$\7$\u010f\n$\f$\16$\u0112\13"+
		"$\3$\5$\u0115\n$\3%\3%\7%\u0119\n%\f%\16%\u011c\13%\3%\3%\3&\6&\u0121"+
		"\n&\r&\16&\u0122\3\'\3\'\3\'\3\'\7\'\u0129\n\'\f\'\16\'\u012c\13\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\6(\u0134\n(\r(\16(\u0135\3(\3(\3)\3)\5)\u013c\n)\3"+
		")\5)\u013f\n)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D"+
		"\4\u011a\u012a\2E\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2Y\2[\2]\2_\2a\2c\2e"+
		"\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\3\2\"\4\2--//\3\2))\3\2$$\7\2\60\60\62;C\\aac|\4\2\13\13\"\"\3\2\62"+
		";\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2"+
		"KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\2\u0171\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3\u0089"+
		"\3\2\2\2\5\u008b\3\2\2\2\7\u008d\3\2\2\2\t\u008f\3\2\2\2\13\u0091\3\2"+
		"\2\2\r\u0093\3\2\2\2\17\u0095\3\2\2\2\21\u0097\3\2\2\2\23\u0099\3\2\2"+
		"\2\25\u009c\3\2\2\2\27\u009f\3\2\2\2\31\u00a2\3\2\2\2\33\u00a5\3\2\2\2"+
		"\35\u00a7\3\2\2\2\37\u00a9\3\2\2\2!\u00ab\3\2\2\2#\u00ad\3\2\2\2%\u00af"+
		"\3\2\2\2\'\u00b1\3\2\2\2)\u00b3\3\2\2\2+\u00b5\3\2\2\2-\u00b7\3\2\2\2"+
		"/\u00b9\3\2\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf\3\2\2\2\67"+
		"\u00c1\3\2\2\29\u00c4\3\2\2\2;\u00c6\3\2\2\2=\u00c8\3\2\2\2?\u00ce\3\2"+
		"\2\2A\u00d0\3\2\2\2C\u00d2\3\2\2\2E\u00fe\3\2\2\2G\u0114\3\2\2\2I\u0116"+
		"\3\2\2\2K\u0120\3\2\2\2M\u0124\3\2\2\2O\u0133\3\2\2\2Q\u013e\3\2\2\2S"+
		"\u0140\3\2\2\2U\u0142\3\2\2\2W\u0144\3\2\2\2Y\u0146\3\2\2\2[\u0148\3\2"+
		"\2\2]\u014a\3\2\2\2_\u014c\3\2\2\2a\u014e\3\2\2\2c\u0150\3\2\2\2e\u0152"+
		"\3\2\2\2g\u0154\3\2\2\2i\u0156\3\2\2\2k\u0158\3\2\2\2m\u015a\3\2\2\2o"+
		"\u015c\3\2\2\2q\u015e\3\2\2\2s\u0160\3\2\2\2u\u0162\3\2\2\2w\u0164\3\2"+
		"\2\2y\u0166\3\2\2\2{\u0168\3\2\2\2}\u016a\3\2\2\2\177\u016c\3\2\2\2\u0081"+
		"\u016e\3\2\2\2\u0083\u0170\3\2\2\2\u0085\u0172\3\2\2\2\u0087\u0174\3\2"+
		"\2\2\u0089\u008a\7*\2\2\u008a\4\3\2\2\2\u008b\u008c\7+\2\2\u008c\6\3\2"+
		"\2\2\u008d\u008e\7}\2\2\u008e\b\3\2\2\2\u008f\u0090\7\177\2\2\u0090\n"+
		"\3\2\2\2\u0091\u0092\7]\2\2\u0092\f\3\2\2\2\u0093\u0094\7_\2\2\u0094\16"+
		"\3\2\2\2\u0095\u0096\7>\2\2\u0096\20\3\2\2\2\u0097\u0098\7@\2\2\u0098"+
		"\22\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7?\2\2\u009b\24\3\2\2\2\u009c"+
		"\u009d\7@\2\2\u009d\u009e\7?\2\2\u009e\26\3\2\2\2\u009f\u00a0\7>\2\2\u00a0"+
		"\u00a1\7>\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3\u00a4\7@\2\2\u00a4"+
		"\32\3\2\2\2\u00a5\u00a6\7-\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\7/\2\2\u00a8"+
		"\36\3\2\2\2\u00a9\u00aa\7,\2\2\u00aa \3\2\2\2\u00ab\u00ac\7\61\2\2\u00ac"+
		"\"\3\2\2\2\u00ad\u00ae\7\'\2\2\u00ae$\3\2\2\2\u00af\u00b0\7^\2\2\u00b0"+
		"&\3\2\2\2\u00b1\u00b2\7(\2\2\u00b2(\3\2\2\2\u00b3\u00b4\7`\2\2\u00b4*"+
		"\3\2\2\2\u00b5\u00b6\7#\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7A\2\2\u00b8.\3"+
		"\2\2\2\u00b9\u00ba\7<\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\7=\2\2\u00bc\62"+
		"\3\2\2\2\u00bd\u00be\7.\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7~\2\2\u00c0"+
		"\66\3\2\2\2\u00c1\u00c2\7~\2\2\u00c2\u00c3\7~\2\2\u00c38\3\2\2\2\u00c4"+
		"\u00c5\7%\2\2\u00c5:\3\2\2\2\u00c6\u00c7\7B\2\2\u00c7<\3\2\2\2\u00c8\u00c9"+
		"\7?\2\2\u00c9>\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cf\7?\2\2\u00cc\u00cd"+
		"\7>\2\2\u00cd\u00cf\7@\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"@\3\2\2\2\u00d0\u00d1\7\60\2\2\u00d1B\3\2\2\2\u00d2\u00d3\7&\2\2\u00d3"+
		"D\3\2\2\2\u00d4\u00d6\5S*\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00e0\3\2\2\2\u00d9\u00dd\7\60"+
		"\2\2\u00da\u00dc\5S*\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00d9\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00eb\3\2\2\2\u00e2\u00e4\5]"+
		"/\2\u00e3\u00e5\t\2\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e8\5S*\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2"+
		"\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e2"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ff\3\2\2\2\u00ed\u00ef\7\60\2\2"+
		"\u00ee\u00f0\5S*\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00fc\3\2\2\2\u00f3\u00f5\5]/\2\u00f4"+
		"\u00f6\t\2\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00f9\5S*\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00d5\3\2\2\2\u00fe\u00ed\3\2"+
		"\2\2\u00ffF\3\2\2\2\u0100\u0106\7)\2\2\u0101\u0105\n\3\2\2\u0102\u0103"+
		"\7)\2\2\u0103\u0105\7)\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2"+
		"\2\2\u0108\u0106\3\2\2\2\u0109\u0115\7)\2\2\u010a\u0110\7$\2\2\u010b\u010f"+
		"\n\4\2\2\u010c\u010d\7$\2\2\u010d\u010f\7$\2\2\u010e\u010b\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\7$\2\2\u0114"+
		"\u0100\3\2\2\2\u0114\u010a\3\2\2\2\u0115H\3\2\2\2\u0116\u011a\7b\2\2\u0117"+
		"\u0119\13\2\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u011b\3"+
		"\2\2\2\u011a\u0118\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011e\7b\2\2\u011eJ\3\2\2\2\u011f\u0121\t\5\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123L\3\2\2\2"+
		"\u0124\u0125\7\61\2\2\u0125\u0126\7,\2\2\u0126\u012a\3\2\2\2\u0127\u0129"+
		"\13\2\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u012b\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e"+
		"\7,\2\2\u012e\u012f\7\61\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b\'\2\2\u0131"+
		"N\3\2\2\2\u0132\u0134\t\6\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2"+
		"\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138"+
		"\b(\2\2\u0138P\3\2\2\2\u0139\u013b\7\17\2\2\u013a\u013c\7\f\2\2\u013b"+
		"\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013f\7\f"+
		"\2\2\u013e\u0139\3\2\2\2\u013e\u013d\3\2\2\2\u013fR\3\2\2\2\u0140\u0141"+
		"\t\7\2\2\u0141T\3\2\2\2\u0142\u0143\t\b\2\2\u0143V\3\2\2\2\u0144\u0145"+
		"\t\t\2\2\u0145X\3\2\2\2\u0146\u0147\t\n\2\2\u0147Z\3\2\2\2\u0148\u0149"+
		"\t\13\2\2\u0149\\\3\2\2\2\u014a\u014b\t\f\2\2\u014b^\3\2\2\2\u014c\u014d"+
		"\t\r\2\2\u014d`\3\2\2\2\u014e\u014f\t\16\2\2\u014fb\3\2\2\2\u0150\u0151"+
		"\t\17\2\2\u0151d\3\2\2\2\u0152\u0153\t\20\2\2\u0153f\3\2\2\2\u0154\u0155"+
		"\t\21\2\2\u0155h\3\2\2\2\u0156\u0157\t\22\2\2\u0157j\3\2\2\2\u0158\u0159"+
		"\t\23\2\2\u0159l\3\2\2\2\u015a\u015b\t\24\2\2\u015bn\3\2\2\2\u015c\u015d"+
		"\t\25\2\2\u015dp\3\2\2\2\u015e\u015f\t\26\2\2\u015fr\3\2\2\2\u0160\u0161"+
		"\t\27\2\2\u0161t\3\2\2\2\u0162\u0163\t\30\2\2\u0163v\3\2\2\2\u0164\u0165"+
		"\t\31\2\2\u0165x\3\2\2\2\u0166\u0167\t\32\2\2\u0167z\3\2\2\2\u0168\u0169"+
		"\t\33\2\2\u0169|\3\2\2\2\u016a\u016b\t\34\2\2\u016b~\3\2\2\2\u016c\u016d"+
		"\t\35\2\2\u016d\u0080\3\2\2\2\u016e\u016f\t\36\2\2\u016f\u0082\3\2\2\2"+
		"\u0170\u0171\t\37\2\2\u0171\u0084\3\2\2\2\u0172\u0173\t \2\2\u0173\u0086"+
		"\3\2\2\2\u0174\u0175\t!\2\2\u0175\u0088\3\2\2\2\32\2\u00ce\u00d7\u00dd"+
		"\u00e0\u00e4\u00e9\u00eb\u00f1\u00f5\u00fa\u00fc\u00fe\u0104\u0106\u010e"+
		"\u0110\u0114\u011a\u0122\u012a\u0135\u013b\u013e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}