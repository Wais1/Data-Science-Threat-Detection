package com.company;

public class Frigate extends Vehicle implements SeaVessel {
    public void fireGun(){
        System.out.println("Fires gun ");
    }

    public Frigate(String name, int getMaxPassengers, int maxSpeed) {
        super(name, getMaxPassengers, maxSpeed);
    }

    @Override
    public void launch() {
        System.out.println("Launches frigate");
    }
}
