package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Welcome, Banner
        System.out.println("============================================");
        System.out.println("=== Train Consist Management Application ===");
        System.out.println("============================================");

        //create a dynamic list to store bogies
        List<String> trainConsist = new ArrayList<>();

        //Display Initial Consist Information
        System.out.println("Train Consist Management Application Started");
        System.out.println("Initial Bogie Count: ");
        System.out.println("Current Train Consist Count: "+trainConsist.size());
        System.out.println("System Ready for the Operations");

    }
}
