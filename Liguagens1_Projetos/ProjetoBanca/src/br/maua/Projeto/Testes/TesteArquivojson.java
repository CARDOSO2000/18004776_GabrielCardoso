package br.maua.Projeto.Testes;

import br.maua.ENUM.TiposDeProdutos;
import br.maua.Projeto.Parsers.ListaDeProdutoParsers;
import br.maua.Projeto.models.ListaDeProdutos;
import br.maua.Projeto.models.Produto;
import org.json.JSONArray;

import java.io.*;

public class TesteArquivojson {
    public static void main(String[] args) {
        ListaDeProdutos listaDeProdutos = new ListaDeProdutos();
        listaDeProdutos.addProduto(new Produto(TiposDeProdutos.GIBI,32,44,"Turma da monica no crack"));
        listaDeProdutos.addProduto(new Produto(TiposDeProdutos.JORNAL,2,100,"COD e uma merda"));
        listaDeProdutos.addProduto(new Produto(TiposDeProdutos.MANGA,32,144,"Midorya no crack"));
        listaDeProdutos.addProduto(new Produto(TiposDeProdutos.REVISTA,323,443,"Caras faliu"));
        JSONArray jsonArray = ListaDeProdutoParsers.toJson(listaDeProdutos);
        System.out.println("Array: "+ jsonArray);
        escreverArquivo("Catalogo.json", jsonArray);
        ListaDeProdutos listaDeProdutos1 = ListaDeProdutoParsers.fromJson(lerArquivo("Catalogo.json"));
        System.out.println("Lista Carregada: ");
        System.out.println(""+listaDeProdutos1);

    }
    private static JSONArray lerArquivo(String nomeArquivo) {
        JSONArray json = null;
        File file = new File(nomeArquivo);
        try{
            //Cria o fluxo de leitura
            FileReader fileReader = new FileReader(file);
            //Buffer de leitura
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            json = new JSONArray (bufferedReader.readLine());

            //Feche tudo ao terminar
            bufferedReader.close();
            fileReader.close();

        }catch (Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
        return json;
    }

    private static void escreverArquivo(String nomeArquivo, JSONArray json) {
        //Cria um arquivo
        File file = new File(nomeArquivo);
        try{

            //Cria uma conexão apra escrever no arquivo
            FileWriter fileWriter = new FileWriter(file);
            //Cria um buffer de writting
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //Escrever algo no arquivo
            bufferedWriter.write("" + json);

            //Fecha o buffer e escreve no arquivo
            bufferedWriter.close();
            //fecha os demais fluxos
            fileWriter.close();

        }catch(Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
    }
}
