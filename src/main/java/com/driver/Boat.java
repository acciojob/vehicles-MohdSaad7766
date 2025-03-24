package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    Boat(String name,int capacity){
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
        return this.name;
    }
    @Override
    public int getVehicleCapacity(){
        return this.capacity;
    }


}


