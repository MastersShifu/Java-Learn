package org.example.model;

public class Client {
    private final Animal clientAnimal;
    private final String clientName;
    private final Integer clientAge;

    public Client(Animal animal, String clientName, Integer clientAge) {
        this.clientAnimal = animal;
        this.clientName = clientName;
        this.clientAge = clientAge;
    }

    public Animal getClientAnimal() {
        return this.clientAnimal;
    }

    public String getClientName() {
        return this.clientName;
    }

    public Integer getClientAge() {
        return this.clientAge;
    }
}
