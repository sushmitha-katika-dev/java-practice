package com.sushmitha.javapractice.controlflow.loopingstatements;

public class sumOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;
        while(n > 0 ){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println("Sum: " + sum);
    }
}
