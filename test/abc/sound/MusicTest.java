package abc.sound;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

/**
 * Tests for the Music abstract data type.
 */
public class MusicTest {

	private final Note note = new Note(new Pitch('C').transpose(13), 24);
	private final Rest rest = new Rest(12);
	private final Note note2 = new Note (new Pitch ('E').transpose(-1), 24);
	private final Chord chord = new Chord(Arrays.asList(note, note2));
	private final Tuplet tuplet = new Tuplet(Arrays.asList(note, note2), 2);
	private final Tuplet tuplet2 = new Tuplet(Arrays.asList(chord, note), 2);
	private final Melody melody1 = new Melody(note, rest);
	private final Melody melody2 = new Melody(melody1, note);
	private final Map <String, Music> voices1 = new HashMap<>();
	
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    // Testing strategy: equals and hashcode
    //		note, rest, chord, tuplet, melody, band
    //		notes are equal if they have the same pitch and duration
    //		order is important for equality of tuplet, and melody 
    //		but not for chord and band (play simultaneously)  
    // Testing strategy: toString()
	// 		note (accidental, octave), rest, chord, tuplet (note/chord),
    //		melody (note/rest/melody), and band (two voices)
    // Testing strategy: play(player, startTick) and getDuration()
    //		note (accidental, octave), rest, chord, tuplet (note/chord), 
    //		melody (note/rest/melody) and band (two voices)
    // Testing strategy: modLength(modifier)
    //		tuplet (note/chord) - correct return values for getDuration and play
    // Testing strategy: parse(string)
    //		note (different octaves, accidental), rest, 
    //		length modifier (rest/note), chord, tuplet, melody (repeats with/without   
    //		begin repeat bar |:), alternate endings, single line/multiple lines), 
    //		band (voice fields, single line/multiple lines)
	//		accidental applied to same notes in a single octave in a measure
	//		key signature applied to same note in all octaves throughout the piece
	//		key signature cancelled by accidental

    @Test
    public void testNoteToString() {
    	assertEquals("string for a note", note.toString(), "^C'24");
    }
    
    @Test
    public void testRestToString() {
    	assertEquals("string for a rest", rest.toString(), "z12");
    }
    
    @Test
    public void testChordToString() {
    	assertEquals("string for a chord", chord.toString(), "[^C'24^D24]");
    }
    
    @Test
    public void testTupletToString() {
    	assertEquals("string for a duplet", tuplet.toString(), "(2^C'24^D24");
    }
    
    @Test
    public void testMelodyToString() {
    	assertEquals("string for a melody", melody1.toString(), "^C'24 z12");
    }
    
    @Test
    public void testBandToString() {
    	voices1.put("1", melody1);
    	voices1.put("2", melody2);
    	Band band = new Band(voices1);
    	assertEquals("string for two voices", band.toString(), 
    			"[|^C'24 z12|]\n[|^C'24 z12 ^C'24|]\n");
    }

    @Test
    public void testPlayNote() throws MidiUnavailableException, InvalidMidiDataException {
    	SequencePlayer player = new SequencePlayer(Music.DEFAULT_TEMPO, Music.TICKS_WHOLE_NOTE);
    	assertEquals("play note", note.play(player, 0), 24);
    	assertEquals("note duration", note.getDuration(), 24);
    }
    
    @Test
    public void testPlayRest() throws MidiUnavailableException, InvalidMidiDataException {
    	SequencePlayer player = new SequencePlayer(Music.DEFAULT_TEMPO, Music.TICKS_WHOLE_NOTE);
    	assertEquals("play rest", rest.play(player, 0), 12);
    	assertEquals("rest duration", rest.getDuration(), 12);
    }
    
    @Test
    public void testPlayChord() throws MidiUnavailableException, InvalidMidiDataException {
    	SequencePlayer player = new SequencePlayer(Music.DEFAULT_TEMPO, Music.TICKS_WHOLE_NOTE);
    	assertEquals("play chord", chord.play(player, 0), 24);
    	assertEquals("chord duration", chord.getDuration(), 24);
    }
    
    @Test
    public void testPlayTupletofNotes() throws MidiUnavailableException, InvalidMidiDataException {
    	SequencePlayer player = new SequencePlayer(Music.DEFAULT_TEMPO, Music.TICKS_WHOLE_NOTE);
    	assertEquals("play tuplet", tuplet.play(player, 0), 72);
    	assertEquals("chord duration", tuplet.getDuration(), 72);
    }
    
    @Test
    public void testPlayTupletofChordAndNote() throws MidiUnavailableException, InvalidMidiDataException {
    	SequencePlayer player = new SequencePlayer(Music.DEFAULT_TEMPO, Music.TICKS_WHOLE_NOTE);
    	assertEquals("play tuplet", tuplet2.play(player, 0), 72);
    	assertEquals("chord duration", tuplet2.getDuration(), 72);
    }
    
    @Test
    public void testPlayMelody() throws MidiUnavailableException, InvalidMidiDataException {
    	SequencePlayer player = new SequencePlayer(Music.DEFAULT_TEMPO, Music.TICKS_WHOLE_NOTE);
    	assertEquals("play melody", melody2.play(player, 0), 60);
    	assertEquals("note duration", melody2.getDuration(), 60);
    }
    
    @Test
    public void testPlayBand() throws MidiUnavailableException, InvalidMidiDataException {
    	SequencePlayer player = new SequencePlayer(Music.DEFAULT_TEMPO, Music.TICKS_WHOLE_NOTE);
    	voices1.put("1", melody1);
    	voices1.put("2", melody2);
    	Band band = new Band(voices1);
    	assertEquals("play melody", band.play(player, 0), 60);
    	assertEquals("band duration", band.getDuration(), 60);
    }
    
    @Test
    public void testNoteEquality() {
    	Note equalNote = new Note (new Pitch('D').transpose(11), 24);
    	Note diffNote = new Note (new Pitch('C').transpose(13), 12);
    	assertTrue("notes are equal", note.equals(equalNote));
    	assertFalse("notes are different", note.equals(diffNote));
    	assertEquals("equal notes have same hash code", note.hashCode(), equalNote.hashCode());
    	assertTrue("unique notes have unique hash code", note.hashCode() != diffNote.hashCode());
    }
    
    @Test
    public void testRestEquality() {
    	Rest equalRest = new Rest(12);
    	Rest diffRest = new Rest(24);
    	assertTrue("rests are equal", rest.equals(equalRest));
    	assertFalse("rests are different", rest.equals(diffRest));
    	assertEquals("equal rests have same hash code", rest.hashCode(), equalRest.hashCode());
    	assertTrue("unique rests have unique hash code", rest.hashCode() != diffRest.hashCode());
    }
    
    @Test
    public void testChordEquality() {
    	Chord equalChord = new Chord(Arrays.asList(note2, note));
    	Chord diffChord = new Chord(Arrays.asList(note, note));
    	assertTrue("chords are equal", chord.equals(equalChord));
    	assertFalse("chords are different", chord.equals(diffChord));
    	assertEquals("equal chords have same hash code", chord.hashCode(), equalChord.hashCode());
    	assertTrue("unique chords have unique hash code", chord.hashCode() != diffChord.hashCode());
    }

    @Test
    public void testTupletEquality() {
    	Tuplet equalTuplet = new Tuplet(Arrays.asList(note, note2), 2);
    	Tuplet diffTuplet = new Tuplet(Arrays.asList(note2, note), 2);
    	assertTrue("tuplet are equal", tuplet.equals(equalTuplet));
    	assertFalse("tuplet are different", tuplet.equals(diffTuplet));
    	assertEquals("equal tuplets have same hash code", tuplet.hashCode(), equalTuplet.hashCode());
    	assertTrue("unique tuplets have unique hash code", tuplet.hashCode() != diffTuplet.hashCode());
    }
    
    @Test
    public void testMelodyEquality() {
    	Melody equalMelody = new Melody(note, rest);
    	Melody diffMelody = new Melody(rest, note);
    	assertTrue("melodies are equal", melody1.equals(equalMelody));
    	assertFalse("melodies are different", melody1.equals(diffMelody));
    	assertEquals("equal melodies have same hash code", melody1.hashCode(), equalMelody.hashCode());
    	assertTrue("unique melodies have unique hash code", melody1.hashCode() != diffMelody.hashCode());
    }

	@Test
	public void testBandEquality() {
    	voices1.put("1", melody1);
    	voices1.put("2", melody2);
    	Map <String, Music> samevoices = new HashMap<>();
    	samevoices.put("1", melody1);
    	samevoices.put("2", melody2);
    	Map <String, Music> diffvoices = new HashMap<>();
    	diffvoices.put("1", melody2);
    	diffvoices.put("2", melody1);
    	Band band = new Band(voices1);
		Band equalBand = new Band(samevoices);
	  	Band diffBand = new Band(diffvoices);
	  	assertTrue("bands are equal", band.equals(equalBand));
	  	assertFalse("bands are different", band.equals(diffBand));
	  	assertEquals("equal bands have same hash code", band.hashCode(), equalBand.hashCode());
	  	assertTrue("unique bands have unique hash code", band.hashCode() != diffBand.hashCode());
	}
    
	 @Test 
	public void TestParseNoteWithAccidentalInLowOctave() {
		Map <String, Integer> key = new HashMap<>();
		List <String> voices = new ArrayList<>();
		assertEquals("parse a note", Music.parseMusic("^C'\n", 24, key, voices).toString(), "^C'24");
	 }
  
	@Test 
	public void TestParseNoteAffectedByKeySignature() {
		Map <String, Integer> key = new HashMap<>();
		key.put("B", -1);
		List <String> voices = new ArrayList<>();
		assertEquals("parse a note", Music.parseMusic("B,,\n", 24, key, voices).toString(), "^A,,24");
	}
	
	@Test 
	public void TestParseRestWithLengthModifier() {
		Map <String, Integer> key = new HashMap<>();
		List <String> voices = new ArrayList<>();
		assertEquals("parse a rest", Music.parseMusic("z/4\n", 24, key, voices).toString(), "z6");
	}
	
	@Test 
	public void TestParseChord() {
		Map <String, Integer> key = new HashMap<>();
		List <String> voices = new ArrayList<>();
		assertEquals("parse a chord", Music.parseMusic("[CEG]\n", 24, key, voices).toString(), "[C24E24G24]");
	}
	
	@Test 
	public void TestParseTuplet() {
		Map <String, Integer> key = new HashMap<>();
		List <String> voices = new ArrayList<>();
		assertEquals("parse a tuplet", Music.parseMusic("(3GAB\n", 24, key, voices).toString(), "(3G24A24B24");
	}
	
	@Test 
	public void TestParseOneLineOneMeasure() {
		Map <String, Integer> key = new HashMap<>();
		List <String> voices = new ArrayList<>();
		assertEquals("parse a measure", Music.parseMusic("C,2 C2 c' c''|]\n", 24, key, voices).toString(), 
				"C,48 C48 C''24 C'''24");
	}
	
	@Test 
	public void TestParseOneLineOneMeasureAffectedByKeySignature() {
		Map <String, Integer> key = new HashMap<>();
		key.put("F", 1);
		key.put("C", 1);
		List <String> voices = new ArrayList<>();
		assertEquals("parse a measure where notes are affected by key signature",
				Music.parseMusic("C,2 C2 c' c''|]\n", 24, key, voices).toString(), 
				"^C,48 ^C48 ^C''24 ^C'''24");
	}
	
	@Test 
	public void TestParseOneLineOneMeasureAffectedByAccidental() {
		Map <String, Integer> key = new HashMap<>();
		List <String> voices = new ArrayList<>();
		assertEquals("parse a measure, effect of accidental last through the measure",
				Music.parseMusic("^C D c C|\n", 24, key, voices).toString(), 
				"^C24 D24 C'24 ^C24");
	}
	
	@Test 
	public void TestParseOneLineTwoMeasureAffectedByKeySignatureAndAccidental() {
		Map <String, Integer> key = new HashMap<>();
		key.put("E", -1);
		List <String> voices = new ArrayList<>();
		assertEquals("parse two measures affected by key signature and accidental",
				Music.parseMusic("E F ^E E|E E F F|\n", 24, key, voices).toString(), 
				"^D24 F24 E24 E24 ^D24 ^D24 F24 F24");
	}
	
	@Test 
	public void TestParseOneVoiceMultipleLines() {
		Map <String, Integer> key = new HashMap<>();
		key.put("E", -1);
		List <String> voices = new ArrayList<>();
		assertEquals("parse two measures affected by key signature and accidental",
				Music.parseMusic("E F ^E E|\nE E F F|\n", 24, key, voices).toString(), 
				"^D24 F24 E24 E24 ^D24 ^D24 F24 F24");
	}
	
	@Test 
	public void TestParseRepeatWithBeginRepeatBar() {
		Map <String, Integer> key = new HashMap<>();
		List <String> voices = new ArrayList<>();
		assertEquals("parse repeated measures",
				Music.parseMusic("|: C D E F | G A B c :|\n", 24, key, voices).toString(), 
				"C24 D24 E24 F24 G24 A24 B24 C'24 C24 D24 E24 F24 G24 A24 B24 C'24");
	}
	
	@Test 
	public void TestParseRepeatWithBeginRepeatBarAndAlternateEnding() {
		Map <String, Integer> key = new HashMap<>();
		List <String> voices = new ArrayList<>();
		String music = 
				"C24 D24 E24 F24 G24 A24 B24 C'24 G24 A24 B24 B24 C24 D24 E24 F24 F24 E24 D24 C24";
		assertEquals("parse repeated measures with alternate endings",
				Music.parseMusic("|: C D E F |[1 G A B c | G A B B :|[2 F E D C |\n", 24, key, voices)
				.toString(), music);
	}
	
	@Test 
	public void TestParseRepeatNoBeginRepeatBarAndAlternateEnding() {
		Map <String, Integer> key = new HashMap<>();
		List <String> voices = new ArrayList<>();
		String music = 
				"C24 D24 E24 F24 G24 A24 B24 C'24 G24 A24 B24 B24 C24 D24 E24 F24 F24 E24 D24 C24";
		assertEquals("parse repeated measures with alternate endings",
				Music.parseMusic("C D E F |[1 G A B c | G A B B :|[2 F E D C |\n", 24, key, voices)
				.toString(), music);
	}
	
	@Test 
	public void TestParseMultipleVoicesOneLine() {
		Map <String, Integer> key = new HashMap<>();
		List <String> voices = new ArrayList<>();
		assertEquals("parse multiple voices with a single note",
				Music.parseMusic("V: 1\n" + "C\n" + "V: 2\n" + "E\n" + "V: 3\n" + "G\n", 24, key, voices)
				.toString(), "[|C24|]\n" + "[|E24|]\n" + "[|G24|]\n");
	}
	
	@Test 
	public void TestParseMultipleVoicesMultipleLines() {
		Map <String, Integer> key = new HashMap<>();
		List <String> voices = new ArrayList<>();
		assertEquals("parse multiple voices with two lines of music",
				Music.parseMusic("V: 1\n" + "C\n" + "V: 2\n" + "E\n" + "V: 1\n" + "G\n" + 
		"V: 2\n" + "B\n", 24, key, voices).toString(), "[|C24 G24|]\n" + "[|E24 B24|]\n");
	}
	
	@Test 
	public void TestParseMultipleVoicesMultipleLinesAndComment() {
		Map <String, Integer> key = new HashMap<>();
		List <String> voices = new ArrayList<>();
		assertEquals("parse multiple voices with two lines of music",
				Music.parseMusic("V: 1\n" + "C\n" + "V: 2\n" + "E\n" + "%\n" + "V: 1\n" + "G\n" + 
		"V: 2\n" + "B\n", 24, key, voices).toString(), "[|C24 G24|]\n" + "[|E24 B24|]\n");
	}
  
}
