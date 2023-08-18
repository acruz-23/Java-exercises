package com.pluralsight.mod3;
import java.io.*;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        Integer w = 0;
        while (w < 5){
            System.out.println("I love Gambling!");
            w++;
        }
        for (int i = 5; i > 0; i--){
            System.out.println(i);
            if (i == 1){
                System.out.println("Roll!");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Dice casinoDice = new Dice();
        int[] rollResults = casinoDice.roll2Dice(100);
        for (int d = 2; d <= 12; d++){
            String timeOrTimes = rollResults[d] > 1 ? "times": "time";
            System.out.println("Dice total was " + d + " " + rollResults[d] + " " + timeOrTimes);

        }
    }
}