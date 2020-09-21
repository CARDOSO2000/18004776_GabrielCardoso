package br.maua.api;



import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiReader {
    private static void leituraJava11(String tipo, String nome) throws  Exception{

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create("https://api.jikan.moe/v3/search/"+tipo+"?q="+nome)).build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

    }
}
