package br.maua.Menu;

import br.maua.api.ApiReader;
import br.maua.dao.AnimeDao;
import br.maua.json.AnimeParser;
import br.maua.model.Anime;

import java.util.Scanner;

public class Menu {
    public void decisao(){
        System.out.println("Ola!Bem vindo! Deseja procurar um anime ou manga?\n");
        System.out.println("Digite 1- anime");
        System.out.println("Digite 2- manga");
    }
    public void menuAnime() throws Exception{
        Anime anime;
        AnimeDao animeDao = new AnimeDao();
        String pesquisa;
        AnimeParser animeParser = new AnimeParser();
        System.out.println("Qual anime deseja procurar?");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        if(animeDao.get("Nome = " + "'" + nome + "'") == null){
            pesquisa = transformar(nome);
            anime = animeParser.fromJson(ApiReader.leituraJava11("anime",pesquisa));
            animeDao.create(anime);
            System.out.println(anime);
        }
        else{
            System.out.println(animeDao.get("Nome = " + "'" + nome + "'").toString());

        }

    }
    private String transformar(String nome){
        char [] letras = nome.toCharArray();
        String nome2 = "";
        String a = "%20";
        for (char letra:letras
             ) {
            if (letra == ' '){

                nome2 = nome2 + a;
            }
            else
                nome2 = nome2 + letra;

        }
        return nome2;
    }
}
