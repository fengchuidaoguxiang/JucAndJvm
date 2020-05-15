package com.juc;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

//class MyThread implements Runnable{
//
//    @Override
//    public void run() {
//
//    }
//}

class MyThread implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("***********come in Callable");
        //暂停一会儿线程
        TimeUnit.SECONDS.sleep(4);
        return 1024;
    }
}
/**
 *
 * 多线程中，第3种获得多线程的方式
 *
 *  1   get方法一般请放在最后一行
 */
public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        MyThread myThread = new MyThread(); // implements Callable<Integer>
//        Thread t1 = new Thread(myThread);
//        t1.start();
        FutureTask futureTask = new FutureTask(new MyThread());

        new Thread(futureTask, "A").start();
        new Thread(futureTask, "B").start();


        System.out.println(Thread.currentThread().getName() + "********计算完成");

        System.out.println(futureTask.get());


    }
}
