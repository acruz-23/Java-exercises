package org.example;

public class Car extends Vehicles{
    public Car(int vin, String make, String model) {
        super(vin, make, model);
    }

    public Car(int vin, int numberOfPassengers, int odometer, int cargoCapacity, int fuelCapacity, String color, String make, String model) {
        super(vin, numberOfPassengers, odometer, cargoCapacity, fuelCapacity, color, make, model);
    }
}
