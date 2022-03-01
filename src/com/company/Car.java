package com.company;

public class Car extends Vehicle{

    public Car() {
    }

    public Car(String model, int madeInYear, TyoeOfEngine typeOfEngime) {
        super(model, madeInYear, typeOfEngime);
    }

    @Override
    void drive() {
    }
}
