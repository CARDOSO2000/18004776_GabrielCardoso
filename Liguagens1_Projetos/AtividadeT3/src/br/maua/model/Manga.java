package br.maua.model;

/**
 * @author Gabriel Cardoso
 * Classe manga
 */
public class Manga {
    private String nome;
    private String url;
    private String sinopse;
    private String tipo;
    private int volume;
    private int capitulo;
    private float nota;

    /**
     * Construtor do Manga
     * @param nome
     * @param url
     * @param sinopse
     * @param tipo
     * @param volume
     * @param capitulo
     * @param nota
     */
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

    @Override
    public String toString() {
        return "Manga{" +
                "nome='" + nome + '\'' +
                ", url='" + url + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", tipo='" + tipo + '\'' +
                ", volume=" + volume +
                ", capitulo=" + capitulo +
                ", nota=" + nota +
                '}';
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
