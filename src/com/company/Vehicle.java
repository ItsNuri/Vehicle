package com.company;

public abstract class Vehicle {
    private String model;
    private int madeInYear;
    private TyoeOfEngine typeOfEngime;

    public Vehicle() {
    }

    public Vehicle(String model, int madeInYear, TyoeOfEngine typeOfEngime) {
        this.model = model;
        this.madeInYear = madeInYear;
        this.typeOfEngime = typeOfEngime;
    }

    abstract void drive();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMadeInYear() {
        return madeInYear;
    }

    public void setMadeInYear(int madeInYear) {
        this.madeInYear = madeInYear;
    }

    public TyoeOfEngine getTypeOfEngime() {
        return typeOfEngime;
    }

    public void setTypeOfEngime(TyoeOfEngine typeOfEngime) {
        this.typeOfEngime = typeOfEngime;
    }
}
