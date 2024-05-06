grammar ArithmeticExpressions;

options {output=AST;}
tokens{
Start;
StartgeneralArithExpr;
GeneralArithExpr;
PrintStmt;
Term;
Factor;
Method;
COMMENT;
Assigment;
Forloop;
Whilestmt;
Decl;
Ifstmt;
Double_dec;
Type_dec;
ClassDec;
TYPE;
String_Dec;
}
@members {
String s="";
}



startgeneralArithExpr	:	multbleClass -> ^(Start multbleClass);
// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
// The finally clause is the last part a rule executes before returning.
finally { s = s + "Exit..."+"\n"; }
  multbleClass
	:	mainclassDec  classDec+;
classDec:	Public? Class VAR '{' stmt* '}' ->^(ClassDec Public? Class VAR '{' stmt* '}');
mainclassDec:	Public? Class VAR '{' stmt* mainMethod stmt*'}' ->^(ClassDec Public? Class VAR '{' stmt* mainMethod stmt* '}');	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


stmt    :   (
	decl -> ^(Decl decl)
	|ifStatement -> ^(Ifstmt ifStatement)
	|whilestmt -> ^(Whilestmt whilestmt)
	|forloop -> ^(Forloop forloop)
	|printStmt ->^(PrintStmt printStmt)
	|assigment -> ^(Assigment assigment)
	|method -> ^(Method method)	
	);
	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


method	:	((Public type VAR params '{' stmt* 'return' (VAR|NUM) SEMICOLON'}'));
mainMethod
	:	Public 'static' VOID 'main''(''String''['']'VAR')''{'stmt*'}';
params	:	'('((type VAR) (',' type VAR)*)? ')';
args	:	arg (',' arg)* ;
arg	:	generalArithExpr ;
decl    :   
	type_dec	-> ^(Type_dec type_dec)
	;
printStmt
	:	Print '('factor')'SEMICOLON;
whilestmt	:	
	'while' '(' condition (AndOr condition)* ')' '{' stmt* '}'
	;
	 
ifStatement:ifstmt (elseIf_rule|ifstmt)* ;
	 
ifstmt  :    
	'if' '(' condition (AndOr condition)* ')'( stmt|'{' stmt+'}') ('else' ( stmt|'{' stmt+'}'))?
	;
elseIf_rule	:'else' 'if''('condition (AndOr condition)*')'( stmt|'{' stmt+'}');
forloop	:   
	'for' '(' decl condition (AndOr condition)* SEMICOLON assigment ')' '{' stmt* '}'
	;
assigment:   
	VAR('[' generalArithExpr']')? (change|'=' generalArithExpr) SEMICOLON
	; 
change	:
	('++'|'--'|('+='|'-=')(NUM))
	;
condition:   
    '!' '(' factor (RelationalOperators factor)? ')'  
    | factor (RelationalOperators factor)?
    ;
type_dec	:	
	//(Modifier? INT VAR '=' (NUM|VAR) (Operation (NUM|VAR))* SEMICOLON)
	(Public? type VAR ('=' generalArithExpr)? SEMICOLON)
	;
 
generalArithExpr: term (('+' | '-')^  term)*
	//-> ^(GeneralArithExpr term (('+' | '-')  term)*)	
	;
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  
term	: factor ( ( '*' | '/' )^ factor)*
	//-> ^(Term factor ( ( '*' | '/' ) factor)*)
	;
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

factor	:  
	 New VAR '(' ')'('.'factor '(' factor ')' )* ->^(Factor New VAR '(' ')'('.'factor '(' factor ')' )*)
	|New INT '[' generalArithExpr ']' ->^(Factor New INT '[' generalArithExpr ']')
	|VAR ('.'factor '(' factor? ')' )* ->^(Factor VAR('.'factor '(' factor? ')' )*)
	|This ( '.' factor '(' args? ')' )* ->^(Factor This ( '.'factor '(' args? ')' )* )
	|VAR '.''length' -> ^(Factor VAR '.''length')
	|NUM -> ^(Factor NUM)
	| '-'  generalArithExpr -> ^(Factor  '-' generalArithExpr)
	| '(' generalArithExpr ')' -> ^(Factor  '(' generalArithExpr ')')
	|VAR '[' generalArithExpr ']' -> ^(Factor VAR '[' generalArithExpr ']')
	;
	
type	:	INT('['']')?|BOOLEAN|VAR;
Class:'class';
This	:	'this';
New	:	'new';
AndOr	:	'&&'|'||';
Public:	'public';   
Print	:	'System.out.println';
INT	:	'int';
VOID	:	'void';
BOOLEAN	:	'boolean';
VAR	:	('a'..'z'|'A'..'Z'|'$'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
NUM	:	('0'..'9')*;
SEMICOLON:	';';
RelationalOperators:   '=='|'!='|'>'|'<'|'>='|'<=';
ML_COMMENT	:	'/*' ( options {greedy=false;} : .)* '*/'+{skip();};
SL_COMMENT	:	'//' (.)*'\n'+{skip();};
WhiteSpace:	(' '|'\n'|'\r'|'\t')+{skip();};