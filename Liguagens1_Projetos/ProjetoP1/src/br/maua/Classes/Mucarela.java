package br.maua.Classes;

import br.maua.ENUM.Estado;
import br.maua.ENUM.TipoDePizza;

public class Mucarela extends Pizza {
    public Mucarela(Estado estado) {
        super(TipoDePizza.MUCARELA, 20, estado);
    }
}
