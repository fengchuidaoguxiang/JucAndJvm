package com.jvm;

class CodeZY {

    public CodeZY(){
        System.out.println("Code的构造方法1111");
    }
    {
        System.out.println("Code的构造块2222");
    }
    static{
        System.out.println("Code的静态代码块3333");
    }
}

public class CodeBlack03{ // 主类  CodeBlack03.class-----
    {
        System.out.println("CodeBlack03的构造块4444");
    }
    static{
        System.out.println("CodeBlack03的静态代码块5555");
    }
    public CodeBlack03(){
        System.out.println("CodeBlack03的构造方法6666");
    }

    public static void main(String[] args) {

        System.out.println("==我是美丽分割线==========CodeBlack03的main方法777");
        new CodeZY();
        System.out.println("-----------------");
        new CodeZY();
        System.out.println("-----------------");
        new CodeBlack03();
    }
}
