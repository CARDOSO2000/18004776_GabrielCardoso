package br.maua.Classes;

import br.maua.ENUM.Estado;
import br.maua.ENUM.Paagamento;
import br.maua.ENUM.TipoDePizza;

public class Mucarela extends Pizza {
    public Mucarela(Paagamento paagamento) {
        super(TipoDePizza.MUCARELA, 20, Estado.PREPARACAO,paagamento);
    }
}
