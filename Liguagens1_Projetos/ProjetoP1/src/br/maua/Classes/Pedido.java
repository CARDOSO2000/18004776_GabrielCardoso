package br.maua.Classes;

import br.maua.ENUM.Estado;
import br.maua.ENUM.Paagamento;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Gabriel de Laurentis Dias Cardoso 18.00477-6
 * Classe do pedido e cria o array das pizzas
 */
public class Pedido {
    private String ID;
    private int total;
    private Paagamento paagamento;
    private Estado estado;
    ArrayList<Pizza> pizza = new ArrayList<>();
    public Pedido() {
        this.ID = geradorID();
        this.estado = Estado.PREPARACAO;
    }

    /**
     * Essa funcao adicio uma pizza ao array
     */

    protected void AdicionarPizza(){
        Scanner scanner = new Scanner(System.in);
        int i;
        do {
            System.out.println("Qual pizza adicionar?");
            System.out.println("1 - Mucarela");
            System.out.println("2 - Marguerita");
            System.out.println("3 - Peperoni");
            System.out.println("4 - Alcachofra");
            System.out.println("0 - Acabou");
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    Pizza pizza1 = new Mucarela();
                    this.pizza.add(pizza1);
                    ValorTotal();
                    break;
                case 2:
                    Pizza pizza2 = new Marguerita();
                    this.pizza.add(pizza2);
                    ValorTotal();
                    break;
                case 3:
                    Pizza pizza3 = new Peperoni();
                    this.pizza.add(pizza3);
                    ValorTotal();
                    break;
                case 4:
                    Pizza pizza4 = new Alcachofra();
                    this.pizza.add(pizza4);
                    ValorTotal();
                    break;
            }

        }while (i != 0);

    }

    /**
     * Faz a somatoria dos precos das pizzas e define um total no pedido
     * @return o total da conta
     */
    protected int ValorTotal(){
        int valor = 0;
        for (Pizza pizzalista: this.pizza) {
            valor = valor + pizzalista.getPreco();
        }
       return  this.total = valor;
    }

    /**
     * Funcao que gera o ID do pedido
     * @return  o ID
     */
    private String geradorID(){
        Random random = new Random();
        String idGerado = "";
        for (int i = 0;i < 3;i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }

    /**
     * Funcao que determina a forma de pagamento do ususario
     */
    protected void FormadePagamento() {
        Scanner scanner = new Scanner(System.in);
        int i;
            System.out.println("Qual forma de pagamento?");
            System.out.println("1 - Credito");
            System.out.println("2 - Debito");
            System.out.println("3 - Dinheiro");
            System.out.println("4 - Vale refeicao");
            System.out.println("5 - Vale alimentacao");
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    this.paagamento = Paagamento.CREDITO;
                    break;
                case 2:
                    this.paagamento = Paagamento.DEBITO;
                    break;
                case 3:
                    this.paagamento = Paagamento.DINHEIRO;
                    break;
                case 4:
                    this.paagamento = Paagamento.VALE_REFEICAO;
                    break;
                case 5:
                    this.paagamento = Paagamento.VALE_ALIMENTACAO;
                    break;
            }
    }

    /**
     * Getter para o ID
     * @return ID
     */

    public String getID() {
        return ID;
    }

    /**
     * getter para o Total
     * @return
     */
    public int getTotal() {
        return total;
    }

    /**
     * Getter para o estado do pedido
     * @return
     */
    public Estado getEstado() {
        return estado;
    }


    /**
     * Funcao que lista o pedido e printa ele
     */
    public void Listarpedido(){
        System.out.println("Pedido: "+ getID()+ " {");
        for (Pizza pizzalista: this.pizza) {
            System.out.println("Sabor: " + pizzalista.getSabor() + " Preco: " + pizzalista.getPreco() + " R$");
        }
        System.out.println("Forma de Pagamento: " + this.paagamento);
        System.out.println("Total: "+getTotal() + " R$");
        System.out.println("Estado: "+ getEstado() + " }");
    }

    /**
     * Funcao para remover a pizza do pedido
     */
    protected void removerPizza(){
        System.out.println("Qual deseja remover?");
        for (Pizza pizzalista: this.pizza) {
            int i = 0;
            System.out.println(i + " - " + pizzalista.getSabor());
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        this.pizza.remove(j);
        ValorTotal();
    }

    /**
     * Funcao para substituir uma pizza do pedido caso ocorreu algum erro
     */
    protected void substituirPizza(){
        System.out.println("Qual deseja substituir?");
        for (Pizza pizzalista: this.pizza) {
            int i = 0;
            System.out.println(i + " - " + pizzalista.getSabor());
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        this.pizza.remove(j);
        System.out.println("Qual deseja recolocar?");
        System.out.println("1 - Mucarela");
        System.out.println("2 - Marguerita");
        System.out.println("3 - Peperoni");
        System.out.println("4 - Alcachofra");
        System.out.println("0 - Acabou");
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                Pizza pizza1 = new Mucarela();
                this.pizza.add(pizza1);
                ValorTotal();
                break;
            case 2:
                Pizza pizza2 = new Marguerita();
                this.pizza.add(pizza2);
                ValorTotal();
                break;
            case 3:
                Pizza pizza3 = new Peperoni();
                this.pizza.add(pizza3);
                ValorTotal();
                break;
            case 4:
                Pizza pizza4 = new Alcachofra();
                this.pizza.add(pizza4);
                ValorTotal();
                break;
        }

    }

    /**
     * Altera o estado do pedido
     */
    void AlterarEstado(){
        System.out.println("Estado atual: " + this.estado);
        Scanner scanner = new Scanner(System.in);
            System.out.println("Qual estado está agora?");
            System.out.println("1 - Realizado");
            System.out.println("2 - Em preparo");
            System.out.println("3 - Saiu");
            System.out.println("4 - Entregue");
            System.out.println("5 - Devolvido");
            int i;
            i = scanner.nextInt();
            switch (i){
                case 1:
                    this.estado = Estado.REALIZADO;
                    break;
                case 2:
                    this.estado = Estado.PREPARACAO;
                    break;
                case 3:
                    this.estado = Estado.SAIU_PARA_ENTREGA;
                    break;
                case 4:
                    this.estado = Estado.ENTREGUE;
                    break;
                case 5:
                    this.estado = Estado.DEVOLVIDO;
                    break;
            }


    }

}
