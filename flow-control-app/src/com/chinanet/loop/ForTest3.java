package com.chinanet.loop;

public class ForTest3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <11; i++) {
            if(i % 2 == 1){
                sum += i;
            }
        }
        System.out.println(sum);
        int sum3 = 0;
        for (int i = 1; i < 11; i+=2) {
            sum3 += i;
        }
        System.out.println(sum3);
        }
}
