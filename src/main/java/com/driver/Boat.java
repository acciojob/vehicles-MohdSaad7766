package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    Boat(){

    }
    public String getVehicleName(){
        return this.name;
    }

    public int getVehicleCapacity(){
        return this.capacity;
    }
}
