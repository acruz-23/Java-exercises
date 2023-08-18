package com.pluralsight.mod1;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String name = scanner.nextLine().trim();
        String firstName, middleName = "(NONE)", lastName = "(NONE)";
        Integer firstSpace = name.indexOf(" ");
        if (firstSpace != -1){
            firstName = name.substring(0, firstSpace);
            name = name.substring(firstSpace+ 1 );
        }else {
            firstName = name;
            System.out.println("First Name: "+ firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);
            return;
        };
        Integer nextSpace = name.indexOf(" ");
        if (nextSpace != -1) {
            middleName = name.substring(0, nextSpace);
            name = name.substring(nextSpace + 1);
        }
        lastName = name;
        System.out.println("First Name: "+ firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);


    }
}