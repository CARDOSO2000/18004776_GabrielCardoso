package br.maua.json;

import br.maua.model.Manga;
import org.json.JSONObject;

public class MangaParser {
    public static Manga fromJson(JSONObject json){
        Manga manga = new Manga(json.getString("title"),json.getString("image_url"),json.getString("synopsis"),json.getString("type"),json.getInt("volumes"),
                json.getInt("chapter"),json.getFloat("score"));
        return manga;
    }
}
