package com.sushmitha.javapractice.controlflow;

import java.util.Scanner;

public class StdGradeCal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100){
            System.out.println("A-Grade");
        } else if(marks >= 80 && marks < 90){
            System.out.println("B-Grade");
        } else if(marks >= 70 && marks < 80){
            System.out.println("C-Grade");
        } else if(marks >= 60 && marks < 70){
            System.out.println("D-Grade");
        } else if(marks >= 40 && marks < 60){
            System.out.println("E-Grade");
        } else if(marks < 40){
            System.out.println("FAIL...");
        } else{
            System.out.println("Invalid input/marks");
        }
    }
}
