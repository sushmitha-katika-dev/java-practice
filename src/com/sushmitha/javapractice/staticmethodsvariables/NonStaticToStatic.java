package com.sushmitha.javapractice.staticmethodsvariables;

/*A non-static method can access a static method directly because
the static method belongs to the class.*/
public class NonStaticToStatic {
    void a(){
        b();
    }
    static void b(){
        System.out.println("B");
    }
    public static void main(String[] args) {
        NonStaticToStatic ns = new NonStaticToStatic();
        ns.a();
    }
}
