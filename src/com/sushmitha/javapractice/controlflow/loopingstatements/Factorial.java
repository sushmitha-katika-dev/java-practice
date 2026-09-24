package com.sushmitha.javapractice.controlflow.loopingstatements;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);

        // Use a temporary variable so 'fact' keeps its original value if needed later
        int temp = fact;
        String rev = "";

        while(temp != 0 ){
            int digit = temp % 10;
            rev = rev + digit;
            temp = temp / 10;
        }
        System.out.println("Reverse of Factorial: " + rev);

        sc.close(); // Good practice to close the scanner
    }
}