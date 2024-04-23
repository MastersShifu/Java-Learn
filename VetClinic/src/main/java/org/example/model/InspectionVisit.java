package org.example.model;

import java.util.Date;

class InspectionVisit implements Visit {
    private Client client;
    private Animal clientAnimal;
    private String visitInfo;
    private final Date nextVisitDate = new Date();

    public void createVisit(Client client, Animal clientAnimal, String visitInfo) {
        this.client = client;
        this.clientAnimal = clientAnimal;
        this.visitInfo = visitInfo;
    }

    public String getVisitInfo() {
        return "Client: " + this.client.getClientName() + " Animal: " + this.clientAnimal.getAnimalKind() + " Animal name:" + this.clientAnimal.getAnimalName() + " Visit info: " + this.visitInfo + " Date: " + this.nextVisitDate;
    }
}
