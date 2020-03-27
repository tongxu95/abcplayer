package abc.sound;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * An immutable data type representing the tune header. 
 * 
 */
public class Header {
	private final String title;
	private final String author;
	private final int defaultDuration;
	private final double meter;
	private final int tempo;
	private final String key;
	
	// Abstraction function:
    //   represent the tune header  
    // Representation invariant:
	//	 title, author are nonempty strings;
	//   key is a valid key signature
	//	 defaultDuration, meter, tempo > 0;
    // Safety from rep exposure:
    //   All fields are private and final
	//	 All fields are immutable types
	
    /**
     * Create tune header
     * @param title title of piece
     * @param author name of composer 
     * @param noteValue length or duration of a note
     * @meter meter sum of the durations of all notes within a bar 
     * @param tempo  number of beats of the given length to play per minute
     * @param key key signature of the piece
     */
	public Header(String title, String author, double noteValue, double meter, int tempo, 
			String key) {
		this.title = title;
		this.author = author;
		this.defaultDuration = (int) noteValue * Music.TICKS_WHOLE_NOTE;
		this.meter = meter;
		this.tempo = tempo;
		this.key = key;
		checkRep();
	}
	
	private void checkRep() {
		final List <String> keySignatures = Arrays.asList("C", "Am", "G", "Em", "D", "Bm", 
				"A", "F#m", "E", "C#m", "B", "G#m", "F#", "D#m", "C#", "A#m", "F", "Dm", "Bb", 
				"Gm", "Eb", "Cm", "Ab", "Fm", "Db", "Bbm", "Gb", "Ebm", "Cb", "Abm");
		assert ! title.isEmpty();
		assert ! author.isEmpty();
		assert defaultDuration > 0;
		assert meter > 0;
		assert tempo > 0;
		assert keySignatures.contains(key);
	}
	
    /**
     * @return the collection of accidentals, as specified by the key signature in the header    
     * */
	public List<String> getAccidentals() {
		List<String> accidentals = new ArrayList<>();
		if (key == "G" || key == "Em" ) {
			accidentals.add("^F");
		} else if (key == "D" || key == "Bm") {
			accidentals.addAll(Arrays.asList("^F", "^C"));
		} else if (key == "A" || key == "F#m") {
			accidentals.addAll(Arrays.asList("^F", "^C", "^G"));
		} else if (key == "E" || key == "C#m") {
			accidentals.addAll(Arrays.asList("^F", "^C", "^G", "^D"));
		}  else if (key == "B" || key == "G#m") {
			accidentals.addAll(Arrays.asList("^F", "^C", "^G", "^D", "^A"));
		}  else if (key == "F#" || key == "D#m") {
			accidentals.addAll(Arrays.asList("^F", "^C", "^G", "^D", "^A", "E"));
		}  else if (key == "C#" || key == "A#m") {
			accidentals.addAll(Arrays.asList("^F", "^C", "^G", "^D", "^A", "E", "B"));
		}  else if (key == "F" || key == "Dm") {
			accidentals.addAll(Arrays.asList("_B"));
		}  else if (key == "Bb" || key == "Gm") {
			accidentals.addAll(Arrays.asList("_B", "_E"));
		}  else if (key == "Eb" || key == "Cm") {
			accidentals.addAll(Arrays.asList("_B", "_E", "_A"));
		}  else if (key == "Ab" || key == "Fm") {
			accidentals.addAll(Arrays.asList("_B", "_E", "_A", "_D"));
		}  else if (key == "Db" || key == "Bbm") {
			accidentals.addAll(Arrays.asList("_B", "_E", "_A", "_D", "_G"));
		}  else if (key == "Gb" || key == "Ebm") {
			accidentals.addAll(Arrays.asList("_B", "_E", "_A", "_D", "_G", "_C"));
		}  else if (key == "Cb" || key == "Abm") {
			accidentals.addAll(Arrays.asList("_B", "_E", "_A", "_D", "_G", "_C", "_F"));
		}
		return accidentals;
	}
	
    /**
     * @return the default note duration of a tone, in number of ticks    
     * */
	public int getDefaultDuration() {
		return defaultDuration;
	}
	
}
