package com.chinanet.create;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //学会使用静态初始化方式定义数组
//        double[] scores = new double[]{56.7,66.0,89,8};
        double[] scores = {56.7,66.0,89,8};
//        int[] ages = new int[]{12,13,23};
//        int[] ages = new int[]{12,13,23};
        int[] ages = {12,13,23};
//        String[] names = new String[]{"张三","李四","王二麻"};
        //简化格式
        String[] names = {"张三","李四","王二麻"};
        System.out.println(scores);
        System.out.println(scores[0]);
        ages[2] = 100;
        System.out.println(ages.length);
    }
}
