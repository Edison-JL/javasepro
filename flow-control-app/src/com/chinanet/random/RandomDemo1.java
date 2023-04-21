package com.chinanet.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo1 {
    public static void main(String[] args) {
        //随机数类
        Random r = new Random();
        for (int i = 0; i < 20;i++) {
            int a = r.nextInt(10) + 1;
            System.out.println(a);
        }
        for (int i = 0; i < 100; i++) {
            int a = r.nextInt(10) + 1;
            System.out.println(a);

        }
        int s = r.nextInt(99) + 1;
        Scanner v = new Scanner(System.in);
        while (true){
            System.out.println("请输入猜的数字！");
            int z = v.nextInt();
            if (z<s){
                System.out.println("猜小了");
            } else if (z>s) {
                System.out.println("猜大了");
            }else {
                System.out.println("猜中了");
                break;
            }

        }
    }
}
