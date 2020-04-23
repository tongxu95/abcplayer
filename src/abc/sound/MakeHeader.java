package abc.sound;

import java.util.List;
import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.ABCHeaderListener;
import abc.parser.ABCHeaderParser;

/**
 * 
 * Make Header from ABCHeader parse tree. 
 *
 */
public class MakeHeader implements ABCHeaderListener {
	private String title, composer, meter, key;
	private double duration, meter_reduced, tempo_beat;
	private int index, tempo_bpm;
	private List <String> voices = new ArrayList<>();
	
	// Abstraction function:
    //   represent fields in ABC music header  
    // Representation invariant:
	//	 title, key, composer, meter, voices != null;
	//	 duration, meter_reduced, tempo_beat, index, tempo_bpm > 0;

	public MakeHeader() {
		title = composer = meter = key = "";
		duration = meter_reduced = tempo_beat = 0.0;
		index = tempo_bpm = 0;
	}
	
    /**
     * Returns Header constructed by this listener object.  
     * Require that the first, second, and last fields in the header
     * are index, title and key respectively. 
     * @return Header for the parse tree that was walked
     */
	public Header getHeader() throws IllegalArgumentException {
		if (composer.isEmpty()) {
			composer = Music.DEFAULT_AUTHOR;
		}
		if (meter.isEmpty()) {
			meter = "4/4";
			meter_reduced = Music.DEFAULT_METER;
		}
		if (duration == 0.0) {
			if (meter_reduced < 0.75) {
				duration = 1.0 / 16.0;
			} else if (meter_reduced >= 0.75) {
				duration = 1.0 / 8.0;
			} 
		}
		if (tempo_beat == 0.0) {
			tempo_bpm = Music.DEFAULT_TEMPO;
			tempo_beat = duration;
		}
		checkRep();
		return new Header(index, title, composer, duration, meter, tempo_beat, 
				tempo_bpm, key, voices);
	}
	
	private void checkRep() {
		assert (title != null && key != null && composer != null && voices != null);
		assert (index > 0 && duration > 0 && meter_reduced > 0 && tempo_beat > 0 && 
				tempo_bpm > 0);
		
	}
	
	@Override public void exitRoot(ABCHeaderParser.RootContext ctx) { }
	
	@Override public void exitHeader(ABCHeaderParser.HeaderContext ctx) { }
	
	@Override public void exitIndex(ABCHeaderParser.IndexContext ctx) {
		// mandatory field (first in header)
		String spec = ctx.TEXT().getText().trim();
		assert spec.matches("[0-9]+");
		index = Integer.parseInt(spec);
	}
	
	@Override public void exitTitle(ABCHeaderParser.TitleContext ctx) {
		// mandatory field (second field in header)
		title = ctx.TEXT().getText();
	}
	
	@Override public void exitOptional(ABCHeaderParser.OptionalContext ctx) { }
	
	@Override public void exitComposer(ABCHeaderParser.ComposerContext ctx) {
		// optional field
		if (ctx != null) {
			composer = ctx.TEXT().getText();
		} 
	}
	
	@Override public void exitDuration(ABCHeaderParser.DurationContext ctx) {
		// optional field
		if (ctx != null) {
			String spec = ctx.TEXT().getText().trim();
			assert spec.matches("[0-9]+/[0-9]+");
			String[] value = spec.split("/");
			duration = Double.parseDouble(value[0]) / Double.parseDouble(value[1]);
		} 
	}
	
	@Override public void exitMeter(ABCHeaderParser.MeterContext ctx) {
		// optional field
		if (ctx != null) {
			String spec = ctx.TEXT().getText().trim();
			if (spec.equals("C")) {
				meter = "4/4";
				meter_reduced = 4.0 / 4.0;
			} else if (spec.equals("C|")) {
				meter = "2/2";
				meter_reduced = 2.0 / 2.0;
			} else if (spec.matches("[0-9]+/[0-9]+")) {
				String[] value = spec.split("/");
				meter_reduced = Double.parseDouble(value[0]) / Double.parseDouble(value[1]);
			} else {
				throw new IllegalArgumentException("ParseError: illegal file format");
			}
		} 
	}
	
	@Override public void exitTempo(ABCHeaderParser.TempoContext ctx) {
		// optional field
		if (ctx != null) {
			String spec = ctx.TEXT().getText().trim();
			assert spec.matches("[0-9]+/[0-9]+=[0-9]+");
			String[] tempo = spec.split("[/=]");
			tempo_beat = Double.parseDouble(tempo[0]) / Double.parseDouble(tempo[1]);
			tempo_bpm = Integer.parseInt(tempo[2]);
		} 
	}
	
	@Override public void exitVoice(ABCHeaderParser.VoiceContext ctx) {
		// optional field
		if (ctx != null) voices.add(ctx.TEXT().getText().trim());
	}
	
	@Override public void exitKey(ABCHeaderParser.KeyContext ctx) {
		// mandatory field (last field in header) 
		key = ctx.TEXT().getText().trim();
		assert key.matches("[A-G][b#]?m?");
	}
	
	@Override public void exitComment(ABCHeaderParser.CommentContext ctx) {	}
	
	@Override public void exitEol(ABCHeaderParser.EolContext ctx) {	}
	
	
	@Override public void enterRoot(ABCHeaderParser.RootContext ctx) { }
	@Override public void enterHeader(ABCHeaderParser.HeaderContext ctx) { }
	@Override public void enterIndex(ABCHeaderParser.IndexContext ctx) { }
	@Override public void enterTitle(ABCHeaderParser.TitleContext ctx) { }
	@Override public void enterOptional(ABCHeaderParser.OptionalContext ctx) { }
	@Override public void enterComposer(ABCHeaderParser.ComposerContext ctx) { }
	@Override public void enterDuration(ABCHeaderParser.DurationContext ctx) { }
	@Override public void enterMeter(ABCHeaderParser.MeterContext ctx) { }
	@Override public void enterTempo(ABCHeaderParser.TempoContext ctx) { }
	@Override public void enterVoice(ABCHeaderParser.VoiceContext ctx) { }
	@Override public void enterKey(ABCHeaderParser.KeyContext ctx) { }
	@Override public void enterComment(ABCHeaderParser.CommentContext ctx) { }
	@Override public void enterEol(ABCHeaderParser.EolContext ctx) { }
	
    @Override public void visitTerminal(TerminalNode terminal) { }
    @Override public void enterEveryRule(ParserRuleContext context) { }
    @Override public void exitEveryRule(ParserRuleContext context) { }
    @Override public void visitErrorNode(ErrorNode node) { }  
}
