package org.example;

import com.sun.source.tree.Tree;
import org.example.model.Bogie;
import org.example.model.Train;
import org.example.service.TrainService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Train Consist Management =====");

        Train train = new Train();

        train.addBogie(new Bogie("Sleeper", "Passenger", 72));
        train.addBogie(new Bogie("AC Chair", "Passenger", 56));
        train.addBogie(new Bogie("First Class", "Passenger", 40));
        train.addBogie(new Bogie("Cargo", "Goods", 0));
        train.addBogie(new Bogie("Parcel", "Goods", 0));


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

    }
}
