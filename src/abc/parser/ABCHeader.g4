/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar ABCHeader;
import Configuration;

root: header EOF;


// Header 
header: index comment* title optional* key;

index: 'X:' DIGIT+ eol;
title: 'T:' TEXT eol;
optional: composer | duration | meter | tempo | comment | voice;
composer: 'C:' TEXT eol;
duration: 'L:' fraction eol;
meter: 'M:' pulse eol;
tempo: 'Q:' fraction '=' DIGIT+ eol;
voice: 'V:' TEXT eol;
key: 'K:' SCALE eol;

fraction: DIGIT+ '/' DIGIT+;
pulse: 'C' | 'C|' | fraction;

SCALE: [A-G] [#b]? 'm'?;


// General 
comment: '%' TEXT NEWLINE;
eol: NEWLINE | comment;

DIGIT: [0-9]+;
TEXT: ~[%NEWLINE]+;
NEWLINE: '\n' | '\r' '\n'?;
WHITESPACE: ' ' | '\t';

/* Tell Antlr to ignore spaces around tokens. */
SPACES : WHITESPACE+ -> skip;

