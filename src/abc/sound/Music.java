package abc.sound;

import org.antlr.v4.runtime.*;

/**
 * 
 * An immutable data type representing a musical piece.
 * 
 *
 */
public interface Music {
	
	public static final String DEFAULT_AUTHOR = "unknown";
	public static final int DEFAULT_NOTE_VALUE = 8;
	public static final double DEFAULT_METER = 1.0;
	public static final int DEFAULT_TEMPO = 100;
	// valid down to 64th note and rest
	public static final int TICKS_WHOLE_NOTE = 192;
	
	//	Datatype definition: 
	//	Music = Note(note: String, length: int) + Rest(length: int) + 
	//			+ Melody (add: Music, tones: Music) + 
	//			Band (voice 1: Music, voices: Music)
	
    /**
     * Parse the body section of the file.
     * @param input string to parse.
     * @return music AST for the input
     * @throws IllegalArgumentException if the expression is invalid
     */
	public static Music parseMusic(String input) throws IllegalArgumentException {
		throw new RuntimeException("not implemented");
	}
	
    /**
     * Play music at startTick.
     *
     * @param player a MIDI sequence player to play the piece
     * @param startTick the starting tick; must be >= 0
     * @return number of ticks after music is played.
     */
	public int play (SequencePlayer player, int startTick);

	
}
