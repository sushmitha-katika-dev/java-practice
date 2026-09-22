package com.sushmitha.javapractice.strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        /*String s1 = "";
        for(int i = s.length()-1; i >= 0; i--){
            s1 = s1 + s.charAt(i);
        }
        System.out.println(s1);*/

        StringBuilder sb = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }

        System.out.println(sb);
    }
}
