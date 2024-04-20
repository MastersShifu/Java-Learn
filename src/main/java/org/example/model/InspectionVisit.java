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
        return "Client: " + client.getClientName() + " Animal: " + clientAnimal.getAnimalKind() + " Animal name:" + clientAnimal.getAnimalName() + " Visit info: " + visitInfo + " Date: " + nextVisitDate;
    }
}
