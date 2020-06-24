package br.maua.Classes;

import java.util.ArrayList;
import java.util.Scanner;

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
                    pedido.ValorTotal();
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
                    System.out.println("Qual pedido quer alterar?");
                    for (Pedido pedidos: listadepedidos) {
                        System.out.println("Pedido: "+pedidos.getID());
                    }
                    String w = scanner.nextLine();
                    
                }
        }
    }


}
