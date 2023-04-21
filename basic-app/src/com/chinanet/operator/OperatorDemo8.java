package com.chinanet.operator;

public class OperatorDemo8 {
    public static void main(String[] args) {
        //三元运算符，理解流程
        double score = 78;
        String rs = score >= 60 ? "考试通过" : "挂科";
        System.out.println(rs);
        //从两个整数中找出最大值
        int a = 30 ;
        int b = 20 ;
        int c = a > b ?  a : b;
        System.out.println(c);
        //三个整数找最大
        int i = 100;
        int j = 20;
        int k = 30;
        int q =(i > j ? i:j) > k ? (i > j ? i:j) : k;
        System.out.println(q);
        int p = i > j ? i > k ? i : k :j > k ? j : k;
        System.out.println(p);
    }
}
