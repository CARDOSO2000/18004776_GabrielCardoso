package br.maua.model;

/**
 * @author Gabriel Cardoso
 * Classe do Anime
 */
public class Anime {
    private String nome;
    private String url;
    private String sinopse;
    private float nota;
    private int episodio;

    /**
     * Construtor do anime
     * @param nome
     * @param url
     * @param sinopse
     * @param nota
     * @param episodio
     */
    public Anime(String nome, String url, String sinopse, float nota, int episodio) {
        this.nome = nome;
        this.url = url;
        this.sinopse = sinopse;
        this.nota = nota;
        this.episodio = episodio;
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

    public float getNota() {
        return nota;
    }

    public int getEpisodio() {
        return episodio;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", url='" + url + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", nota=" + nota +
                ", episodio=" + episodio +
                '}';
    }
}
