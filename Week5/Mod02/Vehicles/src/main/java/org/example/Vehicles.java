package org.example;

public class Vehicles {
    private int vin, numberOfPassengers, odometer, cargoCapacity, fuelCapacity;
    private String color, make, model;

    public Vehicles(int vin, String make, String model) {
        this.vin = vin;
        this.make = make;
        this.model = model;
    }

    public Vehicles(int vin, int numberOfPassengers, int odometer, int cargoCapacity, int fuelCapacity, String color, String make, String model) {
        this.vin = vin;
        this.numberOfPassengers = numberOfPassengers;
        this.odometer = odometer;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVin() {
        return vin;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getOdometer() {
        return odometer;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
