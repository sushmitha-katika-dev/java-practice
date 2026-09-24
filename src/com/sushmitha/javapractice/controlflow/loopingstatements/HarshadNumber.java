package com.sushmitha.javapractice.controlflow.loopingstatements;

import java.util.Scanner;

//sum of digits of number is divisible by number
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //18
        int temp = n;
        int sum = 0;
        while(n != 0){
            int d = n % 10;
            sum += d;
            n = n /10;
        }
        if(temp % sum == 0 ){
            System.out.println("Harshad number");
        } else{
            System.out.println("NOt a harshad number");
        }
    }
}
