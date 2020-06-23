package br.maua.Classes;

public class Usuario {
    private String Name;
    private String senha;
    private String email;

    public Usuario(String name, String senha, String email) {
        Name = name;
        this.senha = senha;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }
}
