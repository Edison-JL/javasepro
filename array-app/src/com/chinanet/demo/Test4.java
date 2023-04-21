package com.chinanet.demo;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rs = new Random();
        int[] gh = new int[5];
        System.out.println("请输入工号！");
        for (int i = 0; i < gh.length; i++) {
            System.out.println("请输入第"+ (i+1) + "个工号！");
            gh[i] = sc.nextInt();
        }
        for (int k = 0; k < 1000; k++) {
            for (int i = 0; i < gh.length; i++) {
                int b = rs.nextInt(5);
                int c = gh[b];
                gh[b] = gh[i];
                gh[i] = c;
            }

        }

        for (int i = 0; i < gh.length; i++) {
            System.out.println(gh[i]);
        }

    }
}
