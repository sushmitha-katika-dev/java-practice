package com.sushmitha.javapractice.controlflow.loopingstatements;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial " + fact );
        String rev = "";
        while(fact != 0 ){
            int digit = fact % 10;
            rev = rev + digit;
            fact = fact / 10;
        }
        System.out.println("Reverse of Factorial : " + rev);
    }
}
