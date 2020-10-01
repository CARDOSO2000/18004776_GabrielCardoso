package br.maua.dao;

import br.maua.Menu.Menu;
import br.maua.api.ApiReader;
import br.maua.interfaces.Dao;
import br.maua.interfaces.DaoFields;
import br.maua.json.AnimeParser;
import br.maua.json.MangaParser;
import br.maua.model.Anime;
import br.maua.model.Manga;
;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimeDao implements Dao<Anime>, DaoFields {
    private Connection connection;
    private String myDBconnection = "jdbc:sqlite:C:\\Users\\gdlau\\Desktop\\18004776_GabrielCardoso\\Liguagens1_Projetos\\AtividadeT3\\lol.db";

    public AnimeDao(){
        try{
            connection = DriverManager.getConnection(myDBconnection);

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
    @Override
    public List<Anime> get(String nome) {
        Menu menu = new Menu();
        Anime anime1;
        AnimeParser animeParser = new AnimeParser();
        String pesquisa;
        List<Anime> animes = new ArrayList<>();
        try{
            //Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(getSelectConditionalString(getTableName()));

//            ResultSet result = statement.executeQuery(getSelectAllString(getTableName()));
//            preparedStatement.executeUpdate();
            preparedStatement.setString(1,nome);
            ResultSet result = preparedStatement.executeQuery();
            if (!result.next()){
                pesquisa = menu.transformar(nome);
                anime1 = animeParser.fromJson(ApiReader.leituraJava11("anime",pesquisa));
                create(anime1);
                System.out.println(anime1);
            }else {
                Anime anime = new Anime(
                        result.getString("Nome"),
                        result.getString("Url"),
                        result.getString("Sinopse"),
                        result.getFloat("Nota"),
                        result.getInt("Quantidade_de_Ep")
                );
                animes.add(anime);
                System.out.println(animes);
            }
            result.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return animes;
    }

    @Override
    public List<Anime> getAll() {
        List<Anime> animes = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectAllString(getTableName()));
            while(result.next()) {
                Anime anime = new Anime(
                        result.getString("Nome"),
                        result.getString("Url"),
                        result.getString("Sinopse"),
                        result.getFloat("Nota"),
                        result.getInt("Quantidade_de_Ep")
                        );
                animes.add(anime);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Banco vazio tente pesquisar antes!");
        }
        return animes;

    }



    @Override
    public void create(Anime anime) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setString(1, anime.getNome());
            preparedStatement.setString(2, anime.getUrl());
            preparedStatement.setString(3, anime.getSinopse());
            preparedStatement.setDouble(4, anime.getNota());
            preparedStatement.setInt(5, anime.getEpisodio());
            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getTableName() {
        return "Anime";
    }


    @Override
    public String getInsertString(String table) {
        return "INSERT INTO " + table + " (Nome, Url, Sinopse, Nota,  Quantidade_de_Ep) VALUES (?, ?, ?, ?, ?);";
    }

    @Override
    public String getSelectAllString(String table) {
        return "SELECT * FROM " + table;
    }

    @Override
    public String getSelectConditionalString(String table) {
        return "SELECT * FROM "+ table +  " WHERE Nome = ?";
    }
}
