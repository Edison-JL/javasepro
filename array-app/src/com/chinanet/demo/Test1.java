package com.chinanet.demo;

public class Test1 {
    public static void main(String[] args) {
        int[] arr2 = {16,32,8,100,78};
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        System.out.println(sum);
    }
}
