package com.sushmitha.javapractice.controlflow.loopingstatements;

public class PerfectNum {
    public static void main(String[] args) {
        int n = 6;
        int i = 1;
        int sum = 0;
        int temp = n;
        while(i < n){
            if(n % i == 0){
                sum += i;
            }
            i++;
        }
        if(sum == temp){
            System.out.println(n + " is a Perfect Number");
        } else{
            System.out.println("not a perfect number");
        }
    }
}
