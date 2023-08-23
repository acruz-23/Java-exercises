package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<Asset>();
        assets.add(new House("My House", "Yesterday", 100000000, "123 Main", 2, 2000, 2000));
        assets.add(new House("My 2nd House", "Maybe tomorrow", 100000000, "234 Main", 4, 1000, 500));
        assets.add(new Vehicle("Truck", "Monday", 50000, "Honda Prius", 2000));

        for (Asset asset : assets){
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Aquired: " + asset.getDateAquired());
            System.out.println("Cost: " + asset.getOriginalCost());
            if (asset instanceof House){
                System.out.println("Address: " + ((House) asset).getAddress());
            }
            if (asset instanceof Vehicle){
                System.out.println("Make model: " + ((Vehicle) asset).getMakeModel());
            }
            System.out.println("Value: " + asset.getValue() + "\n");

        }
    }
}