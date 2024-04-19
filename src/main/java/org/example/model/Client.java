package org.example.model;

import java.util.Scanner;

public class Client {
    private final Animal clientAnimal;
    private final String clientName;
    private final Integer clientAge;

    public Client(Animal animal) {
        Scanner myObj = new Scanner(System.in);
        this.clientAnimal = animal;

        System.out.print("Client name: ");
        this.clientName = myObj.nextLine();

        System.out.println("Age: ");
        while (!myObj.hasNextInt()) {
            System.out.println("That's not a number!");
            myObj.next(); // this is important!
        }
        this.clientAge = myObj.nextInt();
    }

    public Animal getClientAnimal() {
        return clientAnimal;
    }

    public String getClientName() {
        return clientName;
    }

}
