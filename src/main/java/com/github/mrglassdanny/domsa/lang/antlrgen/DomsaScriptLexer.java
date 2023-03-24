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
		Break=1, Case=2, Default=3, Else=4, False=5, For=6, If=7, In=8, Loop=9, 
		Null=10, Return=11, Switch=12, True=13, While=14, LeftParen=15, RightParen=16, 
		LeftBracket=17, RightBracket=18, LeftBrace=19, RightBrace=20, Less=21, 
		LessEqual=22, Greater=23, GreaterEqual=24, Plus=25, PlusPlus=26, Minus=27, 
		MinusMinus=28, Star=29, Div=30, Mod=31, And=32, Or=33, Not=34, Question=35, 
		Colon=36, Comma=37, Assign=38, Equal=39, NotEqual=40, Dot=41, Id=42, Number=43, 
		DigitSequence=44, FormatString=45, String=46, Whitespace=47, Newline=48, 
		BlockComment=49, LineComment=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Break", "Case", "Default", "Else", "False", "For", "If", "In", "Loop", 
			"Null", "Return", "Switch", "True", "While", "LeftParen", "RightParen", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u016c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3"+
		")\3*\3*\3+\3+\3+\7+\u0103\n+\f+\16+\u0106\13+\3,\3,\3-\3-\3.\5.\u010d"+
		"\n.\3.\6.\u0110\n.\r.\16.\u0111\3.\3.\7.\u0116\n.\f.\16.\u0119\13.\5."+
		"\u011b\n.\3/\6/\u011e\n/\r/\16/\u011f\3\60\3\60\3\61\3\61\7\61\u0126\n"+
		"\61\f\61\16\61\u0129\13\61\3\61\3\61\3\62\3\62\3\62\7\62\u0130\n\62\f"+
		"\62\16\62\u0133\13\62\3\62\3\62\3\63\3\63\3\63\5\63\u013a\n\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\6\67\u0147\n\67\r\67"+
		"\16\67\u0148\3\67\3\67\38\38\58\u014f\n8\38\58\u0152\n8\39\39\39\39\7"+
		"9\u0158\n9\f9\169\u015b\139\39\39\39\39\39\3:\3:\3:\3:\7:\u0166\n:\f:"+
		"\16:\u0169\13:\3:\3:\3\u0159\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y\2[-]"+
		"._\2a/c\60e\2g\2i\2k\2m\61o\62q\63s\64\3\2\t\5\2C\\aac|\3\2\62;\n\2$$"+
		"\61\61^^ddhhppttvv\5\2\62;CHch\5\2\2!$$^^\4\2\13\13\"\"\4\2\f\f\17\17"+
		"\2\u0174\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2m\3\2"+
		"\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5{\3\2\2\2\7\u0080\3"+
		"\2\2\2\t\u0088\3\2\2\2\13\u008d\3\2\2\2\r\u0093\3\2\2\2\17\u0097\3\2\2"+
		"\2\21\u009a\3\2\2\2\23\u009d\3\2\2\2\25\u00a2\3\2\2\2\27\u00a7\3\2\2\2"+
		"\31\u00ae\3\2\2\2\33\u00b5\3\2\2\2\35\u00ba\3\2\2\2\37\u00c0\3\2\2\2!"+
		"\u00c2\3\2\2\2#\u00c4\3\2\2\2%\u00c6\3\2\2\2\'\u00c8\3\2\2\2)\u00ca\3"+
		"\2\2\2+\u00cc\3\2\2\2-\u00ce\3\2\2\2/\u00d1\3\2\2\2\61\u00d3\3\2\2\2\63"+
		"\u00d6\3\2\2\2\65\u00d8\3\2\2\2\67\u00db\3\2\2\29\u00dd\3\2\2\2;\u00e0"+
		"\3\2\2\2=\u00e2\3\2\2\2?\u00e4\3\2\2\2A\u00e6\3\2\2\2C\u00ea\3\2\2\2E"+
		"\u00ed\3\2\2\2G\u00ef\3\2\2\2I\u00f1\3\2\2\2K\u00f3\3\2\2\2M\u00f5\3\2"+
		"\2\2O\u00f7\3\2\2\2Q\u00fa\3\2\2\2S\u00fd\3\2\2\2U\u00ff\3\2\2\2W\u0107"+
		"\3\2\2\2Y\u0109\3\2\2\2[\u010c\3\2\2\2]\u011d\3\2\2\2_\u0121\3\2\2\2a"+
		"\u0123\3\2\2\2c\u012c\3\2\2\2e\u0136\3\2\2\2g\u013b\3\2\2\2i\u0141\3\2"+
		"\2\2k\u0143\3\2\2\2m\u0146\3\2\2\2o\u0151\3\2\2\2q\u0153\3\2\2\2s\u0161"+
		"\3\2\2\2uv\7d\2\2vw\7t\2\2wx\7g\2\2xy\7c\2\2yz\7m\2\2z\4\3\2\2\2{|\7e"+
		"\2\2|}\7c\2\2}~\7u\2\2~\177\7g\2\2\177\6\3\2\2\2\u0080\u0081\7f\2\2\u0081"+
		"\u0082\7g\2\2\u0082\u0083\7h\2\2\u0083\u0084\7c\2\2\u0084\u0085\7w\2\2"+
		"\u0085\u0086\7n\2\2\u0086\u0087\7v\2\2\u0087\b\3\2\2\2\u0088\u0089\7g"+
		"\2\2\u0089\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c\n"+
		"\3\2\2\2\u008d\u008e\7h\2\2\u008e\u008f\7c\2\2\u008f\u0090\7n\2\2\u0090"+
		"\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092\f\3\2\2\2\u0093\u0094\7h\2\2\u0094"+
		"\u0095\7q\2\2\u0095\u0096\7t\2\2\u0096\16\3\2\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7h\2\2\u0099\20\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c"+
		"\22\3\2\2\2\u009d\u009e\7n\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7q\2\2\u00a0"+
		"\u00a1\7r\2\2\u00a1\24\3\2\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7w\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7n\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7t\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7t\2\2"+
		"\u00ac\u00ad\7p\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7"+
		"y\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4"+
		"\7j\2\2\u00b4\32\3\2\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8"+
		"\7w\2\2\u00b8\u00b9\7g\2\2\u00b9\34\3\2\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc"+
		"\7j\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7g\2\2\u00bf"+
		"\36\3\2\2\2\u00c0\u00c1\7*\2\2\u00c1 \3\2\2\2\u00c2\u00c3\7+\2\2\u00c3"+
		"\"\3\2\2\2\u00c4\u00c5\7]\2\2\u00c5$\3\2\2\2\u00c6\u00c7\7_\2\2\u00c7"+
		"&\3\2\2\2\u00c8\u00c9\7}\2\2\u00c9(\3\2\2\2\u00ca\u00cb\7\177\2\2\u00cb"+
		"*\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf\u00d0"+
		"\7?\2\2\u00d0.\3\2\2\2\u00d1\u00d2\7@\2\2\u00d2\60\3\2\2\2\u00d3\u00d4"+
		"\7@\2\2\u00d4\u00d5\7?\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7-\2\2\u00d7\64"+
		"\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9\u00da\7-\2\2\u00da\66\3\2\2\2\u00db"+
		"\u00dc\7/\2\2\u00dc8\3\2\2\2\u00dd\u00de\7/\2\2\u00de\u00df\7/\2\2\u00df"+
		":\3\2\2\2\u00e0\u00e1\7,\2\2\u00e1<\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3"+
		">\3\2\2\2\u00e4\u00e5\7\'\2\2\u00e5@\3\2\2\2\u00e6\u00e7\7c\2\2\u00e7"+
		"\u00e8\7p\2\2\u00e8\u00e9\7f\2\2\u00e9B\3\2\2\2\u00ea\u00eb\7q\2\2\u00eb"+
		"\u00ec\7t\2\2\u00ecD\3\2\2\2\u00ed\u00ee\7#\2\2\u00eeF\3\2\2\2\u00ef\u00f0"+
		"\7A\2\2\u00f0H\3\2\2\2\u00f1\u00f2\7<\2\2\u00f2J\3\2\2\2\u00f3\u00f4\7"+
		".\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7?\2\2\u00f6N\3\2\2\2\u00f7\u00f8\7?"+
		"\2\2\u00f8\u00f9\7?\2\2\u00f9P\3\2\2\2\u00fa\u00fb\7#\2\2\u00fb\u00fc"+
		"\7?\2\2\u00fcR\3\2\2\2\u00fd\u00fe\7\60\2\2\u00feT\3\2\2\2\u00ff\u0104"+
		"\5W,\2\u0100\u0103\5W,\2\u0101\u0103\5_\60\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105V\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\5Y-\2\u0108X\3\2\2"+
		"\2\u0109\u010a\t\2\2\2\u010aZ\3\2\2\2\u010b\u010d\5\67\34\2\u010c\u010b"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0110\5]/\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u011a\3\2\2\2\u0113\u0117\5S*\2\u0114\u0116\5]/\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u0113\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\\\3\2\2\2\u011c\u011e\5_\60\2\u011d\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120^\3\2\2\2\u0121"+
		"\u0122\t\3\2\2\u0122`\3\2\2\2\u0123\u0127\7b\2\2\u0124\u0126\5k\66\2\u0125"+
		"\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7b\2\2\u012b"+
		"b\3\2\2\2\u012c\u0131\7$\2\2\u012d\u0130\5e\63\2\u012e\u0130\5k\66\2\u012f"+
		"\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0135\7$\2\2\u0135d\3\2\2\2\u0136\u0139\7^\2\2\u0137\u013a\t\4\2\2\u0138"+
		"\u013a\5g\64\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013af\3\2\2\2"+
		"\u013b\u013c\7w\2\2\u013c\u013d\5i\65\2\u013d\u013e\5i\65\2\u013e\u013f"+
		"\5i\65\2\u013f\u0140\5i\65\2\u0140h\3\2\2\2\u0141\u0142\t\5\2\2\u0142"+
		"j\3\2\2\2\u0143\u0144\n\6\2\2\u0144l\3\2\2\2\u0145\u0147\t\7\2\2\u0146"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b\67\2\2\u014bn\3\2\2\2\u014c\u014e"+
		"\7\17\2\2\u014d\u014f\7\f\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2"+
		"\u014f\u0152\3\2\2\2\u0150\u0152\7\f\2\2\u0151\u014c\3\2\2\2\u0151\u0150"+
		"\3\2\2\2\u0152p\3\2\2\2\u0153\u0154\7\61\2\2\u0154\u0155\7,\2\2\u0155"+
		"\u0159\3\2\2\2\u0156\u0158\13\2\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3"+
		"\2\2\2\u0159\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015d\7,\2\2\u015d\u015e\7\61\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\b9\2\2\u0160r\3\2\2\2\u0161\u0162\7\61\2\2\u0162\u0163"+
		"\7\61\2\2\u0163\u0167\3\2\2\2\u0164\u0166\n\b\2\2\u0165\u0164\3\2\2\2"+
		"\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\b:\2\2\u016bt\3\2\2\2\23\2\u0102"+
		"\u0104\u010c\u0111\u0117\u011a\u011f\u0127\u012f\u0131\u0139\u0148\u014e"+
		"\u0151\u0159\u0167\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}