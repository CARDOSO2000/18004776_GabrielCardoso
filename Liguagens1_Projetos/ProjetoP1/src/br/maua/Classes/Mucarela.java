package br.maua.Classes;
/**
 * @author Gabriel de Laurentis Dias Cardoso 18.00477-6
 */

import br.maua.ENUM.TipoDePizza;

/**
 * Classe filho para o sabor mucarela
 */
public class Mucarela extends Pizza {
    public Mucarela() {
        super(TipoDePizza.MUCARELA, 20);
    }
}
