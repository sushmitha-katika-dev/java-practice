package com.sushmitha.javapractice.controlflow;

import java.util.Scanner;

public class AtmWithdrawal {
    public static void main(String[] args) {
        double balance = 2300;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");

        double amount = scanner.nextDouble();
        if (amount <= 0){
            System.out.println("Invalid amount");
        }if (amount > balance){
            System.out.println("Insufficient balance");
        }else {
            balance = balance - amount;
            System.out.println("Withdrawn sucessfully");
        }
        System.out.println("Balance: " + balance);
    }
}
