package br.maua.Testes;

import br.maua.model.Produto;
import sun.print.PeekGraphics;

import java.sql.*;

public class Aplicacao {
    public void run(){
        try {
            Connection connection =  DriverManager.getConnection("jdbc:sqlite:dados.db");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM produtos");
            while(resultSet.next()){
                Produto produto = new Produto(
                        resultSet.getString("codigo"),
                        resultSet.getString("nome"),
                        resultSet.getString("descricao"),
                        resultSet.getDouble("custo"),
                        resultSet.getDouble("valor"),
                        resultSet.getInt("quantidade")
                );
                System.out.println(produto);
            }
            resultSet.close();
            Produto produto = new Produto("2000", "Water Cooler 120mm", "Cooler", 80, 240, 5);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO produtos (codigo, nome, descricao, custo, valor, quantidade) VALUES (?, ?, ?, ?, ?, ?);");
            preparedStatement.setString(1, produto.getCodigo());
            preparedStatement.setString(2, produto.getNome());
            preparedStatement.setString(3, produto.getDescricao());
            preparedStatement.setDouble(4, produto.getCusto());
            preparedStatement.setDouble(5, produto.getValor());
            preparedStatement.setInt(6, produto.getQuantidade());
            //Executa o PreparedStatement
            int retorno = preparedStatement.executeUpdate();
            System.out.println("Retorno:" + retorno);
            //Salva as modificações no banco
            //connection.commit();

            //Exibe o conteúdo do banco
            resultSet = statement.executeQuery("SELECT * FROM produtos");
            while(resultSet.next()){
                Produto newproduto = new Produto(
                        resultSet.getString("codigo"),
                        resultSet.getString("nome"),
                        resultSet.getString("descricao"),
                        resultSet.getDouble("custo"),
                        resultSet.getDouble("valor"),
                        resultSet.getInt("quantidade")
                );
                System.out.println(newproduto);
            }
            resultSet.close();

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
