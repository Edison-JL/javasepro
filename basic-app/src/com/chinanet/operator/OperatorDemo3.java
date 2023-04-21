package com.chinanet.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //+作为连接符
        int a = 5;
        System.out.println("abc" + 'a');
        System.out.println("abc" + a);
        System.out.println(5+a);
        System.out.println("abc"+5+'a');
        System.out.println(15+"abc"+15);
        System.out.println(a+'a');
        System.out.println(a+""+'a');
        System.out.println(a+'a'+"chinanet");
        System.out.println("chinanet"+a+'a');
        System.out.println("chinanet"+(a+'a'));


    }
}
