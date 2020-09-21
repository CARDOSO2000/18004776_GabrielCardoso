package br.maua.Testes;

import br.maua.dao.ProdutoDao;
import br.maua.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicacaoDAO {
    private List<Produto> produtos;
    private ProdutoDao produtoDao;
    private Scanner scanner;

    public AplicacaoDAO() {
        produtos = new ArrayList<>();
        produtoDao = new ProdutoDao();
        scanner = new Scanner(System.in);
    }

    public void run(){
        boolean alive = true;
       do{
           menu();
           int opcao = Integer.parseInt(scanner.next());
           switch (opcao){
               case 0:
                   alive = false;
                   break;
               case 1:
                   exibirProdutos();
                   break;
               case 2:
                   deletarProduto();
                   break;
               case 3:
                   atualizarProduto();
                   break;
               case 4:
                   cadastrarNovoProduto();
                   break;
           }

       }while(alive);
    }
    private void exibirProdutos() {
        produtos = produtoDao.getAll();
        System.out.println("Produto:");
        produtos.forEach( produto -> System.out.println(produto));
    }
    private void deletarProduto() {
        System.out.println("Codigo do produto:");
        String codigo = scanner.next();
        Produto produto = new Produto(codigo);
        produtoDao.delete(produto);
    }
    private void cadastrarNovoProduto() {
        String nome, codigo, descricao;
        int quantidade;
        double custo, valor;
        System.out.println("Informe os dados:");
        codigo = scanner.next();
        nome = scanner.next();
        descricao = scanner.next();
        custo = Double.parseDouble(scanner.next());
        valor = Double.parseDouble(scanner.next());
        quantidade = Integer.parseInt(scanner.next());
        produtoDao.create(new Produto(
                codigo, nome, descricao, custo, valor, quantidade
        ));
    }
    private void atualizarProduto() {
        produtos = produtoDao.getAll();
        System.out.println("Codigo do Produto para Atualizar:");
        String codigo = scanner.next();
        System.out.println("Cadastre os novos valores:");
        String nome, descricao;
        int quantidade;
        double custo, valor;
        System.out.println("Informe os dados:");
        nome = scanner.next();
        descricao = scanner.next();
        custo = Double.parseDouble(scanner.next());
        valor = Double.parseDouble(scanner.next());
        quantidade = Integer.parseInt(scanner.next());
        produtoDao.update(new Produto(
                codigo, nome, descricao, custo, valor, quantidade
        ));
    }



    public void menu(){
        System.out.println("PLUG_AND_USE-1996");
        System.out.println("1 - Cadastrados");
        System.out.println("2 - Deletar Produto");
        System.out.println("3 - Alterar Produto");
        System.out.println("4 - Cadastrar Produto");
        System.out.println("0 - SAIR");
    }

}

