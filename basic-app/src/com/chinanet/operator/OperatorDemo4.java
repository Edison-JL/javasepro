package com.chinanet.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //学会使用自增自减
        int a = 10;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        int b =10;
        b--;
        System.out.println(b);
        --b;
        System.out.println(b);
        System.out.println("------------------------------------------");
        //非单独使用
        int i = 10;
        int j = ++i;
        System.out.println(j);
        int k = i++;
        System.out.println(k);
        System.out.println(i);
        int c = 10;
        int d = 5;

    }
}
