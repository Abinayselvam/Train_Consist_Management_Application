package org.example.model;

import java.security.InvalidParameterException;

public class Bogie {

    private String name;
    private String type;
    private int capacity;
    private String cargo;

    //passenger bogie constructor
    public Bogie(String name, String type, int capacity) throws InvalidParameterException {
        if(capacity <= 0) {
            throw new InvalidParameterException("Capacity must be greater than 0");
        }
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }
    //goods bogie constructor
    public Bogie(String name, String type, int capacity, String cargo) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.cargo = cargo;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return name + " | " + type + " | Capacity : " + capacity + " | Cargo : " + cargo;
    }
}