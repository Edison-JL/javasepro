package com.chinanet.demo;

public class Test5 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {6,2,9,0,9,90,23,78,37,580,37478,43,454};
        for (int i = arr.length-1; i >=0; i--) {
            for (int i1 = 0; i1 < i; i1++) {
                if (arr[i1]>arr[i1+1]){
                    int a = arr[i1];
                    arr[i1]=arr[i1+1];
                    arr[i1+1]=a;
                }
            }

        }
        for (int i2 = 0; i2 < arr.length; i2++) {
            System.out.println(arr[i2]);
        }
        int[] arr1 = {6,2,90,0,9,90,230,78,37,580,37478,43,454};
        for (int i = 1; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - i; j++) {
                if (arr1[j]>arr1[j+1]){
                        int b = arr1[j];
                        arr1[j] = arr1[j+1];
                        arr1[j+1] = b;
                }

            }

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
    }
}
