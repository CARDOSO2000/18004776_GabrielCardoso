package br.maua.Classes;

import br.maua.ENUM.TipoDePizza;

import java.util.Random;

public abstract class Pizza {
 private TipoDePizza Sabor;
 private int preco;
 private String ID;

 public Pizza(TipoDePizza sabor, int preco) {
  Sabor = sabor;
  this.preco = preco;
  this.ID = geradorId();
 }
 private String geradorId(){
  Random random = new Random();
  String idGerado = "";
  for (int i = 0; i < 3; i++)
     idGerado += random.nextInt(10);
  return idGerado;
 }



}