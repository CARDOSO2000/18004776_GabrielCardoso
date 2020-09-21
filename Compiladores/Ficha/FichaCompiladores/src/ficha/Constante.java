/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha;

/**
 *
 * @author gdlau
 */
public class Constante extends Token{
      public final String lexeme;
    
 public Constante(int t, String s) {
    super(t);
    String lex;
    char [] letras = s.toCharArray();
    if(letras.length == 1)
        lexeme = s;
    else
        lexeme = null;
 }
 
 @Override
 public String toString() {
 return "<" + this.tag + ",\"" + this.lexeme + "\">";
 }

    
}
