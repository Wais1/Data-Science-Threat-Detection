package com.company;

public class Jeep extends Vehicle implements LandVehicle {
    public Jeep(String name, int getMaxPassengers, int maxSpeed) {
        super(name, getMaxPassengers, maxSpeed);
    }

    public void soundHorn(){
        System.out.println("Beep");
    }

    @Override
    public void drive() {
        System.out.println("Drives");
    }
}
