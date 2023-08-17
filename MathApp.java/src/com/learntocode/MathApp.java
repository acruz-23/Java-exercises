package com.learntocode;

public class MathApp {
    public static void main(String[] args) {
       float job1Salary = 30_000f;
       float Job2Salary = 24_000;
       float maxSalary = Math.max(job1Salary, Job2Salary);
       System.out.println("The answer is " + maxSalary);

       float carPrice = 10_000f;
       float truckPrice = 13_000f;
       float minPrice = Math.min(carPrice, truckPrice);
       System.out.println("The answer is " + minPrice);

       float radius = 7.25f;
       double circleArea = Math.PI * Math.pow(radius, 2);
       System.out.println("The area of a circle with raius: " + radius + " is "+ String.format("%.2f", circleArea));


       float root = 5.0f;
       double sqrt = Math.sqrt(root);
       System.out.println("The square root of " + root + " is " + sqrt);

       int x1 = 5, x2 = 85, y1 = 10, y2 =50;
       double distance = Math.sqrt((Math.pow(x1 - x2, 2)) + Math.pow(y1-y2, 2));
       System.out.println("The distance between points (" + x1 +", " + y1 + ") and (" + x2 +", " +y2 + ") is " + distance);

       double num2 = -3.8;
       double numAbs = Math.abs(num2);
       System.out.println(numAbs);

       double randNum = Math.random();
       System.out.println(randNum);
       
    }
}