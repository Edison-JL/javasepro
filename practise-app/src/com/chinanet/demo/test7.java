package com.chinanet.demo;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        int[] scores = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        encryption(scores);


    }
    public static void encryption(int[] password){
        int[] a =new int[password.length];
        for (int i = 0; i < password.length; i++) {
           a[3-i] = (password[i]+5)%10;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }

    }
}
