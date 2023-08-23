package com.pluralsight.mod2;

public class Reservation {
    private String roomType;
    private float price, total;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, float price, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setIsWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public float getPrice() {
        return price;
    }

    public float getTotal() {
        float extra = 1.0f;
        if (this.weekend){
            extra = 1.10f;
        }
        return this.price * this.numberOfNights * extra;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }
}
