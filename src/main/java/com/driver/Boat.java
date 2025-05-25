package com.driver;

public class Boat implements WaterVehicle{
    String name;
    int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName(){
        return this.name;
    }
    public int getCapacity(){
        return this.capacity;
    }
    @Override
    public String getVehicleName(){
       return name;
    }
    @Override
    public int getVehicleCapacity(){
       return capacity;
    };
}
