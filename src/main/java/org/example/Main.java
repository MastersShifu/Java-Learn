package org.example;


import org.example.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean end = false;
        VetClinic clinic = new VetClinic();

        System.out.println("Hello in program! Choose what you want: ");
        while (!end) {
            String choose;
            Scanner myObj = new Scanner(System.in);
            System.out.println("1. Go to clinic\n2. Show visits\n3. Exit");
            choose = myObj.nextLine();

            switch (choose) {
                case "1":
                    System.out.println("Write animal info: ");
                    Animal animal = new Animal();

                    System.out.println("Now Client data: ");
                    Client client = new Client(animal);
                    clinic.newVisitor(client, client.getClientAnimal());
                    break;

                case "2":
                    if (!clinic.getVisits().isEmpty()) {
                        for (String visit : clinic.getVisits()) {
                            System.out.println(visit);
                        }

                    } else {
                        System.out.println("No one visits clinic!");
                    }

                    break;

                case "3":
                    end = true;
                    break;

                default:
                    System.out.println("Invalid input!");
                    break;
            }

        }
    }
}