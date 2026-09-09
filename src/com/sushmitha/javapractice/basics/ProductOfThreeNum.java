package com.sushmitha.javapractice.basics;

import java.util.Scanner;

public class ProductOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*long prod = 1;
        for(int i = 0; i < 3; i++){
            prod *= sc.nextLong();
        }*/
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long prod = a * b * c;
        System.out.println(prod);
    }
}
