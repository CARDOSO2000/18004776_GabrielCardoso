//Gabriel Cardoso 18.00477-6
package com.company;
import java.util.Scanner;
public class Atividade1 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String nome1, nome2, nome3;
        System.out.println("Informe o nome do Usuario 1:");
        nome1 = n.nextLine();
        System.out.println("Informe o nome do Usuario 2:");
        nome2 = n.nextLine();
        System.out.println("Informe o nome do Usuario 3:");
        nome3 = n.nextLine();

        Usuario a = new Usuario(nome1);
        Usuario b = new Usuario(nome2);
        Usuario c = new Usuario(nome3);
        Conta A = new Conta(a,1000);
        Conta B = new Conta(b,250);
        Conta C = new Conta(c,3000);
        System.out.println("Informações Atuais:");
        System.out.println("- "+A.getUsuario().getNome()+" "+A.getIdConta()+": "+A.getSaldo());
        System.out.println("- "+B.getUsuario().getNome()+" "+B.getIdConta()+": "+B.getSaldo());
        System.out.println("- "+C.getUsuario().getNome()+" "+C.getIdConta()+": "+C.getSaldo());
        Transacoes transacoes = new Transacoes();
        String QRA = transacoes.CriarQR(A,250);
        transacoes.pagar(A,B,QRA);
        transacoes.pagar(A,C,QRA);
        transacoes.pagar(A,B,QRA);
        String QRB = transacoes.CriarQR(B,1000);
        transacoes.pagar(B,C,QRB);
        System.out.println("Informações Atualizadas:");
        System.out.println("- "+A.getUsuario().getNome()+" "+A.getIdConta()+": "+A.getSaldo());
        System.out.println("- "+B.getUsuario().getNome()+" "+B.getIdConta()+": "+B.getSaldo());
        System.out.println("- "+C.getUsuario().getNome()+" "+C.getIdConta()+": "+C.getSaldo());
    }

}
