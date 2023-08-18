package com.pluralsight.mod1;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine().trim();
        String firstName, middleName = "", lastName = "";
        Integer firstSpace = fullName.indexOf(" ");
        if (firstSpace != -1){
            firstName = fullName.substring(0, firstSpace);
            fullName = fullName.substring(firstSpace+ 1 );
        }else {
            firstName = fullName;
            fullName = "";}
        Integer nextSpace = fullName.indexOf(" ");
        if (nextSpace != -1) {
            middleName = fullName.substring(0, nextSpace);
            fullName = fullName.substring(nextSpace + 1);
        }
        lastName = fullName;


        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String userDate = scanner.nextLine().trim();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyy");
        LocalDate showTime = LocalDate.parse(userDate, formatter);

        System.out.println("How many tieckets would you like: ");
        Integer numTickets = scanner.nextInt();
        String ticketOrTickets = numTickets > 1 ? "tickets" : "ticket";

        System.out.println
                (numTickets + " " + ticketOrTickets + " reserved for " + showTime + " under " + lastName + ", " + firstName + " " + middleName);



    }
}