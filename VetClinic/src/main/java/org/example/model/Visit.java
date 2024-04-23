package org.example.model;

public interface Visit {
    void createVisit(Client client, Animal clientAnimal, String visitInfo);
    String getVisitInfo();
}
