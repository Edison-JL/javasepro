package com.chinanet.demo;

public class Tese4 {
    public static void main(String[] args) {
        study();
        //理解方法运行内存机制
    }
    public static void eat(){
        System.out.println("eat");
    }
    public static void sleep(){
        System.out.println("sleep");
    }
    public static void study(){
        eat();
        System.out.println("study");
        sleep();
    }
}
