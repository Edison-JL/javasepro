package com.chinanet.demo;

import java.util.Random;
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        int[] luckyNumbers = creatLuckyNumbers();
        int[] userNumbers = userInputNumbers();
        for (int i = 0; i < luckyNumbers.length; i++) {
            System.out.print(luckyNumbers[i]+" ");
        }
        judge(luckyNumbers,userNumbers);

    }
    public static int[] creatLuckyNumbers(){
        Random rd = new Random();
        int[] luckyNumbers = new int[7];

        for (int i = 0; i < 6; i++) {
            luckyNumbers[i] = rd.nextInt(1,34);
            for (int j = 0; j < i; j++) {
                if (luckyNumbers[i] == luckyNumbers[j]){
                    i--;
                    break;
                }

            }
        }
        luckyNumbers[6] = rd.nextInt(1,17);
        return luckyNumbers;
    }
    public static int[] userInputNumbers(){
        Scanner sc = new Scanner(System.in);
        int[] inputNumbers = new int[7];
        for (int i = 0; i < inputNumbers.length; i++) {
            System.out.println("请输入第"+(i+1)+"个号码");
            inputNumbers[i] = sc.nextInt();
            if(i!=inputNumbers.length-1){
                if (inputNumbers[i]<1 || inputNumbers[i] >33){
                    System.out.println("输入错误，请输入在1-33之内数字！");
                    i--;
                }
            }else {
                if (inputNumbers[i]<1 || inputNumbers[i] >16){
                    System.out.println("输入错误，请输入在1-16之内数字！");
                    i--;
                }
            }
        }
        return inputNumbers;
    }
    public static void judge(int[] luckNumbers,int[] userNumbers){
        int count = 0;
        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckNumbers.length-1 ; j++) {
                if(userNumbers[j] == luckNumbers[i]){
                    count++;
                    break;
                }
            }

        }
        switch (count){
            case 0:
            case 1:
            case 2:
                if(luckNumbers[6] == userNumbers[6]){
                    System.out.println("六等奖！");
                }else {
                    System.out.println("没中奖！");
                }
                break;
            case 3:
                if(luckNumbers[6] == userNumbers[6]){
                    System.out.println("五等奖！");
                }else {
                    System.out.println("没中奖！");
                }
                break;
            case 4:
                if(luckNumbers[6] == userNumbers[6]){
                    System.out.println("四等奖！");
                }else {
                    System.out.println("五等奖！");
                }
                break;
            case 5:
                if(luckNumbers[6] == userNumbers[6]){
                    System.out.println("三等奖！");
                }else {
                    System.out.println("四等奖！");
                }
                break;
            case 6:
                if(luckNumbers[6] == userNumbers[6]){
                    System.out.println("一等奖！");
                }else {
                    System.out.println("二等奖！");
                }
                break;

        }



    }
}
