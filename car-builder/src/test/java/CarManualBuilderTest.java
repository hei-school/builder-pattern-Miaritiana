import org.example.CarManualBuilder;
import org.example.Manual;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static utils.TestUtils.ENGINE_SUV;
import static utils.TestUtils.GPS;
import static utils.TestUtils.SEATS;
import static utils.TestUtils.TRIP_COMPUTER;

public class CarManualBuilderTest {

    @Test
    public void test_manual_product() {
        CarManualBuilder builder = new CarManualBuilder();
        builder.setSeats(SEATS);
        builder.setTripComputer(TRIP_COMPUTER);
        builder.setGPS(GPS);
        builder.setEngine(ENGINE_SUV);

        Manual manual = builder.getProduct();

        Assertions.assertEquals(Manual.class, manual.getClass());
    }
}
