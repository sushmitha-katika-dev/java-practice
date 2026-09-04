package com.sushmitha.javapractice.controlflow;

public class WeekDays {
    public static void main(String[] args) {
        String input = "monday";

        switch(input){
            case "monday", "tuesday", "Wednesday", "thursday","friday" -> {
                System.out.println("weekday");
            }
            case "saturday", "sunday" -> {
                System.out.println("weekend");
            }
           default -> {
               System.out.println("Invalid input");
           }
        }
    }
}
