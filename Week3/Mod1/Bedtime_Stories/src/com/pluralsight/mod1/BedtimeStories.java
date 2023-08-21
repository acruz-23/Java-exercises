package com.pluralsight.mod1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the story called?");
        String title = input.nextLine();
        input.close();
        try {
            FileInputStream story = new FileInputStream("file.txt");
            Scanner scanner = new Scanner(story);
            String text;
            int line = 1;
            System.out.println(line + ". " + title);
            while (scanner.hasNextLine()) {
                line++;
                text = scanner.nextLine();
                System.out.println(line + ". " + text);
            }
            scanner.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}