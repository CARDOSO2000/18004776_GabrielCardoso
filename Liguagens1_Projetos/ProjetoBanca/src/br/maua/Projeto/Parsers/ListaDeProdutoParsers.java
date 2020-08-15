package br.maua.Projeto.Parsers;

import br.maua.Projeto.models.ListaDeProdutos;
import br.maua.Projeto.models.Produto;
import org.json.JSONArray;
import org.json.JSONObject;

public class ListaDeProdutoParsers {
    public static JSONArray toJson(ListaDeProdutos listaDeProdutos){
        JSONArray jsonArray = new JSONArray();
        listaDeProdutos.getListaProduto().forEach(produto -> {
            jsonArray.put(ProdutoParsers.toJson(produto));});
        return jsonArray;
    }
    public static ListaDeProdutos fromJson(JSONArray jsonArray){
        ListaDeProdutos listaDeProdutos = new ListaDeProdutos();
        jsonArray.forEach(item -> {
            listaDeProdutos.addProduto(ProdutoParsers.fromJson((JSONObject)item));
        });
        return listaDeProdutos;
    }
}

