package com.juc;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.*;

public class MyThreadPoolDemo {

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
       ExecutorService threadPool = new ThreadPoolExecutor(
               2,
               5,
               2L,
               TimeUnit.SECONDS,
               new LinkedBlockingQueue<>(3),
               Executors.defaultThreadFactory(),
               new ThreadPoolExecutor.DiscardOldestPolicy());

        try{
            // 模拟有10个顾客过来银行办理业务，目前池子里面有5个工作人员提供服务
            for (int i = 1; i <=10; i++) {
                threadPool.execute( () -> {
                    System.out.println(Thread.currentThread().getName() + "\t 办理业务");
                });
//                TimeUnit.SECONDS.sleep(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadPool.shutdown();
        }

    }

    private static void initPool() {
//        ExecutorService threadPool = Executors.newFixedThreadPool(5); // 一池5个工作线程，类似一个银行5个受理窗口
//        ExecutorService threadPool = Executors.newSingleThreadExecutor(); // 一池1个工作线程
        ExecutorService threadPool = Executors.newCachedThreadPool(); // 可扩容，可收缩，一池N个工作线程，类似一个银行有N个受理窗口

        try{
            // 模拟有10个顾客过来银行办理业务，目前池子里面有5个工作人员提供服务
            for (int i = 0; i < 10; i++) {
                TimeUnit.MILLISECONDS.sleep(500);
                threadPool.execute( () -> {
                    System.out.println(Thread.currentThread().getName() + "\t 办理业务");
                });
//                TimeUnit.SECONDS.sleep(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadPool.shutdown();
        }

//        // 数组工具类
//        Arrays.copyOf();
//        // 集合工具类
//        Collections.synchronizedList();
    }
}
