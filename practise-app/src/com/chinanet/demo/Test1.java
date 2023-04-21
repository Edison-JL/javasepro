package com.chinanet.demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入机票原价！");
        int originalPrice = sc.nextInt();
        System.out.println("请输入月份！");
        int month = sc.nextInt();
        System.out.println("请输入仓位！");
        String position = sc.next();
        System.out.println(PriceCalculation(originalPrice,month,position));


    }

    public static double PriceCalculation(int originalPrice, int month, String position) {
        double discountedPrice = 0;
        if(month >= 1 && month <= 12 ){
            if (month >= 5 && month <= 10) {
                switch (position) {
                    case "商务舱":
                        discountedPrice = originalPrice * 0.9;
                    break;
                    case "经济舱":
                        discountedPrice = originalPrice * 0.85;
                    break;
                    default:
                        System.out.println("您输入的仓位有问题");
                }
            } else {
                switch (position) {
                    case "商务舱":
                        discountedPrice = originalPrice * 0.7;
                    break;
                    case "经济舱":
                        discountedPrice = originalPrice * 0.65;
                    break;
                    default:
                        System.out.println("您输入的仓位有问题");

                }

            }
        }else {
            return -1;
        }
        return discountedPrice;

    }
}
