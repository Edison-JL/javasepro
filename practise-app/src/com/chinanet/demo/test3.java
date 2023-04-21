package com.chinanet.demo;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] a =new int[62];
        for (int i = 0; i < 10; i++) {
            a[i] = i+48;
        }
        for (int i = 10; i <36; i++) {
            a[i] = i+55;
        }
        for (int i = 36; i <62; i++) {
            a[i] = i +61;

        }
      //


        for (int i = 0; i < 5; i++) {
            int b = a[rd.nextInt(0,63)];
            System.out.print((char)b);
        }
    }
}
