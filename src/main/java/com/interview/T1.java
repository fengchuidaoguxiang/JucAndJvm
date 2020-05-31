package com.interview;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T1 {

    volatile int n = 0;

    public void add(){
        n++;
    }

    public static void main(String[] args) {
//        System.out.println("hello world");
        Lock lock = new ReentrantLock();
    }
}
