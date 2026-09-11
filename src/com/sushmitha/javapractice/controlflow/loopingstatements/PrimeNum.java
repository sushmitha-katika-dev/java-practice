package com.sushmitha.javapractice.controlflow.loopingstatements;

public class PrimeNum {
    public static void main(String[] args) {
        int n = 11;
        if(n <= 1){
            System.out.println("not prime number");
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println("not prime numbeer");
                break;
            }
        }
        System.out.println("prime number");
    }
}
