package br.maua.Classes;

import java.util.Scanner;
/**
 * @author Gabriel de Laurentis Dias Cardoso 18.00477-6
 */
/**
 * Classe filho do dono
 */
public class dono extends Usuario{

    public dono(String name, String senha, String email) {
        super(name, senha, email);
    }

    /**
     * Varificção de senha do usuario
     * @return retorna 1 se for correta a senha 0 incorreta
     */
    @Override
    public int Verificarsenha() {
        System.out.println("Digite a senha:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String senha;
        senha = String.valueOf(i);
        if(senha.equals(getSenha()))
            return 1;
        else
            return 0;
    }
}

