package org.example.model;

import java.util.Scanner;

public abstract class Animals {
    private final String animalKind;
    private final String animalName;
    private final Float animalAge;
    private final String animalCharacter;

    public Animals() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Animal kind: ");
        this.animalKind = myObj.nextLine();

        System.out.print("Animal name: ");
        this.animalName = myObj.nextLine();

        System.out.println("Animal age: ");
        while (!myObj.hasNextFloat()) {
            System.out.print("That's not a number!");
            myObj.next(); // this is important!
        }
        this.animalAge = myObj.nextFloat();

        System.out.print("Animal character: ");
        this.animalCharacter = myObj.next();
    }

    public String getAnimalKind() {
        return animalKind;
    }

    public String getAnimalName() {
        return animalName;
    }
}


