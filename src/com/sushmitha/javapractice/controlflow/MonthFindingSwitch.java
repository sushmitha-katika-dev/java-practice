package com.sushmitha.javapractice.controlflow;

public class MonthFindingSwitch {
    public static void main(String[] args) {
        int month = 5;
        switch(month){
            case 1, 4, 6, 7, 9, 11 -> System.out.println("31 days");
            case 3,5,8,10,12 -> System.out.println("30 days");
            case 2 -> System.out.println("28/29 days");
            default -> {
                System.out.println("invalid input");
            }
        }
    }
}
