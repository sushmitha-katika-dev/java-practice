package com.sushmitha.javapractice.controlflow.loopingstatements;

public class EvenOddCount {
    public static void main(String[] args) {
        int n = 14837;
        int evenCnt = 0;
        int oddCnt = 0;
        while(n != 0){
            int digit = n % 10;
            if(digit % 2 == 0) evenCnt++;
            else oddCnt++;
            n = n /10;
        }
        System.out.println("Even count: " + evenCnt +"\n" + "Odd count : " + oddCnt);
    }
}
