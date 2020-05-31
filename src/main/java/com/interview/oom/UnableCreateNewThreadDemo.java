package com.interview.oom;

public class UnableCreateNewThreadDemo {

    public static void main(String[] args) {

        //Exception in thread "main" java.lang.OutOfMemoryError: unable to create new native thread

        for (int i = 1;   ; i++) {
            System.out.println("************* i = " + i );

            new Thread( () -> {
                try {
                    Thread.sleep(Integer.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } ).start();
        }
    }
}

