package abc.sound;

import java.util.Map;
import java.util.HashMap;

/**
 * 
 * An immutable data type representing music with multiple voices. 
 * 
 */
public class Band implements Music {
	
	private final Map<String, Music> voices;
	
	// Abstraction function:
    //   represent two musical tones being played being simultaneously 
    // Representation invariant:
	//	 music1, music2 != null
    // Safety from rep exposure:
    //   All fields are private and final
	//	 All fields are immutable 
	
	/**
	 * @param voices mapping of voice labels to melodies 
	 */
	public Band (Map<String, Music> voices) {
		this.voices = new HashMap<>(voices);
		checkRep();
	}
	
	private void checkRep() {
		assert voices != null;
	}
	
    /**
     * @return melody for a given voice
     */
	public Music getVoice(String label) {
		return voices.get(label);
	}
	
	@Override
	public int getDuration () {
		 return voices.values().stream().mapToInt(v -> v.getDuration()).max().orElse(0);
	}
	
	@Override
	public Band modLength(double modifier) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int play (SequencePlayer player, int startTick) {
		return voices.values().stream().mapToInt(v -> v.play(player, startTick)).max().orElse(0);
	}
	
	@Override
	public boolean equals (Object thatObject) {
		if (! (thatObject instanceof Band)) return false;
		Band thatBand = (Band) thatObject;
		for (String voice : voices.keySet()) {
			if (! (voices.get(voice).equals(thatBand.getVoice(voice)))) return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		for (String voice : voices.keySet()) {
			result = prime * result + voices.get(voice).hashCode();
		}
		return result;
	}
	
    /**
     * @return the string representation of music consisting of multiple voices/melodies. 
     */
	@Override
	public String toString() {
		String band = "";
		for (String voice : voices.keySet()) band += "[|" + voices.get(voice).toString() + "|]\n";
		return band;
	}
	
}
