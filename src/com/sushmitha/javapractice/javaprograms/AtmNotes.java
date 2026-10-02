package com.sushmitha.javapractice.javaprograms;

import java.util.Scanner;

/* ATM Notes:
    Write a method that takes a withdrawal amount
        and
        prints the minimum number of notes of 500, 200, 100, 50, 20 and 10 needed.
    If the amount is not a multiple of 10, print -1 instead.
        (Example: 1380 = 2 x 500, 1 x 200, 1 x 100, 1 x 50, 1 x 20, 1 x 10) [10]*/
public class AtmNotes {

    public void minimumNumberOfNotes(int amount) {
        if (amount % 10 != 0) {
            System.out.println("-1");
            return;
        }
        int cnt500 = amount / 500;
        amount %= 500;

        int cnt200 = amount / 200;
        amount %= 200;

        int cnt100 = amount / 100;
        amount %= 100;

        int cnt50 = amount / 50;
        amount %= 50;

        int cnt20 = amount / 20;
        amount %= 20;

        int cnt10 = amount / 10;
        System.out.println("500: " + cnt500);
        System.out.println("200: " + cnt200);
        System.out.println("100: " + cnt100);
        System.out.println("50:  " + cnt50);
        System.out.println("20:  " + cnt20);
        System.out.println("10:  " + cnt10);
    }
    public static void main(String[] args) {
        AtmNotes atm = new AtmNotes();
        ElectricityBillGenerator e = new ElectricityBillGenerator();
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        atm.minimumNumberOfNotes(amount);
    }
}
