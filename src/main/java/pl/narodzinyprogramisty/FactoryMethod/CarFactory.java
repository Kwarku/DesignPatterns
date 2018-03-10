package pl.narodzinyprogramisty.FactoryMethod;

public class CarFactory {

    public static Car getCar(FuelType type) {
        switch (type) {
            case DIESEL:
                return new DieselCar();
            case ELECTRIC:
                return new ElectricCar();
            case GASOLINE:
                return new GasCar();
        }
        return null;
    }
}
