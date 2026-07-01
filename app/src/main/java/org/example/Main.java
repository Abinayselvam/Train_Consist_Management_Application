package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Welcome, Banner
        System.out.println("============================================");
        System.out.println("=== Train Consist Management Application ===");
        System.out.println("============================================");

        //create a dynamic list to store bogies
        List<String> passengerBogies = new ArrayList<>();

        System.out.println("Initial Train Consist: "+passengerBogies.size());
        //Added Bogies
        passengerBogies.add("AC Chair");
        passengerBogies.add("Sleeper");
        passengerBogies.add("First Class");
        passengerBogies.add("Second Class");

        //After adding the bogies
        System.out.println("\nAfter Adding the Bogies into train "+passengerBogies);

        //Remove the bogies
        passengerBogies.remove("First Class");
        System.out.println("\nAfter Remove First Class Bogie"+passengerBogies);

        //check the bogie is in the list
        System.out.println("\nCheck train consists First class");
        if(passengerBogies.contains("First Class")){
            System.out.println("First Class Bogie Exist");
        }
        else
        {
            System.out.println("First Class Bogie Not Exist");
        }

        //Final Train consist
        System.out.println("\n Final Train Consist ");
        System.out.println(passengerBogies);

        //Display Initial Consist Information
        System.out.println("\nCurrent Train Consist Count: "+passengerBogies.size());

        System.out.println("============================================");
        System.out.println("=== UC3 Bogie with unique ID's ===");
        System.out.println("============================================");

        Set<String> bogiesId= new HashSet<>();
        bogiesId.add("BG101");
        bogiesId.add("BG102");
        bogiesId.add("BG103");
        bogiesId.add("BG104");
        bogiesId.add("BG101");//Duplicate Id
        bogiesId.add("BG102");//Duplicate Id

        //
        System.out.println("Hash set store only store the Unique ID's");
        System.out.println("Bogies Id: "+bogiesId);


    }
}
