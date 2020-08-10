package br.maua.parcer;

import br.maua.model.Jogo;
import br.maua.model.ListaJogos;
import org.json.JSONArray;

import java.io.*;

public class TesteJsonArquivo {
    public static void main(String[] args) {
     ListaJogos lsita = new ListaJogos();
        lsita.addJogo(new Jogo("Pc", "minecraft"));
        lsita.addJogo(new Jogo("Pc", "GTA"));
        lsita.addJogo(new Jogo("Pc", "Terraria"));
        lsita.addJogo(new Jogo("PS4", "FIFA"));
        JSONArray json = ListaDeJogosParcer.toJson(lsita);
        System.out.println("Array: " + json);
        escreverArquivo("jogos.json", json);
        ListaJogos lista = ListaDeJogosParcer.fromJson(lerArquivo("jogos.json"));
        System.out.println("Lista Carregada:");
        System.out.println(""+lista);
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
