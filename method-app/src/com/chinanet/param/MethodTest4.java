package com.chinanet.param;

import java.util.Scanner;

public class MethodTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {11,22,33,44,55,66,77,88};
        int b = sc.nextInt();
        System.out.println(backSeq(a, b));


    }
    public static int backSeq(int[] arr,int a){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a){
                return i;
            }

        }
        return -1;
    }
}
