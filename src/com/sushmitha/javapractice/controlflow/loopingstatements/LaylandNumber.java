package com.sushmitha.javapractice.controlflow.loopingstatements;

import java.util.Scanner;

public class LaylandNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n + 1;
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println("Leyland Number");
        } else {
            System.out.println("Not a Leyland Number");
        }
        sc.close();
    }
}
