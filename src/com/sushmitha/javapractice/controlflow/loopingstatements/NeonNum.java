package com.sushmitha.javapractice.controlflow.loopingstatements;

import java.util.Scanner;

// number where the sum of the digits of its square is equal to the original number itself
public class NeonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqr = n * n;
        int sum = 0;
        while(sqr > 0){
            int digit = sqr % 10;
            sum += digit;
            sqr = sqr / 10;
        }
        if(sum == n){
            System.out.println("Neon Number");
        } else{
            System.out.println("Not a Neon Number");
        }
    }
}
