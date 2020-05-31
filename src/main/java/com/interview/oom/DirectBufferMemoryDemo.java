package com.interview.oom;

import java.nio.ByteBuffer;

public class DirectBufferMemoryDemo {

    public static void main(String[] args) {

        System.out.println("配置的maxDirectMemory:" + (sun.misc.VM.maxDirectMemory() / (double) 1024 / 1024) + "MB" );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // -XX:MaxDirectMemorySize=5m  我们配置为5MB，但实际使用6MB，故意使坏
        ByteBuffer bb = ByteBuffer.allocateDirect(  6 * 1024 * 1024 );
    }
}
