package com.company;

public class Vendedor extends Funcionario {

    private Gerente gerente;

    public Vendedor(double salarioBase, Gerente gerente){
        super(salarioBase);
        this.gerente = gerente;

    }

    public final Gerente getGerente() {
        return gerente;
    }

    public boolean setSalarioBase(double novoSalario, Gerente gerente) {
        if(this.gerente.equals(gerente)){
            this.salarioBase = novoSalario;
            return true;
        }else{
            return false;
        }
    }
}
