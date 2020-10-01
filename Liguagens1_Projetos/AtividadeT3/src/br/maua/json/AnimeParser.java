package br.maua.json;

import br.maua.model.Anime;
import org.json.JSONArray;
import org.json.JSONObject;

public class AnimeParser {
    public static Anime fromJson(JSONObject jsonObject){
        JSONObject json = jsonObject.getJSONArray("results").getJSONObject(0);
        Anime anime = new Anime(json.getString("title"),json.getString("url"),json.getString("synopsis"),json.getFloat("score"),json.getInt("episodes"));
        return anime;
    }
}
