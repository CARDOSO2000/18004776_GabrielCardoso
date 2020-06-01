package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Cachorro cachorro = new Cachorro();
	Lobo lobo = new Lobo();
	Peixe peixe = new Peixe();

		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(cachorro);
		animals.add(lobo);
		animals.add(peixe);

		//Metodo 2
		System.out.println("Enhanced for each:");
		for (Animal animal: animals) {
			animal.comer();
			if(animal instanceof Canino){
				System.out.println("Canino!");
				ComportamentoCanino((Canino)animal);
			}
			if(animal instanceof Locomover){
				((Locomover) animal).locomover());
			}
		}
		loco(cachorro);
		loco(peixe);


    }
    public static void ComportamentoCanino(Canino canino){
    	canino.cheirar();
	}
	public static void loco(Locomover locomover){
    	locomover.locomover();
	}
}
