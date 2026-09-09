package com.sushmitha.javapractice.scannerclass;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // byte
        System.out.print("Enter a byte value: ");
        byte byteValue = sc.nextByte();

        // short
        System.out.print("Enter a short value: ");
        short shortValue = sc.nextShort();

        // int
        System.out.print("Enter an integer value: ");
        int intValue = sc.nextInt();

        // long
        System.out.print("Enter a long value: ");
        long longValue = sc.nextLong();

        // float
        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();

        // double
        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        // boolean
        System.out.print("Are you a Java developer? (true/false): ");
        boolean booleanValue = sc.nextBoolean();

        // char
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter a character: ");
        char charValue = sc.nextLine().charAt(0);


        System.out.println("Name       : " + name);
        System.out.println("byte       : " + byteValue);
        System.out.println("short      : " + shortValue);
        System.out.println("int        : " + intValue);
        System.out.println("long       : " + longValue);
        System.out.println("float      : " + floatValue);
        System.out.println("double     : " + doubleValue);
        System.out.println("boolean    : " + booleanValue);
        System.out.println("char       : " + charValue);

        sc.close();
    }
}