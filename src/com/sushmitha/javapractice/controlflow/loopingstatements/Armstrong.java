package com.sushmitha.javapractice.controlflow.loopingstatements;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int cnt = 0;
        while(temp > 0){
            cnt++;
            temp = temp/10;
        }
        temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum += (int)Math.pow(digit, cnt);
            temp = temp/10;
        }
        if(sum == n){
            System.out.println("Armstrong");
        } else{
            System.out.println("Not Armstrong");
        }
    }
}
