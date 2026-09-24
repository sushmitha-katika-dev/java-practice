package com.sushmitha.javapractice.controlflow.loopingstatements;

//number whose sum of the factorials of its individual digits equals the number itself
public class KrishnamurthyNumber {
    public static void main(String[] args) {
        int n = 145;
        int sum = 0;
       for(int i = n; i > 0; i = i / 10){
           int digit = i % 10;
           int fact = 1;
           for(int j = digit; j >= 1; j--){
               fact *= j;
           }
           sum += fact;
       }
       if(n == sum){
           System.out.println("Krishna Murthy Number");
       } else{
           System.out.println("Not a Krishna Murthy Number");
       }
    }
}
