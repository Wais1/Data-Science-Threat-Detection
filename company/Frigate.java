package com.company;

public class Frigate implements SeaVessel {
    public void fireGun(){}

    @Override
    public void launch() {
        System.out.println("Launches frigate");
    }
}
