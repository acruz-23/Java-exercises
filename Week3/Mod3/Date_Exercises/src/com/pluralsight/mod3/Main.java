package com.pluralsight.mod3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        DateTimeFormatter slash = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(currentDate.format(slash));
        DateTimeFormatter month = DateTimeFormatter.ofPattern("MMMM dd, yyy");
        System.out.println(currentDate.format(month));
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter complete = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm");
        System.out.println(currentTime.format(complete));

        System.out.println("Please enter your birthdate: (MM/dd/yyy) ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthday = LocalDate.parse(input, formatter);
        System.out.println("You were born on a " + birthday.getDayOfWeek());
    }
}