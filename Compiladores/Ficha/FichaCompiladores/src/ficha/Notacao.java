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
public class Notacao extends Token {
    public final String lexeme;
    
 public Notacao(int t, String s) {
    super(t);
    String lex = null;
    char [] letras = s.toCharArray();
    for(char letra : letras){
        if(letra == 'E')
            lex = s;
            
    }
     lexeme = lex;
 }
 
 @Override
 public String toString() {
 return "<" + this.tag + ",\"" + this.lexeme + "\">";
 }

    
}
