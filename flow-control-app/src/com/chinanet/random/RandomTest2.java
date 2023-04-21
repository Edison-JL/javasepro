package com.chinanet.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        Random r =new Random();
        int s = r.nextInt(100) + 1;
        Scanner v = new Scanner(System.in);
        while (true) {
            System.out.println("请输入猜的数字！");
            int z = v.nextInt();
            if (z < s) {
                System.out.println("猜小了");
            } else if (z > s) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
