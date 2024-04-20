package org.example.controller;

import org.example.model.Animal;
import org.example.model.Client;

import java.util.Scanner;

public class WriteFields {
    public static Animal NewAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Animal kind: ");
        String animalKind = scanner.nextLine();

        System.out.print("Animal name: ");
        String animalName = scanner.nextLine();

        System.out.println("Animal age: ");
        while (!scanner.hasNextFloat()) {
            System.out.print("That's not a number!\n");
            scanner.next(); // this is important!
        }
        Float animalAge = scanner.nextFloat();

        System.out.print("Animal character: ");
        String animalCharacter = scanner.next();

        return new Animal(animalKind, animalName, animalAge, animalCharacter);
    }

    public static Client NewClient(Animal animal) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Client name: ");
        String clientName = scanner.nextLine();

        System.out.println("Age: ");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!\n");
            scanner.next(); // this is important!
        }
        int clientAge = scanner.nextInt();

        return new Client(animal, clientName, clientAge);
    }
}
