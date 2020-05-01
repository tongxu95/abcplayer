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
    //   represent a musical note with the given pitch and duration in numbers of tick
    // Representation invariant:
	//	 pitch != null;
	//	 duration > 0;
    // Safety from rep exposure:
    //   All fields are private and final
	//	 All fields are immutable types
	
    /**
     * Create a music note
     * @param pitch of a musical note 
     * @param duration note duration (number of ticks)
     */
	public Note (Pitch pitch, int duration) {
		this.duration = duration;
		this.pitch = pitch;
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
	
	@Override
	public int getDuration() {
		return duration;
	}	
	
	@Override
	public Note modLength(double modifier) {
		return new Note (pitch, (int) Math.round(duration*modifier));
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
     * @return a string representation of this note, consisting of the pitch and the
     * 	        note duration in ticks (a whole note last for 192 ticks). 
     */
	@Override
	public String toString() {
		return pitch.toString() + Integer.toString(duration);
	}
	
}
