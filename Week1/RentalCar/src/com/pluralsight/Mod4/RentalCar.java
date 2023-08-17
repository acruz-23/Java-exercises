package com.pluralsight.Mod4;

import java.util.Scanner;

public class RentalCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the pickup date?");
        String pickup = scanner.nextLine();

        System.out.println("Would you like an electronic toll tage for $3.95/day? (yes/no): ");
        String tollOpt = scanner.nextLine();
        System.out.println("Would you like roadside assistance for $3.95/day (yes/no): ");
        String RAOpt = scanner.nextLine();
        System.out.println("Would you like a GPS for $2.95/day? (yes/no): ");
        String gpsOpt = scanner.nextLine();

        System.out.println(("How many days do you need the car?"));
        Integer rentalPeriod = scanner.nextInt();
        System.out.println("How old are you? ");
        Integer age = scanner.nextInt();

        Double basePrice = 29.99;
        double surcharge, extras = 0.0;
        extras += tollOpt.equalsIgnoreCase("yes") ? 3.95: 0.0;
        extras += gpsOpt.equalsIgnoreCase("yes") ? 2.95: 0.0;
        extras += RAOpt.equalsIgnoreCase("yes") ? 3.95: 0.0;
        surcharge = age < 25 ? .3 : 0.0;

        double finalRate = basePrice + basePrice * surcharge + extras;
        double finalPrice = finalRate * rentalPeriod;
        System.out.println("The total for the rental will be: $" + String.format("%.2f", finalPrice));
    }
}