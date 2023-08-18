package com.pluralsight.mod2;

public class CellPhoneApp {
    public static void main(String[] args) {
        CellPhone somePhone = new CellPhone(12345678, "Iphone", "T-mobile", "123-456-7890", "Dan");
        System.out.println(somePhone.getSerialNumber());
        System.out.println(somePhone.getModel());
        System.out.println(somePhone.getCarrier());
        System.out.println(somePhone.getPhoneNumber());
        System.out.println(somePhone.getOwner());
    }

}