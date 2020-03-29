package abc.sound;

import org.junit.Test;
import static org.junit.Assert.*;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

/**
 * Tests for the Music abstract data type.
 */
public class MusicTest {
	
	private final Note note = new Note("^c'", 24);
	private final Rest rest = new Rest(12);
	private final Melody melody1 = new Melody(note, rest);
	private final Melody melody2 = new Melody(melody1, note);
	private final Band band = new Band(melody1, melody2);
	
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    // Testing strategy: toString()
	// 		note (accidental, high octave), rest, melody (consisting of note/rest/melody), 
    //		band (consisting of two melodies)
    // Testing strategy: play(player, startTick)
	// 		note (accidental, high octave), rest, melody(consisting of note/rest/melody), 
    //		band (consisting of two melodies)
    
    @Test
    public void testNoteToString() {
    	assertEquals("string for a note", note.toString(), "^C''24");
    }
    
    @Test
    public void testRestToString() {
    	assertEquals("string for a rest", rest.toString(), "z12");
    }
    
    @Test
    public void testMelodyToString() {
    	assertEquals("string for a melody", melody1.toString(), "^C''24 z12");
    }
    
    @Test
    public void testBandToString() {
    	assertEquals("string for two voices", band.toString(), "[|^C''24 z12|]\n[|^C''24 z12 ^C''24|]");
    }

    @Test
    public void testPlayNote() throws MidiUnavailableException, InvalidMidiDataException {
    	SequencePlayer player = new SequencePlayer(Music.DEFAULT_TEMPO, Music.TICKS_WHOLE_NOTE);
    	assertEquals("play note", note.play(player, 0), 24);
    }
    
    @Test
    public void testPlayRest() throws MidiUnavailableException, InvalidMidiDataException {
    	SequencePlayer player = new SequencePlayer(Music.DEFAULT_TEMPO, Music.TICKS_WHOLE_NOTE);
    	assertEquals("play rest", rest.play(player, 0), 12);
    }
    
    @Test
    public void testPlayMelody() throws MidiUnavailableException, InvalidMidiDataException {
    	SequencePlayer player = new SequencePlayer(Music.DEFAULT_TEMPO, Music.TICKS_WHOLE_NOTE);
    	assertEquals("play melody", melody2.play(player, 0), 60);
    }
    
    @Test
    public void testPlayBand() throws MidiUnavailableException, InvalidMidiDataException {
    	SequencePlayer player = new SequencePlayer(Music.DEFAULT_TEMPO, Music.TICKS_WHOLE_NOTE);
    	assertEquals("play melody", band.play(player, 0), 60);
    }

}
