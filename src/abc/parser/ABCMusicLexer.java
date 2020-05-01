// Generated from ABCMusic.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, REST=15, ACCIDENTAL=16, 
    BASENOTE=17, OCTAVE=18, DIGIT=19, OTHERLETTERS=20, SYMBOL=21, WHITESPACE=22, 
    NEWLINE=23;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "T__13", "REST", "ACCIDENTAL", "BASENOTE", 
    "OCTAVE", "DIGIT", "OTHERLETTERS", "SYMBOL", "WHITESPACE", "NEWLINE"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'|'", "'||'", "'[|'", "'|]'", "':|'", "'|:'", "'[1'", "'[2'", 
    "'/'", "'['", "']'", "'('", "'V:'", "'%'", "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, "REST", "ACCIDENTAL", "BASENOTE", "OCTAVE", "DIGIT", 
    "OTHERLETTERS", "SYMBOL", "WHITESPACE", "NEWLINE"
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


      // This method makes the parser stop running if it encounters
      // invalid input and throw a RuntimeException.
      public void reportErrorsAsExceptions() {
          // To prevent any reports to standard error, add this line:
          //removeErrorListeners();
          
          addErrorListener(new BaseErrorListener() {
              public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol, 
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
                  throw new ParseCancellationException(msg, e);
              }
          });
      }


  public ABCMusicLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "ABCMusic.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31v\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
      "\30\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
      "\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
      "\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
      "\21\5\21_\n\21\3\22\3\22\3\23\3\23\3\24\6\24f\n\24\r\24\16\24g\3\25"+
      "\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\5\30s\n\30\5\30u\n\30\2\2"+
      "\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
      "\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\b\4\2CIci\4\2))"+
      "..\3\2\62;\4\2J\\j{\b\2#%((/\61=>@B~~\4\2\13\13\"\"|\2\3\3\2\2\2\2"+
      "\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
      "\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
      "\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
      "\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
      "\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\66\3\2\2\2\t9\3\2\2\2\13<\3\2\2\2"+
      "\r?\3\2\2\2\17B\3\2\2\2\21E\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27L\3"+
      "\2\2\2\31N\3\2\2\2\33P\3\2\2\2\35S\3\2\2\2\37U\3\2\2\2!^\3\2\2\2#"+
      "`\3\2\2\2%b\3\2\2\2\'e\3\2\2\2)i\3\2\2\2+k\3\2\2\2-m\3\2\2\2/t\3\2"+
      "\2\2\61\62\7~\2\2\62\4\3\2\2\2\63\64\7~\2\2\64\65\7~\2\2\65\6\3\2"+
      "\2\2\66\67\7]\2\2\678\7~\2\28\b\3\2\2\29:\7~\2\2:;\7_\2\2;\n\3\2\2"+
      "\2<=\7<\2\2=>\7~\2\2>\f\3\2\2\2?@\7~\2\2@A\7<\2\2A\16\3\2\2\2BC\7"+
      "]\2\2CD\7\63\2\2D\20\3\2\2\2EF\7]\2\2FG\7\64\2\2G\22\3\2\2\2HI\7\61"+
      "\2\2I\24\3\2\2\2JK\7]\2\2K\26\3\2\2\2LM\7_\2\2M\30\3\2\2\2NO\7*\2"+
      "\2O\32\3\2\2\2PQ\7X\2\2QR\7<\2\2R\34\3\2\2\2ST\7\'\2\2T\36\3\2\2\2"+
      "UV\7|\2\2V \3\2\2\2W_\7`\2\2XY\7`\2\2Y_\7`\2\2Z_\7a\2\2[\\\7a\2\2"+
      "\\_\7a\2\2]_\7?\2\2^W\3\2\2\2^X\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^]\3\2"+
      "\2\2_\"\3\2\2\2`a\t\2\2\2a$\3\2\2\2bc\t\3\2\2c&\3\2\2\2df\t\4\2\2"+
      "ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h(\3\2\2\2ij\t\5\2\2j*\3\2"+
      "\2\2kl\t\6\2\2l,\3\2\2\2mn\t\7\2\2n.\3\2\2\2ou\7\f\2\2pr\7\17\2\2"+
      "qs\7\f\2\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2to\3\2\2\2tp\3\2\2\2u\60\3"+
      "\2\2\2\7\2^grt\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}