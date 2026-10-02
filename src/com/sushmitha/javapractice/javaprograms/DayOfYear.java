package com.sushmitha.javapractice.javaprograms;

import java.util.Scanner;

/*Day of the Year:
    Write a method isLeap(int year)
        and
        a method daysInMonth(int month, int year) using a switch.
            Using them, read a date as three numbers (day, month, year)
                and
                print which day of the year it is.
                (Example: 1 Mar 2024 is day 61, 1 Mar 2023 is day 60) */
public class DayOfYear {
    public static boolean isLeap(int year){
        if(year % 400 == 0) return true;
        return year % 4 == 0 && year % 100 != 0;
    }
    public static int daysInMonth(int month, int year){
        switch(month){
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            case 2 -> {
                if(isLeap(year)){
                    return 29;
                }else{
                    return 28;
                }
            }
            default -> {
                return 0;
            }

        }
    }
    public static void days(int day, int month, int year){
        int days = 0;
        for(int i = 1; i < month; i++){
            days += daysInMonth(i, year);
        }
        days += day;
       System.out.println(day +" " +" "+ monthName(month) +" " + year + " is day "+": "+ days);
    }
    public static String monthName(int month) {
        return switch (month) {
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Aug";
            case 9 -> "Sep";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "Invalid";
        };
    }
    public static int monthNumber(String month) {
        return switch (month.toLowerCase()) {
            case "jan" -> 1;
            case "feb" -> 2;
            case "mar" -> 3;
            case "apr" -> 4;
            case "may" -> 5;
            case "jun" -> 6;
            case "jul" -> 7;
            case "aug" -> 8;
            case "sep" -> 9;
            case "oct" -> 10;
            case "nov" -> 11;
            case "dec" -> 12;
            default -> 0;
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte day = sc.nextByte();
        String mon = sc.next();
        int month = monthNumber(mon);
        int year = sc.nextInt();
        if (month == 0) {
            System.out.println("Invalid month");
            return;
        }
        System.out.println("Leap year -> " + isLeap(year));
        System.out.println("Days in Month: " + daysInMonth(month, year));
        days(day,month, year);
    }
}
