package ficha
%%
%class Lexer /* classe do lexer */
%unicode /*Unicode*/
%standalone
%debug
%line
%column
%type Token

%eofval{
return new Token(Tag.EOF);
%eofval}
%eof{
System.out.println("Análise léxica terminada com sucesso!");
%eof} 

delim = [\ \t\n]
ws={delim}+
letter = [A-Za-z]
digit = [0-9]

%%
{ws}		{}
if		{ return new Token(Tag.IF); }
then		{ return new Token(Tag.THEN); }
else		{ return new Token(Tag.ELSE); }
end		{ return new Token(Tag.END); }
"{"             { return new Token(Tag.CHAVE_ESQUERDA); }
"}"             { return new Token(Tag.CHAVE_DIREITA); }
"("             { return new Token(Tag.PARENTESE_ESQUERDO); }
")"             { return new Token(Tag.PARENTESE_DIREITO); }
";"             { return new Token(Tag.PONTO_VIRGULA); }
","             { return new Token(Tag.VIRGULA); }
{identificador} { return new Identificador(Tag.IDENTIFICADOR, yytext()); }
{notacao}       { return new Notacao(Tag.E, yytext()) }
{cadeia}        { return new Cadeia(Tag.STRING, yytext()) }
{constante}     { return new Constante(Tag.CONST, yytext()) }
while           { return new Token(Tag.WHILE); }
foreach         { return new Token(Tag.FOREACH); }
function        { return new Token(Tag.FUNCTION); }
"<"		{ return new Token(Tag.MENOR); }
"<="		{ return new Token(Tag.MENOR_IGUAL); }
"="		{ return new Token(Tag.IGUAL); }
">"		{ return new Token(Tag.MAIOR); }
">="		{ return new Token(Tag.MAIOR_IGUAL); }
"!="            { return new Token(Tag.DIFERENTE); }
"+"             { return new Token(Tag.SOMA); }
"-"             { return new Token(Tag.SUBTRACAO); }
"*"             { return new Token(Tag.MULTIPLICACAO); }
"%"             { return new Token(Tag.RESTO); }
"++"            { return new Token(Tag.MAIS_UM); }
"--"            { return new Token(Tag.MENOS_UM); }
{comentario}    { return new Comentario(Tag.COMENTARIO, yytext()) }
.		{ throw new Error("Illegal <" + yytext() + "(" + (int)(yytext().charAt(0)) + ")" + ">"); }