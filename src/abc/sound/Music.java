package abc.sound;

import abc.parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Map;

/**
 * 
 * An immutable data type representing a musical piece.
 * 
 *
 */
public interface Music {
	
	public static final String DEFAULT_AUTHOR = "unknown";
	public static final double DEFAULT_METER = 1.0;
	public static final int DEFAULT_TEMPO = 100;
	public static final int TICKS_WHOLE_NOTE = 192;
	
	//	Datatype definition: 
	//	Music = Note(note: String, length: int) + Rest(length: int) + 
	//			+ Chord (notes: List<Note>) + Tuplet (notes: Music, tupletNum: double)
	//			+ Melody (add: Music, tones: Music) + Band (voice 1: Music, voices: Music)
	
    /**
     * Parse the body section of the file.
     * @param input string to parse.
     * @param defaultDuration default duration of a note in number of ticks.
     * @param keySig list of sharps or flats associated with particular notes in the scale.
     * @param voices list of the multiple voices that are played simultaneously; list is 
     * 		  empty if music contain a single melody.
     * @return music AST for the input
     * @throws IllegalArgumentException if the expression is invalid
     */
	public static Music parseMusic(String input, int defaultDuration, 
			Map<String, Integer> keySig, List<String> voices) throws IllegalArgumentException {
		try {
			CharStream stream = new ANTLRInputStream (input);
			ABCMusicLexer lexer = new ABCMusicLexer(stream);
			lexer.reportErrorsAsExceptions();
			
			TokenStream tokens = new CommonTokenStream(lexer);
			ABCMusicParser parser = new ABCMusicParser(tokens);
			parser.reportErrorsAsExceptions();

			ParseTree tree = parser.root();
			ParseTreeWalker walker = new ParseTreeWalker();
			MakeMusic walkMusic = new MakeMusic(defaultDuration, keySig, voices);
			walker.walk(walkMusic, tree);
			return walkMusic.getMusic();
		} catch (Exception e) {
			throw new IllegalArgumentException("ParseError: illegal file format");
		}
	}
	
    /**
     * @return duration of music in number of ticks.
     */
	public int getDuration ();
	
	/**
	 * @param modifier a multiplicative factor that is applied to the note length
	 * @return new music with modified note lengths.
	 */
	public Music modLength(double modifier);
	
    /**
     * Play music at startTick.
     *
     * @param player a MIDI sequence player to play the piece
     * @param startTick the starting tick; must be >= 0
     * @return number of ticks after music is played.
     */
	public int play (SequencePlayer player, int startTick);

}
