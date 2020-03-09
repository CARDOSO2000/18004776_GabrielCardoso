package Exemplo1;

public class Conta {
    // Atributos
    public int numero;
    public Cliente cliente;
    public double saldo;

    // Metodos da classe
    boolean sacar(double valor){
        if(this.saldo < valor){
            return false;
        }
        else {
            this.saldo -= valor;
            return true;
        }
    }
    void depositar(double valor){
        this.saldo += valor;
    }
    void visualizarSaldo(){
        System.out.println("Saldo:" + this.saldo);
    }
    boolean transferirDinheiro(Conta D, double valor){
        if(sacar(valor)){
            D.depositar(valor);
            return true;

        }else
            return false;
    }
}
