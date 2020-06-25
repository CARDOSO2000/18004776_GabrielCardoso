package br.maua.Classes;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Gabriel de Laurentis Dias Cardoso 18.00477-6
 * Classe do sistema que cria um array de pedidos em sua db
 */

public class Sistema {
    ArrayList<Pedido> listadepedidos = new ArrayList<>();
    Menu oi = new Menu();
    Usuario usuario = new dono("Jorge","123456","Naosabiaqovenosaurerameta@sad.triste");

    /**
     * A run roda o menu epede para o usuario definir qual a opção desejada
     */
    public void run(){

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Boa tarde " + usuario.getName()+" !");
        System.out.println("Email: " + usuario.getEmail());
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
                            p = escolherID();
                            if(p != -1) {
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
                                            listadepedidos.get(p).AlterarEstado();
                                            break;
                                        case 2:
                                            listadepedidos.get(p).FormadePagamento();
                                            break;
                                        case 3:
                                            listadepedidos.get(p).substituirPizza();
                                            break;
                                        case 4:
                                            listadepedidos.get(p).removerPizza();
                                        case 5:
                                            listadepedidos.get(p).AdicionarPizza();

                                    }
                                } while (j != 0);
                            }

                    }
                    break;
            }
        }while (n != 0);
    }

    /**
     * Metodo que verifica o ID do pedido a ser alterado
     * @return retorna o valor da posição do pedido no array
     */
    private int escolherID(){
        Scanner scanner = new Scanner(System.in);
        String g;
        g = scanner.next();
        int j = 0;
        int i = 0;
        for (Pedido pedido: listadepedidos) {

             if (pedido.getID().equals(g)) {
                 j = i;
             }

             i++;
        }
        if(listadepedidos.get(j).getID().equals(g)){
            return j;
        }
        System.out.println(j);
        return  -1;

    }

}
