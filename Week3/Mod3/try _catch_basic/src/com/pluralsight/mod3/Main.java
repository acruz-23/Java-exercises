package com.pluralsight.mod3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] phrases = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        int command = 0;
        String another;
        Scanner scanner = new Scanner(System.in);
        Boolean loop = true;
        while (loop){
            System.out.println("What saying would you like (1-10)? ");
            command = scanner.nextInt();
            try {
                System.out.println("Phrase: " + phrases[command - 1]);
            } catch (Exception e){
                System.out.println("Your number does not match a command!");
               // e.printStackTrace();
            }
            System.out.println("Would you like another phrase? (y/n)");
            another = scanner.next();
            if (another.equals("n")){
                loop = false;
            }
        }
    }
}