// Generated from ABCHeader.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCHeaderParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    TEXT=10, NEWLINE=11;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_index = 2, RULE_title = 3, RULE_optional = 4, 
    RULE_composer = 5, RULE_duration = 6, RULE_meter = 7, RULE_tempo = 8, 
    RULE_voice = 9, RULE_key = 10, RULE_comment = 11, RULE_eol = 12;
  public static final String[] ruleNames = {
    "root", "header", "index", "title", "optional", "composer", "duration", 
    "meter", "tempo", "voice", "key", "comment", "eol"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
    "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, "TEXT", 
    "NEWLINE"
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

  @Override
  public String getGrammarFileName() { return "ABCHeader.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


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

  public ABCHeaderParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public HeaderContext header() {
      return getRuleContext(HeaderContext.class,0);
    }
    public TerminalNode EOF() { return getToken(ABCHeaderParser.EOF, 0); }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(26);
      header();
      setState(27);
      match(EOF);
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

  public static class HeaderContext extends ParserRuleContext {
    public IndexContext index() {
      return getRuleContext(IndexContext.class,0);
    }
    public TitleContext title() {
      return getRuleContext(TitleContext.class,0);
    }
    public KeyContext key() {
      return getRuleContext(KeyContext.class,0);
    }
    public List<CommentContext> comment() {
      return getRuleContexts(CommentContext.class);
    }
    public CommentContext comment(int i) {
      return getRuleContext(CommentContext.class,i);
    }
    public List<OptionalContext> optional() {
      return getRuleContexts(OptionalContext.class);
    }
    public OptionalContext optional(int i) {
      return getRuleContext(OptionalContext.class,i);
    }
    public HeaderContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_header; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterHeader(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitHeader(this);
    }
  }

  public final HeaderContext header() throws RecognitionException {
    HeaderContext _localctx = new HeaderContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_header);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(29);
      index();
      setState(33);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__8) {
        {
        {
        setState(30);
        comment();
        }
        }
        setState(35);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(36);
      title();
      setState(40);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8))) != 0)) {
        {
        {
        setState(37);
        optional();
        }
        }
        setState(42);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(43);
      key();
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

  public static class IndexContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(ABCHeaderParser.TEXT, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public IndexContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_index; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterIndex(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitIndex(this);
    }
  }

  public final IndexContext index() throws RecognitionException {
    IndexContext _localctx = new IndexContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_index);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(45);
      match(T__0);
      setState(46);
      match(TEXT);
      setState(47);
      eol();
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

  public static class TitleContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(ABCHeaderParser.TEXT, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public TitleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_title; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterTitle(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitTitle(this);
    }
  }

  public final TitleContext title() throws RecognitionException {
    TitleContext _localctx = new TitleContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_title);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(49);
      match(T__1);
      setState(50);
      match(TEXT);
      setState(51);
      eol();
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

  public static class OptionalContext extends ParserRuleContext {
    public ComposerContext composer() {
      return getRuleContext(ComposerContext.class,0);
    }
    public DurationContext duration() {
      return getRuleContext(DurationContext.class,0);
    }
    public MeterContext meter() {
      return getRuleContext(MeterContext.class,0);
    }
    public TempoContext tempo() {
      return getRuleContext(TempoContext.class,0);
    }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public VoiceContext voice() {
      return getRuleContext(VoiceContext.class,0);
    }
    public OptionalContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_optional; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterOptional(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitOptional(this);
    }
  }

  public final OptionalContext optional() throws RecognitionException {
    OptionalContext _localctx = new OptionalContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_optional);
    try {
      setState(59);
      switch (_input.LA(1)) {
      case T__2:
        enterOuterAlt(_localctx, 1);
        {
        setState(53);
        composer();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(54);
        duration();
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 3);
        {
        setState(55);
        meter();
        }
        break;
      case T__5:
        enterOuterAlt(_localctx, 4);
        {
        setState(56);
        tempo();
        }
        break;
      case T__8:
        enterOuterAlt(_localctx, 5);
        {
        setState(57);
        comment();
        }
        break;
      case T__6:
        enterOuterAlt(_localctx, 6);
        {
        setState(58);
        voice();
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

  public static class ComposerContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(ABCHeaderParser.TEXT, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public ComposerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_composer; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterComposer(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitComposer(this);
    }
  }

  public final ComposerContext composer() throws RecognitionException {
    ComposerContext _localctx = new ComposerContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_composer);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(61);
      match(T__2);
      setState(62);
      match(TEXT);
      setState(63);
      eol();
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

  public static class DurationContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(ABCHeaderParser.TEXT, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public DurationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_duration; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterDuration(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitDuration(this);
    }
  }

  public final DurationContext duration() throws RecognitionException {
    DurationContext _localctx = new DurationContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_duration);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(65);
      match(T__3);
      setState(66);
      match(TEXT);
      setState(67);
      eol();
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

  public static class MeterContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(ABCHeaderParser.TEXT, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public MeterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_meter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterMeter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitMeter(this);
    }
  }

  public final MeterContext meter() throws RecognitionException {
    MeterContext _localctx = new MeterContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_meter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(69);
      match(T__4);
      setState(70);
      match(TEXT);
      setState(71);
      eol();
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

  public static class TempoContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(ABCHeaderParser.TEXT, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public TempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterTempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitTempo(this);
    }
  }

  public final TempoContext tempo() throws RecognitionException {
    TempoContext _localctx = new TempoContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_tempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(73);
      match(T__5);
      setState(74);
      match(TEXT);
      setState(75);
      eol();
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

  public static class VoiceContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(ABCHeaderParser.TEXT, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public VoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_voice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(77);
      match(T__6);
      setState(78);
      match(TEXT);
      setState(79);
      eol();
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

  public static class KeyContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(ABCHeaderParser.TEXT, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public KeyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterKey(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitKey(this);
    }
  }

  public final KeyContext key() throws RecognitionException {
    KeyContext _localctx = new KeyContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_key);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(81);
      match(T__7);
      setState(82);
      match(TEXT);
      setState(83);
      eol();
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
    public TerminalNode TEXT() { return getToken(ABCHeaderParser.TEXT, 0); }
    public TerminalNode NEWLINE() { return getToken(ABCHeaderParser.NEWLINE, 0); }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(85);
      match(T__8);
      setState(86);
      match(TEXT);
      setState(87);
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

  public static class EolContext extends ParserRuleContext {
    public TerminalNode NEWLINE() { return getToken(ABCHeaderParser.NEWLINE, 0); }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public EolContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_eol; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterEol(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitEol(this);
    }
  }

  public final EolContext eol() throws RecognitionException {
    EolContext _localctx = new EolContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_eol);
    try {
      setState(91);
      switch (_input.LA(1)) {
      case NEWLINE:
        enterOuterAlt(_localctx, 1);
        {
        setState(89);
        match(NEWLINE);
        }
        break;
      case T__8:
        enterOuterAlt(_localctx, 2);
        {
        setState(90);
        comment();
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r`\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\7\3\"\n\3\f\3"+
      "\16\3%\13\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\4\3\4\3\4\3"+
      "\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6>\n\6\3\7\3\7\3\7\3"+
      "\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
      "\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16^\n\16\3\16\2"+
      "\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2Z\2\34\3\2\2\2\4\37\3\2"+
      "\2\2\6/\3\2\2\2\b\63\3\2\2\2\n=\3\2\2\2\f?\3\2\2\2\16C\3\2\2\2\20"+
      "G\3\2\2\2\22K\3\2\2\2\24O\3\2\2\2\26S\3\2\2\2\30W\3\2\2\2\32]\3\2"+
      "\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\3\3\2\2\2\37#\5\6\4\2 \"\5\30"+
      "\r\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2"+
      "&*\5\b\5\2\')\5\n\6\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3"+
      "\2\2\2,*\3\2\2\2-.\5\26\f\2.\5\3\2\2\2/\60\7\3\2\2\60\61\7\f\2\2\61"+
      "\62\5\32\16\2\62\7\3\2\2\2\63\64\7\4\2\2\64\65\7\f\2\2\65\66\5\32"+
      "\16\2\66\t\3\2\2\2\67>\5\f\7\28>\5\16\b\29>\5\20\t\2:>\5\22\n\2;>"+
      "\5\30\r\2<>\5\24\13\2=\67\3\2\2\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;"+
      "\3\2\2\2=<\3\2\2\2>\13\3\2\2\2?@\7\5\2\2@A\7\f\2\2AB\5\32\16\2B\r"+
      "\3\2\2\2CD\7\6\2\2DE\7\f\2\2EF\5\32\16\2F\17\3\2\2\2GH\7\7\2\2HI\7"+
      "\f\2\2IJ\5\32\16\2J\21\3\2\2\2KL\7\b\2\2LM\7\f\2\2MN\5\32\16\2N\23"+
      "\3\2\2\2OP\7\t\2\2PQ\7\f\2\2QR\5\32\16\2R\25\3\2\2\2ST\7\n\2\2TU\7"+
      "\f\2\2UV\5\32\16\2V\27\3\2\2\2WX\7\13\2\2XY\7\f\2\2YZ\7\r\2\2Z\31"+
      "\3\2\2\2[^\7\r\2\2\\^\5\30\r\2][\3\2\2\2]\\\3\2\2\2^\33\3\2\2\2\6"+
      "#*=]";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}