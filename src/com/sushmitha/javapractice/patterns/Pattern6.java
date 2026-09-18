package com.sushmitha.javapractice.patterns;

public class Pattern6 {
    public static void main(String[] args) {
        //Inverted Right-Aligned Triangle
        int n = 5;
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
