package br.maua.json;

import br.maua.model.Anime;
import org.json.JSONObject;

public class AnimeParser {
    public static Anime fromJson(JSONObject json){
        Anime anime = new Anime(json.getString("title"),json.getString("url"),json.getString("synopsis"),json.getFloat("score"),json.getInt("episodes"));
        return anime;
    }
}
