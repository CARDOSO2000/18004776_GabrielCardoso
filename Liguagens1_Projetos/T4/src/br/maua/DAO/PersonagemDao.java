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
    public Personagem get(int condition) {
        List<Personagem> personagems = new ArrayList<>();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getSelectConditionalString(getTableName()));
            preparedStatement.setInt(1,condition);
            ResultSet result = preparedStatement.executeQuery();
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
        return personagems.get(0);
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
                        result.getFloat("Ataque_magico"),
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
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getUpdateString(getTableName()));
            preparedStatement.setString(1,personagem.getNome());
            preparedStatement.setString(2,personagem.getProfissao());
            preparedStatement.setFloat(3,personagem.getMana());
            preparedStatement.setFloat(4,personagem.getAtaque());
            preparedStatement.setFloat(5,personagem.getAtaque_magico());
            preparedStatement.setFloat(6,personagem.getDefesa());
            preparedStatement.setFloat(7,personagem.getDefesa_magica());
            preparedStatement.setFloat(8,personagem.getVelociade());
            preparedStatement.setString(9,personagem.getArmadura());
            preparedStatement.setString(10,personagem.getArmas());
            preparedStatement.setString(11,personagem.getPedra());
            preparedStatement.setInt(12,personagem.getId());

            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Personagem personagem) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getDeleteString(getTableName()));
            preparedStatement.setInt(1,personagem.getId());
            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void create(Personagem personagem) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(getInsertString(getTableName()));
            preparedStatement.setInt(1,personagem.getId());
            preparedStatement.setString(2,personagem.getNome());
            preparedStatement.setString(3,personagem.getProfissao());
            preparedStatement.setFloat(4,personagem.getMana());
            preparedStatement.setFloat(5,personagem.getAtaque());
            preparedStatement.setFloat(6,personagem.getAtaque_magico());
            preparedStatement.setFloat(7,personagem.getDefesa());
            preparedStatement.setFloat(8,personagem.getDefesa_magica());
            preparedStatement.setFloat(9,personagem.getVelociade());
            preparedStatement.setFloat(10,personagem.getDestreza());
            preparedStatement.setFloat(11,personagem.getExp());
            preparedStatement.setInt(12,personagem.getNivel());
            preparedStatement.setString(13,personagem.getArmadura());
            preparedStatement.setString(14,personagem.getArmas());
            preparedStatement.setString(15,personagem.getPedra());
            preparedStatement.setString(16,personagem.getRaca());


            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
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
        return "UPDATE " + table +  " SET  Nome = ?, Profissao = ?,Mana =?, Ataque =?, Ataque_magico = ?, Defesa = ?, Defesa_magica = ?, Velocidade = ?, Armadura = ?, Arma = ?, Pedra = ? WHERE ID = ?;";
    }

    @Override
    public String getInsertString(String table) {
        return "INSERT INTO " + table + " (ID, Nome, Profissao, Mana, Ataque, Ataque_magico, Defesa, Defesa_magica, Velocidade, Destreza, Exp, Nivel_atual, Armadura, Arma, Pedra, Raca) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    }

    @Override
    public String getSelectAllString(String table) {
        return "SELECT * FROM " + table;
    }

    @Override
    public String getSelectConditionalString(String table) {
         return "SELECT * FROM " + table + "WHERE ID = ?";
    }
}
