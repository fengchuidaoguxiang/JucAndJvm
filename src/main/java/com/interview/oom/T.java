package com.interview.oom;

public class T {

    public static void main(String[] args) {

        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
