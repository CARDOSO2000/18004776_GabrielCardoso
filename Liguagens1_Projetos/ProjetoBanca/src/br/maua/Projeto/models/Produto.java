package br.maua.Projeto.models;

import br.maua.ENUM.TiposDeProdutos;

public class Produto {
    private TiposDeProdutos Tipo;
    private int valor;
    private int quantidade;

    public Produto(TiposDeProdutos tipo, int valor, int quantidade) {
        Tipo = tipo;
        this.valor = valor;
        this.quantidade = quantidade;
    }
}
