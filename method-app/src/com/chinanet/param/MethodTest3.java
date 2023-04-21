package com.chinanet.param;

public class MethodTest3 {
    public static void main(String[] args) {
        int[] ages = {10,20,30,40};
        printArray(ages);
    }
    public static void printArray(int[] arr){
        System.out.print("该数组内容为：[");
        if (arr != null &&arr.length >0 ){
            for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1 ){
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ", ");
//            }
                System.out.print(i == arr.length - 1 ? arr[i] :arr[i]+",");

            }
        }

        System.out.println("]");

    }
}
