package com.sushmitha.javapractice.controlflow.loopingstatements;

// add 1 to the number and the result is a perfect square
public class SunnyNumber {
    public static void main(String[] args) {
        int n = 15;
        int x = n + 1;
        boolean isPerfectSquare = false;

        if (x >= 0) {
            for (int i = 1; i <= x; i++) {
                if (i * i == x) {
                    isPerfectSquare = true;
                    break;
                }
            }
        }
        if(isPerfectSquare){
            System.out.println("Sunny Number");
        } else{
            System.out.println("not a sunny number");
        }
    }
}
