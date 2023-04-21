package com.chinanet.loop;

public class ForForDemo9 {
    public static void main(String[] args) {
        //说5天，每天3句123
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
