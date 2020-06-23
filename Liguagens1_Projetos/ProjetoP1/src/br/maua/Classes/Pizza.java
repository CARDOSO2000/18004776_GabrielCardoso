package br.maua.Classes;

import br.maua.ENUM.Estado;
import br.maua.ENUM.TipoDePizza;

import java.util.Random;

public abstract class Pizza {
 private TipoDePizza Sabor;
 private int preco;
 private String ID;
 private Estado estado;

 public Pizza(TipoDePizza sabor, int preco, Estado estado) {
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

 public TipoDePizza getSabor() {
  return Sabor;
 }

 public int getPreco() {
  return preco;
 }

 public String getID() {
  return ID;
 }

 public Estado getEstado() {
  return estado;
 }

 @Override
 public String toString() {
  return "Pizza{" +
          "Sabor=" + Sabor +
          ", preco=" + preco +
          "R$, ID='" + ID + '\'' +
          ", estado=" + estado +
          '}';
 }
}
