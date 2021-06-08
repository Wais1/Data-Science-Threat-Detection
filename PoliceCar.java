package com.company;

public class PoliceCar extends Vehicle implements IsEmergency, LandVehicle {

    public PoliceCar(String name, int getMaxPassengers, int maxSpeed) {
        super(name, getMaxPassengers, maxSpeed);
    }

    public void toggleAlleyLights() {
        System.out.println("Alley lights toggled");
    }

    @Override
    public void soundSiren() {
        System.out.println("Siren is on");
    }

    @Override
    public void drive() {
        System.out.println("Drives like police car");
    }
}
