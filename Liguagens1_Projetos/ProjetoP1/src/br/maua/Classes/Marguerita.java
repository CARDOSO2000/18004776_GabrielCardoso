package br.maua.Classes;

import br.maua.ENUM.Estado;
import br.maua.ENUM.TipoDePizza;

public class Marguerita extends Pizza{
    public Marguerita(Estado estado) {
        super(TipoDePizza.MARGUERITA, 25, estado);
    }
}
