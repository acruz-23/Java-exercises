package com.learnToCode.Mod03;

import java.util.*;

public class PayRoll_Calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("How many hours have you worked? ");
        float hours = scanner.nextFloat();
        System.out.println("What is your pay rate? ");
        float payRate = scanner.nextFloat();

        float overtime = 0;
        if (hours > 40){
            overtime = hours - 40;
            hours -= overtime;
        }
        float grossPay = hours * payRate + overtime * 1.5f * payRate;
        System.out.println("Your gross pay is " + grossPay);
    }
    }
