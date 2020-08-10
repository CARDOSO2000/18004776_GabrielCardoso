package br.maua.Projeto.models;

import br.maua.ENUM.TiposDeProdutos;

public class Produto {
    private TiposDeProdutos tipo;
    private String titulo;
    private int valor;
    private int quantidade;

    public Produto(TiposDeProdutos tipo, int valor, int quantidade,String titulo) {
        this.tipo = tipo;
        this.valor = valor;
        this.quantidade = quantidade;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "tipo=" + tipo +
                ", titulo='" + titulo + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }

    public String getTipo() {
        return " "+ tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
