package com.sushmitha.javapractice.controlflow;

import java.util.Scanner;

public class EmpSalBonusCal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Basic Salary:");
        double basicSal = scanner.nextInt();
        System.out.println("Enter Experience: ");
        int experience = scanner.nextInt();
        System.out.println("Enter Rating: ");
        int rating = scanner.nextInt();

        double bonus = 0;
        double performanceBonus = 0;
        double experienceBonus = 0;
        double finalSal = 0;
        if(rating == 5 && basicSal > 0){
            bonus = 0.20;
            performanceBonus = basicSal * bonus;
            if(experience >= 10){
                bonus = 0.10;
            } else if(experience >= 5 &&  experience < 10) {
                bonus = 0.05;
            } else{
                bonus = 0;
            }
            experienceBonus = basicSal * bonus;
            finalSal = basicSal + performanceBonus + experienceBonus;
        } else if(rating == 4 && basicSal > 0){
            bonus = 0.15;
            performanceBonus = basicSal * bonus;
            if(experience >= 10){
                bonus = 0.10;
            } else if(experience >= 5 &&  experience < 10) {
                bonus = 0.05;
            } else{
                bonus = 0;
            }
            experienceBonus = basicSal * bonus;
            finalSal = basicSal + performanceBonus + experienceBonus;
        } else if(rating == 3 && basicSal > 0){
            bonus = 0.10;
            performanceBonus = basicSal * bonus;
            if(experience >= 10){
                bonus = 0.10;
            } else if(experience >= 5 &&  experience < 10) {
                bonus = 0.05;
            } else{
                bonus = 0;
            }
            experienceBonus = basicSal * bonus;
            finalSal = basicSal + performanceBonus + experienceBonus;
        } else if(rating == 2 && basicSal > 0){
            bonus = 0.05;
            performanceBonus = basicSal * bonus;
            if(experience >= 10){
                bonus = 0.10;
            } else if(experience >= 5 &&  experience < 10) {
                bonus = 0.05;
            } else{
                bonus = 0;
            }
            experienceBonus = basicSal * bonus;
            finalSal = basicSal + performanceBonus + experienceBonus;
        } else if(rating == 1 && basicSal > 0){
            bonus = 0;
            performanceBonus = basicSal * bonus;
            if(experience >= 10){
                bonus = 0.10;
            } else if(experience >= 5 &&  experience < 10) {
                bonus = 0.05;
            } else{
                bonus = 0;
            }
            experienceBonus = basicSal * bonus;
            finalSal = basicSal + performanceBonus + experienceBonus;
        } else {
            System.out.println("Invalid Rating/salary");
        }

        System.out.println("Performance Bonus: " + performanceBonus);
        System.out.println("Experience Bonus: " + experienceBonus);
        System.out.println("final Salary: " + finalSal);
    }
}
