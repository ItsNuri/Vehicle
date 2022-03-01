package com.company;

public class Truck extends Vehicle {

    public Truck() {
    }

    public Truck(String model, int madeInYear, TyoeOfEngine typeOfEngime) {
        super(model, madeInYear, typeOfEngime);
    }

    @Override
    void drive() {
    }

}
