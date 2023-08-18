package com.pluralsight.mod2;

public class CellPhoneApp {
    public static void main(String[] args) {
        CellPhone somePhone = new CellPhone(12345678, "Iphone", "T-mobile", "123-456-7890", "Dan");
        CellPhone otherPhone = new CellPhone();
        otherPhone.changeNumber("456-123-5321");
        otherPhone.setOwner("Billy");
        display(somePhone);
        display(otherPhone);
        System.out.println(somePhone.dial(otherPhone.getPhoneNumber()));
        System.out.println(otherPhone.dial(somePhone.getPhoneNumber()));

    }

    public static void display(CellPhone phone){
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Serial Number: " + phone.getSerialNumber() + "\n");
    }

}