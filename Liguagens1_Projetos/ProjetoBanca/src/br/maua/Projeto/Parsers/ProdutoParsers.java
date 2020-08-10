package br.maua.Projeto.Parsers;

import br.maua.Projeto.models.Produto;
import org.json.JSONObject;

public class ProdutoParsers {
    public static JSONObject toJson(Produto produto){
        JSONObject json = new JSONObject();
        json.put("tipo", produto.getTipo());
        json.put("valor", produto.getValor());
        json.put("quantidade", produto.getQuantidade());
        json.put("titulo", produto.getTitulo());
        return json;
    }
    public static Produto fromJson(JSONObject json){
        Produto produto = new Produto(json.getString("tipo"),json.getInt("valor"),json.getInt("quantidade"),json.getString("titulo"));
    }

}
