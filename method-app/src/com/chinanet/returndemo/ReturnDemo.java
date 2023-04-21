package com.chinanet.returndemo;

public class ReturnDemo {
    public static void main(String[] args) {
        //明确关键字作用
        chu(10,0);
    }
    public static void chu(int a,int b){
        if (b==0){
            System.out.println("数据有误");
            return;//立即跳出当前方法，并结束方法执行
        }
        int c = a/b;

    }
}
