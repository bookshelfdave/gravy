// Generated from ./src/main/java/com/basho/gravy/parser/Gravy.g4 by ANTLR 4.0
package com.basho.gravy.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GravyLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE_SET=1, TYPE_COUNTER=2, TYPE_LWW=3, TYPE_MAP=4, BY=5, ADD=6, UPDATE=7, 
		INCREMENT=8, DECREMENT=9, LCURLY=10, RCURLY=11, LPAREN=12, RPAREN=13, 
		COMMA=14, DOT=15, ID=16, INT=17, FLOAT=18, STRING=19, LINE_COMMENT=20, 
		WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'set'", "'counter'", "'register'", "'map'", "'by'", "'add'", "'update'", 
		"'increment'", "'decrement'", "'{'", "'}'", "'('", "')'", "','", "'.'", 
		"ID", "INT", "FLOAT", "STRING", "LINE_COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"TYPE_SET", "TYPE_COUNTER", "TYPE_LWW", "TYPE_MAP", "BY", "ADD", "UPDATE", 
		"INCREMENT", "DECREMENT", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "COMMA", 
		"DOT", "ID", "INT", "FLOAT", "DIGIT", "STRING", "ESC", "LINE_COMMENT", 
		"WS"
	};


	public GravyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gravy.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 22: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\27\u00bd\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21z\n\21\r\21\16\21{\3\22\6\22\177"+
		"\n\22\r\22\16\22\u0080\3\23\6\23\u0084\n\23\r\23\16\23\u0085\3\23\3\23"+
		"\7\23\u008a\n\23\f\23\16\23\u008d\13\23\3\23\3\23\6\23\u0091\n\23\r\23"+
		"\16\23\u0092\5\23\u0095\n\23\3\24\3\24\3\25\3\25\3\25\7\25\u009c\n\25"+
		"\f\25\16\25\u009f\13\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00a7\n\26"+
		"\3\27\3\27\7\27\u00ab\n\27\f\27\16\27\u00ae\13\27\3\27\5\27\u00b1\n\27"+
		"\3\27\3\27\3\27\3\27\3\30\6\30\u00b8\n\30\r\30\16\30\u00b9\3\30\3\30\4"+
		"\u009d\u00ac\31\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\2\1)\25\1+\2\1-\26\2/\27\3\3\2\4\6\62;C\\aac|\5\13\f\17\17\"\"\u00c6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\65\3\2"+
		"\2\2\7=\3\2\2\2\tF\3\2\2\2\13J\3\2\2\2\rM\3\2\2\2\17Q\3\2\2\2\21X\3\2"+
		"\2\2\23b\3\2\2\2\25l\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33r\3\2\2\2\35t\3"+
		"\2\2\2\37v\3\2\2\2!y\3\2\2\2#~\3\2\2\2%\u0094\3\2\2\2\'\u0096\3\2\2\2"+
		")\u0098\3\2\2\2+\u00a6\3\2\2\2-\u00a8\3\2\2\2/\u00b7\3\2\2\2\61\62\7u"+
		"\2\2\62\63\7g\2\2\63\64\7v\2\2\64\4\3\2\2\2\65\66\7e\2\2\66\67\7q\2\2"+
		"\678\7w\2\289\7p\2\29:\7v\2\2:;\7g\2\2;<\7t\2\2<\6\3\2\2\2=>\7t\2\2>?"+
		"\7g\2\2?@\7i\2\2@A\7k\2\2AB\7u\2\2BC\7v\2\2CD\7g\2\2DE\7t\2\2E\b\3\2\2"+
		"\2FG\7o\2\2GH\7c\2\2HI\7r\2\2I\n\3\2\2\2JK\7d\2\2KL\7{\2\2L\f\3\2\2\2"+
		"MN\7c\2\2NO\7f\2\2OP\7f\2\2P\16\3\2\2\2QR\7w\2\2RS\7r\2\2ST\7f\2\2TU\7"+
		"c\2\2UV\7v\2\2VW\7g\2\2W\20\3\2\2\2XY\7k\2\2YZ\7p\2\2Z[\7e\2\2[\\\7t\2"+
		"\2\\]\7g\2\2]^\7o\2\2^_\7g\2\2_`\7p\2\2`a\7v\2\2a\22\3\2\2\2bc\7f\2\2"+
		"cd\7g\2\2de\7e\2\2ef\7t\2\2fg\7g\2\2gh\7o\2\2hi\7g\2\2ij\7p\2\2jk\7v\2"+
		"\2k\24\3\2\2\2lm\7}\2\2m\26\3\2\2\2no\7\177\2\2o\30\3\2\2\2pq\7*\2\2q"+
		"\32\3\2\2\2rs\7+\2\2s\34\3\2\2\2tu\7.\2\2u\36\3\2\2\2vw\7\60\2\2w \3\2"+
		"\2\2xz\t\2\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\"\3\2\2\2}\177"+
		"\5\'\24\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081$\3\2\2\2\u0082\u0084\5\'\24\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u008b\5\37\20\2\u0088\u008a\5\'\24\2\u0089\u0088\3\2\2\2\u008a\u008d"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0095\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0090\5\37\20\2\u008f\u0091\5\'\24\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0083\3\2\2\2\u0094\u008e\3\2\2\2\u0095&\3\2\2\2"+
		"\u0096\u0097\4\62;\2\u0097(\3\2\2\2\u0098\u009d\7$\2\2\u0099\u009c\5+"+
		"\26\2\u009a\u009c\13\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7$\2\2\u00a1*\3\2\2\2\u00a2\u00a3"+
		"\7^\2\2\u00a3\u00a7\7$\2\2\u00a4\u00a5\7^\2\2\u00a5\u00a7\7^\2\2\u00a6"+
		"\u00a2\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7,\3\2\2\2\u00a8\u00ac\7\'\2\2"+
		"\u00a9\u00ab\13\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b1\7\17\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\u00b3\7\f\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\27\2\2\u00b5"+
		".\3\2\2\2\u00b6\u00b8\t\3\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\b\30\3\2\u00bc\60\3\2\2\2\17\2{\u0080\u0085\u008b\u0092\u0094\u009b\u009d"+
		"\u00a6\u00ac\u00b0\u00b9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}