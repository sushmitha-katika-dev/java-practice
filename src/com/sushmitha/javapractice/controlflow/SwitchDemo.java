package com.sushmitha.javapractice.controlflow;

public class SwitchDemo {
    public static void main(String[] args) {
        char ch = 'O';
        switch(ch){

            case 'O' -> System.out.println("Outstanding");
            case 'A' -> System.out.println("Very good");
            case 'B' -> System.out.println("good");
            case 'C' -> System.out.println("Outstanding");
            case 'D' -> System.out.println("Outstanding");
            case 'F' -> System.out.println("Outstanding");
            default -> {
                System.out.println("invalid input");
            }
        }
    }
}
