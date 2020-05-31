package com.interview.ref;

public class StrongReferenceDemo {

    public static void main(String[] args) {

        // 这样定义的默认就是强引用
        Object obj1 = new Object();
        // obj2 引用赋值
        Object obj2 = obj1;
        // 置空
        obj1 = null;

        System.gc();
        System.out.println(obj2);
    }
}
