package org.example;

import java.time.Year;

public class Vehicle extends Asset{

    private String makeModel;
    private int year, odometer;

    public Vehicle(String description, String dateAquired, double originalCost, String makeModel, int year) {
        super(description, dateAquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
    }

    public double getValue(){
        int currentYear = Year.now().getValue();
        int age = currentYear - this.year;
        double value = getOriginalCost();
        if (age >= 0 && age <= 3){
            value *= Math.pow((1 - .03), age);
        }
        else if (age > 3 && age <= 6){
            value *= Math.pow((1 - .06), age);
        }
        else if ( age > 6 && age <= 10){
            value *= Math.pow((1 - .08), age);
        }
        else if (age > 10 ){
           value -= 1000.0;
        }
        if ( odometer > 100000 && !makeModel.contains("Honda") && !makeModel.contains("Toyota")){
            value *= .75;
        }
        return value;
    }
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
