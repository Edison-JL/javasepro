package com.chinanet.loop;

import java.util.Scanner;

public class DeadForDemo8 {
    public static void main(String[] args) {
//        for (; ; ) {
//            System.out.println("123");
//        }
//        while (true){
//            System.out.println("122");
//        }
//        do {
//            System.out.println("1234");
//        }while (true);
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = 520;
            System.out.println("请输入密码！");
            int b = sc.nextInt();
            if (b==a){
                System.out.println("密码输入正确！");
                break;
            }else {
                System.out.println("密码错误！");
            }
        }

    }
}
