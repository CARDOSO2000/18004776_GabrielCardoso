package br.maua.Classes;

import java.util.ArrayList;
import java.util.Scanner;


public class Sistema {
    ArrayList<Pedido> listadepedidos = new ArrayList<>();
    Menu oi = new Menu();
    Usuario usuario = new dono("Jorge","123456","Naosabiaqovenosaurerameta@sad.triste");
    public void run(){

        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            oi.printaInterface();
             n = scanner.nextInt();
            switch (n) {
                case 1:
                    int i = usuario.Verificarsenha();
                    if (i == 1) {
                        Pedido pedido = new Pedido();
                        pedido.AdicionarPizza();
                        pedido.FormadePagamento();
                        listadepedidos.add(pedido);
                    } else {
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
                    if (j == 1) {
                        int p;

                            System.out.println("Qual pedido quer alterar?");
                            for (Pedido pedidos : listadepedidos) {
                                System.out.println("Pedido: " + pedidos.getID());
                            }
                            String w;
                            w = scanner.next();
                            p = escolherID(w);

                        System.out.println(p);

                        do {
                            System.out.println("Oque deseja alterar?");
                            System.out.println("1 - Estado?");
                            System.out.println("2 - Forma de pagamento?");
                            System.out.println("3 - Sabor?");
                            System.out.println("4 - Remover pizza");
                            System.out.println("5 - Adicionar pizza?");
                            System.out.println("0 - Acabou");
                            j = scanner.nextInt();
                            switch (j) {
                                case 1:
                                    listadepedidos.get((int) p).AlterarEstado();
                                    break;
                                case 2:
                                    listadepedidos.get((int) p).FormadePagamento();
                                    break;
                                case 3:
                                    listadepedidos.get((int) p).substituirPizza();
                                    break;
                                case 4:
                                    listadepedidos.get((int) p).removerPizza();
                                case 5:
                                    listadepedidos.get((int) p).AdicionarPizza();

                            }
                        } while (j != 0);


                    }
            }
        }while (n != 0);
    }
    private int escolherID(String g){
        int j = 0;
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
