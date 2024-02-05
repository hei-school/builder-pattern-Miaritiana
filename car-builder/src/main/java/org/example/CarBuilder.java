package org.example;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder(){
        this.reset();
    }
    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.seats = seats;
    }

    @Override
    public void setEngine(String engineType) {
        this.car.engineType = engineType;
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        this.car.tripComputer = hasTripComputer;
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.car.gps = hasGPS;
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}
