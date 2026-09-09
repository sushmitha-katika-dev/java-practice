package com.sushmitha.javapractice.basics;

import java.util.Scanner;

public class DollarToInr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dollar = sc.nextInt();
        double inr = dollar * 87.34;
        System.out.printf("%.4f", inr);
    }
}
