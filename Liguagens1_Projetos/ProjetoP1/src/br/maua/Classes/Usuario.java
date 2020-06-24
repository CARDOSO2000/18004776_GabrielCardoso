package br.maua.Classes;

import br.maua.Interface.VerificarSenha;



public class Usuario implements VerificarSenha {
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


    @Override
    public int Verificarsenha(int i) {
        String senha;
        senha = String.valueOf(i);
        if(senha.equals(getSenha()))
            return 1;
        else
            return 0;
    }
}
