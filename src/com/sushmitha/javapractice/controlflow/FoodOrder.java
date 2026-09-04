package com.sushmitha.javapractice.controlflow;

import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur choice");
        System.out.println("\n1. Pizza\n2. Burger\n3. Biryani\n4. Sandwich\n5. Exit");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("You Selected: Pizza");
                break;
            case 2:
                System.out.println("You selected: Burger");
                break;
            case 3:
                System.out.println("You Selected: Biryani");
                break;
            case 4:
                System.out.println("You selected: Sandwich");
                break;
            case 5:
                System.out.println("Exit....");
                break;
            default:
                System.out.println("Enter Invalid Input");
        }
    }
}
