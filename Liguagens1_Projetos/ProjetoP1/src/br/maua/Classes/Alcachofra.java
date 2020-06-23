package br.maua.Classes;

import br.maua.ENUM.Estado;
import br.maua.ENUM.TipoDePizza;

public class Alcachofra extends Pizza {

    public Alcachofra(Estado estado) {
        super(TipoDePizza.ALCACHOFRA, 22, estado);
    }
}
