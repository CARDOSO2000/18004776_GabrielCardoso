package br.maua;
import pacote.QualquerCoisa;
import pacote.Dog;

public class Main {

    public static void main(String[] args) {
        QualquerCoisa meuQualquerCoisa = new QualquerCoisa();
        Dog dog1 = new Dog(30);
        Dog dog2 = new Dog(3);
        dog1.bark();
        meuQualquerCoisa.ola();
        dog2.bark();
    }
}
