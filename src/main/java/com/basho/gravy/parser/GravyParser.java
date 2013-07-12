// Generated from ./src/main/java/com/basho/gravy/parser/Gravy.g4 by ANTLR 4.0
package com.basho.gravy.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GravyParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE_SET=1, TYPE_COUNTER=2, TYPE_LWW=3, TYPE_MAP=4, BY=5, ADD=6, UPDATE=7, 
		INCREMENT=8, DECREMENT=9, LCURLY=10, RCURLY=11, LPAREN=12, RPAREN=13, 
		COMMA=14, DOT=15, ID=16, INT=17, FLOAT=18, STRING=19, LINE_COMMENT=20, 
		WS=21;
	public static final String[] tokenNames = {
		"<INVALID>", "'set'", "'counter'", "'register'", "'map'", "'by'", "'add'", 
		"'update'", "'increment'", "'decrement'", "'{'", "'}'", "'('", "')'", 
		"','", "'.'", "ID", "INT", "FLOAT", "STRING", "LINE_COMMENT", "WS"
	};
	public static final int
		RULE_crdt_command = 0, RULE_crdt_scope = 1, RULE_crdt_scope_command = 2, 
		RULE_crdt_add_type = 3, RULE_crdt_incdec_counter = 4, RULE_crdt_initializer = 5, 
		RULE_crdt_type = 6;
	public static final String[] ruleNames = {
		"crdt_command", "crdt_scope", "crdt_scope_command", "crdt_add_type", "crdt_incdec_counter", 
		"crdt_initializer", "crdt_type"
	};

	@Override
	public String getGrammarFileName() { return "Gravy.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GravyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Crdt_commandContext extends ParserRuleContext {
		public Crdt_scopeContext crdt_scope() {
			return getRuleContext(Crdt_scopeContext.class,0);
		}
		public Crdt_initializerContext crdt_initializer() {
			return getRuleContext(Crdt_initializerContext.class,0);
		}
		public Crdt_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crdt_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).enterCrdt_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).exitCrdt_command(this);
		}
	}

	public final Crdt_commandContext crdt_command() throws RecognitionException {
		Crdt_commandContext _localctx = new Crdt_commandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_crdt_command);
		try {
			setState(16);
			switch (_input.LA(1)) {
			case TYPE_SET:
			case TYPE_COUNTER:
			case TYPE_LWW:
			case TYPE_MAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(14); crdt_initializer();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(15); crdt_scope();
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

	public static class Crdt_scopeContext extends ParserRuleContext {
		public Crdt_scope_commandContext crdt_scope_command;
		public List<Crdt_scope_commandContext> cmds = new ArrayList<Crdt_scope_commandContext>();
		public TerminalNode LCURLY() { return getToken(GravyParser.LCURLY, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(GravyParser.COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GravyParser.COMMA); }
		public List<Crdt_scope_commandContext> crdt_scope_command() {
			return getRuleContexts(Crdt_scope_commandContext.class);
		}
		public Crdt_scope_commandContext crdt_scope_command(int i) {
			return getRuleContext(Crdt_scope_commandContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(GravyParser.RCURLY, 0); }
		public Crdt_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crdt_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).enterCrdt_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).exitCrdt_scope(this);
		}
	}

	public final Crdt_scopeContext crdt_scope() throws RecognitionException {
		Crdt_scopeContext _localctx = new Crdt_scopeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_crdt_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); match(LCURLY);
			setState(19); ((Crdt_scopeContext)_localctx).crdt_scope_command = crdt_scope_command();
			((Crdt_scopeContext)_localctx).cmds.add(((Crdt_scopeContext)_localctx).crdt_scope_command);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(20); match(COMMA);
				setState(21); ((Crdt_scopeContext)_localctx).crdt_scope_command = crdt_scope_command();
				((Crdt_scopeContext)_localctx).cmds.add(((Crdt_scopeContext)_localctx).crdt_scope_command);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27); match(RCURLY);
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

	public static class Crdt_scope_commandContext extends ParserRuleContext {
		public Crdt_incdec_counterContext crdt_incdec_counter() {
			return getRuleContext(Crdt_incdec_counterContext.class,0);
		}
		public Crdt_add_typeContext crdt_add_type() {
			return getRuleContext(Crdt_add_typeContext.class,0);
		}
		public Crdt_scope_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crdt_scope_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).enterCrdt_scope_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).exitCrdt_scope_command(this);
		}
	}

	public final Crdt_scope_commandContext crdt_scope_command() throws RecognitionException {
		Crdt_scope_commandContext _localctx = new Crdt_scope_commandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_crdt_scope_command);
		try {
			setState(31);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(29); crdt_add_type();
				}
				break;
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(30); crdt_incdec_counter();
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

	public static class Crdt_add_typeContext extends ParserRuleContext {
		public Crdt_typeContext crdt_type() {
			return getRuleContext(Crdt_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GravyParser.ID, 0); }
		public TerminalNode ADD() { return getToken(GravyParser.ADD, 0); }
		public Crdt_add_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crdt_add_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).enterCrdt_add_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).exitCrdt_add_type(this);
		}
	}

	public final Crdt_add_typeContext crdt_add_type() throws RecognitionException {
		Crdt_add_typeContext _localctx = new Crdt_add_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_crdt_add_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(ADD);
			setState(34); crdt_type();
			setState(35); match(ID);
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

	public static class Crdt_incdec_counterContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(GravyParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(GravyParser.BY, 0); }
		public TerminalNode INT() { return getToken(GravyParser.INT, 0); }
		public TerminalNode ID() { return getToken(GravyParser.ID, 0); }
		public TerminalNode DECREMENT() { return getToken(GravyParser.DECREMENT, 0); }
		public TerminalNode TYPE_COUNTER() { return getToken(GravyParser.TYPE_COUNTER, 0); }
		public Crdt_incdec_counterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crdt_incdec_counter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).enterCrdt_incdec_counter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).exitCrdt_incdec_counter(this);
		}
	}

	public final Crdt_incdec_counterContext crdt_incdec_counter() throws RecognitionException {
		Crdt_incdec_counterContext _localctx = new Crdt_incdec_counterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_crdt_incdec_counter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT || _la==DECREMENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(38); match(TYPE_COUNTER);
			setState(39); match(ID);
			setState(40); match(BY);
			setState(41); match(INT);
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

	public static class Crdt_initializerContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(GravyParser.RPAREN, 0); }
		public Crdt_typeContext crdt_type() {
			return getRuleContext(Crdt_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GravyParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(GravyParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(GravyParser.STRING, 0); }
		public Crdt_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crdt_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).enterCrdt_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).exitCrdt_initializer(this);
		}
	}

	public final Crdt_initializerContext crdt_initializer() throws RecognitionException {
		Crdt_initializerContext _localctx = new Crdt_initializerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_crdt_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); crdt_type();
			setState(44); match(LPAREN);
			setState(46);
			_la = _input.LA(1);
			if (_la==ID || _la==STRING) {
				{
				setState(45);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(48); match(RPAREN);
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

	public static class Crdt_typeContext extends ParserRuleContext {
		public TerminalNode TYPE_LWW() { return getToken(GravyParser.TYPE_LWW, 0); }
		public TerminalNode TYPE_MAP() { return getToken(GravyParser.TYPE_MAP, 0); }
		public TerminalNode TYPE_SET() { return getToken(GravyParser.TYPE_SET, 0); }
		public TerminalNode TYPE_COUNTER() { return getToken(GravyParser.TYPE_COUNTER, 0); }
		public Crdt_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crdt_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).enterCrdt_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).exitCrdt_type(this);
		}
	}

	public final Crdt_typeContext crdt_type() throws RecognitionException {
		Crdt_typeContext _localctx = new Crdt_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_crdt_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_SET) | (1L << TYPE_COUNTER) | (1L << TYPE_LWW) | (1L << TYPE_MAP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\2\3\27\67\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2"+
		"\3\2\5\2\23\n\2\3\3\3\3\3\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\3\3\3"+
		"\4\3\4\5\4\"\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5"+
		"\7\61\n\7\3\7\3\7\3\b\3\b\3\b\2\t\2\4\6\b\n\f\16\2\5\3\n\13\4\22\22\25"+
		"\25\3\3\6\63\2\22\3\2\2\2\4\24\3\2\2\2\6!\3\2\2\2\b#\3\2\2\2\n\'\3\2\2"+
		"\2\f-\3\2\2\2\16\64\3\2\2\2\20\23\5\f\7\2\21\23\5\4\3\2\22\20\3\2\2\2"+
		"\22\21\3\2\2\2\23\3\3\2\2\2\24\25\7\f\2\2\25\32\5\6\4\2\26\27\7\20\2\2"+
		"\27\31\5\6\4\2\30\26\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2"+
		"\33\35\3\2\2\2\34\32\3\2\2\2\35\36\7\r\2\2\36\5\3\2\2\2\37\"\5\b\5\2 "+
		"\"\5\n\6\2!\37\3\2\2\2! \3\2\2\2\"\7\3\2\2\2#$\7\b\2\2$%\5\16\b\2%&\7"+
		"\22\2\2&\t\3\2\2\2\'(\t\2\2\2()\7\4\2\2)*\7\22\2\2*+\7\7\2\2+,\7\23\2"+
		"\2,\13\3\2\2\2-.\5\16\b\2.\60\7\16\2\2/\61\t\3\2\2\60/\3\2\2\2\60\61\3"+
		"\2\2\2\61\62\3\2\2\2\62\63\7\17\2\2\63\r\3\2\2\2\64\65\t\4\2\2\65\17\3"+
		"\2\2\2\6\22\32!\60";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}