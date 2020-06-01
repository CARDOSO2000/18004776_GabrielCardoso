package br.maua.IMplementacoes;
import br.maua.models.Dog;
public class ArreyI {

    public static void run(){
      // int [] meusInteiros = new int[10];
     //  meusInteiros[3] = 42;
      //  System.out.println("Valor na 3:"+ meusInteiros[3]);
        Dog [] dogs = new Dog[3];
        Dog dog = new Dog("Thor","Golden",30);
        dogs[0] = dog;
        dogs[1] = new Dog("Fido","LOL",20);
        dogs[2] = new Dog("Mel","Rex",4);
        dogs[3] = new Dog("Mel","Rex",4);
        for(int i = 0; i < dogs.length;i++){
            System.out.println(dogs[i]);
        }
    }
}
