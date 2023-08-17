package com.pluralsight.MOD4;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Would you like a regular or large sub?");
            String size = scanner.nextLine();
            double price = 0;
            if (size.toLowerCase().equals("regular")) {
            price = 5.45;
             }else if (size.toLowerCase().equals("large")) {
            price = 8.95;
             }else {System.out.println("Sorry, we only have regular or large subs.");
            return;}
            System.out.println("How old are you?");
            int age = scanner.nextInt();

            double discount = 0;

            if (age <= 17){
                discount = .1;
            }else if (age >= 65){
                discount = .2;
            }
            double cost = price * (1.0 - discount);
            System.out.println("The sandwich will be: $" + String.format("%.2f", cost));

    }
}