package com.sushmitha.javapractice.controlflow.loopingstatements;

import java.util.Scanner;

public class PasswordMatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int n = 12345;
        boolean isExit = true;
        int cnt = 0;
        while(isExit) {
            System.out.println("Enter password: ");
            int input = sc.nextInt();
            if(n == input){
                System.out.println("Password correct");
                break;
            } else{
                System.out.println("Password incorrect, try again...");
                cnt++;
            }

            if(cnt == 3){
                isExit = false;
            }*/
        String password = "Sushmitha";
        boolean isExit = true;
        int cnt = 0;
        if(password.length() >= 8){
            while(isExit) {
                System.out.println("Enter password: ");
                String input = sc.next();
                if(password.equals(input)){
                    System.out.println("Password correct");
                    break;
                } else{
                    System.out.println("Password incorrect, try again...");
                    cnt++;
                }

                if(cnt == 3){
                    isExit = false;
                }
            }
        }

    }
}
