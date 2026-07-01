package org.example.service;

import org.example.model.Train;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class TrainService {
    private Train train;

    public TrainService() {
        train = new Train();
    }

    public void displaySummary() {

        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        System.out.println("Train initialized successfully.");
        System.out.println("Initial Bogie Count : " + train.getConsist().size());
    }
    public void addPassengerBogies() {

        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        train.getConsist().add("Sleeper");
        train.getConsist().add("AC Chair");
        train.getConsist().add("First Class");

        System.out.println("Passenger Bogies:");
        System.out.println(train.getConsist());

        train.getConsist().remove("AC Chair");

        System.out.println();
        System.out.println("After Removing AC Chair:");
        System.out.println(train.getConsist());

        System.out.println();
        System.out.println("Sleeper Exists : "
                + train.getConsist().contains("Sleeper"));
    }
    public void trackUniqueBogieIds() {

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        System.out.println("Unique Bogie IDs");
        System.out.println(bogieIds);
    }
    public void maintainOrderedTrain() {

        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        train.add(2, "Pantry");

        train.removeFirst();
        train.removeLast();

        System.out.println("Final Train Consist");
        System.out.println(train);
    }

    public Train getTrain() {
        return train;
    }
}
