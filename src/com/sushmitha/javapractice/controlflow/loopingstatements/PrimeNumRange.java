package com.sushmitha.javapractice.controlflow.loopingstatements;

public class PrimeNumRange {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 30;
        for(int i = 0; i <= num; i++){
           if(isPrime(i)){
               System.out.print(i + " ");
           }
        }
    }
}
