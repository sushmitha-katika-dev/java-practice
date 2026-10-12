package com.sushmitha.javapractice.javaprograms;

import java.util.Scanner;

/*Digit Analysis:
    Write a method countDigit(int n, int d) that returns how many times digit d appears in n,
          and a method largestDigit(int n) that returns the largest digit of n.
          For n = 7473, the count of 7 is 2 and the largest digit is 7.
        Use only loops and arithmetic operators.*/
public class DigitAnalysis {

    public static int countDigit(int n, int d) {
        int cnt = 0;
        while (n > 0) {
            if (n % 10 == d) cnt++;
            n /= 10;
        }
        return cnt;
    }

    public static int largestDigit(int n) {
        int max = 0;
        while (n > 0) {
            int digi = n % 10;
            if (digi > max) max = digi;
            n /= 10;
        }
        return max;
    }

    // Checks if a digit has already appeared in the preceding part of the number
    public static boolean isUnique(int fullNum, int currNum, int target) {
        while (fullNum > currNum) {
            if (fullNum % 10 == target) return false;
            fullNum /= 10;
        }
        return true;
    }
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int number = reverseNumber(n);

        if (number == 0) {
            System.out.println("0 -> 1");
        } else {
            int temp = number;
            while (temp > 0) {
                int d = temp % 10;
                if (isUnique(number, temp, d)) {
                    System.out.println(d + " -> " + countDigit(number, d));
                }
                temp /= 10;
            }
        }
        System.out.println("Largest Digit: " + largestDigit(number));
        sc.close();
    }
}