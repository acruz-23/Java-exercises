package com.pluralsight.mod3;
import java.io.*;
import java.util.Arrays;

public class TestStatisctics {
    public static void main(String[] args) {
        double[] scores = {20, 100, 70, 90, 80, 65, 93, 86.5, 89.2, 77};
        int count = 0;
        double sum = 0, avg, lowScore, highscore;
        for(double score : scores){
            sum += score;
            count++;
        }
        avg = sum / count;
        Arrays.sort(scores);
        highscore = scores[9];
        lowScore = scores[0];
        System.out.println("Average: " + avg);
        System.out.println("High score: " + highscore);
        System.out.println("Low score: " + lowScore);

    }


}