package br.maua.Implement.serializacao;

import br.maua.Implement.serializacao.Pessoa;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TesteDeserializar {
    public static void main(String[] args) {
        Pessoa p1, p2;

        try{
            //Acessa o arquivo
            FileInputStream fileInputStream = new FileInputStream("ecm251.maua");
            //Acessa os dados no arquivo
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            //Ler os objetos do arquivo
            p1 = (Pessoa) objectInputStream.readObject();
            p2 = (Pessoa) objectInputStream.readObject();

            System.out.println("Pessoas:" + p1 + p2);

            //Fecha os fluxos
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }

    }
}
