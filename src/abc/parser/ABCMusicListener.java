// Generated from ABCMusic.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ABCMusicParser}.
 */
public interface ABCMusicListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(ABCMusicParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(ABCMusicParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#music}.
   * @param ctx the parse tree
   */
  void enterMusic(ABCMusicParser.MusicContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#music}.
   * @param ctx the parse tree
   */
  void exitMusic(ABCMusicParser.MusicContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#line}.
   * @param ctx the parse tree
   */
  void enterLine(ABCMusicParser.LineContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#line}.
   * @param ctx the parse tree
   */
  void exitLine(ABCMusicParser.LineContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#element}.
   * @param ctx the parse tree
   */
  void enterElement(ABCMusicParser.ElementContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#element}.
   * @param ctx the parse tree
   */
  void exitElement(ABCMusicParser.ElementContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#note}.
   * @param ctx the parse tree
   */
  void enterNote(ABCMusicParser.NoteContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#note}.
   * @param ctx the parse tree
   */
  void exitNote(ABCMusicParser.NoteContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#single}.
   * @param ctx the parse tree
   */
  void enterSingle(ABCMusicParser.SingleContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#single}.
   * @param ctx the parse tree
   */
  void exitSingle(ABCMusicParser.SingleContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#type}.
   * @param ctx the parse tree
   */
  void enterType(ABCMusicParser.TypeContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#type}.
   * @param ctx the parse tree
   */
  void exitType(ABCMusicParser.TypeContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#pitch}.
   * @param ctx the parse tree
   */
  void enterPitch(ABCMusicParser.PitchContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#pitch}.
   * @param ctx the parse tree
   */
  void exitPitch(ABCMusicParser.PitchContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#length}.
   * @param ctx the parse tree
   */
  void enterLength(ABCMusicParser.LengthContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#length}.
   * @param ctx the parse tree
   */
  void exitLength(ABCMusicParser.LengthContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#chord}.
   * @param ctx the parse tree
   */
  void enterChord(ABCMusicParser.ChordContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#chord}.
   * @param ctx the parse tree
   */
  void exitChord(ABCMusicParser.ChordContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#tuplet}.
   * @param ctx the parse tree
   */
  void enterTuplet(ABCMusicParser.TupletContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#tuplet}.
   * @param ctx the parse tree
   */
  void exitTuplet(ABCMusicParser.TupletContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#barline}.
   * @param ctx the parse tree
   */
  void enterBarline(ABCMusicParser.BarlineContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#barline}.
   * @param ctx the parse tree
   */
  void exitBarline(ABCMusicParser.BarlineContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#repeat}.
   * @param ctx the parse tree
   */
  void enterRepeat(ABCMusicParser.RepeatContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#repeat}.
   * @param ctx the parse tree
   */
  void exitRepeat(ABCMusicParser.RepeatContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#voice}.
   * @param ctx the parse tree
   */
  void enterVoice(ABCMusicParser.VoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#voice}.
   * @param ctx the parse tree
   */
  void exitVoice(ABCMusicParser.VoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#comment}.
   * @param ctx the parse tree
   */
  void enterComment(ABCMusicParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#comment}.
   * @param ctx the parse tree
   */
  void exitComment(ABCMusicParser.CommentContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCMusicParser#eol}.
   * @param ctx the parse tree
   */
  void enterEol(ABCMusicParser.EolContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCMusicParser#eol}.
   * @param ctx the parse tree
   */
  void exitEol(ABCMusicParser.EolContext ctx);
}