package com.sushmitha.javapractice.staticmethodsvariables;

public class StaticToNonStatic {
    static void a(){
       // b();  Cannot access non-static method directly

        /*StaticToNonStatic obj = new StaticToNonStatic();
        obj.b();*/
    }
     void b(){
         System.out.println("B");
     }

    public static void main(String[] args) {
        a();
    }
}


/*
Why? a() belongs to the class, but b() belongs to an object.

But you can do:

static void a() {
    Demo obj = new Demo();
    obj.b();   // ✅
}*/
