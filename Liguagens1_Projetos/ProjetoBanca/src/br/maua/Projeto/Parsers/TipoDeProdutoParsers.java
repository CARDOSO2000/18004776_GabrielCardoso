package br.maua.Projeto.Parsers;

import br.maua.ENUM.TiposDeProdutos;

public class TipoDeProdutoParsers {
    public static TiposDeProdutos toTipo(String tipo){
        if(tipo.equals("Gibi"))return TiposDeProdutos.GIBI;
        if (tipo.equals("Manga"))return TiposDeProdutos.MANGA;
        if(tipo.equals("Jornal"))return TiposDeProdutos.JORNAL;
        else return TiposDeProdutos.REVISTA;
    }
}
