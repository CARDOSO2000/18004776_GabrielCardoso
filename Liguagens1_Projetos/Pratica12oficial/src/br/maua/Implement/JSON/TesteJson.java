package br.maua.Implement.JSON;

import br.maua.model.Jogo;
import br.maua.parcer.JogoParcer;
import org.json.JSONObject;

public class TesteJson {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo("PC", "CyberPunk");
        JSONObject json = JogoParcer.toJson(jogo1);
        System.out.println("Formato ToString: " + jogo1);
        System.out.println("--------------------");
        System.out.println("Formato Json: "+ json);
        Jogo jogo2 = JogoParcer.fromJson(json);
        System.out.println("Jogo 2: "+ jogo2);
    }
}
