package com.company;

public class Main {

    public static void main(String[] args) {
        PoliceCar policeCar = new PoliceCar();
        PoliceCar[] policeArray = {policeCar};
        policeArray[0].soundSiren();
    }
}
