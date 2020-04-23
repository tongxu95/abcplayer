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

index: 'X:' TEXT eol;
title: 'T:' TEXT eol;
optional: composer | duration | meter | tempo | comment | voice;
composer: 'C:' TEXT eol;
duration: 'L:' TEXT eol;
meter: 'M:' TEXT eol;
tempo: 'Q:' TEXT eol;
voice: 'V:' TEXT eol;
key: 'K:' TEXT eol;


// General 
comment: '%' TEXT NEWLINE;
eol: NEWLINE | comment;

TEXT: [a-zA-Z0-9/=',;.!?|# \t]+;
NEWLINE: [\n\r] | '\r\n';


