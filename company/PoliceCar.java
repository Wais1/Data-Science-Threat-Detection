package com.company;

public class PoliceCar implements IsEmergency, LandVehicle {
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
