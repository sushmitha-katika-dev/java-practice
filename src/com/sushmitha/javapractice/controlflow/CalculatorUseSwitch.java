package com.sushmitha.javapractice.controlflow;

import java.util.Scanner;

public class CalculatorUseSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter ur choice");
        System.out.println("\n1. Addition\n2. Sub\n3. Div\n4. Mul");
        int input = sc.nextInt();
        switch(input){
            case 1 -> {
                int result = a+b;
                System.out.println("resut: " + result);
            }
            case 2 -> {
                int result = a-b;
                System.out.println("resut: " + result);
            }
            case 3 -> {
                int result = a/b;
                System.out.println("resut: " + result);
            }
            case 4 -> {
                int result = a*b;
                System.out.println("resut: " + result);
            }
            default -> {
                System.out.println("Invalid Input");
            }

        }
    }
}
