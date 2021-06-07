package com.company;

public class Jeep implements LandVehicle {
    public void soundHorn(){}

    @Override
    public void drive() {
        System.out.println("I am a Jeep");
    }
}
