package abc.sound;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.parser.ABCHeaderListener;
import abc.parser.ABCHeaderParser;

public class MakeHeader implements ABCHeaderListener{
	
	public Header getHeader() {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitRoot(ABCHeaderParser.RootContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitHeader(ABCHeaderParser.HeaderContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitIndex(ABCHeaderParser.IndexContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitTitle(ABCHeaderParser.TitleContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitOptional(ABCHeaderParser.OptionalContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitComposer(ABCHeaderParser.ComposerContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitDuration(ABCHeaderParser.DurationContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitMeter(ABCHeaderParser.MeterContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitTempo(ABCHeaderParser.TempoContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitVoice(ABCHeaderParser.VoiceContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitKey(ABCHeaderParser.KeyContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitFraction(ABCHeaderParser.FractionContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitPulse(ABCHeaderParser.PulseContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitComment(ABCHeaderParser.CommentContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	@Override public void exitEol(ABCHeaderParser.EolContext ctx) {
		throw new RuntimeException("not implemented");
	}
	
	
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
	@Override public void enterFraction(ABCHeaderParser.FractionContext ctx) { }
	@Override public void enterPulse(ABCHeaderParser.PulseContext ctx) { }
	@Override public void enterComment(ABCHeaderParser.CommentContext ctx) { }
	@Override public void enterEol(ABCHeaderParser.EolContext ctx) { }
	
    @Override public void visitTerminal(TerminalNode terminal) { }
    @Override public void enterEveryRule(ParserRuleContext context) { }
    @Override public void exitEveryRule(ParserRuleContext context) { }
    @Override public void visitErrorNode(ErrorNode node) { }  
}
