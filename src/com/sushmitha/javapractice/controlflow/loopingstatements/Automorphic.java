package com.sushmitha.javapractice.controlflow.loopingstatements;

//number whose sqr ends with num
public class Automorphic {
    public static void main(String[] args) {
        int n = 25;
        int sqr = n * n;

        int temp = n;
        int divisor = 1;

        while(temp > 0){
            divisor = divisor * 10;
            temp = temp / 10;
        }
        if(sqr % divisor == n){
            System.out.println("Automorphic");
        } else{
            System.out.println("not automorphic");
        }
    }
}
