package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Vehicle car1 = new Car("Toyota",2005,TyoeOfEngine.Electromobile);
        Vehicle car2 = new Car("Audi",1999,TyoeOfEngine.Hybrid);
        Vehicle car3 = new Car("Mersedes",2014,TyoeOfEngine.Electromobile);
        Vehicle car4 = new Car("Wolksvagen",2022,TyoeOfEngine.Fuel);
        Vehicle car5 = new Car("BMV",2020,TyoeOfEngine.Fuel);
        Vehicle truck1 = new Truck("Vaz",1998,TyoeOfEngine.Hybrid);
        Vehicle truck2 = new Truck("Gaz",2002,TyoeOfEngine.Electromobile);
        Vehicle truck3 = new Truck("Gaz",2022,TyoeOfEngine.Fuel);
        Vehicle truck4 = new Truck("Truck USA",2012,TyoeOfEngine.Hybrid);
        Vehicle truck5 = new Truck("Gaz",1995,TyoeOfEngine.Fuel);

        Vehicle[] autos = {car1,car2,car3,car4,car5,truck1,truck2,truck3,truck4,truck5};

        TyoeOfEngine[] electromobiles = new TyoeOfEngine[]{};
        TyoeOfEngine[] hydrid = new TyoeOfEngine[]{};
        TyoeOfEngine[] flue = new TyoeOfEngine[]{};

        for (int i = 0; i < autos.length; i++) {
            if ()
        }


    }
}
