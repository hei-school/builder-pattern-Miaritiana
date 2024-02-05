package org.example;

public class Car {
    int seats;
    boolean gps;
    boolean tripComputer;
    String engineType;

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", gps=" + gps +
                ", tripComputer=" + tripComputer +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
