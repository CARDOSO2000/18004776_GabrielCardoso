package br.maua.parcer;

import br.maua.ENUM.Status;
import br.maua.model.Jogo;
import org.json.JSONObject;

public class JogoParcer {
    public static JSONObject toJson(Jogo jogo){
        JSONObject json = new JSONObject();
        json.put("plataforma",jogo.getPlataforma());
        json.put("nome",jogo.getNome());
        json.put("status",jogo.getStatus());
        return json;
    }
    public static Jogo fromJson(JSONObject json){
        Jogo jogo = new Jogo(json.getString("plataforma"),json.getString("nome"));
        jogo.setStatus(StatusParcer.toStatus(json.getString("status")));
        return jogo;

    }
}
