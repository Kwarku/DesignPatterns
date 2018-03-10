package pl.narodzinyprogramisty.FactoryMethod;

public class ElectricCar implements Car{
    public FuelType getFuel() {
        return FuelType.ELECTRIC;
    }
}
