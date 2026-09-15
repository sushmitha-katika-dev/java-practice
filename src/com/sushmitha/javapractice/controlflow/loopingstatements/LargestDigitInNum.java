package com.sushmitha.javapractice.controlflow.loopingstatements;

public class LargestDigitInNum {
    public static void main(String[] args) {
        int n = 47821;
        int max = 0;
        while(n > 0){
            int digit = n % 10;
            if(digit > max){
                max = digit;
            }
            n = n/10;
        }
        System.out.println("Largest Digit in Number : " + max);
    }
}
