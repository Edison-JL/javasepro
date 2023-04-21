package com.chinanet.demo;

public class test2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200 ; i++) {
            boolean a = true;
            for (int j = 2; j <= i/2; j++) {
                if(i % j == 0){
                    a = false;
                    break;

                }

            }
            if (a ==  true){
                count++;
                System.out.print(i+"\t");

            }

        }
        System.out.println(count);
    }

}
