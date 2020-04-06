//Gabriel Cardoso 18.00477-6

package com.company;

public class Conta {
        private int IdConta;
        private static int totalContas = 0;
        private double saldo;
        private Usuario usuario;
        private Transacoes transacoes;

        public Conta(Usuario usuario, double saldo){
            this.usuario = usuario;
            this.saldo = saldo;
            this.IdConta = totalContas ;
            totalContas = totalContas + 1;
        }
        public double getSaldo(){
            return this.saldo;
        }
        public int getIdConta(){
            return this.IdConta;
        }
        public Usuario getUsuario(){
            return this.usuario;
        }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
