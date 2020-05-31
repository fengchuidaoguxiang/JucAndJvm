package com.jvm;

public class T2 {

    public static void main(String[] args) {
//        Thread t1 = new Thread();
//        t1.start();
//        t1.start();
//        Exception in thread "main" java.lang.IllegalThreadStateException

        // 取得内核数
//        System.out.println(Runtime.getRuntime().availableProcessors());

//        // 返回Java虚拟机试图使用的最大内存量
//        long maxMemory = Runtime.getRuntime().maxMemory();
//        // 返回Java虚拟机中的内存总量
//        long totalMemory = Runtime.getRuntime().totalMemory();
//        System.out.println("-Xmx: MAX_MEMORY = " + maxMemory + "(字节)、" + (maxMemory / (double) 1024 / 1024) + "MB");
//        System.out.println("-Xms: TOTAL_MEMORY = " + totalMemory + "(字节)、" + (totalMemory / (double)1024 / 1024) + "MB");

//        String str = "www.atguigu.com" ;
//        while(true)
//        {
//            str += str + new Random().nextInt(88888888) + new Random().nextInt(999999999) ;
//        }

//        byte[] bytes = new byte[40 * 1024 * 1024];

        System.gc();
    }
}

//    Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

