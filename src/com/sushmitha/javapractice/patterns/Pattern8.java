package com.sushmitha.javapractice.patterns;

public class Pattern8 {
    public static void main(String[] args) {
        //inverted full pyramid
        int n = 5;
        //inverted full pyramid
        for(int i = n; i >= 1; i--){
            for(int j = 1;j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1;j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // inverted continus star full pyramid
        for(int i = n; i >= 1; i--){
            for(int j = 1;j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1;j <= i*2-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
