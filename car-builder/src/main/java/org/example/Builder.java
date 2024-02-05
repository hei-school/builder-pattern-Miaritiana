package org.example;

public interface Builder {
    void reset();
    void setSeats(int seats);
    void setEngine(String engineType);
    void setTripComputer(boolean hasTripComputer);
    void setGPS(boolean hasGPS);
}
