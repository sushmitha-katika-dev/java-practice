package com.sushmitha.javapractice.staticmethodsvariables;
/*
Both belong to the class, so static methods can directly access static methods.*/

public class StaticToStatic {

    static void a() {
        b();   // ✅
    }

    static void b() {
        System.out.println("B");
    }
}