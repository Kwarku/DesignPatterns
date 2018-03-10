package pl.narodzinyprogramisty.FactoryMethod;

public class DieselCar implements Car {


    public FuelType getFuel() {
        return FuelType.DIESEL;
    }

}
