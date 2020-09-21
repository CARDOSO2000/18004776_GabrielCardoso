package br.maua.model;

public class Manga {
    private String nome;
    private String url;
    private String sinopse;
    private String tipo;
    private int volume;
    private int capitulo;
    private float nota;

    public Manga(String nome, String url, String sinopse, String tipo, int volume, int capitulo, float nota) {
        this.nome = nome;
        this.url = url;
        this.sinopse = sinopse;
        this.tipo = tipo;
        this.volume = volume;
        this.capitulo = capitulo;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getUrl() {
        return url;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVolume() {
        return volume;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public float getNota() {
        return nota;
    }
}
