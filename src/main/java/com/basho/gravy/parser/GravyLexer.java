// Generated from ./src/main/java/com/basho/gravy/parser/Gravy.g4 by ANTLR 4.1
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
		COMMA=14, DOT=15, ID=16, INT=17, STRING=18, WS=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'set'", "'counter'", "'register'", "'map'", "'by'", "'add'", "'update'", 
		"'increment'", "'decrement'", "'{'", "'}'", "'('", "')'", "','", "'.'", 
		"ID", "INT", "STRING", "WS"
	};
	public static final String[] ruleNames = {
		"TYPE_SET", "TYPE_COUNTER", "TYPE_LWW", "TYPE_MAP", "BY", "ADD", "UPDATE", 
		"INCREMENT", "DECREMENT", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "COMMA", 
		"DOT", "ID", "INT", "STRING", "ESC", "WS"
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
		case 19: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\25\u0095\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\7\21u\n\21"+
		"\f\21\16\21x\13\21\3\22\6\22{\n\22\r\22\16\22|\3\23\3\23\3\23\7\23\u0082"+
		"\n\23\f\23\16\23\u0085\13\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u008d"+
		"\n\24\3\25\6\25\u0090\n\25\r\25\16\25\u0091\3\25\3\25\3\u0083\26\3\3\1"+
		"\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31"+
		"\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\2\1)\25\2\3\2\6\4\2"+
		"C\\c|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u0099\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		")\3\2\2\2\3+\3\2\2\2\5/\3\2\2\2\7\67\3\2\2\2\t@\3\2\2\2\13D\3\2\2\2\r"+
		"G\3\2\2\2\17K\3\2\2\2\21R\3\2\2\2\23\\\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2"+
		"\31j\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37p\3\2\2\2!r\3\2\2\2#z\3\2\2\2%"+
		"~\3\2\2\2\'\u008c\3\2\2\2)\u008f\3\2\2\2+,\7u\2\2,-\7g\2\2-.\7v\2\2.\4"+
		"\3\2\2\2/\60\7e\2\2\60\61\7q\2\2\61\62\7w\2\2\62\63\7p\2\2\63\64\7v\2"+
		"\2\64\65\7g\2\2\65\66\7t\2\2\66\6\3\2\2\2\678\7t\2\289\7g\2\29:\7i\2\2"+
		":;\7k\2\2;<\7u\2\2<=\7v\2\2=>\7g\2\2>?\7t\2\2?\b\3\2\2\2@A\7o\2\2AB\7"+
		"c\2\2BC\7r\2\2C\n\3\2\2\2DE\7d\2\2EF\7{\2\2F\f\3\2\2\2GH\7c\2\2HI\7f\2"+
		"\2IJ\7f\2\2J\16\3\2\2\2KL\7w\2\2LM\7r\2\2MN\7f\2\2NO\7c\2\2OP\7v\2\2P"+
		"Q\7g\2\2Q\20\3\2\2\2RS\7k\2\2ST\7p\2\2TU\7e\2\2UV\7t\2\2VW\7g\2\2WX\7"+
		"o\2\2XY\7g\2\2YZ\7p\2\2Z[\7v\2\2[\22\3\2\2\2\\]\7f\2\2]^\7g\2\2^_\7e\2"+
		"\2_`\7t\2\2`a\7g\2\2ab\7o\2\2bc\7g\2\2cd\7p\2\2de\7v\2\2e\24\3\2\2\2f"+
		"g\7}\2\2g\26\3\2\2\2hi\7\177\2\2i\30\3\2\2\2jk\7*\2\2k\32\3\2\2\2lm\7"+
		"+\2\2m\34\3\2\2\2no\7.\2\2o\36\3\2\2\2pq\7\60\2\2q \3\2\2\2rv\t\2\2\2"+
		"su\t\3\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\"\3\2\2\2xv\3\2\2"+
		"\2y{\t\4\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}$\3\2\2\2~\u0083"+
		"\7$\2\2\177\u0082\5\'\24\2\u0080\u0082\13\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7$\2\2\u0087"+
		"&\3\2\2\2\u0088\u0089\7^\2\2\u0089\u008d\7$\2\2\u008a\u008b\7^\2\2\u008b"+
		"\u008d\7^\2\2\u008c\u0088\3\2\2\2\u008c\u008a\3\2\2\2\u008d(\3\2\2\2\u008e"+
		"\u0090\t\5\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\25\2\2\u0094"+
		"*\3\2\2\2\t\2v|\u0081\u0083\u008c\u0091";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}