/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated from /Users/ebottard/Documents/projects/tis-100/src/main/java/eric/bottard/Tis100.g4 by ANTLR 4.5
package eric.bottard.tis100.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Tis100Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, REGISTER=16, 
		PORT=17, COMMENT=18, INT=19, DIGIT=20, ID=21, WS=22, NEWLINE=23;
	public static final int
		RULE_node = 0, RULE_line = 1, RULE_label = 2, RULE_stmt = 3, RULE_src = 4, 
		RULE_dst = 5;
	public static final String[] ruleNames = {
		"node", "line", "label", "stmt", "src", "dst"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'NOP'", "'MOV'", "','", "'SWP'", "'SAV'", "'ADD'", "'SUB'", 
		"'NEG'", "'JMP'", "'JEZ'", "'JNZ'", "'JGZ'", "'JLZ'", "'JRO'", null, null, 
		null, null, null, null, null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "REGISTER", "PORT", "COMMENT", "INT", "DIGIT", 
		"ID", "WS", "NEWLINE"
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Tis100.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Tis100Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NodeContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitNode(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << COMMENT) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(12); 
				line();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(Tis100Parser.NEWLINE, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(Tis100Parser.COMMENT, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(18); 
				label();
				}
			}

			setState(22);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(21); 
				stmt();
				}
			}

			setState(25);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(24); 
				match(COMMENT);
				}
			}

			setState(27); 
			match(NEWLINE);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Tis100Parser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			match(ID);
			setState(30); 
			match(T__0);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JNZContext extends StmtContext {
		public TerminalNode ID() { return getToken(Tis100Parser.ID, 0); }
		public JNZContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterJNZ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitJNZ(this);
		}
	}
	public static class JLZContext extends StmtContext {
		public TerminalNode ID() { return getToken(Tis100Parser.ID, 0); }
		public JLZContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterJLZ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitJLZ(this);
		}
	}
	public static class NOPContext extends StmtContext {
		public NOPContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterNOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitNOP(this);
		}
	}
	public static class NEGContext extends StmtContext {
		public NEGContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterNEG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitNEG(this);
		}
	}
	public static class SUBContext extends StmtContext {
		public SrcContext src() {
			return getRuleContext(SrcContext.class,0);
		}
		public SUBContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterSUB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitSUB(this);
		}
	}
	public static class JEZContext extends StmtContext {
		public TerminalNode ID() { return getToken(Tis100Parser.ID, 0); }
		public JEZContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterJEZ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitJEZ(this);
		}
	}
	public static class JROContext extends StmtContext {
		public SrcContext src() {
			return getRuleContext(SrcContext.class,0);
		}
		public JROContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterJRO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitJRO(this);
		}
	}
	public static class JMPContext extends StmtContext {
		public TerminalNode ID() { return getToken(Tis100Parser.ID, 0); }
		public JMPContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterJMP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitJMP(this);
		}
	}
	public static class SAVContext extends StmtContext {
		public SAVContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterSAV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitSAV(this);
		}
	}
	public static class SWPContext extends StmtContext {
		public SWPContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterSWP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitSWP(this);
		}
	}
	public static class JGZContext extends StmtContext {
		public TerminalNode ID() { return getToken(Tis100Parser.ID, 0); }
		public JGZContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterJGZ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitJGZ(this);
		}
	}
	public static class MOVContext extends StmtContext {
		public SrcContext src() {
			return getRuleContext(SrcContext.class,0);
		}
		public DstContext dst() {
			return getRuleContext(DstContext.class,0);
		}
		public MOVContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterMOV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitMOV(this);
		}
	}
	public static class ADDContext extends StmtContext {
		public SrcContext src() {
			return getRuleContext(SrcContext.class,0);
		}
		public ADDContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterADD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitADD(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new NOPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32); 
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new MOVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33); 
				match(T__2);
				setState(34); 
				src();
				setState(35); 
				match(T__3);
				setState(36); 
				dst();
				}
				break;
			case T__4:
				_localctx = new SWPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38); 
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new SAVContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39); 
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new ADDContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(40); 
				match(T__6);
				setState(41); 
				src();
				}
				break;
			case T__7:
				_localctx = new SUBContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(42); 
				match(T__7);
				setState(43); 
				src();
				}
				break;
			case T__8:
				_localctx = new NEGContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(44); 
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new JMPContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(45); 
				match(T__9);
				setState(46); 
				match(ID);
				}
				break;
			case T__10:
				_localctx = new JEZContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(47); 
				match(T__10);
				setState(48); 
				match(ID);
				}
				break;
			case T__11:
				_localctx = new JNZContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(49); 
				match(T__11);
				setState(50); 
				match(ID);
				}
				break;
			case T__12:
				_localctx = new JGZContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(51); 
				match(T__12);
				setState(52); 
				match(ID);
				}
				break;
			case T__13:
				_localctx = new JLZContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(53); 
				match(T__13);
				setState(54); 
				match(ID);
				}
				break;
			case T__14:
				_localctx = new JROContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(55); 
				match(T__14);
				setState(56); 
				src();
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

	public static class SrcContext extends ParserRuleContext {
		public SrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_src; }
	 
		public SrcContext() { }
		public void copyFrom(SrcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SourceIntContext extends SrcContext {
		public TerminalNode INT() { return getToken(Tis100Parser.INT, 0); }
		public SourceIntContext(SrcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterSourceInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitSourceInt(this);
		}
	}
	public static class SourcePortContext extends SrcContext {
		public TerminalNode PORT() { return getToken(Tis100Parser.PORT, 0); }
		public SourcePortContext(SrcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterSourcePort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitSourcePort(this);
		}
	}
	public static class SourceRegisterContext extends SrcContext {
		public TerminalNode REGISTER() { return getToken(Tis100Parser.REGISTER, 0); }
		public SourceRegisterContext(SrcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterSourceRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitSourceRegister(this);
		}
	}

	public final SrcContext src() throws RecognitionException {
		SrcContext _localctx = new SrcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_src);
		try {
			setState(62);
			switch (_input.LA(1)) {
			case REGISTER:
				_localctx = new SourceRegisterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59); 
				match(REGISTER);
				}
				break;
			case INT:
				_localctx = new SourceIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60); 
				match(INT);
				}
				break;
			case PORT:
				_localctx = new SourcePortContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61); 
				match(PORT);
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

	public static class DstContext extends ParserRuleContext {
		public DstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dst; }
	 
		public DstContext() { }
		public void copyFrom(DstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DestinationRegisterContext extends DstContext {
		public TerminalNode REGISTER() { return getToken(Tis100Parser.REGISTER, 0); }
		public DestinationRegisterContext(DstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterDestinationRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitDestinationRegister(this);
		}
	}
	public static class DestinationPortContext extends DstContext {
		public TerminalNode PORT() { return getToken(Tis100Parser.PORT, 0); }
		public DestinationPortContext(DstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterDestinationPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitDestinationPort(this);
		}
	}

	public final DstContext dst() throws RecognitionException {
		DstContext _localctx = new DstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dst);
		try {
			setState(66);
			switch (_input.LA(1)) {
			case REGISTER:
				_localctx = new DestinationRegisterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64); 
				match(REGISTER);
				}
				break;
			case PORT:
				_localctx = new DestinationPortContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65); 
				match(PORT);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\3"+
		"\5\3\26\n\3\3\3\5\3\31\n\3\3\3\5\3\34\n\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\5\6A\n\6\3\7\3\7\5\7E\n\7"+
		"\3\7\2\2\b\2\4\6\b\n\f\2\2S\2\21\3\2\2\2\4\25\3\2\2\2\6\37\3\2\2\2\b;"+
		"\3\2\2\2\n@\3\2\2\2\fD\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2"+
		"\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\21\3\2\2\2\24\26\5\6\4"+
		"\2\25\24\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\31\5\b\5\2\30\27\3\2\2"+
		"\2\30\31\3\2\2\2\31\33\3\2\2\2\32\34\7\24\2\2\33\32\3\2\2\2\33\34\3\2"+
		"\2\2\34\35\3\2\2\2\35\36\7\31\2\2\36\5\3\2\2\2\37 \7\27\2\2 !\7\3\2\2"+
		"!\7\3\2\2\2\"<\7\4\2\2#$\7\5\2\2$%\5\n\6\2%&\7\6\2\2&\'\5\f\7\2\'<\3\2"+
		"\2\2(<\7\7\2\2)<\7\b\2\2*+\7\t\2\2+<\5\n\6\2,-\7\n\2\2-<\5\n\6\2.<\7\13"+
		"\2\2/\60\7\f\2\2\60<\7\27\2\2\61\62\7\r\2\2\62<\7\27\2\2\63\64\7\16\2"+
		"\2\64<\7\27\2\2\65\66\7\17\2\2\66<\7\27\2\2\678\7\20\2\28<\7\27\2\29:"+
		"\7\21\2\2:<\5\n\6\2;\"\3\2\2\2;#\3\2\2\2;(\3\2\2\2;)\3\2\2\2;*\3\2\2\2"+
		";,\3\2\2\2;.\3\2\2\2;/\3\2\2\2;\61\3\2\2\2;\63\3\2\2\2;\65\3\2\2\2;\67"+
		"\3\2\2\2;9\3\2\2\2<\t\3\2\2\2=A\7\22\2\2>A\7\25\2\2?A\7\23\2\2@=\3\2\2"+
		"\2@>\3\2\2\2@?\3\2\2\2A\13\3\2\2\2BE\7\22\2\2CE\7\23\2\2DB\3\2\2\2DC\3"+
		"\2\2\2E\r\3\2\2\2\t\21\25\30\33;@D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
