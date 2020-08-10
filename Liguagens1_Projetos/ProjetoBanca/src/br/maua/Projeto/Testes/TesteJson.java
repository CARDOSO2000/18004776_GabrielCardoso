package br.maua.Projeto.Testes;

import br.maua.ENUM.TiposDeProdutos;
import br.maua.Projeto.Parsers.ProdutoParsers;
import br.maua.Projeto.models.ListaDeProdutos;
import br.maua.Projeto.models.Produto;
import org.json.JSONArray;
import org.json.JSONObject;

public class TesteJson {
    public static void main(String[] args) {
        Produto produto = new Produto(TiposDeProdutos.GIBI, 32,44,"Turma da monica no crack");
        JSONObject json = ProdutoParsers.toJson(produto);
        System.out.println("Formato ToString: " + produto);
        System.out.println("--------------------");
        System.out.println("Formato Json: "+ json);
        Produto produto2 = ProdutoParsers.fromJson(json);
        System.out.println("Jogo 2: "+ produto2);

    }
}
