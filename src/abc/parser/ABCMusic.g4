/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar ABCMusic;
import Configuration;

root: music EOF;


// Music 
music: (line | voice | comment)+;
line: measure+ NEWLINE;
measure: barline? repeat? element+ barline?; 
barline: '|' | '||' | '[|' | '|]' | ':|' | '|:';
repeat: '[1' | '[2';

element: note | tuplet | WHITESPACE;
note: single | chord;
single: type length?;
type: pitch | REST;
pitch: ACCIDENTAL? BASENOTE OCTAVE*;
length: DIGIT | DIGIT? '/' DIGIT?;
chord: '[' single+ ']';
tuplet: '(' DIGIT note+;


REST: 'z';
ACCIDENTAL: '^' | '^^' | '_' | '__' | '=';
BASENOTE: [A-Ga-g];
OCTAVE: [,'];


// General 
DIGIT: [0-9]+;
OTHERLETTERS: [H-Zh-y];
SYMBOL: [/;.!?|#"&<>@-];
WHITESPACE: ' ' | '\t';
NEWLINE: '\n' | '\r' '\n'?;

voice: 'V:' text+ eol;
comment: '%' (text+)? NEWLINE;
eol: NEWLINE | comment;
text: BASENOTE | REST | OTHERLETTERS | DIGIT | WHITESPACE+ 
	| OCTAVE | ACCIDENTAL | SYMBOL;