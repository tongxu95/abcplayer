package abc.sound;

/**
 * 
 * An immutable data type representing a melody. 
 * 
 */
public class Melody implements Music {
	private final Music music1, music2;
	
	// Abstraction function:
    //   represent two musical tones being played sequentially with music1 being played 
	//	 before music2  
    // Representation invariant:
	//	 music1, music2 != null
    // Safety from rep exposure:
    //   All fields are private and final
	//	 All fields are immutable 
	
    /**
     * Create a melody.
     * @param music1 Musical tones to be played first
     * @param music2 Musical tones to be played after music1
     */
	public Melody (Music music1, Music music2) {
		this.music1 = music1;
		this.music2 = music2;
		checkRep();
	}
	
	private void checkRep() {
		assert music1 != null;
		assert music2 != null;
	}
	
    /**
     * @return first music piece 
     */
	public Music getMusic1() {
		return music1;
	}
	
    /**
     * @return second music piece
     */
	public Music getMusic2() {
		return music2;
	}
	
	public int play (SequencePlayer player, int startTick) {
		int tick = music1.play(player, startTick);
		return music2.play(player, tick);
	}
	
	@Override
	public boolean equals (Object thatObject) {
		if (! (thatObject instanceof Melody)) return false;
		Melody thatMelody = (Melody) thatObject;
		return music1.equals(thatMelody.getMusic1()) && music2.equals(thatMelody.getMusic2());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + music1.hashCode();
		result = prime * result + music2.hashCode();
		return result;
	}
	
    /**
     * @return the string representation in abc music notation. 
     */
	@Override
	public String toString() {
		return music1.toString() + " " + music2.toString();
	}
	
}
