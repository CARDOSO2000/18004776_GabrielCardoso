package br.maua.dao;

import br.maua.interfaces.Dao;
import br.maua.interfaces.DaoFields;
import br.maua.model.Manga;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MangaDao implements Dao<Manga>, DaoFields {
    private Connection connection;
    private String myDBconnection = "jdbc:sqlite:sqlite(1).db";

    public MangaDao(){
        try{
            connection = DriverManager.getConnection(myDBconnection);

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Manga> get(String condition) {
        List<Manga> mangas = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectConditionalString(getTableName(), condition));
            while(result.next()) {
                Manga manga = new Manga(
                        result.getString("Nome"),
                        result.getString("Url"),
                        result.getString("Sinopse"),
                        result.getString("Tipo"),
                        result.getInt("Quantidade_de_vol"),
                        result.getInt("Quantidade_de_cap"),
                        result.getFloat("Nota")
                );
                mangas.add(manga);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return mangas;
    }

    @Override
    public List<Manga> getAll() {
        List<Manga> mangas = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectAllString(getTableName()));
            while(result.next()) {
                Manga manga = new Manga(
                        result.getString("Nome"),
                        result.getString("Url"),
                        result.getString("Sinopse"),
                        result.getString("Tipo"),
                        result.getInt("Quantidade_de_vol"),
                        result.getInt("Quantidade_de_cap"),
                        result.getFloat("Nota")
                );
                mangas.add(manga);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return mangas;
    }

    @Override
    public void update(Manga manga) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getUpdateString(getTableName()));
            preparedStatement.setString(1, manga.getNome());
            preparedStatement.setString(2, manga.getUrl());
            preparedStatement.setString(3, manga.getSinopse());
            preparedStatement.setDouble(4, manga.getNota());
            preparedStatement.setString(5, manga.getTipo());
            preparedStatement.setInt(6, manga.getVolume());
            preparedStatement.setInt(7, manga.getCapitulo());
            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Manga manga) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getDeleteString(getTableName()));
            preparedStatement.setString(1, manga.getNome());
            preparedStatement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void create(Manga manga) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setString(1, manga.getNome());
            preparedStatement.setString(2, manga.getUrl());
            preparedStatement.setString(3, manga.getSinopse());
            preparedStatement.setDouble(4, manga.getNota());
            preparedStatement.setString(5, manga.getTipo());
            preparedStatement.setInt(6, manga.getVolume());
            preparedStatement.setInt(7, manga.getCapitulo());
            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getTableName() {
        return "Manga";
    }

    @Override
    public String getDeleteString(String table) {
        return "DELETE FROM " + table + " WHERE Nome = ?";
    }

    @Override
    public String getUpdateString(String table) {
        return "UPDATE " + table +  " SET Nome = ?, Url = ?, Sinopse = ?, Nota = ?, Tipo = ?, Quantidade_de_vol = ?, Quantidade_de_cap = ? WHERE Nome = ?;";
    }

    @Override
    public String getInsertString(String table) {
        return "INSERT INTO " + table + " (Nome, Url, Sinopse, Nota, Tipo, Quantidade_de_vol, Quantidade_de_cap) VALUES (?, ?, ?, ?, ?, ?, ?);";
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
