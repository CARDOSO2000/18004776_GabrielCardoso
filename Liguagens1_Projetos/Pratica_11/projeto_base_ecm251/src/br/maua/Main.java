package br.maua;

import br.maua.enumerates.AnimalClasses;
import br.maua.interfaces.Eat;
import br.maua.interfaces.Walk;
import br.maua.model.Animal;
import br.maua.model.Cat;
import br.maua.model.Dog;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe ponto de entrada da aplicação base <br>
 *     Ela é responsável or inicia a aplicação, criando as instancias dos objetos
 * @author Gabriel Cardoso - gdlaurentis.diascardoso@gmail.com
 * @since 01/06/2020
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> myAnimas = new ArrayList<>();
        myAnimas.add(new Dog(AnimalClasses.DOMESTIC, "Thor"));
        myAnimas.add(new Cat(AnimalClasses.CIRCUS, "Gigi"));
        myAnimas.forEach(animal -> {
            howToWalk(animal, 100);
            howToEat(animal, 10);
        });
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.console().readLine();
    }

    public static void howToWalk(Walk walker, int distance){
        System.out.println(walker.walk(distance));
    }

    public static void howToEat(Eat eater, int amount){
        System.out.println(eater.eat(amount));
    }
}
