package br.maua.Classes;

import br.maua.ENUM.Estado;
import br.maua.ENUM.Paagamento;
import br.maua.ENUM.TipoDePizza;

public class Marguerita extends Pizza{
    public Marguerita(Paagamento paagamento) {
        super(TipoDePizza.MARGUERITA, 25,Estado.PREPARACAO, paagamento);
    }
}
