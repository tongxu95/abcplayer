package abc.sound;

import abc.parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * 
 * An immutable data type representing the tune header. 
 * 
 */
public class Header {
	private final String title, author, meter, key;
	private final int index, defaultDuration, tempo_bpm, tempo_beat;
	private List <String> voices;
	
	// Abstraction function:
    //   represent the tune header  
    // Representation invariant:
	//	 title, author are nonempty strings;
	//   key is a valid key signature
	//	 index, defaultDuration, meter, tempo_beat, tempo_bpm > 0;
	//	 voices != null
    // Safety from rep exposure:
    //   All fields are private and final except voices (voice may be labeled in body but 
	//	 not in header
	//	 All fields except voices are immutable types; voices is a mutable list, so Header()
	//	 constructor, getVoices() and addVoices() make defensive copies of the List
	
    /**
     * Create tune header
     * @param index a number similar to the tracking number in a recording
     * @param title title of piece
     * @param author name of composer 
     * @param noteValue length or duration of a note
     * @param meter sum of the durations of all notes within a bar 
     * @param tempo_beat beat length, may be different from noteValue
     * @param tempo_bpm number of beats per minute
     * @param key key signature of the piece
     * @param voices voices that are played simultaneously in the piece 
     */
	public Header(int index, String title, String author, double noteValue, String meter, 
			double tempo_beat, int tempo_bpm, String key, List<String> voices) {
		this.index = index;
		this.title = title;
		this.author = author;
		this.defaultDuration = (int) (noteValue * Music.TICKS_WHOLE_NOTE);
		this.meter = meter;
		this.tempo_beat = (int) (tempo_beat * Music.TICKS_WHOLE_NOTE);
		this.tempo_bpm = tempo_bpm;
		this.key = key;
		this.voices = new ArrayList<>(voices);
		checkRep();
	}
	
	private void checkRep() {
		final List <String> keySignatures = Arrays.asList("C", "Am", "G", "Em", "D", "Bm", 
				"A", "F#m", "E", "C#m", "B", "G#m", "F#", "D#m", "C#", "A#m", "F", "Dm",  
				"Bb", "Gm", "Eb", "Cm", "Ab", "Fm", "Db", "Bbm", "Gb", "Ebm", "Cb", "Abm");
		assert ! title.isEmpty();
		assert ! author.isEmpty();
		assert ! meter.isEmpty();
		assert index > 0;
		assert defaultDuration > 0;
		assert tempo_beat > 0;
		assert tempo_bpm > 0;
		assert keySignatures.contains(key);
		assert voices != null;
	}
	
	
    /**
     * Parse the music header.
     * @param input string to parse.
     * @return header AST for the input
     * @throws IllegalArgumentException if the expression is invalid
     */
	public static Header parseHeader(String input) throws IllegalArgumentException {
		try {
			CharStream stream = new ANTLRInputStream (input);
			ABCHeaderLexer lexer = new ABCHeaderLexer(stream);
			lexer.reportErrorsAsExceptions();

			TokenStream tokens = new CommonTokenStream(lexer);
			ABCHeaderParser parser = new ABCHeaderParser(tokens);
			parser.reportErrorsAsExceptions();

			ParseTree tree = parser.root();
			ParseTreeWalker walker = new ParseTreeWalker();
			MakeHeader walkHeader = new MakeHeader();
			walker.walk(walkHeader, tree);
			return walkHeader.getHeader();
		} catch (Exception e) {
			throw new IllegalArgumentException("ParseError: illegal file format");
		}
	}
	
    /**
     * @return the collection of accidentals, as specified by the key signature in the header    
     * */
	public Map<String, Integer> getKeySig () {
		Map<String, Integer> keySig = new HashMap<>();
		if (key == "G" || key == "Em" ) {
			keySig.put("F", 1);
		} else if (key == "D" || key == "Bm") {
			keySig.put("F", 1);
			keySig.put("C", 1);
		} else if (key == "A" || key == "F#m") {
			keySig.put("F", 1);
			keySig.put("C", 1);
			keySig.put("G", 1);
		} else if (key == "E" || key == "C#m") {
			keySig.put("F", 1);
			keySig.put("C", 1);
			keySig.put("G", 1);
			keySig.put("D", 1);
		}  else if (key == "B" || key == "G#m") {
			keySig.put("F", 1);
			keySig.put("C", 1);
			keySig.put("G", 1);
			keySig.put("D", 1);
			keySig.put("A", 1);
		}  else if (key == "F#" || key == "D#m") {
			keySig.put("F", 1);
			keySig.put("C", 1);
			keySig.put("G", 1);
			keySig.put("D", 1);
			keySig.put("A", 1);
			keySig.put("E", 1);
		}  else if (key == "C#" || key == "A#m") {
			keySig.put("F", 1);
			keySig.put("C", 1);
			keySig.put("G", 1);
			keySig.put("D", 1);
			keySig.put("A", 1);
			keySig.put("E", 1);
			keySig.put("B", 1);
		}  else if (key == "F" || key == "Dm") {
			keySig.put("B", -1);
		}  else if (key == "Bb" || key == "Gm") {
			keySig.put("B", -1);
			keySig.put("E", -1);
		}  else if (key == "Eb" || key == "Cm") {
			keySig.put("B", -1);
			keySig.put("E", -1);
			keySig.put("A", -1);
		}  else if (key == "Ab" || key == "Fm") {
			keySig.put("B", -1);
			keySig.put("E", -1);
			keySig.put("A", -1);
			keySig.put("D", -1);
		}  else if (key == "Db" || key == "Bbm") {
			keySig.put("B", -1);
			keySig.put("E", -1);
			keySig.put("A", -1);
			keySig.put("D", -1);
			keySig.put("G", -1);
		}  else if (key == "Gb" || key == "Ebm") {
			keySig.put("B", -1);
			keySig.put("E", -1);
			keySig.put("A", -1);
			keySig.put("D", -1);
			keySig.put("G", -1);
			keySig.put("C", -1);
		}  else if (key == "Cb" || key == "Abm") {
			keySig.put("B", -1);
			keySig.put("E", -1);
			keySig.put("A", -1);
			keySig.put("D", -1);
			keySig.put("G", -1);
			keySig.put("C", -1);
			keySig.put("F", -1);
		}
		return keySig;
	}
	
    /**
     * @return the default note duration of a tone, in number of ticks    
     * */
	public int getDefaultDuration() {
		return defaultDuration;
	}
	
    /**
     * @return voices in this piece    
     * */
	public List<String> getVoices() {
		return new ArrayList<>(voices);
	}
	
    /**
     * Add voice label to header if voice field was not specified in the header
     * @param voiceLabels List of voice labels 
     * */
	public void addVoices(List<String> voiceLabels) {
		if (voices.isEmpty()) voices = new ArrayList<>(voiceLabels);
		return;
	}
	
	@Override
	public boolean equals (Object thatObject) {
		if (! (thatObject instanceof Header)) return false;
		Header thatHeader = (Header) thatObject;
		return this.toString().equals(thatHeader.toString());
	}
	
	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}
	
    /**
     * @return a string representation of this music header, consisting newline separated fields
     * 		   in the order of Index, Title, Author, Default Note Value, Meter, Tempo, Voices 
     *		   (separated by comma and space) and Key Signature.
     * 		  
     */
	@Override
	public String toString() {
		String header = "Index: " + Integer.toString(index) + "\nTitle: " + title +
				"\nAuthor: " + author + "\nDefault Note Value: " + 
				Integer.toString(defaultDuration) + " ticks\nMeter: " + meter +
				 "\nTempo: " + Integer.toString(tempo_beat) + " ticks per beat, " +
				Integer.toString(tempo_bpm) + " beats per minute\nVoices: " +
				voices.stream().collect(Collectors.joining(", ")) + "\nKey Signature: " 
				+ key + "\n";
		return header;
	}

}
