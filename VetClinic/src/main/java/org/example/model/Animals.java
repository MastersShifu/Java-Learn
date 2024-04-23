package org.example.model;

public abstract class Animals {
    private final String animalKind;
    private final String animalName;
    private final Float animalAge;
    private final String animalCharacter;

    public Animals(String animalKind, String animalName, Float animalAge, String animalCharacter) {
        this.animalKind = animalKind;
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.animalCharacter = animalCharacter;
    }

    public String getAnimalKind() {
        return this.animalKind;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public Float getAnimalAge() {
        return this.animalAge;
    }

    public String getAnimalCharacter() {
        return this.animalCharacter;
    }
}


