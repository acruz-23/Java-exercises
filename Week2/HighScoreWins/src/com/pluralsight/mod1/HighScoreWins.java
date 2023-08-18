package com.pluralsight.mod1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter team1:team2|team1score:team2score ");
        String res = scanner.nextLine();
        String[] teamAndScores = res.split(Pattern.quote("|"));
        String[] teams = teamAndScores[0].split(Pattern.quote(":"));
        String[] scores = teamAndScores[1].split(Pattern.quote(":"));
        Integer score1 = Integer.parseInt(scores[0]);
        Integer score2 = Integer.parseInt(scores[1]);
        if (score1 > score2){
            System.out.println(teams[0] + " wins with a score of " + score1);
        }else if (score2 > score1){
            System.out.println(teams[1] + " wins with a score of " + score2);
        }else {
            System.out.println(teams[0] + " and " + teams[1] + " tied with a score of " + score1);
        }

    }
}