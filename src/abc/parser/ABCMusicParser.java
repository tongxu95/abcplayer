// Generated from ABCMusic.g4 by ANTLR 4.5.1

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
public class ABCMusicParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, REST=15, ACCIDENTAL=16, 
    BASENOTE=17, OCTAVE=18, DIGIT=19, OTHERLETTERS=20, SYMBOL=21, WHITESPACE=22, 
    NEWLINE=23;
  public static final int
    RULE_root = 0, RULE_music = 1, RULE_line = 2, RULE_measure = 3, RULE_barline = 4, 
    RULE_repeat = 5, RULE_element = 6, RULE_note = 7, RULE_single = 8, RULE_type = 9, 
    RULE_pitch = 10, RULE_length = 11, RULE_chord = 12, RULE_tuplet = 13, 
    RULE_voice = 14, RULE_comment = 15, RULE_eol = 16, RULE_text = 17;
  public static final String[] ruleNames = {
    "root", "music", "line", "measure", "barline", "repeat", "element", 
    "note", "single", "type", "pitch", "length", "chord", "tuplet", "voice", 
    "comment", "eol", "text"
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

  @Override
  public String getGrammarFileName() { return "ABCMusic.g4"; }

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

  public ABCMusicParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public MusicContext music() {
      return getRuleContext(MusicContext.class,0);
    }
    public TerminalNode EOF() { return getToken(ABCMusicParser.EOF, 0); }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(36);
      music();
      setState(37);
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

  public static class MusicContext extends ParserRuleContext {
    public List<LineContext> line() {
      return getRuleContexts(LineContext.class);
    }
    public LineContext line(int i) {
      return getRuleContext(LineContext.class,i);
    }
    public List<VoiceContext> voice() {
      return getRuleContexts(VoiceContext.class);
    }
    public VoiceContext voice(int i) {
      return getRuleContext(VoiceContext.class,i);
    }
    public List<CommentContext> comment() {
      return getRuleContexts(CommentContext.class);
    }
    public CommentContext comment(int i) {
      return getRuleContext(CommentContext.class,i);
    }
    public MusicContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_music; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMusic(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMusic(this);
    }
  }

  public final MusicContext music() throws RecognitionException {
    MusicContext _localctx = new MusicContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_music);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(42); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        setState(42);
        switch (_input.LA(1)) {
        case T__0:
        case T__1:
        case T__2:
        case T__3:
        case T__4:
        case T__5:
        case T__6:
        case T__7:
        case T__9:
        case T__11:
        case REST:
        case ACCIDENTAL:
        case BASENOTE:
        case WHITESPACE:
          {
          setState(39);
          line();
          }
          break;
        case T__12:
          {
          setState(40);
          voice();
          }
          break;
        case T__13:
          {
          setState(41);
          comment();
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(44); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << REST) | (1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << WHITESPACE))) != 0) );
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
    public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
    public List<MeasureContext> measure() {
      return getRuleContexts(MeasureContext.class);
    }
    public MeasureContext measure(int i) {
      return getRuleContext(MeasureContext.class,i);
    }
    public LineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_line; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLine(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLine(this);
    }
  }

  public final LineContext line() throws RecognitionException {
    LineContext _localctx = new LineContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_line);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(47); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(46);
        measure();
        }
        }
        setState(49); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << REST) | (1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << WHITESPACE))) != 0) );
      setState(51);
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

  public static class MeasureContext extends ParserRuleContext {
    public List<BarlineContext> barline() {
      return getRuleContexts(BarlineContext.class);
    }
    public BarlineContext barline(int i) {
      return getRuleContext(BarlineContext.class,i);
    }
    public RepeatContext repeat() {
      return getRuleContext(RepeatContext.class,0);
    }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public MeasureContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_measure; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMeasure(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMeasure(this);
    }
  }

  public final MeasureContext measure() throws RecognitionException {
    MeasureContext _localctx = new MeasureContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_measure);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(54);
      _la = _input.LA(1);
      if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
        {
        setState(53);
        barline();
        }
      }

      setState(57);
      _la = _input.LA(1);
      if (_la==T__6 || _la==T__7) {
        {
        setState(56);
        repeat();
        }
      }

      setState(60); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(59);
          element();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(62); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(65);
      switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
      case 1:
        {
        setState(64);
        barline();
        }
        break;
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

  public static class BarlineContext extends ParserRuleContext {
    public BarlineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_barline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterBarline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitBarline(this);
    }
  }

  public final BarlineContext barline() throws RecognitionException {
    BarlineContext _localctx = new BarlineContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_barline);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(67);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
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

  public static class RepeatContext extends ParserRuleContext {
    public RepeatContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_repeat; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterRepeat(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitRepeat(this);
    }
  }

  public final RepeatContext repeat() throws RecognitionException {
    RepeatContext _localctx = new RepeatContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_repeat);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(69);
      _la = _input.LA(1);
      if ( !(_la==T__6 || _la==T__7) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
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

  public static class ElementContext extends ParserRuleContext {
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public TupletContext tuplet() {
      return getRuleContext(TupletContext.class,0);
    }
    public TerminalNode WHITESPACE() { return getToken(ABCMusicParser.WHITESPACE, 0); }
    public ElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_element; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterElement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitElement(this);
    }
  }

  public final ElementContext element() throws RecognitionException {
    ElementContext _localctx = new ElementContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_element);
    try {
      setState(74);
      switch (_input.LA(1)) {
      case T__9:
      case REST:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(71);
        note();
        }
        break;
      case T__11:
        enterOuterAlt(_localctx, 2);
        {
        setState(72);
        tuplet();
        }
        break;
      case WHITESPACE:
        enterOuterAlt(_localctx, 3);
        {
        setState(73);
        match(WHITESPACE);
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

  public static class NoteContext extends ParserRuleContext {
    public SingleContext single() {
      return getRuleContext(SingleContext.class,0);
    }
    public ChordContext chord() {
      return getRuleContext(ChordContext.class,0);
    }
    public NoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote(this);
    }
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_note);
    try {
      setState(78);
      switch (_input.LA(1)) {
      case REST:
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(76);
        single();
        }
        break;
      case T__9:
        enterOuterAlt(_localctx, 2);
        {
        setState(77);
        chord();
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

  public static class SingleContext extends ParserRuleContext {
    public TypeContext type() {
      return getRuleContext(TypeContext.class,0);
    }
    public LengthContext length() {
      return getRuleContext(LengthContext.class,0);
    }
    public SingleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_single; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterSingle(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitSingle(this);
    }
  }

  public final SingleContext single() throws RecognitionException {
    SingleContext _localctx = new SingleContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_single);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(80);
      type();
      setState(82);
      _la = _input.LA(1);
      if (_la==T__8 || _la==DIGIT) {
        {
        setState(81);
        length();
        }
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

  public static class TypeContext extends ParserRuleContext {
    public PitchContext pitch() {
      return getRuleContext(PitchContext.class,0);
    }
    public TerminalNode REST() { return getToken(ABCMusicParser.REST, 0); }
    public TypeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_type; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterType(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitType(this);
    }
  }

  public final TypeContext type() throws RecognitionException {
    TypeContext _localctx = new TypeContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_type);
    try {
      setState(86);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(84);
        pitch();
        }
        break;
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(85);
        match(REST);
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

  public static class PitchContext extends ParserRuleContext {
    public TerminalNode BASENOTE() { return getToken(ABCMusicParser.BASENOTE, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(ABCMusicParser.ACCIDENTAL, 0); }
    public List<TerminalNode> OCTAVE() { return getTokens(ABCMusicParser.OCTAVE); }
    public TerminalNode OCTAVE(int i) {
      return getToken(ABCMusicParser.OCTAVE, i);
    }
    public PitchContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_pitch; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterPitch(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitPitch(this);
    }
  }

  public final PitchContext pitch() throws RecognitionException {
    PitchContext _localctx = new PitchContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(89);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(88);
        match(ACCIDENTAL);
        }
      }

      setState(91);
      match(BASENOTE);
      setState(95);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==OCTAVE) {
        {
        {
        setState(92);
        match(OCTAVE);
        }
        }
        setState(97);
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

  public static class LengthContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(ABCMusicParser.DIGIT, i);
    }
    public LengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_length; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLength(this);
    }
  }

  public final LengthContext length() throws RecognitionException {
    LengthContext _localctx = new LengthContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_length);
    int _la;
    try {
      setState(106);
      switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(98);
        match(DIGIT);
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(100);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(99);
          match(DIGIT);
          }
        }

        setState(102);
        match(T__8);
        setState(104);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(103);
          match(DIGIT);
          }
        }

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

  public static class ChordContext extends ParserRuleContext {
    public List<SingleContext> single() {
      return getRuleContexts(SingleContext.class);
    }
    public SingleContext single(int i) {
      return getRuleContext(SingleContext.class,i);
    }
    public ChordContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_chord; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterChord(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitChord(this);
    }
  }

  public final ChordContext chord() throws RecognitionException {
    ChordContext _localctx = new ChordContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(108);
      match(T__9);
      setState(110); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(109);
        single();
        }
        }
        setState(112); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REST) | (1L << ACCIDENTAL) | (1L << BASENOTE))) != 0) );
      setState(114);
      match(T__10);
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

  public static class TupletContext extends ParserRuleContext {
    public TerminalNode DIGIT() { return getToken(ABCMusicParser.DIGIT, 0); }
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public TupletContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tuplet; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTuplet(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTuplet(this);
    }
  }

  public final TupletContext tuplet() throws RecognitionException {
    TupletContext _localctx = new TupletContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_tuplet);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(116);
      match(T__11);
      setState(117);
      match(DIGIT);
      setState(119); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(118);
          note();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(121); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,17,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
    }
    public List<TextContext> text() {
      return getRuleContexts(TextContext.class);
    }
    public TextContext text(int i) {
      return getRuleContext(TextContext.class,i);
    }
    public VoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterVoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitVoice(this);
    }
  }

  public final VoiceContext voice() throws RecognitionException {
    VoiceContext _localctx = new VoiceContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_voice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(123);
      match(T__12);
      setState(125); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(124);
        text();
        }
        }
        setState(127); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REST) | (1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << OCTAVE) | (1L << DIGIT) | (1L << OTHERLETTERS) | (1L << SYMBOL) | (1L << WHITESPACE))) != 0) );
      setState(129);
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
    public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
    public List<TextContext> text() {
      return getRuleContexts(TextContext.class);
    }
    public TextContext text(int i) {
      return getRuleContext(TextContext.class,i);
    }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_comment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(131);
      match(T__13);
      setState(137);
      _la = _input.LA(1);
      if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REST) | (1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << OCTAVE) | (1L << DIGIT) | (1L << OTHERLETTERS) | (1L << SYMBOL) | (1L << WHITESPACE))) != 0)) {
        {
        setState(133); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(132);
          text();
          }
          }
          setState(135); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REST) | (1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << OCTAVE) | (1L << DIGIT) | (1L << OTHERLETTERS) | (1L << SYMBOL) | (1L << WHITESPACE))) != 0) );
        }
      }

      setState(139);
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
    public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public EolContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_eol; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterEol(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitEol(this);
    }
  }

  public final EolContext eol() throws RecognitionException {
    EolContext _localctx = new EolContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_eol);
    try {
      setState(143);
      switch (_input.LA(1)) {
      case NEWLINE:
        enterOuterAlt(_localctx, 1);
        {
        setState(141);
        match(NEWLINE);
        }
        break;
      case T__13:
        enterOuterAlt(_localctx, 2);
        {
        setState(142);
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

  public static class TextContext extends ParserRuleContext {
    public TerminalNode BASENOTE() { return getToken(ABCMusicParser.BASENOTE, 0); }
    public TerminalNode REST() { return getToken(ABCMusicParser.REST, 0); }
    public TerminalNode OTHERLETTERS() { return getToken(ABCMusicParser.OTHERLETTERS, 0); }
    public TerminalNode DIGIT() { return getToken(ABCMusicParser.DIGIT, 0); }
    public List<TerminalNode> WHITESPACE() { return getTokens(ABCMusicParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(ABCMusicParser.WHITESPACE, i);
    }
    public TerminalNode OCTAVE() { return getToken(ABCMusicParser.OCTAVE, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(ABCMusicParser.ACCIDENTAL, 0); }
    public TerminalNode SYMBOL() { return getToken(ABCMusicParser.SYMBOL, 0); }
    public TextContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_text; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterText(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitText(this);
    }
  }

  public final TextContext text() throws RecognitionException {
    TextContext _localctx = new TextContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_text);
    try {
      int _alt;
      setState(157);
      switch (_input.LA(1)) {
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(145);
        match(BASENOTE);
        }
        break;
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(146);
        match(REST);
        }
        break;
      case OTHERLETTERS:
        enterOuterAlt(_localctx, 3);
        {
        setState(147);
        match(OTHERLETTERS);
        }
        break;
      case DIGIT:
        enterOuterAlt(_localctx, 4);
        {
        setState(148);
        match(DIGIT);
        }
        break;
      case WHITESPACE:
        enterOuterAlt(_localctx, 5);
        {
        setState(150); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(149);
            match(WHITESPACE);
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(152); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,22,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        }
        break;
      case OCTAVE:
        enterOuterAlt(_localctx, 6);
        {
        setState(154);
        match(OCTAVE);
        }
        break;
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 7);
        {
        setState(155);
        match(ACCIDENTAL);
        }
        break;
      case SYMBOL:
        enterOuterAlt(_localctx, 8);
        {
        setState(156);
        match(SYMBOL);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00a2\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\6\3-\n\3\r\3\16\3.\3"+
      "\4\6\4\62\n\4\r\4\16\4\63\3\4\3\4\3\5\5\59\n\5\3\5\5\5<\n\5\3\5\6"+
      "\5?\n\5\r\5\16\5@\3\5\5\5D\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\bM\n"+
      "\b\3\t\3\t\5\tQ\n\t\3\n\3\n\5\nU\n\n\3\13\3\13\5\13Y\n\13\3\f\5\f"+
      "\\\n\f\3\f\3\f\7\f`\n\f\f\f\16\fc\13\f\3\r\3\r\5\rg\n\r\3\r\3\r\5"+
      "\rk\n\r\5\rm\n\r\3\16\3\16\6\16q\n\16\r\16\16\16r\3\16\3\16\3\17\3"+
      "\17\3\17\6\17z\n\17\r\17\16\17{\3\20\3\20\6\20\u0080\n\20\r\20\16"+
      "\20\u0081\3\20\3\20\3\21\3\21\6\21\u0088\n\21\r\21\16\21\u0089\5\21"+
      "\u008c\n\21\3\21\3\21\3\22\3\22\5\22\u0092\n\22\3\23\3\23\3\23\3\23"+
      "\3\23\6\23\u0099\n\23\r\23\16\23\u009a\3\23\3\23\3\23\5\23\u00a0\n"+
      "\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\3\2"+
      "\3\b\3\2\t\n\u00af\2&\3\2\2\2\4,\3\2\2\2\6\61\3\2\2\2\b8\3\2\2\2\n"+
      "E\3\2\2\2\fG\3\2\2\2\16L\3\2\2\2\20P\3\2\2\2\22R\3\2\2\2\24X\3\2\2"+
      "\2\26[\3\2\2\2\30l\3\2\2\2\32n\3\2\2\2\34v\3\2\2\2\36}\3\2\2\2 \u0085"+
      "\3\2\2\2\"\u0091\3\2\2\2$\u009f\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3(\3\3"+
      "\2\2\2)-\5\6\4\2*-\5\36\20\2+-\5 \21\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2"+
      "\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60\62\5\b\5\2\61\60\3"+
      "\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65"+
      "\66\7\31\2\2\66\7\3\2\2\2\679\5\n\6\28\67\3\2\2\289\3\2\2\29;\3\2"+
      "\2\2:<\5\f\7\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5\16\b\2>=\3\2\2\2"+
      "?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\5\n\6\2CB\3\2\2\2CD\3\2"+
      "\2\2D\t\3\2\2\2EF\t\2\2\2F\13\3\2\2\2GH\t\3\2\2H\r\3\2\2\2IM\5\20"+
      "\t\2JM\5\34\17\2KM\7\30\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\17\3\2"+
      "\2\2NQ\5\22\n\2OQ\5\32\16\2PN\3\2\2\2PO\3\2\2\2Q\21\3\2\2\2RT\5\24"+
      "\13\2SU\5\30\r\2TS\3\2\2\2TU\3\2\2\2U\23\3\2\2\2VY\5\26\f\2WY\7\21"+
      "\2\2XV\3\2\2\2XW\3\2\2\2Y\25\3\2\2\2Z\\\7\22\2\2[Z\3\2\2\2[\\\3\2"+
      "\2\2\\]\3\2\2\2]a\7\23\2\2^`\7\24\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2"+
      "\2ab\3\2\2\2b\27\3\2\2\2ca\3\2\2\2dm\7\25\2\2eg\7\25\2\2fe\3\2\2\2"+
      "fg\3\2\2\2gh\3\2\2\2hj\7\13\2\2ik\7\25\2\2ji\3\2\2\2jk\3\2\2\2km\3"+
      "\2\2\2ld\3\2\2\2lf\3\2\2\2m\31\3\2\2\2np\7\f\2\2oq\5\22\n\2po\3\2"+
      "\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\r\2\2u\33\3\2\2\2"+
      "vw\7\16\2\2wy\7\25\2\2xz\5\20\t\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|"+
      "\3\2\2\2|\35\3\2\2\2}\177\7\17\2\2~\u0080\5$\23\2\177~\3\2\2\2\u0080"+
      "\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3"+
      "\2\2\2\u0083\u0084\5\"\22\2\u0084\37\3\2\2\2\u0085\u008b\7\20\2\2"+
      "\u0086\u0088\5$\23\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
      "\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0087"+
      "\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\31"+
      "\2\2\u008e!\3\2\2\2\u008f\u0092\7\31\2\2\u0090\u0092\5 \21\2\u0091"+
      "\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092#\3\2\2\2\u0093\u00a0\7\23"+
      "\2\2\u0094\u00a0\7\21\2\2\u0095\u00a0\7\26\2\2\u0096\u00a0\7\25\2"+
      "\2\u0097\u0099\7\30\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
      "\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a0\3\2\2\2\u009c\u00a0"+
      "\7\24\2\2\u009d\u00a0\7\22\2\2\u009e\u00a0\7\27\2\2\u009f\u0093\3"+
      "\2\2\2\u009f\u0094\3\2\2\2\u009f\u0095\3\2\2\2\u009f\u0096\3\2\2\2"+
      "\u009f\u0098\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
      "\u009e\3\2\2\2\u00a0%\3\2\2\2\32,.\638;@CLPTX[afjlr{\u0081\u0089\u008b"+
      "\u0091\u009a\u009f";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}