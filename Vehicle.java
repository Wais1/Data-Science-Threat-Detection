package com.company;

public abstract class Vehicle {

     private String name;
     private int getMaxPassengers;
     private int maxSpeed;

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Vehicle() {
     }

     public Vehicle(String name, int getMaxPassengers, int maxSpeed) {
          this.name = name;
          this.getMaxPassengers = getMaxPassengers;
          this.maxSpeed = maxSpeed;
     }

     public int getGetMaxPassengers() {
          return getMaxPassengers;
     }

     public void setGetMaxPassengers(int getMaxPassengers) {
          this.getMaxPassengers = getMaxPassengers;
     }

     public int getMaxSpeed() {
          return maxSpeed;
     }

     public void setMaxSpeed(int maxSpeed) {
          this.maxSpeed = maxSpeed;
     }

}