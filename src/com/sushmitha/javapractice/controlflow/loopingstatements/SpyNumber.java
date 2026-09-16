package com.sushmitha.javapractice.controlflow.loopingstatements;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;
        while(n != 0){
            int d = n % 10;
            sum += d;
            prod *= d;
            n = n /10;
        }
        if(sum == prod){
            System.out.println("Spy Number");
        } else{
            System.out.println("not spy number");
        }
    }
}
