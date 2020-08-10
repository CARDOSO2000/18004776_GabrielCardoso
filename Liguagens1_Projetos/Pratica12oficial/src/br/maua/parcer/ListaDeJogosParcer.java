package br.maua.parcer;

import br.maua.model.Jogo;
import br.maua.model.ListaJogos;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ListaDeJogosParcer {
    public static JSONArray toJson(ListaJogos lista){
        JSONArray json = new JSONArray();
        lista.getJogos().forEach(jogo -> {
            json.put(JogoParcer.toJson(jogo));
        });
        return json;
    }
    public static ListaJogos fromJson(JSONArray json){
        ListaJogos lista = new ListaJogos();
        json.forEach(item ->{
            lista.addJogo(JogoParcer.fromJson((JSONObject) item));
        });
        return lista;
    }
}
