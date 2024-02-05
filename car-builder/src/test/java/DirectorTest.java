import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static utils.TestUtils.ENGINE_SPORT_CAR;
import static utils.TestUtils.ENGINE_SUV;

public class DirectorTest {

    @Test
    public void test_make_sport_car() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.makeSportCar(builder);
        Car car = builder.getProduct();
        String expected = ENGINE_SPORT_CAR;

        Assertions.assertEquals(car.getEngineType(), expected);
    }

    @Test
    public void test_make_suv() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.makeSUV(builder);
        Car car = builder.getProduct();
        String expected = ENGINE_SUV;

        Assertions.assertEquals(car.getEngineType(), expected);
    }

    @Test
    public void test_create_car_manual() {
        Director director = new Director();
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.makeSUV(manualBuilder);
        Manual manual = manualBuilder.getProduct();

        Assertions.assertEquals(Manual.class, manual.getClass());
    }
}
