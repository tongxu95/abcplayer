package abc.sound;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

/**
 * 
 * An immutable data type representing a chord or a group of notes that is played simultaneously. 
 * 
 */
public class Chord implements Music{
	
	private final List<Note> notes;
	
	// Abstraction function:
    //   represent a chord or a group of notes that is played simultaneously
    // Representation invariant:
	//	 notes is not empty;
    // Safety from rep exposure:
    //   Field is private and final 
	//	 notes is a mutable list, so the Chord constructor and getNotes() method make defensive 
	//	 copies of the List
	
    /**
     * Create a chord
     * @param chord a list of notes that is played simultaneously
     */
	public Chord (List<Note> chord) {
		this.notes = new ArrayList<>(chord);
		checkRep();
	}
	
	private void checkRep() {
		assert ! notes.isEmpty();
	}
	
	public List<Music> getNotes() {
		return new ArrayList<>(notes);
	}
	
	@Override
	public int getDuration() {
		return notes.get(0).getDuration();
	}
	
	@Override
	public Chord modLength(double modifier) {
		List <Note> chord = notes.stream().map(n -> n.modLength(modifier))
				.collect(Collectors.toList());
		return new Chord (chord);
	}
	
	@Override
	public int play (SequencePlayer player, int startTick) {
		notes.stream().map(n -> n.play(player, startTick));
		return startTick + getDuration();
	}
	
	@Override
	public boolean equals (Object thatObject) {
		if (! (thatObject instanceof Chord)) return false;
		Chord thatChord = (Chord) thatObject;
		// order of notes in chord is not important since they are played simultaneously
		return notes.size() == thatChord.getNotes().size() && 
				notes.stream().allMatch(n -> thatChord.getNotes().contains(n));
	}
	
	@Override
	public int hashCode() {
		return notes.stream().mapToInt(n -> n.hashCode()).sum();
	}
	
    /**
     * @return a string representation of this chord, denoted by a group of notes between
     * 	         square brackets ([ and ])
     */
	@Override
	public String toString() {
		return "[" + notes.stream().map(n -> n.toString()).reduce("", String::concat) + "]";
	}
	
}
