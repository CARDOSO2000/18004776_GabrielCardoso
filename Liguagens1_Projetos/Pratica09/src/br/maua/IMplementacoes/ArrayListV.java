package br.maua.IMplementacoes;

import br.maua.models.Dog;

import java.util.ArrayList;

/**
 * @author GABRIEL
 */
public class ArrayListV {
    public static void run(){
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog dog = new Dog("D1","LAbrador",3);
        dogs.add(dog);
        dogs.add(new Dog("D2","LOL",1));
        dog = new Dog("D3","L",2);
        if(!dogs.contains(dog))
            dogs.add(dog);
        for(Dog dogNovo : dogs){
            System.out.println(dogNovo);
        }
        //Foreach dos
        dogs.forEach((cachorroDaLambda)->{
            System.out.println(cachorroDaLambda);
        });
    }
}
