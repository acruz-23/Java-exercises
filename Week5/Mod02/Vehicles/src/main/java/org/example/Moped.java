package org.example;

public class Moped extends Vehicles{
    public Moped(int vin, String make, String model) {
        super(vin, make, model);
    }

    public Moped(int vin, int numberOfPassengers, int odometer, int cargoCapacity, int fuelCapacity, String color, String make, String model) {
        super(vin, numberOfPassengers, odometer, cargoCapacity, fuelCapacity, color, make, model);
    }
}
