package org.example;

import com.sun.source.tree.Tree;
import org.example.service.TrainService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
     TrainService trainService = new TrainService();
     //uc1
     trainService.displaySummary();
     //uc2
     trainService.addPassengerBogies();
     //uc3
     trainService.trackUniqueBogieIds();
     //uc4
     trainService.maintainOrderedTrain();
     //uc5
     trainService.preserveInsertionOrder();
     //uc6
     trainService.mapBogieCapacity();
     //uc7
     trainService.sortBogiesByCapacity();
     //uc9
        trainService.groupBogiesByType();
     //uc8
     trainService.filterPassengerBogies();
    }
}
