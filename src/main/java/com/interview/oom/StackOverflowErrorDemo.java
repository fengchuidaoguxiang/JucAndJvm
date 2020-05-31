package com.interview.oom;

public class StackOverflowErrorDemo {

    public static void main(String[] args) {

        stackOverFlowError();
    }

    private static void stackOverFlowError() {

        stackOverFlowError(); //Exception in thread "main" java.lang.StackOverflowError

    }
}
