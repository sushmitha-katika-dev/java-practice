package com.sushmitha.javapractice.Arrays;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }

}
