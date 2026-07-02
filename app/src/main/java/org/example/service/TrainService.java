package org.example.service;

import org.example.model.Bogie;
import org.example.model.Train;

import java.util.*;
import java.util.stream.Collectors;


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

    public void preserveInsertionOrder() {

        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Duplicate Entry
        trainFormation.add("Sleeper");

        System.out.println("Train Formation");

        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }

        System.out.println();

        System.out.println("Total Bogies : " + trainFormation.size());
    }
    public void mapBogieCapacity() {

        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 78);
        bogieCapacity.put("First Class", 24);

        System.out.println("Bogie Capacity Details");
        System.out.println("----------------------");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {

            System.out.println("Bogie Name : " + entry.getKey());
            System.out.println("Capacity   : " + entry.getValue());
            System.out.println();
        }

    }

    public void sortBogiesByCapacity() {

        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("First Class", "Passenger", 24));

        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("Bogies Sorted by Capacity");
        System.out.println("-------------------------");

        for (Bogie bogie : bogies) {

            System.out.println(
                    bogie.getName()
                            + " --> "
                            + bogie.getCapacity());

        }

    }
    public void filterPassengerBogies() {

        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Cargo", "Goods", 120));


        List<Bogie> filteredBogies =
                bogies.stream()
                        .filter(bogie -> bogie.getCapacity() > 60)
                        .collect(Collectors.toList());

        System.out.println("Passenger Bogies with Capacity > 60");
        System.out.println("-----------------------------------");

        for (Bogie bogie : filteredBogies) {

            System.out.println(
                    bogie.getName()
                            + " --> "
                            + bogie.getCapacity());

        }

    }
    public void groupBogiesByType() {

        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Cargo", "Goods", 120));
        bogies.add(new Bogie("Parcel Van", "Goods", 80));

        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("Grouped Bogies");
        System.out.println("--------------");

        groupedBogies.forEach((type, bogieList) -> {

            System.out.println(type + " :");

            for (Bogie bogie : bogieList) {
                System.out.println("   "
                        + bogie.getName()
                        + " -> "
                        + bogie.getCapacity());
            }

            System.out.println();

        });

    }


    public Train getTrain() {
        return train;
    }
}
