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
public class Identificador extends Token {
    public final String lexeme;
    
     public Identificador(int t, String s) {
        super(t);
        lexeme = new String(s);
    }
 @Override
 public String toString() {
 return "<" + this.tag + ",\"" + this.lexeme + "\">";
 }

    
}
