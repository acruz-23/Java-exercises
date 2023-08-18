package com.pluralsight.mod1;

import java.util.Scanner;

public class PostageBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = scanner.nextLine().trim();

        StringBuilder billingAddress = new StringBuilder();
        System.out.println("Please provide the billing address information: ");
        System.out.println("Billing Street: ");
        billingAddress.append(scanner.nextLine().trim() + "\n");
        System.out.println("Billing City: ");
        billingAddress.append(scanner.nextLine().trim() + ", ");
        System.out.println("Billing State ");
        billingAddress.append(scanner.nextLine() + " ");
        System.out.println("Billing Zip: ");
        billingAddress.append(scanner.nextLine() + "\n");

        StringBuilder shippingAddress = new StringBuilder();
        System.out.println("Please provide the shipping address information: ");
        System.out.println("Shipping Street: ");
        shippingAddress.append(scanner.nextLine() + "\n");
        System.out.println("Shipping City: ");
        shippingAddress.append(scanner.nextLine() + ", ");
        System.out.println("Shipping State: ");
        shippingAddress.append(scanner.nextLine() + " ");
        System.out.println("Shipping Zip: ");
        shippingAddress.append(scanner.nextLine() + "\n");

        System.out.println("\n"+ name);
        System.out.println("\n" + billingAddress);
        System.out.println(shippingAddress);

    }
}