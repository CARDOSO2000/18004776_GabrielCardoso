package br.maua.Classes;

import java.util.Scanner;

public class dono extends Usuario{

    public dono(String name, String senha, String email) {
        super(name, senha, email);
    }

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

