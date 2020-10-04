package br.maua.Menu;


import br.maua.dao.AnimeDao;
import br.maua.dao.MangaDao;


import java.util.Scanner;

/**
 * Menu para o usuario trabalhar
 */
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
                        System.out.println(animeDao.getAll());
                            break;
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
                        System.out.println(mangaDao.getAll());

                            break;
                    }

            }

        }while(i != 0);
    }

    /**
     * Uma interface para o usuario
     */
    public void decisao(){
        System.out.println("Ola!Bem vindo! Deseja procurar um anime ou manga?\n");
        System.out.println("Digite 1- anime");
        System.out.println("Digite 2- manga");
        System.out.println("Digite 0- para sair");
    }
    public void menuManga() throws Exception{
        MangaDao mangaDao = new MangaDao();
         System.out.println("Qual manga deseja procurar?");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        mangaDao.get(nome);
    }
    public void menuAnime() throws Exception{
        AnimeDao animeDao = new AnimeDao();
        System.out.println("Qual anime deseja procurar?");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        animeDao.get(nome);

    }

    /**
     * Metodo usado para que quando for realizado uma pesquisa no api se houver espaço tranformar para %20
     * @param nome
     * @return
     */
    public String transformar(String nome){
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
