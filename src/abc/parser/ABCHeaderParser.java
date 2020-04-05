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
    T__9=10, T__10=11, T__11=12, T__12=13, SCALE=14, DIGIT=15, TEXT=16, 
    NEWLINE=17, WHITESPACE=18, SPACES=19;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_index = 2, RULE_title = 3, RULE_optional = 4, 
    RULE_composer = 5, RULE_duration = 6, RULE_meter = 7, RULE_tempo = 8, 
    RULE_voice = 9, RULE_key = 10, RULE_fraction = 11, RULE_pulse = 12, 
    RULE_comment = 13, RULE_eol = 14;
  public static final String[] ruleNames = {
    "root", "header", "index", "title", "optional", "composer", "duration", 
    "meter", "tempo", "voice", "key", "fraction", "pulse", "comment", "eol"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'='", "'V:'", 
    "'K:'", "'/'", "'C'", "'C|'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, "SCALE", "DIGIT", "TEXT", "NEWLINE", "WHITESPACE", "SPACES"
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
      setState(30);
      header();
      setState(31);
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
      setState(33);
      index();
      setState(37);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__12) {
        {
        {
        setState(34);
        comment();
        }
        }
        setState(39);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(40);
      title();
      setState(44);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__12))) != 0)) {
        {
        {
        setState(41);
        optional();
        }
        }
        setState(46);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(47);
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
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(ABCHeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(ABCHeaderParser.DIGIT, i);
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(49);
      match(T__0);
      setState(51); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(50);
        match(DIGIT);
        }
        }
        setState(53); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(55);
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
      setState(57);
      match(T__1);
      setState(58);
      match(TEXT);
      setState(59);
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
      setState(67);
      switch (_input.LA(1)) {
      case T__2:
        enterOuterAlt(_localctx, 1);
        {
        setState(61);
        composer();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(62);
        duration();
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 3);
        {
        setState(63);
        meter();
        }
        break;
      case T__5:
        enterOuterAlt(_localctx, 4);
        {
        setState(64);
        tempo();
        }
        break;
      case T__12:
        enterOuterAlt(_localctx, 5);
        {
        setState(65);
        comment();
        }
        break;
      case T__7:
        enterOuterAlt(_localctx, 6);
        {
        setState(66);
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
      setState(69);
      match(T__2);
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

  public static class DurationContext extends ParserRuleContext {
    public FractionContext fraction() {
      return getRuleContext(FractionContext.class,0);
    }
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
      setState(73);
      match(T__3);
      setState(74);
      fraction();
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

  public static class MeterContext extends ParserRuleContext {
    public PulseContext pulse() {
      return getRuleContext(PulseContext.class,0);
    }
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
      setState(77);
      match(T__4);
      setState(78);
      pulse();
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

  public static class TempoContext extends ParserRuleContext {
    public FractionContext fraction() {
      return getRuleContext(FractionContext.class,0);
    }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(ABCHeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(ABCHeaderParser.DIGIT, i);
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(81);
      match(T__5);
      setState(82);
      fraction();
      setState(83);
      match(T__6);
      setState(85); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(84);
        match(DIGIT);
        }
        }
        setState(87); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(89);
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
      setState(91);
      match(T__7);
      setState(92);
      match(TEXT);
      setState(93);
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
    public TerminalNode SCALE() { return getToken(ABCHeaderParser.SCALE, 0); }
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
      setState(95);
      match(T__8);
      setState(96);
      match(SCALE);
      setState(97);
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

  public static class FractionContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(ABCHeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(ABCHeaderParser.DIGIT, i);
    }
    public FractionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fraction; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterFraction(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitFraction(this);
    }
  }

  public final FractionContext fraction() throws RecognitionException {
    FractionContext _localctx = new FractionContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_fraction);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(100); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(99);
        match(DIGIT);
        }
        }
        setState(102); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(104);
      match(T__9);
      setState(106); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(105);
        match(DIGIT);
        }
        }
        setState(108); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
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

  public static class PulseContext extends ParserRuleContext {
    public FractionContext fraction() {
      return getRuleContext(FractionContext.class,0);
    }
    public PulseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_pulse; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).enterPulse(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCHeaderListener ) ((ABCHeaderListener)listener).exitPulse(this);
    }
  }

  public final PulseContext pulse() throws RecognitionException {
    PulseContext _localctx = new PulseContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_pulse);
    try {
      setState(113);
      switch (_input.LA(1)) {
      case T__10:
        enterOuterAlt(_localctx, 1);
        {
        setState(110);
        match(T__10);
        }
        break;
      case T__11:
        enterOuterAlt(_localctx, 2);
        {
        setState(111);
        match(T__11);
        }
        break;
      case DIGIT:
        enterOuterAlt(_localctx, 3);
        {
        setState(112);
        fraction();
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
    enterRule(_localctx, 26, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(115);
      match(T__12);
      setState(116);
      match(TEXT);
      setState(117);
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
    enterRule(_localctx, 28, RULE_eol);
    try {
      setState(121);
      switch (_input.LA(1)) {
      case NEWLINE:
        enterOuterAlt(_localctx, 1);
        {
        setState(119);
        match(NEWLINE);
        }
        break;
      case T__12:
        enterOuterAlt(_localctx, 2);
        {
        setState(120);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25~\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3"+
      "\3\3\3\7\3&\n\3\f\3\16\3)\13\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3"+
      "\3\3\3\3\4\3\4\6\4\66\n\4\r\4\16\4\67\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
      "\3\6\3\6\3\6\3\6\3\6\5\6F\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
      "\3\t\3\t\3\t\3\n\3\n\3\n\3\n\6\nX\n\n\r\n\16\nY\3\n\3\n\3\13\3\13"+
      "\3\13\3\13\3\f\3\f\3\f\3\f\3\r\6\rg\n\r\r\r\16\rh\3\r\3\r\6\rm\n\r"+
      "\r\r\16\rn\3\16\3\16\3\16\5\16t\n\16\3\17\3\17\3\17\3\17\3\20\3\20"+
      "\5\20|\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2"+
      "|\2 \3\2\2\2\4#\3\2\2\2\6\63\3\2\2\2\b;\3\2\2\2\nE\3\2\2\2\fG\3\2"+
      "\2\2\16K\3\2\2\2\20O\3\2\2\2\22S\3\2\2\2\24]\3\2\2\2\26a\3\2\2\2\30"+
      "f\3\2\2\2\32s\3\2\2\2\34u\3\2\2\2\36{\3\2\2\2 !\5\4\3\2!\"\7\2\2\3"+
      "\"\3\3\2\2\2#\'\5\6\4\2$&\5\34\17\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2"+
      "\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*.\5\b\5\2+-\5\n\6\2,+\3\2\2\2-\60"+
      "\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\5\26\f"+
      "\2\62\5\3\2\2\2\63\65\7\3\2\2\64\66\7\21\2\2\65\64\3\2\2\2\66\67\3"+
      "\2\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\36\20\2:\7\3\2\2\2"+
      ";<\7\4\2\2<=\7\22\2\2=>\5\36\20\2>\t\3\2\2\2?F\5\f\7\2@F\5\16\b\2"+
      "AF\5\20\t\2BF\5\22\n\2CF\5\34\17\2DF\5\24\13\2E?\3\2\2\2E@\3\2\2\2"+
      "EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\13\3\2\2\2GH\7\5\2\2HI\7"+
      "\22\2\2IJ\5\36\20\2J\r\3\2\2\2KL\7\6\2\2LM\5\30\r\2MN\5\36\20\2N\17"+
      "\3\2\2\2OP\7\7\2\2PQ\5\32\16\2QR\5\36\20\2R\21\3\2\2\2ST\7\b\2\2T"+
      "U\5\30\r\2UW\7\t\2\2VX\7\21\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3"+
      "\2\2\2Z[\3\2\2\2[\\\5\36\20\2\\\23\3\2\2\2]^\7\n\2\2^_\7\22\2\2_`"+
      "\5\36\20\2`\25\3\2\2\2ab\7\13\2\2bc\7\20\2\2cd\5\36\20\2d\27\3\2\2"+
      "\2eg\7\21\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jl"+
      "\7\f\2\2km\7\21\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\31\3"+
      "\2\2\2pt\7\r\2\2qt\7\16\2\2rt\5\30\r\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2"+
      "\2t\33\3\2\2\2uv\7\17\2\2vw\7\22\2\2wx\7\23\2\2x\35\3\2\2\2y|\7\23"+
      "\2\2z|\5\34\17\2{y\3\2\2\2{z\3\2\2\2|\37\3\2\2\2\13\'.\67EYhns{";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}