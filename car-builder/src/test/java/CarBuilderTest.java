import org.example.Car;
import org.example.CarBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static utils.TestUtils.ENGINE_SUV;
import static utils.TestUtils.GPS;
import static utils.TestUtils.SEATS;
import static utils.TestUtils.TRIP_COMPUTER;

public class CarBuilderTest {

    @Test
    public void test_car_product() {
        CarBuilder builder = new CarBuilder();
        builder.setSeats(SEATS);
        builder.setTripComputer(TRIP_COMPUTER);
        builder.setGPS(GPS);
        builder.setEngine(ENGINE_SUV);

        Car car = builder.getProduct();

        Assertions.assertEquals(Car.class, car.getClass());
    }
}
