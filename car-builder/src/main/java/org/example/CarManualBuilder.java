package org.example;

public class CarManualBuilder implements Builder{
    private Manual manual;

    public CarManualBuilder(){
        this.reset();
    }
    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        this.manual.seats = seats;
    }

    @Override
    public void setEngine(String engineType) {
        this.manual.engineType = engineType;
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        this.manual.tripComputer = hasTripComputer;
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.manual.gps = hasGPS;
    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
