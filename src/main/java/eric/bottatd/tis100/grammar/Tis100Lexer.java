// Generated from /Users/ebottard/Documents/projects/tis-100/src/main/java/eric/bottard/Tis100.g4 by ANTLR 4.5
package eric.bottatd.tis100.grammar;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, REGISTER=7, PORT=8, INT=9, 
		DIGIT=10, ID=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "REGISTER", "PORT", "INT", 
		"DIGIT", "ID", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16\\\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\62\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tC\n\t\3\n\5\nF\n\n\3\n\3"+
		"\n\5\nJ\n\n\3\n\5\nM\n\n\3\13\3\13\3\f\6\fR\n\f\r\f\16\fS\3\r\6\rW\n\r"+
		"\r\r\16\rX\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\3\2\4\3\2\62;\7\2&&//\62;C\\aad\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2"+
		"\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13%\3\2\2\2\r\'\3\2\2\2\17\61"+
		"\3\2\2\2\21B\3\2\2\2\23E\3\2\2\2\25N\3\2\2\2\27Q\3\2\2\2\31V\3\2\2\2\33"+
		"\34\7\f\2\2\34\4\3\2\2\2\35\36\7%\2\2\36\6\3\2\2\2\37 \7<\2\2 \b\3\2\2"+
		"\2!\"\7O\2\2\"#\7Q\2\2#$\7X\2\2$\n\3\2\2\2%&\7.\2\2&\f\3\2\2\2\'(\7L\2"+
		"\2()\7O\2\2)*\7R\2\2*\16\3\2\2\2+,\7C\2\2,-\7E\2\2-\62\7E\2\2./\7P\2\2"+
		"/\60\7K\2\2\60\62\7N\2\2\61+\3\2\2\2\61.\3\2\2\2\62\20\3\2\2\2\63\64\7"+
		"W\2\2\64C\7R\2\2\65\66\7N\2\2\66\67\7G\2\2\678\7H\2\28C\7V\2\29:\7F\2"+
		"\2:;\7Q\2\2;<\7Y\2\2<C\7P\2\2=>\7T\2\2>?\7K\2\2?@\7I\2\2@A\7J\2\2AC\7"+
		"V\2\2B\63\3\2\2\2B\65\3\2\2\2B9\3\2\2\2B=\3\2\2\2C\22\3\2\2\2DF\7/\2\2"+
		"ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GI\5\25\13\2HJ\5\25\13\2IH\3\2\2\2IJ\3\2"+
		"\2\2JL\3\2\2\2KM\5\25\13\2LK\3\2\2\2LM\3\2\2\2M\24\3\2\2\2NO\t\2\2\2O"+
		"\26\3\2\2\2PR\t\3\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\30\3\2"+
		"\2\2UW\7\"\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\b\r"+
		"\2\2[\32\3\2\2\2\n\2\61BEILSX\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}