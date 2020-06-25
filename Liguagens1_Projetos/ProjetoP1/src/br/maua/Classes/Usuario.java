package br.maua.Classes;

import br.maua.Interface.VerificarSenha;


/**
 * @author Gabriel de Laurentis Dias Cardoso 18.00477-6
 * Classe pai que define os usuarios do sistema no caso so existe 1 mas
 * se tievesse mais daria para criar
 */

public abstract class Usuario implements VerificarSenha {
    private String Name;
    private String senha;
    private String email;

    public Usuario(String name, String senha, String email) {
        Name = name;
        this.senha = senha;
        this.email = email;
    }

    /**
     * getter para o nome
     * @return nome
     */
    public String getName() {
        return Name;
    }

    /**
     * Getter para a senha
     * @return senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Getter para o email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Interface para verificar a senha do usuario
     * @param i
     * @return
     */
    @Override
    public int Verificarsenha(int i) {
        return 0;
    }


}
