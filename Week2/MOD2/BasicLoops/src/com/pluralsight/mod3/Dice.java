package com.pluralsight.mod3;

public class Dice {
    private int[] rollCtArray = new int[13];

    public int[] roll2Dice (int times){
        int rollTotal;
        for (int i = 0;i < times;i++){
            int roll1= 1 + (int)(Math.random() * 6);
            int roll2 = 1 + (int)(Math.random() * 6);
            rollTotal = roll1 + roll2;
            System.out.println("Rolls: " + roll1 + "-" +roll2 + " Sum: "+ rollTotal);
            this.rollCtArray[rollTotal]++;
        }
        return this.rollCtArray;
    }

}
