package com.chinanet.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random rs = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rs.nextInt(1,21);
        }
        Scanner sc = new Scanner(System.in);
        //boolean zhi = true;
        OUT:
        while (true){
            System.out.println("请输入猜的数！");
            int c = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (c==arr[i]){
                    System.out.println("猜中了！该数据在第" + (i+1) + "位！");
                    for (int i1 = 0; i1 < arr.length; i1++) {
                        System.out.print(arr[i1] + "\t");
                        // zhi = false;
                    }
                    break OUT;
                }
            }
            System.out.println("重新猜一下！");
        }



    }
}
