package com.chinanet.demo;

public class Test2 {
    public static void main(String[] args) {
        //数组元素求最值
        int[] yz = {15,9000,10000,20000,9500,-5};
        int yz1 = yz[0];
        for (int i = 1; i < yz.length; i++) {
            if (yz[i]>yz1){
                yz1 = yz[i];
            }

        }
        System.out.println(yz1);
    }
}
