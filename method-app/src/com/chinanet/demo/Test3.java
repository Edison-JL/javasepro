package com.chinanet.demo;

public class Test3 {
    public static void main(String[] args) {
        int[] sz = {22,33,45,567,665,356,355,66765,9686,};
        System.out.println(max(sz));

    }
    public static int max(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
            }

        }
        return max;
    }

}
