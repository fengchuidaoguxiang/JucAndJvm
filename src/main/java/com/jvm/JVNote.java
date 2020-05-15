package com.jvm;

public class JVNote {

    public static void m1(){
        m1();
    }

    public static void main(String[] args) {
        System.out.println("1111");
        m1();
        System.out.println("444");


    }
}
