package com.sushmitha.javapractice.Arrays;

import java.util.Scanner;

public class SumArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
