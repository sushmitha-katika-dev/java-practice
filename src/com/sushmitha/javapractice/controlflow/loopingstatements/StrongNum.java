package com.sushmitha.javapractice.controlflow.loopingstatements;

import java.util.Scanner;

// sum of factorials of each digit = num
public class StrongNum {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;

        while(n > 0){
            int d = n % 10;
            int fact = 1;
            for(int i = 1; i <= d; i++){
                fact *= i;
            }
            sum += fact;
            n = n/10;
        }

        if(temp == sum){
            System.out.println("Strong Number");
        } else{
            System.out.println("Not a strong number");
        }
    }
}
