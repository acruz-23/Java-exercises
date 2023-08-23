package com.pluralsight.mod2;

public class Room {
    private int numberOfBeds;
    private float price;
    private boolean dirty = false, occupied = false;

    public boolean isAvailable(){
        if (dirty == false && occupied == false){
            return true;
        }else return false;
    }

    public Room(int numberOfBeds, float price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean cleanRoom() {
        if (occupied){
            return false;
        }
        this.dirty = false;
        return true;
    }

    public boolean checkIn() {
        String message = "";
        if (!dirty && !occupied){
            this.dirty = true;
            this.occupied = true;
            return true;
        }else if (dirty && occupied){
            message = "Room is dirty and occupied.";
        } else if (dirty){
            message = "Room is dirty.";
        }else if (occupied){
            message = "Room is already occupied.";
        }

        System.out.println(message);
        return false;
    }
    public boolean checkOut(){
        if (occupied){
            this.occupied = false;
            return true;
        }
        return false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public float getPrice() {
        return price;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }
}
