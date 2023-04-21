package com.chinanet.loop;

public class ForTest4 {
    public static void main(String[] args) {
        //找出水仙花数
        int count = 0;
        for (int i = 100; i <1000 ; i++) {
            int a = i % 10;
            int b = (i % 100) / 10;
            int c = i / 100;
            if(a*a*a + b*b*b + c*c*c== i){
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
