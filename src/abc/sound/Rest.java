package abc.sound;

/**
 * 
 * An immutable data type representing a rest in music. 
 * 
 */
public class Rest implements Music {
	
	private final int duration;
	
	// Abstraction function:
    //   represent a rest in music with duration in number of ticks
    // Representation invariant:
	//	 duration > 0;
    // Safety from rep exposure:
    //   Field is private and final 
	//	 Field is an immutable integer
	
    /**
     * Create a rest in music
     * @param duration rest duration (number of ticks)
     */
	public Rest(int duration) {
		this.duration = duration;
		checkRep();
	}
	
	private void checkRep() {
		assert duration > 0;
	}
	
    /**
     * @return duration of the rest (number of ticks)
     */
	public int getDuration() {
		return duration;
	}
	
	@Override
	public int play (SequencePlayer player, int startTick) {
		return startTick + duration;
	}
	
	@Override
	public boolean equals (Object thatObject) {
		if (! (thatObject instanceof Rest)) return false;
		Rest thatRest = (Rest) thatObject;
		return duration == thatRest.getDuration();
	}
	
	@Override
	public int hashCode() {
		return duration;
	}
	
    /**
     * @return a string representation of this rest in abc music notation. The string 
     * 	       consists of the rest (denoted "z"), and the rest duration in ticks. 
     */
	@Override
	public String toString() {
		return "z" + Integer.toString(duration);
	}
	
}
