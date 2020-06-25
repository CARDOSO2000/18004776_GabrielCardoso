package br.maua.Classes;


import br.maua.ENUM.TipoDePizza;

/**
 * @author Gabriel de Laurentis Dias Cardoso 18.00477-6
 * Classe pai que cria uma pizza
 */
public abstract class Pizza {
 private TipoDePizza Sabor;
 private int preco;

 public Pizza(TipoDePizza sabor, int preco) {
  Sabor = sabor;
  this.preco = preco;


 }

 /**
  * Getter para o dabor da pizza
  * @return sabor
  */

 public TipoDePizza getSabor() {
  return Sabor;
 }

 /**
  * Getter do preco da pizza
  * @return valor
  */
 public int getPreco() {
  return preco;
 }

}
