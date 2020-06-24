package br.maua.Classes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Sistema {
    ArrayList<Pedido> listadepedidos;
    Menu oi = new Menu();
    Usuario usuario = new dono("Jorge","123456","Naosabiaqovenosaurerameta@sad.triste");
    void run(){
        oi.printaInterface();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case 1:
                int i = usuario.Verificarsenha();
                if(i == 1) {
                    Pedido pedido = new Pedido();
                    pedido.AdicionarPizza();
                    pedido.FormadePagamento();
                    listadepedidos.add(pedido);
                }else {
                    System.out.println("Senha incorreta");
                }
                break;
            case 2:
                for (Pedido pedidos : listadepedidos) {
                    pedidos.Listarpedido();
                }
                break;
            case 3:
                int j = usuario.Verificarsenha();
                if(j == 1){
                    double p;
                    do {
                    System.out.println("Qual pedido quer alterar?");
                    for (Pedido pedidos : listadepedidos) {
                        System.out.println("Pedido: " + pedidos.getID());
                    }
                    String w = scanner.nextLine();
                    p = escolherID(w);
                }while(p == 0.1);
                    j = scanner.nextInt();
                    Pedido alterar = listadepedidos.get((int)p);
                    System.out.println("Oque deseja alterar?");
                    System.out.println("1 - Estado?");
                    System.out.println("2 - Forma de pagamento?");
                    System.out.println("3 - Sabor?");
                    System.out.println("4 - Remover");
                    System.out.println("5 - Adicionar sabor?");
                    System.out.println("0 - Acabou");
                    switch (j){
                        case 1:

                    }


                }
        }
    }
    private double escolherID(String g){
        double j = 0.1;
        for (Pedido pedido: listadepedidos) {
            int i = 0;
            if(g.equals(pedido.getID())){
                 j = i;
            }
            i++;
        }
        return j;
    }

}
