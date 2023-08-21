package com.pluralsight.mod3;


import java.util.Scanner;

public class VehicleInventory {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[20];
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 32775, 12250.0F);
        vehicles[1] = new Vehicle(201121, "Ford Explorer", "Blue", 42775, 12250.0F);
        vehicles[2] = new Vehicle(301121, "Ford Explorer", "Green", 52775, 12250.0F);
        vehicles[3] = new Vehicle(401121, "Ford Explorer", "Black", 62775, 12250.0F);
        vehicles[4] = new Vehicle(501121, "Ford Explorer", "Gray", 72775, 12250.0F);
        vehicles[5] = new Vehicle(601121, "Ford Explorer", "White", 762775, 12250.0F);
        boolean loop = true;

        while (loop) {
            System.out.println("What do you want to do?");
            System.out.println(" 1 - Find vehicles that match make/model");
            System.out.println(
                    " 2 - Find vehicles that fall within a price range");
            System.out.println(" 3 - Find vehicles that match a color");
            System.out.println(" 4 - List all vehicles");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command: ");
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    findVehiclesByMakeModel(vehicles);
                    break;
                case 2:
                    findVehiclesByPrice(vehicles);
                    break;
                case 3:
                    findVehiclesByColor(vehicles);
                    break;
                case 4:
                    listAllVehicles(vehicles);
                    break;
                case 5:
                    vehicles[getVehicleCt(vehicles) - 1] = addAVehicle();
                    System.out.println("Vehicle added");
                    System.out.println("There are now " + getVehicleCt(vehicles) + " stored vehicles." );
                    System.out.println("Press enter to continue...");
                    scanner.nextLine();
                    break;
                case 6:
                    loop = false;
                    return;
                default:
                    System.out.println("Command not recognized. Please enter the number.");
            }
        }
    }

    private static void findVehiclesByColor(Vehicle[] vehicles) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What color would you like to search for? ");
        String search = scanner.nextLine();
        int match = 0;
        for (Vehicle vehicle : vehicles){
            if (vehicle == null) {
                break;
            } else if (vehicle.getColor().equals(search)){
                System.out.println("Match found : (Match "+match+")");
                vehicle.displayVehicle();

                match++;
            }
        }
        if (match < 1){
            System.out.println("No match found.");
        }
        System.out.println("Press enter to continue...");
        scanner.nextLine();
    }

    private static void findVehiclesByMakeModel(Vehicle[] vehicles) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What make and model would you like to search for? ");
        String search = scanner.nextLine();
        int match = 0;
        for (Vehicle vehicle : vehicles){
            if (vehicle == null) {
                break;
            } else if (vehicle.getMakeModel().equals(search)){
                System.out.println("Match found : (Match "+match+")");
                vehicle.displayVehicle();

                match++;
            }
        }
        if (match < 1){
            System.out.println("No match found.");
        }
        System.out.println("Press enter to continue...");
        scanner.nextLine();
    }

    private static Vehicle addAVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the vehicle information: ");
        System.out.println("What is the vehicle ID? ");
        long vehicleId = scanner.nextLong();
        System.out.println("What is the make and model?");
        String makeModel = scanner.nextLine();

        System.out.println("What is the odometer reading? ");
        int odometerReading = scanner.nextInt();
        System.out.println("What is the color? ");
        String color = scanner.nextLine();
        System.out.println("What is the price?");
        float price = scanner.nextFloat();
        return new Vehicle(vehicleId, makeModel, color, odometerReading, price);

    }

    private static void listAllVehicles(Vehicle[] vehicles) {
        Scanner scanner = new Scanner(System.in);
        int match =0;
        for (Vehicle vehicle: vehicles){
            if (vehicle!= null){
                System.out.println("Match #" + match);
                vehicle.displayVehicle();
            }
        }
        System.out.println("Press enter to continue...");
        scanner.nextLine();
    }

    private static void findVehiclesByPrice(Vehicle[] vehicles) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the minimum price? ");
        float minPrice = scanner.nextFloat();
        System.out.println("What is the maximum price?");
        float maxPrice = scanner.nextFloat();
        int match = 0;
        for (Vehicle vehicle: vehicles){
            if (vehicle == null) {
                break;
            } else if (vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice) {
                System.out.println("A price match has been found: (match " + match + ")");
                vehicle.displayVehicle();
                match++;
            }
        }
        if (match < 1){
            System.out.println("No match found for that price range.");
        }
        System.out.println("Press enter to continue...");
        scanner.nextLine();
        }


    private static int getVehicleCt(Vehicle[] vehicles) {
        int count= 0;
        for (Vehicle vehicle: vehicles){
            if (vehicle != null){
                count++;
            }
        }
        return count;
    }
}