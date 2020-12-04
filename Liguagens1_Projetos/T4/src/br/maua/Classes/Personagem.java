package br.maua.Classes;

import br.maua.Enum.*;

public class Personagem {
    private int id;
    private String raca;
    private String profissao;
    private String armadura;
    private String pedra;
    private String armas;
    private float mana;
    private String nome;
    private float ataque;
    private float ataque_magico;
    private float defesa;
    private float defesa_magica;
    private float velociade;
    private float destreza;
    private float exp;
    private int nivel;

    public Personagem(int id, String raca, String profissao, float mana, String nome,
                      float ataque, float ataque_magico, float defesa, float defesa_magica,
                      float velociade, float destreza, float exp, int nivel,String armadaura, String arma, String pedra) {
        this.id = id;
        this.raca = raca;
        this.profissao = profissao;
        this.mana = mana;
        this.nome = nome;
        this.ataque = ataque;
        this.ataque_magico = ataque_magico;
        this.defesa = defesa;
        this.defesa_magica = defesa_magica;
        this.velociade = velociade;
        this.destreza = destreza;
        this.exp = exp;
        this.nivel = nivel;
        this.armadura = armadaura;
        this.armas = arma;
        this.pedra = pedra;
    }

}
