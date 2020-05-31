package com.interview;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

class MyThread implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println( Thread.currentThread().getName()  + "************** come in Callable");
        TimeUnit.SECONDS.sleep(3);
        return 1024;
    }
}

/**
 *   多线程中，第3种获得多线程的方式
 */
public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 两个线程，一个main线程，一个是AAFutureTask线程

        // FutureTask(Callable<V> callable)
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
//        FutureTask<Integer> futureTask2 = new FutureTask<>(new MyThread());

        new Thread(futureTask, "AA").start();
        new Thread(futureTask, "BB").start();

//        int result02  = futureTask.get();

        System.out.println(Thread.currentThread().getName() + "******************");
        int result01 = 100;

        // 建议放在最后，要求获得Callable线程的计算结果，如果没有计算完成就要去强求，会导致阻塞，直到计算完成
        int result02  = futureTask.get();

//        while(!futureTask.isDone()){
//
//        }

        System.out.println("************result: " + (result01 + result02) );


    }
}
