package com.sushmitha.javapractice.javaprograms;

import java.util.Scanner;

/*Electricity Bill:
    Write a method calculateBill(int units) that returns the bill amount.
        Charges: first 100 units at Rs 3 per unit,
                    next 100 units (101 to 200) at Rs 5 per unit,
                    above 200 units at Rs 8 per unit.
                    Add a fixed charge of Rs 50.
                    Read the units consumed and print the bill.
                    (Example: 250 units = 300 + 500 + 400 + 50 = Rs 1250) [10]*/
public class ElectricityBillGenerator {
    int FIXED_CHARGES = 50;
    public double calculateBill(int units){
        int bill = 0;
        if(units > 0 && units <= 100){
            bill = 3 * units ;
        } else if(units > 100 && units <= 200){
            bill = 5 * (units-100) + (3 * 100) ;
        } else if(units > 200){
            bill = 8 * (units-200) +(5 * 100) + (3 * 100) ;
        }
        return bill + FIXED_CHARGES;
    }
    public static void main(String[] args) {
        ElectricityBillGenerator e = new ElectricityBillGenerator();
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        System.out.println("Charges: " + e.calculateBill(units));
    }
}
