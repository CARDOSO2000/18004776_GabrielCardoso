package br.maua.Classes;
/**
 * @author Gabriel de Laurentis Dias Cardoso 18.00477-6
 */

import br.maua.ENUM.TipoDePizza;

/**
 * Classe filho que define o sabor marguerita
 */
public class Marguerita extends Pizza{
    public Marguerita() {
        super(TipoDePizza.MARGUERITA, 25);
    }
}
