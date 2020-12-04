package br.maua.DAO;

import br.maua.Classes.Personagem;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class PersonagemDao implements Dao<Personagem>, DAOFields {
    private Connection connection;
    private String myDBConnectionString = "jdbc:sqlite:rpg.db";
    public PersonagemDao() {
        try {
            connection = DriverManager.getConnection(myDBConnectionString);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    @Override
    public List<Personagem> get(String condition) {
        List<Personagem> personagems = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectConditionalString(getTableName(),condition));
            while(result.next()){
                Personagem personagem = new Personagem(
                        result.getInt("ID"),
                        result.getString("Raca"),
                        result.getString("Profissao"),
                        result.getFloat("Mana"),
                        result.getString("Nome"),
                        result.getFloat("Ataque"),
                        result.getFloat("Atque_magico"),
                        result.getFloat("Defesa"),
                        result.getFloat("Defesa_magica"),
                        result.getFloat("Velocidade"),
                        result.getFloat("Destreza"),
                        result.getFloat("Exp"),
                        result.getInt("Nivel_atual"),
                        result.getString("Armadura"),
                        result.getString("Arma"),
                        result.getString("Pedra")
                        );
                personagems.add(personagem);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return personagems;
    }

    @Override
    public List<Personagem> getAll() {
        List<Personagem> personagems = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(getSelectAllString(getTableName()));
            while(result.next()){
                Personagem personagem = new Personagem(
                        result.getInt("ID"),
                        result.getString("Raca"),
                        result.getString("Profissao"),
                        result.getFloat("Mana"),
                        result.getString("Nome"),
                        result.getFloat("Ataque"),
                        result.getFloat("Atque_magico"),
                        result.getFloat("Defesa"),
                        result.getFloat("Defesa_magica"),
                        result.getFloat("Velocidade"),
                        result.getFloat("Destreza"),
                        result.getFloat("Exp"),
                        result.getInt("Nivel_atual"),
                        result.getString("Armadura"),
                        result.getString("Arma"),
                        result.getString("Pedra")
                );
                personagems.add(personagem);
            }
            result.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return personagems;
    }

    @Override
    public void update(Personagem personagem) {

    }

    @Override
    public void delete(Personagem personagem) {

    }

    @Override
    public void create(Personagem personagem) {

    }
    @Override
    public String getTableName() {
        return "rpg";
    }

    @Override
    public String getDeleteString(String table) {
        return  "DELETE FROM " + table + " WHERE ID = ?";
    }

    @Override
    public String getUpdateString(String table) {
        return "UPDATE " + table +  " SET  Nome = ?, Profissao = ?,  Armadura = ?, Arma = ?, Pedra = ? WHERE ID = ?;";
    }

    @Override
    public String getInsertString(String table) {
        return "INSERT INTO " + table + " (ID, Nome, Profissao, Mana, Ataque, Ataque_magico, Defesa, Defesa_magica, Velociade, Destreza, Exp, Nivel_atual, Armadura, Arma, Pedra, Raca) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    }

    @Override
    public String getSelectAllString(String table) {
        return "SELECT * FROM " + table;
    }

    @Override
    public String getSelectConditionalString(String table, String condition) {
        return null;
    }
}
