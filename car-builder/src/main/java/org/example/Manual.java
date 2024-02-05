package org.example;

public class Manual {
    int seats;
    boolean gps;
    boolean tripComputer;
    String engineType;

    @Override
    public String toString() {
        return "Manual{" +
                "seats=" + seats +
                ", gps=" + gps +
                ", tripComputer=" + tripComputer +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
