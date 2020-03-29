package abc.sound;

public class Band implements Music {
	private final Music voice1, voice2;
	
	public Band (Music voice1, Music voice2) {
		this.voice1 = voice1;
		this.voice2 = voice2;
		checkRep();
	}
	
	private void checkRep() {
		assert voice1 != null;
		assert voice2 != null;
	}
	
    /**
     * @return one voice in this music piece
     */
	public Music getVoice1() {
		return voice1;
	}
	
    /**
     * @return other voice(s) in this music piece
     */
	public Music getVoice2() {
		return voice2;
	}
	
	public int play (SequencePlayer player, int startTick) {
		int ticks1 = voice1.play(player, startTick);
		int ticks2 = voice2.play(player, startTick);
		return Integer.max(ticks1, ticks2);
	}
	
	@Override
	public boolean equals (Object thatObject) {
		if (! (thatObject instanceof Band)) return false;
		Band thatBand = (Band) thatObject;
		return (voice1.equals(thatBand.getVoice1()) && voice2.equals(thatBand.getVoice2()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + voice1.hashCode();
		result = prime * result + voice2.hashCode();
		return result;
	}
	
    /**
     * @return a string representation of this note in abc music notation, consisting of 
     * 	       the pitch and the note duration in ticks. 
     */
	@Override
	public String toString() {
		return "[|" + voice1.toString() + "|]\n[|" + voice2.toString() + "|]";
	}
	
}
