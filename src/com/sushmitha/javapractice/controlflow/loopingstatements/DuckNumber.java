package com.sushmitha.javapractice.controlflow.loopingstatements;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isDuck = false;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) {
                isDuck = true;
                break;
            }
            n = n / 10;
        }

        if (isDuck) {
            System.out.println("Duck number");
        } else {
            System.out.println("not a duck number");
        }

    }
}
