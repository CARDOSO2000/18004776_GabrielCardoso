package br.maua.Classes;

import br.maua.ENUM.Estado;
import br.maua.ENUM.TipoDePizza;

public class Peperoni extends Pizza{
    public Peperoni(Estado estado) {
        super(TipoDePizza.PEPERONI, 22,estado);
    }
}
