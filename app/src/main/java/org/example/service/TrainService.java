package org.example.service;

import org.example.model.Bogie;
import org.example.model.Train;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        System.out.println("Initial Bogie Count : " + train.getBogies().size());
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


    /*
        UC7
     */
    public void sortBogiesByCapacity(Train train) {

        train.getBogies()
                .sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\n===== Sorted Bogies =====");

        train.getBogies()
                .forEach(System.out::println);
    }

    /*
        UC8
     */

    public void filterPassengerBogies(Train train) {

        List<Bogie> filtered =
                train.getBogies()
                        .stream()
                        .filter(b -> b.getCapacity() > 60)
                        .collect(Collectors.toList());

        System.out.println("\n===== Capacity Greater Than 60 =====");

        filtered.forEach(System.out::println);
    }

    /*
        UC9
     */

    public void groupBogies(Train train) {

        Map<String, List<Bogie>> grouped =

                train.getBogies()
                        .stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("\n===== Grouped Bogies =====");

        grouped.forEach((type, list) -> {

            System.out.println(type);

            list.forEach(System.out::println);

            System.out.println();

        });

    }

    /*
        UC10
     */

    public void totalSeats(Train train) {

        Integer total =

                train.getBogies()
                        .stream()
                        .map(Bogie::getCapacity)
                        .reduce(0, Integer::sum);

        System.out.println("\n==============================");
        System.out.println("Total Seating Capacity : " + total);
        System.out.println("==============================");

    }
    /*
     * UC11 : Validate Train ID
     */
    public boolean validateTrainId(String trainId) {

        String regex = "TRN-\\d{4}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(trainId);

        return matcher.matches();
    }

    /*
     * UC11 : Validate Cargo Code
     */
    public boolean validateCargoCode(String cargoCode) {

        String regex = "PET-[A-Z]{2}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(cargoCode);

        return matcher.matches();
    }
    /*
     * UC12 : Safety Compliance Check
     */
    public boolean checkSafetyCompliance(List<Bogie> goodsBogies) {

        return goodsBogies.stream()
                .allMatch(bogie -> {

                    if (bogie.getName().equalsIgnoreCase("Cylindrical")) {

                        return bogie.getCargo().equalsIgnoreCase("Petroleum");
                    }

                    return true;
                });
    }


    public Train getTrain() {
        return train;
    }
}
