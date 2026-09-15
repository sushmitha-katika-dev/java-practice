package com.sushmitha.javapractice.controlflow.loopingstatements;

public class ProdOfDigits {
    public static void main(String[] args) {
        int n = 153;
        int prod = 1;
        while(n > 0){
            int digit = n % 10;
            prod *= digit;
            n = n/10;
        }
        System.out.println("Product of digits: " + prod);
    }
}
