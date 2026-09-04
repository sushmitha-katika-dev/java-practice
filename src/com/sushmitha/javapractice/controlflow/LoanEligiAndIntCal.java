package com.sushmitha.javapractice.controlflow;

public class LoanEligiAndIntCal {
    public static void main(String[] args){
        int age = 25;
        int monthlySal = 30000;
        int creditScore = 690;
        int existingLoanEmi = 1000;
        int experience = 5;

        double emiLimit = monthlySal * 0.40;

        if(age >= 21 && age <= 60 &&
                monthlySal >= 25000 &&
                creditScore >= 650 &&
                experience >= 2 &&
                existingLoanEmi <= emiLimit){

            System.out.println("Eligible for Loan");

            if(creditScore >= 750){
                System.out.println("Interest rate: 9%");
            } else if(creditScore >= 700) {
                System.out.println("Interest rate: 10%");
            } else {
                System.out.println("Interest rate: 12%");
            }

        } else{
            System.out.println("Not Eligible");
            System.out.println("Reasons:");
            if(age < 21 && age > 60){
                System.out.println("Age must be b/w 21-60");
            }
            if(monthlySal < 25000){
                System.out.println("Monthly salary should be greater than 25k");
            }
            if(creditScore < 650){
                System.out.println("Credit score must be atleast 650");
            }
            if(experience < 2){
                System.out.println("Experience must be at least 2 yrs");
            }
            if(existingLoanEmi > emiLimit) {
                System.out.println("existing EMI exceeds 40 % of salary");
            }
        }
    }
}
