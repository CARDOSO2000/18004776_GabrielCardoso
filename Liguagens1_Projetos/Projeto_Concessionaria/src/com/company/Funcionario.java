package com.company;

public class Funcionario {
    private double salarioBase;
    private double comissao;

    public Funcionario(double salarioBase){
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
}
