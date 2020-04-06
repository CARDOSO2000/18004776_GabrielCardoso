package com.company;

public class Vendedor {
    private double salarioBase;
    private double comissao;
    private Gerente gerente;

    public Vendedor(double salarioBase, Gerente gerente){
        this.gerente = gerente;
        this.salarioBase = salarioBase;
        this.comissao = 0.05;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getComissao() {
        return comissao;
    }
    public double getSalarioFinal(double totalVendasMes){
        return salarioBase + comissao*totalVendasMes;
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
