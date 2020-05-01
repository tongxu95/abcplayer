package abc.sound;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Tuplet implements Music{
	private final int tupletNum;
	private final double modifier;
	private final List<Music> notes;
	
	// Abstraction function:
    //   represent a tuplet of duplet, triplet, or quadruplet
    // Representation invariant:
	//	 modifier > 0;
	//	 notes is not empty;
    // Safety from rep exposure:
    //   Field is private and final 
	//	 notes is a mutable list, so the getNotes() method make defensive copies of the List
	
	/**
	 * 
	 * @param notes list of notes in the tuplet
	 * @param tuplet number
	 */
	public Tuplet(List<Music> notes, int tupletNum) {
		assert tupletNum >= 2 && tupletNum <= 4;
		this.tupletNum = tupletNum;
		if (tupletNum == 2) modifier = 3.0/2.0;
		else if (tupletNum == 3) modifier = 2.0/3.0;
		else modifier = 3.0/4.0;
		this.notes = notes;
		checkRep();
	}
	
	private void checkRep() {
		assert tupletNum > 0 && modifier > 0;
		assert ! notes.isEmpty();
	}

	public List<Music> getNotes() {
		return new ArrayList<>(notes);
	}
	
	@Override
	public int getDuration () {
		return (int) (modifier * notes.stream().
				map(n -> n.getDuration()).reduce(0, (a,b) -> a+b));
	}
	
	@Override
	public Tuplet modLength(double modifier) {
		throw new UnsupportedOperationException();

	}
	
	@Override
	public int play (SequencePlayer player, int startTick) {
		int newStartTick = startTick;
		List<Music> tuplet = notes.stream().
				map(n -> n.modLength(modifier)).collect(Collectors.toList());
		for (Music note : tuplet) {;
			newStartTick = note.play(player, newStartTick);
		}
		return newStartTick;
	}

	@Override
	public boolean equals (Object thatObject) {
		if (! (thatObject instanceof Tuplet)) return false;
		Tuplet thatTuplet = (Tuplet) thatObject;
		// order of notes in tuplet is important since they are played sequentially
		return notes.equals(thatTuplet.getNotes());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		for (Music note : notes) {
			result = prime * result + note.hashCode();
		}
		return result;
	}
	
    /**
     * @return a string representation of this tuplet, denoted by an opening round bracket (, 
     * 		   the tuplet number, and the notes in the tuplet
     */
	@Override
	public String toString() {
		return "(" + Integer.toString(tupletNum) + 
				notes.stream().map(n -> n.toString()).reduce("", String::concat);
	}
}
