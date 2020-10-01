package br.maua.testes;

import br.maua.api.ApiReader;
import org.json.JSONObject;

import java.util.Scanner;

public class APITeste {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.println("Nome: ");
        String manga = scanner.nextLine();
        JSONObject jsonObject = ApiReader.leituraJava11(tipo, manga);
        System.out.println(jsonObject.toString());

    }
}