package com.chinanet.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        //理解变量使用注意事项
        //先申明在使用
        int a = 23;
        System.out.println(a);
//        a = 1.5;
        //变量有效范围到}截止,同一范围不能重复
        {
            //
            int b =23;

        }
        System.out.println(a);
        a = 200;
        int c ;
//        System.out.println(c);
        char ch = 'a';
        System.out.println(ch + 1);
        System.out.println(ch);
        //八进制就是二进制三位一看
        //十六进制就是二进制四位一看
        int i1 = 0b0110;
        System.out.println(i1);
        int i2 = 0177;
        System.out.println(i2);
        int i3 = 0xda;
        System.out.println(i3);


    }
}
