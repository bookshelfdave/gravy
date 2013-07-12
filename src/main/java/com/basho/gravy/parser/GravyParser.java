// Generated from ./src/main/java/com/basho/gravy/parser/Gravy.g4 by ANTLR 4.1
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
		COMMA=14, DOT=15, ID=16, INT=17, STRING=18, WS=19;
	public static final String[] tokenNames = {
		"<INVALID>", "'set'", "'counter'", "'register'", "'map'", "'by'", "'add'", 
		"'update'", "'increment'", "'decrement'", "'{'", "'}'", "'('", "')'", 
		"','", "'.'", "ID", "INT", "STRING", "WS"
	};
	public static final int
		RULE_crdt_command = 0, RULE_crdt_scope = 1, RULE_crdt_scope_command = 2, 
		RULE_crdt_add_type = 3, RULE_crdt_type_with_scope = 4, RULE_crdt_incdec_counter = 5, 
		RULE_crdt_initializer = 6, RULE_crdt_type = 7;
	public static final String[] ruleNames = {
		"crdt_command", "crdt_scope", "crdt_scope_command", "crdt_add_type", "crdt_type_with_scope", 
		"crdt_incdec_counter", "crdt_initializer", "crdt_type"
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
		public Crdt_initializerContext crdt_initializer() {
			return getRuleContext(Crdt_initializerContext.class,0);
		}
		public Crdt_scopeContext crdt_scope() {
			return getRuleContext(Crdt_scopeContext.class,0);
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
			setState(18);
			switch (_input.LA(1)) {
			case TYPE_SET:
			case TYPE_COUNTER:
			case TYPE_LWW:
			case TYPE_MAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(16); crdt_initializer();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(17); crdt_scope();
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
		public Crdt_scope_commandContext crdt_scope_command(int i) {
			return getRuleContext(Crdt_scope_commandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GravyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GravyParser.COMMA, i);
		}
		public List<Crdt_scope_commandContext> crdt_scope_command() {
			return getRuleContexts(Crdt_scope_commandContext.class);
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
			setState(20); match(LCURLY);
			setState(21); ((Crdt_scopeContext)_localctx).crdt_scope_command = crdt_scope_command();
			((Crdt_scopeContext)_localctx).cmds.add(((Crdt_scopeContext)_localctx).crdt_scope_command);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(22); match(COMMA);
				setState(23); ((Crdt_scopeContext)_localctx).crdt_scope_command = crdt_scope_command();
				((Crdt_scopeContext)_localctx).cmds.add(((Crdt_scopeContext)_localctx).crdt_scope_command);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29); match(RCURLY);
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
		public Crdt_type_with_scopeContext crdt_type_with_scope() {
			return getRuleContext(Crdt_type_with_scopeContext.class,0);
		}
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
			setState(34);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(31); crdt_add_type();
				}
				break;
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); crdt_incdec_counter();
				}
				break;
			case TYPE_SET:
			case TYPE_COUNTER:
			case TYPE_LWW:
			case TYPE_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(33); crdt_type_with_scope();
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
		public TerminalNode INT() { return getToken(GravyParser.INT, 0); }
		public TerminalNode ID() { return getToken(GravyParser.ID, 0); }
		public Crdt_typeContext crdt_type() {
			return getRuleContext(Crdt_typeContext.class,0);
		}
		public TerminalNode STRING() { return getToken(GravyParser.STRING, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(ADD);
			setState(41);
			switch (_input.LA(1)) {
			case TYPE_SET:
			case TYPE_COUNTER:
			case TYPE_LWW:
			case TYPE_MAP:
				{
				setState(37); crdt_type();
				setState(38); match(ID);
				}
				break;
			case ID:
			case INT:
			case STRING:
				{
				setState(40);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Crdt_type_with_scopeContext extends ParserRuleContext {
		public Crdt_initializerContext crdt_initializer() {
			return getRuleContext(Crdt_initializerContext.class,0);
		}
		public Crdt_scopeContext crdt_scope() {
			return getRuleContext(Crdt_scopeContext.class,0);
		}
		public Crdt_type_with_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crdt_type_with_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).enterCrdt_type_with_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GravyListener ) ((GravyListener)listener).exitCrdt_type_with_scope(this);
		}
	}

	public final Crdt_type_with_scopeContext crdt_type_with_scope() throws RecognitionException {
		Crdt_type_with_scopeContext _localctx = new Crdt_type_with_scopeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_crdt_type_with_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); crdt_initializer();
			setState(44); crdt_scope();
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
		public Token value;
		public TerminalNode INCREMENT() { return getToken(GravyParser.INCREMENT, 0); }
		public TerminalNode INT() { return getToken(GravyParser.INT, 0); }
		public TerminalNode BY() { return getToken(GravyParser.BY, 0); }
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
		enterRule(_localctx, 10, RULE_crdt_incdec_counter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT || _la==DECREMENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(47); match(TYPE_COUNTER);
			setState(48); match(ID);
			setState(49); match(BY);
			setState(50); ((Crdt_incdec_counterContext)_localctx).value = match(INT);
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
		public Token scope_name;
		public TerminalNode ID() { return getToken(GravyParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(GravyParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(GravyParser.LPAREN, 0); }
		public Crdt_typeContext crdt_type() {
			return getRuleContext(Crdt_typeContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_crdt_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); crdt_type();
			setState(53); match(LPAREN);
			setState(55);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(54); ((Crdt_initializerContext)_localctx).scope_name = match(ID);
				}
			}

			setState(57); match(RPAREN);
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
		public TerminalNode TYPE_MAP() { return getToken(GravyParser.TYPE_MAP, 0); }
		public TerminalNode TYPE_SET() { return getToken(GravyParser.TYPE_SET, 0); }
		public TerminalNode TYPE_LWW() { return getToken(GravyParser.TYPE_LWW, 0); }
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
		enterRule(_localctx, 14, RULE_crdt_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\25@\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\5\2\25\n\2"+
		"\3\3\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\4\3\4\3\4\5\4%"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\5\5,\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\5\b:\n\b\3\b\3\b\3\t\3\t\3\t\2\n\2\4\6\b\n\f\16\20\2\5\3"+
		"\2\22\24\3\2\n\13\3\2\3\6=\2\24\3\2\2\2\4\26\3\2\2\2\6$\3\2\2\2\b&\3\2"+
		"\2\2\n-\3\2\2\2\f\60\3\2\2\2\16\66\3\2\2\2\20=\3\2\2\2\22\25\5\16\b\2"+
		"\23\25\5\4\3\2\24\22\3\2\2\2\24\23\3\2\2\2\25\3\3\2\2\2\26\27\7\f\2\2"+
		"\27\34\5\6\4\2\30\31\7\20\2\2\31\33\5\6\4\2\32\30\3\2\2\2\33\36\3\2\2"+
		"\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\r\2\2"+
		" \5\3\2\2\2!%\5\b\5\2\"%\5\f\7\2#%\5\n\6\2$!\3\2\2\2$\"\3\2\2\2$#\3\2"+
		"\2\2%\7\3\2\2\2&+\7\b\2\2\'(\5\20\t\2()\7\22\2\2),\3\2\2\2*,\t\2\2\2+"+
		"\'\3\2\2\2+*\3\2\2\2,\t\3\2\2\2-.\5\16\b\2./\5\4\3\2/\13\3\2\2\2\60\61"+
		"\t\3\2\2\61\62\7\4\2\2\62\63\7\22\2\2\63\64\7\7\2\2\64\65\7\23\2\2\65"+
		"\r\3\2\2\2\66\67\5\20\t\2\679\7\16\2\28:\7\22\2\298\3\2\2\29:\3\2\2\2"+
		":;\3\2\2\2;<\7\17\2\2<\17\3\2\2\2=>\t\4\2\2>\21\3\2\2\2\7\24\34$+9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}