package br.maua.dao;

import br.maua.interfaces.Dao;
import br.maua.interfaces.DaoFields;
import br.maua.model.Anime;
import br.maua.model.Manga;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimeDao implements Dao<Anime>, DaoFields {
    private Connection connection;
    private String myDBconnection = "jdbc:sqlite:sqlite(1).db";

    public AnimeDao(){
        try{
            connection = DriverManager.getConnection(myDBconnection);

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
    @Override
    public List<Anime> get(String condition) {
        List<Anime> animes = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectConditionalString(getTableName(), condition));
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
        }

        return animes;
    }

    @Override
    public void update(Anime anime) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getUpdateString(getTableName()));
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
    public void delete(Anime anime) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getDeleteString(getTableName()));
            preparedStatement.setString(1, anime.getNome());
            preparedStatement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
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
    public String getDeleteString(String table) {
        return "DELETE FROM " + table + " WHERE Nome = ?";
    }

    @Override
    public String getUpdateString(String table) {
        return "UPDATE " + table +  " SET Nome = ?, Url = ?, Sinopse = ?, Nota = ?, Quantidade_de_Ep = ? WHERE Nome = ?;";
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
    public String getSelectConditionalString(String table, String condition) {
        return "SELECT * FROM "+ table +  " WHERE " + condition;
    }
}
