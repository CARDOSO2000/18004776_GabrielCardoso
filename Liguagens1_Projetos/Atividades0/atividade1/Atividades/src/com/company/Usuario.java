//Gabriel Cardoso 18.00477-6
package com.company;

public class Usuario {
    private String nome, senha, email;

    public Usuario(String nome){
        this.nome = nome;
        this.senha = null;
        this.email = null;
    }
    public String getNome(){
        return this.nome;
    }

}
