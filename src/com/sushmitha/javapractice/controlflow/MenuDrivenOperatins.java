package com.sushmitha.javapractice.controlflow;

import java.util.Scanner;

public class MenuDrivenOperatins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select any option");
        System.out.println("---------------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("---------------------");

        boolean isExit = true;
        while(isExit){

            int input = sc.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.print("enter first value : ");
                    int num1 = sc.nextInt();
                    System.out.print("enter second value : ");
                    int num2 = sc.nextInt();
                    int c = num1 + num2;
                    System.out.println("Addition operation : " + c);
                }
                case 2 -> {
                    System.out.print("enter first value : ");
                    int num1 = sc.nextInt();
                    System.out.print("enter second value : ");
                    int num2 = sc.nextInt();
                    int c = num1 - num2;
                    System.out.println("Substraction operation : " + c);
                }
                case 3 -> {
                    System.out.print("enter first value : ");
                    int num1 = sc.nextInt();
                    System.out.print("enter second value : ");
                    int num2 = sc.nextInt();
                    int c = num1 / num2;
                    System.out.println("Division operation : " + c);
                }
                case 4 -> {
                    System.out.print("enter first value : ");
                    int num1 = sc.nextInt();
                    System.out.print("enter second value : ");
                    int num2 = sc.nextInt();
                    int c = num1 * num2;
                    System.out.println("Multiplication operation : " + c);
                }
                default -> {
                    System.out.println("invalid option");
                }
            }
        }


    }
}
