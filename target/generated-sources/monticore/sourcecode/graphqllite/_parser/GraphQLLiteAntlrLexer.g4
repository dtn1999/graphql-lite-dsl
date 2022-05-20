/* generated by template parser.Lexer*/

lexer grammar GraphQLLiteAntlrLexer;

@lexer::header {
  package graphqllite._parser;
}

/* generated by template parser.LexerMember*/


@lexer::members {



private GraphQLLiteAntlrParser _monticore_parser;

protected GraphQLLiteAntlrParser getCompiler() {
   return _monticore_parser;
}

public void setMCParser(GraphQLLiteAntlrParser in) {
  this._monticore_parser = in;
}

protected void storeComment(){
  if (getCompiler() != null) {
    de.monticore.ast.Comment _comment = new de.monticore.ast.Comment(getText());
    de.se_rwth.commons.SourcePosition startPos = new de.se_rwth.commons.SourcePosition(_tokenStartLine, _tokenStartCharPositionInLine);
    _comment.set_SourcePositionStart(startPos);
    _comment.set_SourcePositionEnd(getCompiler().computeEndPosition(startPos, getText()));
    getCompiler().addComment(_comment);
  }
}
}


  SCHEMA3386979745 : 'schema';
  EXCLAMATIONMARK : '!';
  FALSE97196323 : 'false';
  STRING2486848561 : 'String';
  TYPE3575610 : 'type';
  MINUS : '-';
  POINT : '.';
  INT73679 : 'Int';
  FLOAT67973692 : 'Float';
  SCALAR3386777580 : 'scalar';
  NULL3392903 : 'null';
  TRUE3569038 : 'true';
  COLON : ':';
  LCURLY : '{';
  LBRACK : '[';
  ID2331 : 'ID';
  BOOLEAN1729365000 : 'Boolean';
  RCURLY : '}';
  RBRACK : ']';
 
  
 // Start of 'ASTLexProd Digit'
fragment Digit 
  
:
  
  '0'..'9'  
  ;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd OctalDigit'
fragment OctalDigit 
  
:
  
  '0'..'7'  
  ;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd StringCharacters'
fragment StringCharacters 
  
:
  
  (
  
   StringCharacter 
  )
+
  ;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd SingleCharacter'
fragment SingleCharacter 
  
:
  
  ~(
  
  '\'' 
  )

  ;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd NEWLINE'
fragment NEWLINE 
  
:
  
  (
  
  '\r' 
  '\n' 
  |
  '\r' 
  |
  '\n' 
  )

  ;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd Digits'
Digits 
  
:
  
  (
   Digit 
  )
+
  ;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd EscapeSequence'
fragment EscapeSequence 
  
:
  
  '\\' 
  (
  
  'b' 
  |
  't' 
  |
  'n' 
  |
  'f' 
  |
  'r' 
  |
  '"' 
  |
  '\'' 
  |
  '\\' 
  )

  |
   OctalEscape 
  |
   UnicodeEscape 
  ;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd String'
String 
  
:
  
  '"' 
  (
  
   StringCharacters 
  )
?
  '"' 
  {setText(getText().substring(1,getText().length() - 1));

};
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd HexDigit'
fragment HexDigit 
  
:
  
  '0'..'9'  
  |
  'a'..'f'  
  |
  'A'..'F'  
  ;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd StringCharacter'
fragment StringCharacter 
  
:
  
  ~(
  
  '"' 
  |
  '\\' 
  )

  |
   EscapeSequence 
  ;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd Name'
Name 
  
:
  
  (
  
  'a'..'z'  
  |
  'A'..'Z'  
  |
  '_' 
  |
  '$' 
  )

  (
  
  'a'..'z'  
  |
  'A'..'Z'  
  |
  '_' 
  |
  '0'..'9'  
  |
  '$' 
  )
*
  ;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd Char'
Char 
  
:
  
  '\'' 
  (
  
   SingleCharacter 
  |
   EscapeSequence 
  )

  '\'' 
  {setText(getText().substring(1,getText().length() - 1));

};
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd ML_COMMENT'
ML_COMMENT 
  
:
  
  '/*' 
  (
  .
  )
*
  ?
  '*/' 
  {storeComment();

}->skip;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd SL_COMMENT'
SL_COMMENT 
  
:
  
  '//' 
  (
  
  ~(
  
  '\n' 
  |
  '\r' 
  )

  )
*
  {storeComment();

}->skip;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd ZeroToThree'
fragment ZeroToThree 
  
:
  
  '0'..'3'  
  ;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd OctalEscape'
fragment OctalEscape 
  
:
  
  '\\' 
   OctalDigit 
  |
  '\\' 
   OctalDigit 
   OctalDigit 
  |
  '\\' 
   ZeroToThree 
   OctalDigit 
   OctalDigit 
  ;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd UnicodeEscape'
fragment UnicodeEscape 
  
:
  
  '\\' 
  'u' 
   HexDigit 
   HexDigit 
   HexDigit 
   HexDigit 
  ;
// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd WS'
WS 
  
:
  
  (
  
  ' ' 
  |
  '\t' 
  |
  '\r' 
  |
  '\n' 
  )

  ->skip;
// End of 'ASTLexProd'


