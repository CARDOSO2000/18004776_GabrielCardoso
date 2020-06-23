package br.maua.Classes;

import br.maua.ENUM.Estado;
import br.maua.ENUM.Paagamento;
import br.maua.ENUM.TipoDePizza;

public class Alcachofra extends Pizza {

    public Alcachofra(Paagamento paagamento) {
        super(TipoDePizza.ALCACHOFRA, 22,Estado.PREPARACAO, paagamento);
    }
}
