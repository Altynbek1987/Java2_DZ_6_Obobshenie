package com.company;

public class Main {

    public static void main(String[] args) {
        Airplane<Number> integerSpeedSena = new Airplane<>(1000, 2000000);
        System.out.println("Максимальная скорость " + integerSpeedSena.getSpeed() + " Km/час");
        System.out.println("Цена " + integerSpeedSena.getSena() + " $");

    }






}
