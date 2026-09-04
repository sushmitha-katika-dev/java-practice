package com.sushmitha.javapractice.controlflow;

import java.util.Scanner;

public class ElectricityBillCal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of Units: ");
        int units = scanner.nextInt();
        int bill = 0;
        if(units > 0 && units <= 100){
            bill = 2 * units;
        } else if(units > 100 && units <= 200){
            bill = 3 * units;
        } else if(units > 200 && units <= 300){
            bill = 5 * units;
        } else if(units > 300){
            bill = 7 * units;
        } else{
            System.out.println("Invalid Input");
        }
        System.out.println("Total Bill : " + bill);
    }
}
