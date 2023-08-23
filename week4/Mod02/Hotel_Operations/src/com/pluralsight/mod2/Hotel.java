package com.pluralsight.mod2;

public class Hotel {
    private String name;
    private int numberOfSuites, numberOfRooms, bookedSuites, bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, int numberOfSuites){
        boolean areRoomsAvailable = this.numberOfRooms - this.bookedBasicRooms >= numberOfRooms;
        boolean areSuitesAvailable = this.numberOfSuites - this.bookedSuites >= numberOfSuites;
        if (areRoomsAvailable && areSuitesAvailable ){
            this.bookedBasicRooms += numberOfRooms;
            this.bookedSuites += numberOfSuites;
            return true;
        } else if (!areRoomsAvailable){
            System.out.println("There are not enough rooms.");

        }else if (!areSuitesAvailable){
            System.out.println("There are not enough suites available.");
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
}
