package br.maua.Projeto.Testes;

import br.maua.ENUM.TiposDeProdutos;
import br.maua.Projeto.models.ListaDeProdutos;
import br.maua.Projeto.models.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto(TiposDeProdutos.GIBI, 25,34);
        System.out.println("" + produto);
        ListaDeProdutos listaDeProdutos = new ListaDeProdutos();
        listaDeProdutos.addProduto(produto);
        System.out.println(""+listaDeProdutos);
    }
}
