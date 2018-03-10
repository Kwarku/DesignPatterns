package pl.narodzinyprogramisty;

import org.junit.Test;
import pl.narodzinyprogramisty.FactoryMethod.Car;
import pl.narodzinyprogramisty.FactoryMethod.CarFactory;
import pl.narodzinyprogramisty.FactoryMethod.FuelType;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryCarTest {

    @Test
    public void getCarTest(){
        Car dieselCar = CarFactory.getCar(FuelType.DIESEL);
        assertThat(dieselCar.getFuel()).isEqualTo(FuelType.DIESEL);

        Car electricCar = CarFactory.getCar(FuelType.ELECTRIC);
        assertThat(electricCar.getFuel()).isEqualByComparingTo(FuelType.ELECTRIC);
    }
}
