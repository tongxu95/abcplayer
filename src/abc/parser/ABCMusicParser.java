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
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ACCIDENTAL=15, BASENOTE=16, 
    OCTAVE=17, REST=18, DIGIT=19, TEXT=20, NEWLINE=21, WHITESPACE=22;
  public static final int
    RULE_root = 0, RULE_music = 1, RULE_line = 2, RULE_element = 3, RULE_note = 4, 
    RULE_single = 5, RULE_type = 6, RULE_pitch = 7, RULE_length = 8, RULE_chord = 9, 
    RULE_tuplet = 10, RULE_barline = 11, RULE_repeat = 12, RULE_voice = 13, 
    RULE_comment = 14, RULE_eol = 15;
  public static final String[] ruleNames = {
    "root", "music", "line", "element", "note", "single", "type", "pitch", 
    "length", "chord", "tuplet", "barline", "repeat", "voice", "comment", 
    "eol"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'/'", "'['", "']'", "'('", "'|'", "'||'", "'[|'", "'|]'", "':|'", 
    "'|:'", "'[1'", "'[2'", "'V:'", "'%'", null, null, null, "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, "ACCIDENTAL", "BASENOTE", "OCTAVE", "REST", "DIGIT", 
    "TEXT", "NEWLINE", "WHITESPACE"
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
      setState(32);
      music();
      setState(33);
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
      setState(36); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(35);
        line();
        }
        }
        setState(38); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << REST) | (1L << NEWLINE) | (1L << WHITESPACE))) != 0) );
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
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public VoiceContext voice() {
      return getRuleContext(VoiceContext.class,0);
    }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
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
      setState(49);
      switch (_input.LA(1)) {
      case T__1:
      case T__3:
      case T__4:
      case T__5:
      case T__6:
      case T__7:
      case T__8:
      case T__9:
      case T__10:
      case T__11:
      case ACCIDENTAL:
      case BASENOTE:
      case REST:
      case NEWLINE:
      case WHITESPACE:
        enterOuterAlt(_localctx, 1);
        {
        setState(43);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << REST) | (1L << WHITESPACE))) != 0)) {
          {
          {
          setState(40);
          element();
          }
          }
          setState(45);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(46);
        match(NEWLINE);
        }
        break;
      case T__12:
        enterOuterAlt(_localctx, 2);
        {
        setState(47);
        voice();
        }
        break;
      case T__13:
        enterOuterAlt(_localctx, 3);
        {
        setState(48);
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

  public static class ElementContext extends ParserRuleContext {
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public ChordContext chord() {
      return getRuleContext(ChordContext.class,0);
    }
    public TupletContext tuplet() {
      return getRuleContext(TupletContext.class,0);
    }
    public BarlineContext barline() {
      return getRuleContext(BarlineContext.class,0);
    }
    public RepeatContext repeat() {
      return getRuleContext(RepeatContext.class,0);
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
    enterRule(_localctx, 6, RULE_element);
    try {
      setState(57);
      switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(51);
        note();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(52);
        chord();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(53);
        tuplet();
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(54);
        barline();
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        setState(55);
        repeat();
        }
        break;
      case 6:
        enterOuterAlt(_localctx, 6);
        {
        setState(56);
        match(WHITESPACE);
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
    enterRule(_localctx, 8, RULE_note);
    try {
      setState(61);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case BASENOTE:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(59);
        single();
        }
        break;
      case T__1:
        enterOuterAlt(_localctx, 2);
        {
        setState(60);
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
    enterRule(_localctx, 10, RULE_single);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(63);
      type();
      setState(64);
      length();
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
    enterRule(_localctx, 12, RULE_type);
    try {
      setState(68);
      switch (_input.LA(1)) {
      case ACCIDENTAL:
      case BASENOTE:
        enterOuterAlt(_localctx, 1);
        {
        setState(66);
        pitch();
        }
        break;
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(67);
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
    enterRule(_localctx, 14, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(71);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(70);
        match(ACCIDENTAL);
        }
      }

      setState(73);
      match(BASENOTE);
      setState(77);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==OCTAVE) {
        {
        {
        setState(74);
        match(OCTAVE);
        }
        }
        setState(79);
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
    enterRule(_localctx, 16, RULE_length);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(85);
      _la = _input.LA(1);
      if (_la==DIGIT) {
        {
        setState(81); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(80);
          match(DIGIT);
          }
          }
          setState(83); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        }
      }

      setState(95);
      _la = _input.LA(1);
      if (_la==T__0) {
        {
        setState(87);
        match(T__0);
        setState(93);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(89); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(88);
            match(DIGIT);
            }
            }
            setState(91); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

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
    enterRule(_localctx, 18, RULE_chord);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(97);
      match(T__1);
      setState(99); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(98);
        single();
        }
        }
        setState(101); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << BASENOTE) | (1L << REST))) != 0) );
      setState(103);
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
    enterRule(_localctx, 20, RULE_tuplet);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(105);
      match(T__3);
      setState(106);
      match(DIGIT);
      setState(108); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(107);
          note();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(110); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
    enterRule(_localctx, 22, RULE_barline);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(112);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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
    enterRule(_localctx, 24, RULE_repeat);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(114);
      _la = _input.LA(1);
      if ( !(_la==T__10 || _la==T__11) ) {
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

  public static class VoiceContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
    public EolContext eol() {
      return getRuleContext(EolContext.class,0);
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
    enterRule(_localctx, 26, RULE_voice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(116);
      match(T__12);
      setState(117);
      match(TEXT);
      setState(118);
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
    public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
    public TerminalNode NEWLINE() { return getToken(ABCMusicParser.NEWLINE, 0); }
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
    enterRule(_localctx, 28, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(120);
      match(T__13);
      setState(121);
      match(TEXT);
      setState(122);
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
    enterRule(_localctx, 30, RULE_eol);
    try {
      setState(126);
      switch (_input.LA(1)) {
      case NEWLINE:
        enterOuterAlt(_localctx, 1);
        {
        setState(124);
        match(NEWLINE);
        }
        break;
      case T__13:
        enterOuterAlt(_localctx, 2);
        {
        setState(125);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u0083\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\3\2\3\2\3\2\3\3\6\3\'\n\3\r\3\16\3(\3\4\7\4,\n\4\f\4\16\4/\13\4\3"+
      "\4\3\4\3\4\5\4\64\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\5\6"+
      "@\n\6\3\7\3\7\3\7\3\b\3\b\5\bG\n\b\3\t\5\tJ\n\t\3\t\3\t\7\tN\n\t\f"+
      "\t\16\tQ\13\t\3\n\6\nT\n\n\r\n\16\nU\5\nX\n\n\3\n\3\n\6\n\\\n\n\r"+
      "\n\16\n]\5\n`\n\n\5\nb\n\n\3\13\3\13\6\13f\n\13\r\13\16\13g\3\13\3"+
      "\13\3\f\3\f\3\f\6\fo\n\f\r\f\16\fp\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
      "\3\17\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u0081\n\21\3\21\2\2\22\2"+
      "\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\7\f\3\2\r\16\u0087"+
      "\2\"\3\2\2\2\4&\3\2\2\2\6\63\3\2\2\2\b;\3\2\2\2\n?\3\2\2\2\fA\3\2"+
      "\2\2\16F\3\2\2\2\20I\3\2\2\2\22W\3\2\2\2\24c\3\2\2\2\26k\3\2\2\2\30"+
      "r\3\2\2\2\32t\3\2\2\2\34v\3\2\2\2\36z\3\2\2\2 \u0080\3\2\2\2\"#\5"+
      "\4\3\2#$\7\2\2\3$\3\3\2\2\2%\'\5\6\4\2&%\3\2\2\2\'(\3\2\2\2(&\3\2"+
      "\2\2()\3\2\2\2)\5\3\2\2\2*,\5\b\5\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2"+
      "-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\64\7\27\2\2\61\64\5\34\17\2\62"+
      "\64\5\36\20\2\63-\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\7\3\2\2\2"+
      "\65<\5\n\6\2\66<\5\24\13\2\67<\5\26\f\28<\5\30\r\29<\5\32\16\2:<\7"+
      "\30\2\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:"+
      "\3\2\2\2<\t\3\2\2\2=@\5\f\7\2>@\5\24\13\2?=\3\2\2\2?>\3\2\2\2@\13"+
      "\3\2\2\2AB\5\16\b\2BC\5\22\n\2C\r\3\2\2\2DG\5\20\t\2EG\7\24\2\2FD"+
      "\3\2\2\2FE\3\2\2\2G\17\3\2\2\2HJ\7\21\2\2IH\3\2\2\2IJ\3\2\2\2JK\3"+
      "\2\2\2KO\7\22\2\2LN\7\23\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2"+
      "\2P\21\3\2\2\2QO\3\2\2\2RT\7\25\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2"+
      "UV\3\2\2\2VX\3\2\2\2WS\3\2\2\2WX\3\2\2\2Xa\3\2\2\2Y_\7\3\2\2Z\\\7"+
      "\25\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_[\3\2\2"+
      "\2_`\3\2\2\2`b\3\2\2\2aY\3\2\2\2ab\3\2\2\2b\23\3\2\2\2ce\7\4\2\2d"+
      "f\5\f\7\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\5"+
      "\2\2j\25\3\2\2\2kl\7\6\2\2ln\7\25\2\2mo\5\n\6\2nm\3\2\2\2op\3\2\2"+
      "\2pn\3\2\2\2pq\3\2\2\2q\27\3\2\2\2rs\t\2\2\2s\31\3\2\2\2tu\t\3\2\2"+
      "u\33\3\2\2\2vw\7\17\2\2wx\7\26\2\2xy\5 \21\2y\35\3\2\2\2z{\7\20\2"+
      "\2{|\7\26\2\2|}\7\27\2\2}\37\3\2\2\2~\u0081\7\27\2\2\177\u0081\5\36"+
      "\20\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081!\3\2\2\2\22(-\63;?FI"+
      "OUW]_agp\u0080";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}