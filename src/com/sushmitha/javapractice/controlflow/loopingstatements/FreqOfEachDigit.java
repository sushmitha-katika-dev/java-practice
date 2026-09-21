package com.sushmitha.javapractice.controlflow.loopingstatements;

import java.util.HashMap;

public class FreqOfEachDigit {
    public static void main(String[] args) {
        /*HashMap<Integer,Integer> hm = new HashMap<>();
        int n = 22345;
        while(n != 0){
            int digit = n % 10;
            hm.put(digit,hm.getOrDefault(digit,0)+1);
            n = n/10;
        }
        System.out.println(hm);*/
        int n = 34424;
        for(int i = 0; i < 9; i++){
            int temp = n;
            int cnt = 0;
            while(temp > 0){
                int digit = temp % 10;
                if(digit == i){
                    cnt++;
                }
                temp = temp / 10;
            }
            if(cnt > 0){
                System.out.println("Freq of " + i + " : " + cnt);
            }
        }
    }
}
