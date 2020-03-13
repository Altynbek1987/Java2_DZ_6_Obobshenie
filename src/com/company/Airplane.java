package com.company;

public class Airplane <T extends Number> implements Flying {
    T speed;
    T sena;
    public Airplane(T speed, T sena) {
        this.speed = speed;
        this.sena = sena;
    }
    @Override
    public T getSpeed() {
        return speed;
    }
    @Override
    public T getSena() {
        return sena;
    }
}
