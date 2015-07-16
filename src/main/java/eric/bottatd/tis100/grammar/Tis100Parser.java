// Generated from /Users/ebottard/Documents/projects/tis-100/src/main/java/eric/bottard/Tis100.g4 by ANTLR 4.5
package eric.bottatd.tis100.grammar;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, REGISTER=7, PORT=8, INT=9, 
		DIGIT=10, ID=11, WS=12;
	public static final int
		RULE_node = 0, RULE_line = 1, RULE_comment = 2, RULE_label = 3, RULE_stmt = 4, 
		RULE_src = 5, RULE_dst = 6;
	public static final String[] ruleNames = {
		"node", "line", "comment", "label", "stmt", "src", "dst"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'#'", "':'", "'MOV'", "','", "'JMP'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "REGISTER", "PORT", "INT", "DIGIT", 
		"ID", "WS"
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
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << ID))) != 0)) {
				{
				setState(14); 
				line();
				}
			}

			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(17); 
				match(T__0);
				setState(18); 
				line();
				}
				}
				setState(23);
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
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
		try {
			setState(30);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); 
				comment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25); 
				label();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26); 
				label();
				setState(27); 
				stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29); 
				stmt();
				}
				break;
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

	public static class CommentContext extends ParserRuleContext {
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			match(T__1);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(33);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__0) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		enterRule(_localctx, 6, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			match(ID);
			setState(40); 
			match(T__2);
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
		public SrcContext src() {
			return getRuleContext(SrcContext.class,0);
		}
		public DstContext dst() {
			return getRuleContext(DstContext.class,0);
		}
		public TerminalNode ID() { return getToken(Tis100Parser.ID, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(49);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); 
				match(T__3);
				setState(43); 
				src();
				setState(44); 
				match(T__4);
				setState(45); 
				dst();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); 
				match(T__5);
				setState(48); 
				match(ID);
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
		public TerminalNode REGISTER() { return getToken(Tis100Parser.REGISTER, 0); }
		public TerminalNode INT() { return getToken(Tis100Parser.INT, 0); }
		public TerminalNode PORT() { return getToken(Tis100Parser.PORT, 0); }
		public SrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_src; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterSrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitSrc(this);
		}
	}

	public final SrcContext src() throws RecognitionException {
		SrcContext _localctx = new SrcContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_src);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REGISTER) | (1L << PORT) | (1L << INT))) != 0)) ) {
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

	public static class DstContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(Tis100Parser.REGISTER, 0); }
		public TerminalNode PORT() { return getToken(Tis100Parser.PORT, 0); }
		public DstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).enterDst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tis100Listener ) ((Tis100Listener)listener).exitDst(this);
		}
	}

	public final DstContext dst() throws RecognitionException {
		DstContext _localctx = new DstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==REGISTER || _la==PORT) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\5\2\22\n\2\3\2\3\2\7\2"+
		"\26\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\7\4"+
		"%\n\4\f\4\16\4(\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\64\n"+
		"\6\3\7\3\7\3\b\3\b\3\b\3&\2\t\2\4\6\b\n\f\16\2\5\3\2\3\3\3\2\t\13\3\2"+
		"\t\n9\2\21\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b)\3\2\2\2\n\63\3\2\2\2\f\65"+
		"\3\2\2\2\16\67\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\21\22\3\2\2\2\22\27"+
		"\3\2\2\2\23\24\7\3\2\2\24\26\5\4\3\2\25\23\3\2\2\2\26\31\3\2\2\2\27\25"+
		"\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\27\3\2\2\2\32!\5\6\4\2\33!\5\b"+
		"\5\2\34\35\5\b\5\2\35\36\5\n\6\2\36!\3\2\2\2\37!\5\n\6\2 \32\3\2\2\2 "+
		"\33\3\2\2\2 \34\3\2\2\2 \37\3\2\2\2!\5\3\2\2\2\"&\7\4\2\2#%\n\2\2\2$#"+
		"\3\2\2\2%(\3\2\2\2&\'\3\2\2\2&$\3\2\2\2\'\7\3\2\2\2(&\3\2\2\2)*\7\r\2"+
		"\2*+\7\5\2\2+\t\3\2\2\2,-\7\6\2\2-.\5\f\7\2./\7\7\2\2/\60\5\16\b\2\60"+
		"\64\3\2\2\2\61\62\7\b\2\2\62\64\7\r\2\2\63,\3\2\2\2\63\61\3\2\2\2\64\13"+
		"\3\2\2\2\65\66\t\3\2\2\66\r\3\2\2\2\678\t\4\2\28\17\3\2\2\2\7\21\27 &"+
		"\63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}