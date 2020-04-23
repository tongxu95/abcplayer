// Generated from ABCHeader.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ABCHeaderParser}.
 */
public interface ABCHeaderListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link ABCHeaderParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(ABCHeaderParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCHeaderParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(ABCHeaderParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCHeaderParser#header}.
   * @param ctx the parse tree
   */
  void enterHeader(ABCHeaderParser.HeaderContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCHeaderParser#header}.
   * @param ctx the parse tree
   */
  void exitHeader(ABCHeaderParser.HeaderContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCHeaderParser#index}.
   * @param ctx the parse tree
   */
  void enterIndex(ABCHeaderParser.IndexContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCHeaderParser#index}.
   * @param ctx the parse tree
   */
  void exitIndex(ABCHeaderParser.IndexContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCHeaderParser#title}.
   * @param ctx the parse tree
   */
  void enterTitle(ABCHeaderParser.TitleContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCHeaderParser#title}.
   * @param ctx the parse tree
   */
  void exitTitle(ABCHeaderParser.TitleContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCHeaderParser#optional}.
   * @param ctx the parse tree
   */
  void enterOptional(ABCHeaderParser.OptionalContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCHeaderParser#optional}.
   * @param ctx the parse tree
   */
  void exitOptional(ABCHeaderParser.OptionalContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCHeaderParser#composer}.
   * @param ctx the parse tree
   */
  void enterComposer(ABCHeaderParser.ComposerContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCHeaderParser#composer}.
   * @param ctx the parse tree
   */
  void exitComposer(ABCHeaderParser.ComposerContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCHeaderParser#duration}.
   * @param ctx the parse tree
   */
  void enterDuration(ABCHeaderParser.DurationContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCHeaderParser#duration}.
   * @param ctx the parse tree
   */
  void exitDuration(ABCHeaderParser.DurationContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCHeaderParser#meter}.
   * @param ctx the parse tree
   */
  void enterMeter(ABCHeaderParser.MeterContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCHeaderParser#meter}.
   * @param ctx the parse tree
   */
  void exitMeter(ABCHeaderParser.MeterContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCHeaderParser#tempo}.
   * @param ctx the parse tree
   */
  void enterTempo(ABCHeaderParser.TempoContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCHeaderParser#tempo}.
   * @param ctx the parse tree
   */
  void exitTempo(ABCHeaderParser.TempoContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCHeaderParser#voice}.
   * @param ctx the parse tree
   */
  void enterVoice(ABCHeaderParser.VoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCHeaderParser#voice}.
   * @param ctx the parse tree
   */
  void exitVoice(ABCHeaderParser.VoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCHeaderParser#key}.
   * @param ctx the parse tree
   */
  void enterKey(ABCHeaderParser.KeyContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCHeaderParser#key}.
   * @param ctx the parse tree
   */
  void exitKey(ABCHeaderParser.KeyContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCHeaderParser#comment}.
   * @param ctx the parse tree
   */
  void enterComment(ABCHeaderParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCHeaderParser#comment}.
   * @param ctx the parse tree
   */
  void exitComment(ABCHeaderParser.CommentContext ctx);
  /**
   * Enter a parse tree produced by {@link ABCHeaderParser#eol}.
   * @param ctx the parse tree
   */
  void enterEol(ABCHeaderParser.EolContext ctx);
  /**
   * Exit a parse tree produced by {@link ABCHeaderParser#eol}.
   * @param ctx the parse tree
   */
  void exitEol(ABCHeaderParser.EolContext ctx);
}