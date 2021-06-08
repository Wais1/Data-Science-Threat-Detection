package com.company;

public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel{

    public Hovercraft(String name, int getMaxPassengers, int maxSpeed) {
        super(name, getMaxPassengers, maxSpeed);
    }

    public void enterLand(){
        System.out.println("Enter land");
    }
    public void enterSea(){
        System.out.println("Enter Sea");
    }

    @Override
    public void drive() {
        System.out.println("Drives like a hovercraft and a land vehicle");
    }

    @Override
    public void launch() {
        System.out.println("Launches " + displacement);
    }
}
