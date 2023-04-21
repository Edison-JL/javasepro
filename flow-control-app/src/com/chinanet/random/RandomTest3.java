package com.chinanet.random;

import java.util.Random;

public class RandomTest3 {
    public static void main(String[] args) {
        Random r = new Random();
        int data = r.nextInt(10,30);
        System.out.println(data);
    }
}
