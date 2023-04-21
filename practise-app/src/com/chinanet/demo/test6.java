package com.chinanet.demo;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            scores[i] = sc.nextInt();
            if(scores[i] < 0 || scores[i] > 100){
                System.out.println("分数输入错误！请重新输入");
                i--;
            }
        }
        System.out.println(finalScore(scores));
    }
    public static int finalScore(int[] score){
        int a = 0;
        for (int i = 0; i < score.length-1; i++) {
            for (int j = 0; j <score.length-(i+1) ; j++) {
                if(score[j] > score[j+1]){
                    a = score[j];
                    score[j] = score[j+1];
                    score[j+1]= a;
                }

            }
        }
        int totalScores =0;
        for (int i = 1; i < score.length-1; i++) {
            totalScores +=score[i];

        }
        return totalScores/4;

    }
}
