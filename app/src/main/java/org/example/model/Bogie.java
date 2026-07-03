package org.example.model;

public class Bogie {

    private String name;
    private String type;
    private int capacity;
    private String cargo;

    //passenger bogie
    public Bogie(String name, String type,int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

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