package br.maua.Classes;

import br.maua.ENUM.Estado;
import br.maua.ENUM.Paagamento;
import br.maua.ENUM.TipoDePizza;


public abstract class Pizza {
 private TipoDePizza Sabor;
 private int preco;

 public Pizza(TipoDePizza sabor, int preco) {
  Sabor = sabor;
  this.preco = preco;


 }


 public TipoDePizza getSabor() {
  return Sabor;
 }

 public int getPreco() {
  return preco;
 }

 @Override
 public String toString() {
  return "Pizza{" +
          "Sabor=" + Sabor +
          ", preco=" + preco +
          '}';
 }
}
