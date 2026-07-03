package org.example;

import com.sun.source.tree.Tree;
import org.example.model.Bogie;
import org.example.model.GoodsBogie;
import org.example.model.Train;
import org.example.service.TrainService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Train Consist Management =====");

        Train train = new Train();

        train.addBogie(new Bogie("Cylindrical", "Goods",100,"Petroleum"));
        train.addBogie(new Bogie("AC Chair", "Passenger", 56,"Coal"));
        train.addBogie(new Bogie("First Class", "Passenger", 40,"Cylindrical"));
        train.addBogie(new Bogie("Cargo", "Goods", 0,"Wood"));



     TrainService trainService = new TrainService();
     //uc1
     trainService.displaySummary();

     //uc3
     trainService.trackUniqueBogieIds();
     //uc4
     trainService.maintainOrderedTrain();
     //uc5
     trainService.preserveInsertionOrder();
     //uc6
     trainService.mapBogieCapacity();
        // UC7
        trainService.sortBogiesByCapacity(train);
        // UC8
        trainService.filterPassengerBogies(train);
        // UC9
        trainService.groupBogies(train);
        // UC10
        trainService.totalSeats(train);
        //UC11
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== UC11 ==========");

        System.out.print("Enter Train ID : ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code : ");
        String cargoCode = scanner.nextLine();

        if (trainService.validateTrainId(trainId)) {
            System.out.println("Train ID is Valid");
        } else {
            System.out.println("Train ID is Invalid");
        }

        if (trainService.validateCargoCode(cargoCode)) {
            System.out.println("Cargo Code is Valid");
        } else {
            System.out.println("Cargo Code is Invalid");
        }

        List<Bogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new Bogie(
                "Cylindrical",
                "Goods",
                100,
                "Petroleum"));

        goodsBogies.add(new Bogie(
                "Open Wagon",
                "Goods",
                120,
                "Coal"));

        goodsBogies.add(new Bogie(
                "Box Wagon",
                "Goods",
                90,
                "Food"));

        boolean safe = trainService.checkSafetyCompliance(goodsBogies);

        System.out.println("========== UC12 ==========");

        goodsBogies.forEach(System.out::println);

        System.out.println();

        if (safe) {
            System.out.println("Train Safety Status : SAFE");
        } else {
            System.out.println("Train Safety Status : NOT SAFE");
        }
        //uc13
        List<Bogie> bogies = new ArrayList<>();

        // Create large dataset

        for (int i = 1; i <= 100000; i++) {

            bogies.add(new Bogie(
                    "Sleeper-" + i,
                    "Passenger",
                    (i % 100) + 1));

        }

        /*
         * Loop Benchmark
         */

        long loopStart = System.nanoTime();

        List<Bogie> loopResult = trainService.filterUsingLoop(bogies);

        long loopEnd = System.nanoTime();

        /*
         * Stream Benchmark
         */

        long streamStart = System.nanoTime();

        List<Bogie> streamResult = trainService.filterUsingStream(bogies);

        long streamEnd = System.nanoTime();

        long loopTime = loopEnd - loopStart;
        long streamTime = streamEnd - streamStart;

        System.out.println("========== UC13 ==========");

        System.out.println();

        System.out.println("Loop Filter Count    : " + loopResult.size());

        System.out.println("Stream Filter Count  : " + streamResult.size());

        System.out.println();

        System.out.println("Loop Execution Time   : " + loopTime + " ns");

        System.out.println("Stream Execution Time : " + streamTime + " ns");
        System.out.println("=== UC15 : Safe Cargo Assignment ===");

        TrainService service = new TrainService();

        GoodsBogie bogie1 = new GoodsBogie("BG101", "Cylindrical");

        GoodsBogie bogie2 = new GoodsBogie("BG102", "Rectangular");

        System.out.println();

        System.out.println("Assigning Petroleum to Cylindrical Bogie");

        service.assignCargo(bogie1, "Petroleum");

        System.out.println();

        System.out.println("Assigning Petroleum to Rectangular Bogie");

        service.assignCargo(bogie2, "Petroleum");

        System.out.println();

        System.out.println("Application Continues Successfully...");

        scanner.close();

    }
}
