package com.pluralsight.Mod1;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        System.out.println("First name: ");
        String firstName = scanner.nextLine().trim();
        System.out.println("Middle name: ");
        String middleName = scanner.nextLine().trim();
        System.out.println("Last name: ");
        String lastName = scanner.nextLine().trim();
        System.out.println("Suffix: ");
        String suffix = scanner.nextLine().trim();
        String fullName;
        if (middleName.length() > 0){
            fullName = firstName + " " + middleName + " " + lastName;
        }else fullName = firstName + " " + lastName;
        if (suffix.length() > 0){
            fullName += ", " + suffix;
        }
        System.out.println("Welcome, " + fullName);

    }
}