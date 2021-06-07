package com.company;

public class Hovercraft implements LandVehicle, SeaVessel{
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
        System.out.println("Launches");
    }
}
