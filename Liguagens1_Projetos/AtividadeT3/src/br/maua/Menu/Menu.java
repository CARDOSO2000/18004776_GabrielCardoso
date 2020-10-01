package br.maua.Menu;

import br.maua.api.ApiReader;
import br.maua.dao.AnimeDao;
import br.maua.dao.MangaDao;
import br.maua.json.AnimeParser;
import br.maua.json.MangaParser;
import br.maua.model.Anime;
import br.maua.model.Manga;

import java.util.Scanner;

public class Menu {
    public void menu() throws Exception {
        int i = 1;
        AnimeDao animeDao = new AnimeDao();
        MangaDao mangaDao = new MangaDao();
        Scanner scanner = new Scanner(System.in);
        do{
            decisao();
            i = scanner.nextInt();
            switch (i){
                case 1:
                    System.out.println("Deseja ver nossos animes ou procurar um ?");
                    System.out.println("1 - pesquisa");
                    System.out.println("2 - todos");
                    i = scanner.nextInt();
                    if(i == 1){
                        menuAnime();
                        break;
                    }
                    else {
                        try {
                            animeDao.getAll();
                            break;
                        }catch (Exception exception){
                            exception.printStackTrace();
                            System.out.println("Nao tem nada na tabela ainda tente procurar um");
                            break;
                        }

                    }

                case 2:
                    System.out.println("Deseja ver nossos mangas ou procurar um?");
                    System.out.println("1 - pesquisa");
                    System.out.println("2 - todos");
                    i = scanner.nextInt();
                    if(i == 1){
                        menuManga();
                        break;
                    }
                    else {
                        try {
                            mangaDao.getAll();
                            break;
                        }catch (Exception exception){
                            exception.printStackTrace();
                            System.out.println("Nao tem nada na tabela ainda tente procurar um");
                            break;
                        }
                    }

            }

        }while(i != 0);
    }
    public void decisao(){
        System.out.println("Ola!Bem vindo! Deseja procurar um anime ou manga?\n");
        System.out.println("Digite 1- anime");
        System.out.println("Digite 2- manga");
        System.out.println("Digite 0- para sair");
    }
    public void menuManga() throws Exception{
        Manga manga;
        MangaDao mangaDao = new MangaDao();
        String pesquisa;
        MangaParser mangaParser = new MangaParser();
         System.out.println("Qual manga deseja procurar?");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        if(mangaDao.get("Nome = " + "'" + nome + "'") == null){
            pesquisa = transformar(nome);
            manga = mangaParser.fromJson(ApiReader.leituraJava11("anime",pesquisa));
            mangaDao.create(manga);
            System.out.println(manga);
        }
        else{
            System.out.println(mangaDao.get("Nome = " + "'" + nome + "'").toString());

        }
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
