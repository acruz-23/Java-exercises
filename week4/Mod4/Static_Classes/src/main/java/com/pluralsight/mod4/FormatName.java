package com.pluralsight.mod4;

public class FormatName {
    //private String firstName, middleName, lastName, prefix, suffix;
    private FormatName(){};
    public static String format(String firstName, String lastName){
        return lastName + ", " + firstName;
    }
    public static String format(String firstName, String middleName, String lastName){
        return  lastName + ", " + firstName + " " + middleName;
    }

    public static String format(String prefix,String firstName, String middleName, String lastName){
        return  lastName + ", " + prefix + " " + firstName + " " + middleName;
    }
    public static String format(String prefix,String firstName, String middleName, String lastName, String suffix){
        return  lastName + ", " + prefix + " " + firstName + " " + middleName + ", "+ suffix;
    }





}
