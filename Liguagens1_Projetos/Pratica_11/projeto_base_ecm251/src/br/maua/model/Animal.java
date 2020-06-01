package br.maua.model;

import br.maua.enumerates.AnimalClasses;
import br.maua.interfaces.Eat;
import br.maua.interfaces.Walk;

/**
 * Representação da abstração dos animais
 *  @author Gabriel Cardoso - gdlaurentis.diascardoso@gmail.com
 *   @since 01/06/2020
 *   @version 1.0
 */

public abstract class Animal implements Walk, Eat {
    private AnimalClasses animalClass;
    private String name;

    /**
     *
     * @param animalClass
     * @param name
     */
    public Animal(AnimalClasses animalClass, String name) {
        this.animalClass = animalClass;
        this.name = name;
    }

    public AnimalClasses getAnimalClass() {
        return animalClass;
    }

    public String getName() {
        return name;
    }
}
