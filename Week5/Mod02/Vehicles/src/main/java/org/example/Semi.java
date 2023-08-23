package org.example;

public class Semi extends Vehicles{
    public Semi(int vin, String make, String model) {
        super(vin, make, model);
    }

    public Semi(int vin, int numberOfPassengers, int odometer, int cargoCapacity, int fuelCapacity, String color, String make, String model) {
        super(vin, numberOfPassengers, odometer, cargoCapacity, fuelCapacity, color, make, model);
    }
}
