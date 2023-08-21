package com.pluralsight.mod3;

public class Vehicle {
    private long vehicleId;
    private String makeModel, color;
    private int odometerREading;
    private float price;

    public Vehicle (long vehicleId, String makeModel, String color, int odometerREading, float price){
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerREading = odometerREading;
        this.price = price;
    }

    public long getVehicleId(){
        return this.vehicleId;
    }

    public void setVehicleId(long vehicleId){
        this.vehicleId = vehicleId;
    }

    public String getMakeModel(){
        return this.makeModel;
    }

    public void setMakeModel(String makeModel){
        this.makeModel = makeModel;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }


    public int getOdometerReading(){
        return odometerREading;
    }

    public void setOdometerREading(int odometerREading){
        this.odometerREading = odometerREading;
    }

    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void displayVehicle(){
        System.out.println("Vehicle ID: " + this.vehicleId);
        System.out.println("Make and Model: "+ this.makeModel);
        System.out.println("Color: "+ this.color);
        System.out.println("Odometer: "+ this.odometerREading);
        System.out.println("Price: "+ this.price + "\n");
    }

}
