package com.sushmitha.javapractice.controlflow.loopingstatements;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reverse: " + rev);

        // for 740 the reverse will be 47 for the above using string we get 047
        /*int num = 720;
        String reverse = "";

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse + digit;
            num = num / 10;
        }

        System.out.println(reverse);*/
    }
}
