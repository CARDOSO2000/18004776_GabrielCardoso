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

    public int getId() {
        return id;
    }

    public String getRaca() {
        return raca;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getArmadura() {
        return armadura;
    }

    public String getPedra() {
        return pedra;
    }

    public String getArmas() {
        return armas;
    }

    public float getMana() {
        return mana;
    }

    public String getNome() {
        return nome;
    }

    public float getAtaque() {
        return ataque;
    }

    public float getAtaque_magico() {
        return ataque_magico;
    }

    public float getDefesa() {
        return defesa;
    }

    public float getDefesa_magica() {
        return defesa_magica;
    }

    public float getVelociade() {
        return velociade;
    }

    public float getDestreza() {
        return destreza;
    }

    public float getExp() {
        return exp;
    }

    public int getNivel() {
        return nivel;
    }
}
