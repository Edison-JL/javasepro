package com.chinanet.create;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //动态初始化数组默认值规则
        int[] arr = new int[10];
        double[] arr1 = new double[10];
        System.out.println(arr[2]);
        //字符数组
        char[] chars = new char[100];
        System.out.println((int)chars[2]);
        double[] doubles = new double[90];
        System.out.println(doubles[89]);
        boolean[] booleans = new boolean[89];
        System.out.println(booleans[23]);
        System.out.println(booleans[88]);
        String[] strings = new String[90];
        System.out.println(strings[89]);

    }
}
