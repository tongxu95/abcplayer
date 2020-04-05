/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar ABCMusic;
import Configuration;

root: music EOF;


// Music 
music: line +;
line: element* NEWLINE | voice | comment;
element: note | chord | tuplet | barline | repeat | WHITESPACE;

note: single | chord;
single: type length;
type: pitch | REST;
pitch: ACCIDENTAL? BASENOTE OCTAVE*;
length: (DIGIT+)? ('/' (DIGIT+)?)?;

ACCIDENTAL: '^' | '^^' | '_' | '__' | '=';
BASENOTE: [A-Ga-g];
OCTAVE: [,'];
REST: 'z';

chord: '[' single+ ']';
tuplet: '(' DIGIT note+;

barline: '|' | '||' | '[|' | '|]' | ':|' | '|:';
repeat: '[1' | '[2';

voice: 'V:' TEXT eol;


// General 
comment: '%' TEXT NEWLINE;
eol: NEWLINE | comment;

DIGIT: [0-9]+;
TEXT: ~[%NEWLINE]+;
NEWLINE: '\n' | '\r' '\n'?;
WHITESPACE: ' ' | '\t';



