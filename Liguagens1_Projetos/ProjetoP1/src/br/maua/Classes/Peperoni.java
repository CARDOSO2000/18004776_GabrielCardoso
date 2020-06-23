package br.maua.Classes;

import br.maua.ENUM.Estado;
import br.maua.ENUM.Paagamento;
import br.maua.ENUM.TipoDePizza;

public class Peperoni extends Pizza{
    public Peperoni(Paagamento paagamento) {
        super(TipoDePizza.PEPERONI, 22,Estado.PREPARACAO,paagamento);
    }
}
