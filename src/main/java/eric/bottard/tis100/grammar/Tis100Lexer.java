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
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Tis100Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, REGISTER=16, 
		PORT=17, COMMENT=18, INT=19, DIGIT=20, ID=21, WS=22, NEWLINE=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "REGISTER", "PORT", 
		"COMMENT", "INT", "DIGIT", "ID", "WS", "NEWLINE"
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


	public Tis100Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tis100.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21p\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0088\n\22\3\23\3\23\7\23"+
		"\u008c\n\23\f\23\16\23\u008f\13\23\3\24\5\24\u0092\n\24\3\24\3\24\5\24"+
		"\u0096\n\24\3\24\5\24\u0099\n\24\3\25\3\25\3\26\6\26\u009e\n\26\r\26\16"+
		"\26\u009f\3\27\6\27\u00a3\n\27\r\27\16\27\u00a4\3\27\3\27\3\30\3\30\2"+
		"\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\5\3\2\f\f\3\2\62;\7\2&"+
		"&//\62;C\\aa\u00b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\67\3\2\2\2\t;\3\2\2\2\13"+
		"=\3\2\2\2\rA\3\2\2\2\17E\3\2\2\2\21I\3\2\2\2\23M\3\2\2\2\25Q\3\2\2\2\27"+
		"U\3\2\2\2\31Y\3\2\2\2\33]\3\2\2\2\35a\3\2\2\2\37e\3\2\2\2!o\3\2\2\2#\u0087"+
		"\3\2\2\2%\u0089\3\2\2\2\'\u0091\3\2\2\2)\u009a\3\2\2\2+\u009d\3\2\2\2"+
		"-\u00a2\3\2\2\2/\u00a8\3\2\2\2\61\62\7<\2\2\62\4\3\2\2\2\63\64\7P\2\2"+
		"\64\65\7Q\2\2\65\66\7R\2\2\66\6\3\2\2\2\678\7O\2\289\7Q\2\29:\7X\2\2:"+
		"\b\3\2\2\2;<\7.\2\2<\n\3\2\2\2=>\7U\2\2>?\7Y\2\2?@\7R\2\2@\f\3\2\2\2A"+
		"B\7U\2\2BC\7C\2\2CD\7X\2\2D\16\3\2\2\2EF\7C\2\2FG\7F\2\2GH\7F\2\2H\20"+
		"\3\2\2\2IJ\7U\2\2JK\7W\2\2KL\7D\2\2L\22\3\2\2\2MN\7P\2\2NO\7G\2\2OP\7"+
		"I\2\2P\24\3\2\2\2QR\7L\2\2RS\7O\2\2ST\7R\2\2T\26\3\2\2\2UV\7L\2\2VW\7"+
		"G\2\2WX\7\\\2\2X\30\3\2\2\2YZ\7L\2\2Z[\7P\2\2[\\\7\\\2\2\\\32\3\2\2\2"+
		"]^\7L\2\2^_\7I\2\2_`\7\\\2\2`\34\3\2\2\2ab\7L\2\2bc\7N\2\2cd\7\\\2\2d"+
		"\36\3\2\2\2ef\7L\2\2fg\7T\2\2gh\7Q\2\2h \3\2\2\2ij\7C\2\2jk\7E\2\2kp\7"+
		"E\2\2lm\7P\2\2mn\7K\2\2np\7N\2\2oi\3\2\2\2ol\3\2\2\2p\"\3\2\2\2qr\7W\2"+
		"\2r\u0088\7R\2\2st\7N\2\2tu\7G\2\2uv\7H\2\2v\u0088\7V\2\2wx\7F\2\2xy\7"+
		"Q\2\2yz\7Y\2\2z\u0088\7P\2\2{|\7T\2\2|}\7K\2\2}~\7I\2\2~\177\7J\2\2\177"+
		"\u0088\7V\2\2\u0080\u0081\7C\2\2\u0081\u0082\7P\2\2\u0082\u0088\7[\2\2"+
		"\u0083\u0084\7N\2\2\u0084\u0085\7C\2\2\u0085\u0086\7U\2\2\u0086\u0088"+
		"\7V\2\2\u0087q\3\2\2\2\u0087s\3\2\2\2\u0087w\3\2\2\2\u0087{\3\2\2\2\u0087"+
		"\u0080\3\2\2\2\u0087\u0083\3\2\2\2\u0088$\3\2\2\2\u0089\u008d\7%\2\2\u008a"+
		"\u008c\n\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e&\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092"+
		"\7/\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\5)\25\2\u0094\u0096\5)\25\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5)\25\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099(\3\2\2\2\u009a\u009b\t\3\2\2\u009b*\3\2\2\2\u009c"+
		"\u009e\t\4\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0,\3\2\2\2\u00a1\u00a3\7\"\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\b\27\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7\f\2\2"+
		"\u00a9\60\3\2\2\2\13\2o\u0087\u008d\u0091\u0095\u0098\u009f\u00a4\3\b"+
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
