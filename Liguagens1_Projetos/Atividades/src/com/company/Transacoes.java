package com.company;
import java.util.Random;


public class Transacoes {

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public String CriarQR(Conta conta, double valor) {
        return String.format("%d;%s;%f;%d", conta.getIdConta(), conta.getUsuario().getNome(), valor, getRandomNumberInRange(1000,9999));
    }


    public void pagar(Conta conta1, Conta conta2, String transacoes) {
        String[] s = transacoes.split(";");
        int Id;
        Id = Integer.parseInt(s[0]);
        s[2] = s[2].replace(",",".");
        double valor;
        valor = Double.parseDouble(s[2]);
        if (Id == conta1.getIdConta()) {
            if (conta2.getSaldo() >= valor) {
                conta1.setSaldo(conta1.getSaldo() + valor);
                conta2.setSaldo(conta2.getSaldo() - valor);


            }

        }


    }



}
