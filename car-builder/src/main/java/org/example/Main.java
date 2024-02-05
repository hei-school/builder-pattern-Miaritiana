package org.example;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.makeSportCar(builder);
        Car car = builder.getProduct();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.makeSUV(manualBuilder);
        Manual manual = manualBuilder.getProduct();

        System.out.println(car.toString());
        System.out.println(manual.toString());
    }
}