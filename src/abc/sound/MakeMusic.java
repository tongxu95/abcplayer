package abc.sound;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import abc.parser.ABCMusicListener;
import abc.parser.ABCMusicParser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MakeMusic implements ABCMusicListener {
	private final int defaultDuration;
	private final Map<String, Integer> keySig;
	private List<String> voiceLabels;
	private Stack <Music> stack = new Stack <>();
	private Map<String, String> accidentals = new HashMap<>();
	private boolean startRepeat = false;
	private boolean endRepeat = false;
	private boolean alternateEnding = false;
	
    /**
     * Construct a MakeMusic object.
     * @param defaultDuration default duration of a note in number of ticks.
     * @param keySig list of sharps or flats associated with particular notes in the scale.
     * @param voiceLabels labels of voices that are played simultaneously; list is empty if
     * 		  music contain a single melody.
     */
	public MakeMusic (int defaultDuration, Map<String, Integer> keySig, List<String> voiceLabels) {
		this.defaultDuration = defaultDuration;
		this.keySig = new HashMap<>(keySig);
		this.voiceLabels = new ArrayList<>(voiceLabels);
	}
	
    /**
     * Returns music constructed by this listener object.
     * Requires that this listener has completely walked over an ABCMusic parse tree
     * using ParseTreeWalker.
     * @return Music for the parse tree that was walked
     */
	public Music getMusic() {
		return stack.pop();
	}
	
	
	/*apply key signature; key signature applies throughout the piece, irrespective of the octave */
	private int applyKeySig (String baseNote) {
		int keyShift = 0;
		if (keySig.containsKey(baseNote.toUpperCase())) keyShift = keySig.get(baseNote.toUpperCase());
		return keyShift;
	}
	
	
	/*apply accidental for notes in the same octave and measure */
	private String applyAccidentals (String note) {
		if (accidentals.containsKey(note)) return accidentals.get(note);
		else return "";
	}
	
	
	/* Parse a string into a Pitch and apply key signature and accidentals. */
	private Pitch parsePitch(String pitch) {
		int semitoneUp = 0;
		Matcher matcher = Pattern.compile("([^a-gA-G]+)?([a-gA-G])([,']+)?").matcher(pitch);
		if (! matcher.matches()) throw new IllegalArgumentException();
		String baseNote = matcher.group(2);
		if (baseNote.matches("[a-g]"))	semitoneUp += 12;
		
		String actNote = baseNote;
		if (matcher.group(3) != null) {
			actNote += matcher.group(3);
			String[] octave = matcher.group(3).split("");
			for (String scale : octave) {
				semitoneUp += scale.matches("'") ? 12 : -12;
			}
		}
		
		int shift = applyKeySig(baseNote.toUpperCase());
		String accidental;
		if (matcher.group(1) != null) {
			accidental = matcher.group(1);
			accidentals.put(actNote, accidental);
		} else {
			accidental = applyAccidentals(actNote);
		}		
		// a natural return note to its natural pitch
		if (accidental.equals("=")) {
			return new Pitch (baseNote.toUpperCase().charAt(0)).transpose(semitoneUp);
		} else {
			if (accidental.equals("^")) shift += 1;
			else if (accidental.equals("^^"))	shift += 2;
			else if (accidental.equals("_")) shift += -1;
			else if (accidental.equals("__"))	shift += -2;
			return new Pitch (baseNote.toUpperCase().charAt(0)).transpose(semitoneUp + shift);
		}
	}	
	
	
	/* Return duration in number of ticks after applying modifer to default duration. */
	private int modLength(String modifier) {
		double fraction = 1.0;
		if (modifier.matches("[0-9]+")) fraction *= Double.parseDouble(modifier);
		else {
			Matcher m = Pattern.compile("([0-9]+)?/([0-9]+)?").matcher(modifier);
			if (! m.matches()) throw new IllegalArgumentException();
			if (m.group(1) != null) fraction *= Double.parseDouble(m.group(1));
			if (m.group(2) != null) fraction /= Double.parseDouble(m.group(2));
			// treat absence of denominator as 2
			else fraction /= 2.0; 
		}
		return (int) (defaultDuration * fraction);
	}	

	
	@Override public void exitRoot(ABCMusicParser.RootContext ctx) { }

	@Override public void exitMusic(ABCMusicParser.MusicContext ctx) {
		if (ctx.line() != null) {
			List<ABCMusicParser.LineContext> lines = ctx.line();
			assert stack.size() >= lines.size();
			
			if (voiceLabels.isEmpty()) {
				Music music = new Rest(0);
				for (int i = 0; i < lines.size(); ++i) {
					music = new Melody(stack.pop(), music);
				}
				stack.add(music);
			} else {
				// use map to concatenate sequences belonging to the same voice
				Map <String, Music> voices = new HashMap<>();
				for (String label : voiceLabels) voices.put (label, new Rest(0));
				for (int j = 0; j < lines.size(); j += voiceLabels.size()) {
					for (String label : voiceLabels) {
						voices.put(label, new Melody(voices.get(label), stack.remove(0)));
					}
				}
				stack.add(new Band (voices));
			}	
		}
	}
	
	@Override public void exitLine(ABCMusicParser.LineContext ctx) {
			List<ABCMusicParser.MeasureContext> measures = ctx.measure();
			assert stack.size() >= measures.size();
			
			if (measures.size() > 1) {			
				// if measures contain end repeat bar without begin repeat bar, add 
				// begin repeat bar to the first measure
				boolean endRepeatBar = measures.stream().map(m -> m.getText()).
						anyMatch(m -> m.contains(":|"));
				boolean beginRepeatBar = measures.stream().map(m -> m.getText()).
						anyMatch(m -> m.contains("|:"));
				if (endRepeatBar && ! beginRepeatBar) startRepeat = true;
				
				Music music = new Rest(0);
				Music repeat = new Rest(0);
				for (int i = 0; i < measures.size(); ++i) {
					if (measures.get(i).getText().startsWith("|:")) startRepeat = true;
					if (measures.get(i).getText().endsWith(":|")) endRepeat = true;
					if (measures.get(i).getText().contains("[1")) alternateEnding = true;
					
					Music measure = stack.remove(0);
					music = new Melody (music, measure);
					if (startRepeat && ! alternateEnding) repeat = new Melody (repeat, measure);
					if (endRepeat) {
						if (startRepeat) {
							music = new Melody(music, repeat);
							startRepeat = endRepeat = alternateEnding = false;
						} else {
							
						}

					}				
				}
				stack.add(music);
			}
	}
	
	@Override public void exitMeasure(ABCMusicParser.MeasureContext ctx) { 
		List<ABCMusicParser.ElementContext> elements = ctx.element();
		// remove WHITESPACE from elements
		elements.removeIf(e -> (e.getText().matches("[ \t]")));
		assert stack.size() >= elements.size();
		
		Music music = new Rest(0);
		for (int i = 0; i < elements.size(); ++i) {
			music = new Melody (stack.pop(), music);
		}	
		stack.add(music);
	}
	
	@Override public void exitBarline(ABCMusicParser.BarlineContext ctx) { 
		// clear accidentals from previous measure
		accidentals = new HashMap<>();
	}
	
	@Override public void exitRepeat(ABCMusicParser.RepeatContext ctx) { }
	
	@Override public void exitElement(ABCMusicParser.ElementContext ctx) { }
	
	@Override public void exitNote(ABCMusicParser.NoteContext ctx) { }
	
	@Override public void exitSingle(ABCMusicParser.SingleContext ctx) {
		int duration;
		if (ctx.length() != null) duration = modLength(ctx.length().getText());
		else duration = defaultDuration;

		if (ctx.type().REST() != null) {
			Rest rest = new Rest (duration);
			stack.add(rest);
		} else {
			Note note = new Note (parsePitch(ctx.type().pitch().getText()), duration);
			stack.add(note);
		}
	}
	
	@Override public void exitType(ABCMusicParser.TypeContext ctx) { }
	
	@Override public void exitPitch(ABCMusicParser.PitchContext ctx) { }
	
	@Override public void exitLength(ABCMusicParser.LengthContext ctx) { }
	
	@Override public void exitChord(ABCMusicParser.ChordContext ctx) {
		List<ABCMusicParser.SingleContext> numNotes = ctx.single();
		assert stack.size() >= numNotes.size();
		List<Note> notes = new ArrayList<>();
		for (int i = 0; i < numNotes.size(); ++i) {
			notes.add((Note) stack.pop());
		}
		Collections.reverse(notes);
		Chord chord = new Chord(notes);
		stack.add(chord);
	}
	
	@Override public void exitTuplet(ABCMusicParser.TupletContext ctx) {
		List<ABCMusicParser.NoteContext> numNotes = ctx.note();
		assert stack.size() >= numNotes.size();
		List <Music> notes = new ArrayList<>();
		for (int i = 0; i < numNotes.size(); ++i) {
			notes.add(stack.pop());
		}
		Collections.reverse(notes);
		Tuplet tuplet = new Tuplet(notes, Integer.parseInt(ctx.DIGIT().getText()));
		stack.add(tuplet);
	}
	
	@Override public void exitVoice(ABCMusicParser.VoiceContext ctx) {
		String label = ctx.text().stream().map(n -> n.getText())
				.reduce("", String::concat);
		if (! voiceLabels.contains(label)) voiceLabels.add(label);
	}
	
	@Override public void exitComment(ABCMusicParser.CommentContext ctx) { }
	
	@Override public void exitEol(ABCMusicParser.EolContext ctx) { }
	
	@Override public void exitText(ABCMusicParser.TextContext ctx) { }
	
	@Override public void enterRoot(ABCMusicParser.RootContext ctx) { }
	@Override public void enterMusic(ABCMusicParser.MusicContext ctx) { }
	@Override public void enterLine(ABCMusicParser.LineContext ctx) { }
	@Override public void enterMeasure(ABCMusicParser.MeasureContext ctx) { }
	@Override public void enterBarline(ABCMusicParser.BarlineContext ctx) { }
	@Override public void enterRepeat(ABCMusicParser.RepeatContext ctx) { }
	@Override public void enterElement(ABCMusicParser.ElementContext ctx) { }
	@Override public void enterNote(ABCMusicParser.NoteContext ctx) { }
	@Override public void enterSingle(ABCMusicParser.SingleContext ctx) { }
	@Override public void enterType(ABCMusicParser.TypeContext ctx) { }
	@Override public void enterPitch(ABCMusicParser.PitchContext ctx) { }
	@Override public void enterLength(ABCMusicParser.LengthContext ctx) { }
	@Override public void enterChord(ABCMusicParser.ChordContext ctx) { }
	@Override public void enterTuplet(ABCMusicParser.TupletContext ctx) { }
	@Override public void enterVoice(ABCMusicParser.VoiceContext ctx) { }
	@Override public void enterComment(ABCMusicParser.CommentContext ctx) { }
	@Override public void enterEol(ABCMusicParser.EolContext ctx) { }
	@Override public void enterText(ABCMusicParser.TextContext ctx) { }
	
    @Override public void visitTerminal(TerminalNode terminal) { }
    @Override public void enterEveryRule(ParserRuleContext context) { }
    @Override public void exitEveryRule(ParserRuleContext context) { }
    @Override public void visitErrorNode(ErrorNode node) { } 
}
