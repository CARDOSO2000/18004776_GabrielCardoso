package br.maua.Projeto.models;

import java.util.ArrayList;
import java.util.List;

public class ListaDeProdutos {
    private List<Produto> listaProduto;

    public ListaDeProdutos() {
        this.listaProduto = new ArrayList<>();
    }
    public void addProduto(Produto produto){
        this.listaProduto.add(produto);
    }

    public List<Produto> getListaProduto() {
        return this.listaProduto;
    }

    @Override
    public String toString() {
        return "ListaDeProdutos{" +
                "listaProduto=" + listaProduto +
                "}\n";
    }
}
