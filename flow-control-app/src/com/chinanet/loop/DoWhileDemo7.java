package com.chinanet.loop;

public class DoWhileDemo7 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("123");
            i++;
        }while (i<3);
        System.out.println("------------------------------");
        for (int j = 0; j < 3; j++) {
            System.out.println("helloworld");
        }
        int n = 0;
        while (n<3){
            System.out.println("");
            n++;
        }
        System.out.println(n);
    }
}
