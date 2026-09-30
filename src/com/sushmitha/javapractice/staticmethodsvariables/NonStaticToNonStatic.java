package com.sushmitha.javapractice.staticmethodsvariables;

public class NonStaticToNonStatic {
    void a(){
        b(); //Both belong to the same object, so they can access each other directly.
    }
    void b(){
        System.out.println("B");
    }
    public static void main(String[] args) {
        NonStaticToNonStatic ns = new NonStaticToNonStatic();
        ns.a();
    }
}
