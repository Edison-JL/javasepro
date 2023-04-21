package com.chinanet.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        //表达式类型自动转换
        byte a = 10;
        int b = 20;
        double c = 30;
        double d = a+b+c;
        System.out.println(d);
        //面试题
        byte i = 10;
        byte j = 10;
        int k = i + j;

    }
}
