package com.chinanet.demo;

public class Test1 {
    //使用方法计算1-n的和并返回
    public static void main(String[] args) {
        int c = add(100);
        System.out.println(c);


    }
    public static int add(int a){
        int he = 0;
        for (int i = 0; i <= a ; i++) {
            he += i;
        }
        return he;
    }
}
