package com.sushmitha.javapractice.controlflow.loopingstatements;

public class FizzBuzz {
    public static void main(String[] args) {

        /*int n = 21;
        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("FizzBuzz");
        } else if(n % 3 == 0){
            System.out.println("Buzz");
        } else if(n % 5 == 0){
            System.out.println("Fizz");
        } else{
            System.out.println("Invalid Num);
        }*/
        for(int n = 1; n <= 100; n++){
            if(n % 3 == 0 && n % 5 == 0){
                System.out.println(n + "-> " + "FizzBuzz");
            } else if(n % 3 == 0){
                System.out.println(n + "-> " + "Buzz");
            } else if(n % 5 == 0){
                System.out.println(n + "-> " + "Fizz");
            }
        }
    }
}
