package com.chinanet.loop;

public class WhileDemo5 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 3){
            System.out.println("123");
            a++;
        }
        int high = 1;
        int count = 0;
        while (high<8848860){
            high=high*2;
            count++;
        }
        System.out.println(high);
    }
}
