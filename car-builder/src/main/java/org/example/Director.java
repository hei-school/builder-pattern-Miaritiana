package org.example;

public class Director {
    public void makeSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("SportCar");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("SUV");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
