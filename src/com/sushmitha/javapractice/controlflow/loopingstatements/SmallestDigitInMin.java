package com.sushmitha.javapractice.controlflow.loopingstatements;

public class SmallestDigitInMin {
    public static void main(String[] args) {
        int n = 47821;
        int min = 9;
        while(n > 0){
            int digit = n % 10;
            if(digit < min){
                min = digit;
            }
            n = n/10;
        }
        System.out.println("Smallest Digit in Number : " + min);
    }
}

