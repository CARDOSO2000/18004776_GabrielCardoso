package br.maua.json;

import br.maua.model.Manga;
import org.json.JSONArray;
import org.json.JSONObject;

public class MangaParser {
    public static Manga fromJson( JSONObject jsonObject){
        JSONObject json = jsonObject.getJSONArray("results").getJSONObject(0);
        Manga manga = new Manga(json.getString("title"),json.getString("image_url"),json.getString("synopsis"),json.getString("type"),json.getInt("volumes"),
                json.getInt("chapters"),json.getFloat("score"));
        return manga;
    }
}
