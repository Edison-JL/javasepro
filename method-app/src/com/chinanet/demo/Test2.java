package com.chinanet.demo;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        pd(b);
    }
    public static void pd(int a){
        if (a%2==0){
            System.out.println("偶数");
        } else {
            System.out.println("奇数");

        }
    }
}
