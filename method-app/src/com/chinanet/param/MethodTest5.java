package com.chinanet.param;

import java.util.Scanner;

public class MethodTest5 {
    public static void main(String[] args) {
        int[] a ={11,22,33,44,55,66};
        int[] b ={11,22,33,55,44,55,66};
        System.out.println(judgeArr(a, b));

    }
    public static boolean judgeArr(int[] a,int[] b){
//        Scanner sc = new Scanner(System.in);
        if (a.length == b.length){
            for (int i = 0; i < a.length; i++) {
                if(a[i] != b[i]){
                    return false;
                }

            }
            return true;
        }
        return false;
    }
}
