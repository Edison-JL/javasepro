package com.chinanet.operator;

public class OperatorDemo7 {
    public static void main(String[] args) {
        //逻辑运算符
        double size = 9.8;
        double storage = 16;
        //前后都是TRUE
        System.out.println(size >= 6.95 & storage>=8);
        System.out.println(size >= 6.95 | storage>=18);
        System.out.println(size >= 6.95 ^ storage>=18);
        System.out.println(!true);
        System.out.println("--------------------------------");
        int a = 20;
        int b = 20;
        System.out.println(a > 100 && ++b > 10);
        System.out.println(b);
        System.out.println(a > 100 || ++b > 10);
        System.out.println(b);
    }
}
