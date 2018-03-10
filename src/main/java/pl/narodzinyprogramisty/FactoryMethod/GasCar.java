package pl.narodzinyprogramisty.FactoryMethod;

public class GasCar implements Car {
    public FuelType getFuel() {
        return FuelType.GASOLINE;
    }
}
