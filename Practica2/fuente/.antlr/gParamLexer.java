// Generated from c:\Users\tromp\Desktop\PECL2_PPL\0.pl2\gParamLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParamLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_JSON=1, KW_DOT=2, KW_SVG=3, KW_CSV=4, KW_LEN=5, KW_FONTCOLOR=6, KW_FONTNAME=7, 
		KW_FONTSIZE=8, KW_ARROWSIZE=9, KW_ARROWCOLOR=10, KW_PENWIDTH=11, KW_FILLCOLOR=12, 
		KW_STYLE=13, KW_SHAPE=14, KW_EDGE=15, KW_NODE=16, KW_RELA=17, KW_CLASS=18, 
		KW_PROP=19, KW_INHE=20, KW_INDI=21, S_IGUAL=22, S_GUIONB=23, S_COMILLAS=24, 
		ENTERO=25, INTRO=26, WS=27, TEXTOCON=28, TEXTOSIN=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", "KW_LEN", "KW_FONTCOLOR", "KW_FONTNAME", 
		"KW_FONTSIZE", "KW_ARROWSIZE", "KW_ARROWCOLOR", "KW_PENWIDTH", "KW_FILLCOLOR", 
		"KW_STYLE", "KW_SHAPE", "KW_EDGE", "KW_NODE", "KW_RELA", "KW_CLASS", "KW_PROP", 
		"KW_INHE", "KW_INDI", "S_IGUAL", "S_GUIONB", "S_COMILLAS", "ENTERO", "INTRO", 
		"WS", "TEXTOCON", "TEXTOSIN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-JSON'", "'-DOT'", "'-SVG'", "'-CSV'", "'-len'", "'-fontcolor'", 
		"'-fontname'", "'-fontsize'", "'-arrowsize'", "'-arrowcolor'", "'-penwidth'", 
		"'-fillcolor'", "'-style'", "'-shape'", "'edge'", "'node'", "'relationship'", 
		"'class'", "'property'", "'inheritance'", "'indirect_use'", "'='", "'_'", 
		"'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", "KW_LEN", "KW_FONTCOLOR", 
		"KW_FONTNAME", "KW_FONTSIZE", "KW_ARROWSIZE", "KW_ARROWCOLOR", "KW_PENWIDTH", 
		"KW_FILLCOLOR", "KW_STYLE", "KW_SHAPE", "KW_EDGE", "KW_NODE", "KW_RELA", 
		"KW_CLASS", "KW_PROP", "KW_INHE", "KW_INDI", "S_IGUAL", "S_GUIONB", "S_COMILLAS", 
		"ENTERO", "INTRO", "WS", "TEXTOCON", "TEXTOSIN"
	};
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


	public gParamLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gParamLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 27:
			TEXTOCON_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TEXTOCON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0116\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\6\32\u00f7\n\32"+
		"\r\32\16\32\u00f8\3\33\6\33\u00fc\n\33\r\33\16\33\u00fd\3\33\3\33\3\34"+
		"\6\34\u0103\n\34\r\34\16\34\u0104\3\34\3\34\3\35\3\35\6\35\u010b\n\35"+
		"\r\35\16\35\u010c\3\35\3\35\3\35\3\36\6\36\u0113\n\36\r\36\16\36\u0114"+
		"\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37\3\2\6\3\2\62;\4\2\13\f\17\17\5\2\"\"$$??\6\2\"\"$$??aa\2\u011a"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\3=\3\2\2\2\5C\3\2\2\2\7H\3\2\2\2\tM\3\2\2\2\13R\3\2\2\2\rW\3\2"+
		"\2\2\17b\3\2\2\2\21l\3\2\2\2\23v\3\2\2\2\25\u0081\3\2\2\2\27\u008d\3\2"+
		"\2\2\31\u0097\3\2\2\2\33\u00a2\3\2\2\2\35\u00a9\3\2\2\2\37\u00b0\3\2\2"+
		"\2!\u00b5\3\2\2\2#\u00ba\3\2\2\2%\u00c7\3\2\2\2\'\u00cd\3\2\2\2)\u00d6"+
		"\3\2\2\2+\u00e2\3\2\2\2-\u00ef\3\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2"+
		"\63\u00f6\3\2\2\2\65\u00fb\3\2\2\2\67\u0102\3\2\2\29\u0108\3\2\2\2;\u0112"+
		"\3\2\2\2=>\7/\2\2>?\7L\2\2?@\7U\2\2@A\7Q\2\2AB\7P\2\2B\4\3\2\2\2CD\7/"+
		"\2\2DE\7F\2\2EF\7Q\2\2FG\7V\2\2G\6\3\2\2\2HI\7/\2\2IJ\7U\2\2JK\7X\2\2"+
		"KL\7I\2\2L\b\3\2\2\2MN\7/\2\2NO\7E\2\2OP\7U\2\2PQ\7X\2\2Q\n\3\2\2\2RS"+
		"\7/\2\2ST\7n\2\2TU\7g\2\2UV\7p\2\2V\f\3\2\2\2WX\7/\2\2XY\7h\2\2YZ\7q\2"+
		"\2Z[\7p\2\2[\\\7v\2\2\\]\7e\2\2]^\7q\2\2^_\7n\2\2_`\7q\2\2`a\7t\2\2a\16"+
		"\3\2\2\2bc\7/\2\2cd\7h\2\2de\7q\2\2ef\7p\2\2fg\7v\2\2gh\7p\2\2hi\7c\2"+
		"\2ij\7o\2\2jk\7g\2\2k\20\3\2\2\2lm\7/\2\2mn\7h\2\2no\7q\2\2op\7p\2\2p"+
		"q\7v\2\2qr\7u\2\2rs\7k\2\2st\7|\2\2tu\7g\2\2u\22\3\2\2\2vw\7/\2\2wx\7"+
		"c\2\2xy\7t\2\2yz\7t\2\2z{\7q\2\2{|\7y\2\2|}\7u\2\2}~\7k\2\2~\177\7|\2"+
		"\2\177\u0080\7g\2\2\u0080\24\3\2\2\2\u0081\u0082\7/\2\2\u0082\u0083\7"+
		"c\2\2\u0083\u0084\7t\2\2\u0084\u0085\7t\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7y\2\2\u0087\u0088\7e\2\2\u0088\u0089\7q\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7q\2\2\u008b\u008c\7t\2\2\u008c\26\3\2\2\2\u008d\u008e\7/\2\2\u008e"+
		"\u008f\7r\2\2\u008f\u0090\7g\2\2\u0090\u0091\7p\2\2\u0091\u0092\7y\2\2"+
		"\u0092\u0093\7k\2\2\u0093\u0094\7f\2\2\u0094\u0095\7v\2\2\u0095\u0096"+
		"\7j\2\2\u0096\30\3\2\2\2\u0097\u0098\7/\2\2\u0098\u0099\7h\2\2\u0099\u009a"+
		"\7k\2\2\u009a\u009b\7n\2\2\u009b\u009c\7n\2\2\u009c\u009d\7e\2\2\u009d"+
		"\u009e\7q\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7t\2\2"+
		"\u00a1\32\3\2\2\2\u00a2\u00a3\7/\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7"+
		"v\2\2\u00a5\u00a6\7{\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\34"+
		"\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7j\2\2\u00ac"+
		"\u00ad\7c\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7g\2\2\u00af\36\3\2\2\2\u00b0"+
		"\u00b1\7g\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7i\2\2\u00b3\u00b4\7g\2\2"+
		"\u00b4 \3\2\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7f\2"+
		"\2\u00b8\u00b9\7g\2\2\u00b9\"\3\2\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7"+
		"g\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0"+
		"\7k\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7u\2\2\u00c3"+
		"\u00c4\7j\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7r\2\2\u00c6$\3\2\2\2\u00c7"+
		"\u00c8\7e\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7u\2\2"+
		"\u00cb\u00cc\7u\2\2\u00cc&\3\2\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7t\2"+
		"\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3"+
		"\7t\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7{\2\2\u00d5(\3\2\2\2\u00d6\u00d7"+
		"\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7j\2\2\u00d9\u00da\7g\2\2\u00da"+
		"\u00db\7t\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7c\2\2"+
		"\u00de\u00df\7p\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7g\2\2\u00e1*\3\2\2"+
		"\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6"+
		"\7k\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7e\2\2\u00e9"+
		"\u00ea\7v\2\2\u00ea\u00eb\7a\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7u\2\2"+
		"\u00ed\u00ee\7g\2\2\u00ee,\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0.\3\2\2\2\u00f1"+
		"\u00f2\7a\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\7$\2\2\u00f4\62\3\2\2\2\u00f5"+
		"\u00f7\t\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\64\3\2\2\2\u00fa\u00fc\t\3\2\2\u00fb\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\b\33\2\2\u0100\66\3\2\2\2\u0101\u0103\7\"\2"+
		"\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\b\34\2\2\u01078\3\2\2\2\u0108"+
		"\u010a\7$\2\2\u0109\u010b\n\4\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\7$\2\2\u010f\u0110\b\35\3\2\u0110:\3\2\2\2\u0111\u0113\n\5\2\2"+
		"\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115<\3\2\2\2\b\2\u00f8\u00fd\u0104\u010c\u0114\4\b\2\2\3\35"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}