package abc.sound;

/**
 * 
 * An immutable data type representing a musical note. 
 * 
 */
public class Note implements Music {
	private final Pitch pitch;
	private final int duration;
	
	// Abstraction function:
    //   represent a musical note  
    // Representation invariant:
	//	 pitch != null;
	//	 duration > 0;
    // Safety from rep exposure:
    //   All fields are private and final
	//	 All fields are immutable types
	
    /**
     * Create a music note
     * @param note a musical note in abc music notation
     * @param duration note duration (number of ticks)
     */
	public Note (String note, int duration) {
		this.duration = duration;
		String[] specs = note.split("");
		int semitones = 0;
		String baseNote = "";
		for (String spec : specs) {
			if (spec.matches("^|_")) {
				semitones += spec.matches("^") ? 1 : -1;
			} else if (spec.matches("[a-gA-G]")) {
				baseNote = spec.toUpperCase();
				if (spec.matches("[a-g]")) {
					semitones += 12;
				}
			} else if (spec.matches(",|'")) {
				semitones += spec.matches("'") ? 12 : -12;
			}
		}
		pitch = new Pitch(baseNote.charAt(0)).transpose(semitones);
		checkRep();
	}
	
	private void checkRep() {
		assert pitch != null;
		assert duration > 0;
	}	
	
    /**
     * @return pitch of the note
     */
	public Pitch getPitch() {
		return pitch;
	}
	
    /**
     * @return duration of the note (number of ticks)
     */
	public int getDuration() {
		return duration;
	}
	
	@Override
	public int play (SequencePlayer player, int startTick) {
		player.addNote(pitch.toMidiNote(), startTick, duration);
		return startTick + duration;
	}
	
	@Override
	public boolean equals (Object thatObject) {
		if (! (thatObject instanceof Note)) return false;
		Note thatNote = (Note) thatObject;
		return pitch.equals(thatNote.getPitch()) && duration == thatNote.getDuration();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pitch.hashCode();
		result = prime * result + duration;
		return result;
	}
	
    /**
     * @return a string representation of this note in abc music notation, consisting of 
     * 	       the pitch and the note duration in ticks. 
     */
	@Override
	public String toString() {
		return pitch.toString() + "1/" + Integer.toString(duration);
	}
	
}
