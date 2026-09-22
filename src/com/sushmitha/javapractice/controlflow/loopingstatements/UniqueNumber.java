package com.sushmitha.javapractice.controlflow.loopingstatements;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//number in which every digit appears exactly once, with no repetitions.
public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isUnique = true;

        for(int i = 0; i < 9; i++){
            int temp = n;
            int cnt = 0;
            while(temp > 0){
                int digit = temp % 10;
                if(digit == i){
                    cnt++;
                }
                if(cnt > 1){
                    isUnique = false;
                    break;
                }
                temp = temp / 10;
            }
        }

        /*
        HashSet<Integer> hs = new HashSet<>();
        while(n > 0){
            int digit = n % 10;
            if(hs.contains(digit)){
               isUnique = false;
               break;
            }
            hs.add(digit);
            n = n/10;
        } */
        if(isUnique){
            System.out.println("Unique Number");
        } else{
            System.out.println("Not a Unique Nmber");
        }

    }
}
