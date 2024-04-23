package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VetClinic {

    private final List<String> visits = new ArrayList<>();

    public void newVisitor( Client client, Animal clientAnimal) {
        boolean end = false;
        Scanner scanner = new Scanner(System.in);
        String visitInfo;

        while (!end) {
            System.out.println("Why you want visit clinic? \n1. Disease\n2.Inspection\n3.Vaccination");
            visitInfo = scanner.nextLine();

            switch (visitInfo.toLowerCase()) {
                case "1" -> {
                    System.out.println("DiseaseVisit");
                    Visit diseaseVisit = new DiseaseVisit();
                    diseaseVisit.createVisit(client, clientAnimal, "Disease visit");
                    visits.add(diseaseVisit.getVisitInfo());
                    end = true;
                }

                case "2"-> {
                    System.out.println("InspectionVisit");
                    Visit inspectionVisit = new InspectionVisit();
                    inspectionVisit.createVisit(client, clientAnimal, "Inspection visit");
                    visits.add(inspectionVisit.getVisitInfo());
                    end = true;
                }
                case "3" -> {
                    System.out.println("VaccinationVisit");
                    Visit vaccinationVisit = new VaccinationVisit();
                    vaccinationVisit.createVisit(client, clientAnimal, "Vaccination visit");
                    visits.add(vaccinationVisit.getVisitInfo());
                    end = true;
                }
                default -> {
                    System.out.println("Invalid visit info");
                }
            }
        }
    }

    public List<String> getVisits() {
        return this.visits;
    }
}
