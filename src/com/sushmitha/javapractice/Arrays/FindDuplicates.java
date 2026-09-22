package com.sushmitha.javapractice.Arrays;

import java.util.Scanner;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(!seen.add(arr[i])){
                duplicate.add(arr[i]);
            }
        }

        for(int num : duplicate){
            System.out.print(num + " ");
        }
    }
}