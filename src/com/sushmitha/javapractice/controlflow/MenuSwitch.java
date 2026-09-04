package com.sushmitha.javapractice.controlflow;

import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur choice");
        System.out.println("\n1. Dosa\n2. idly\n3. Poori\n4. Exit");
        String input = sc.next();
        switch (input) {
            case "dosa" -> System.out.println("dosa");
            case "idly" -> System.out.println("idly");
            case "poori" -> System.out.println("poori");
            case "exit" -> System.out.println("Exit...");
            default -> System.out.println("not in menu");
        }
    }
}