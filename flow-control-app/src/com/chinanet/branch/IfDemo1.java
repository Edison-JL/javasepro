package com.chinanet.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        //心跳60-100是正常的
        int heartbeat = 30;

        if(heartbeat < 60 || heartbeat > 100){
            System.out.println("心跳是"+heartbeat);
        }
        System.out.println("检查结束");
        //2;
        //发红包
        double money = 5.999;
        if (money >= 1314){
            System.out.println("发送成功");
        }else {
            System.out.println("没钱了");
        }
        //3；
        //绩效系统：0-60 C，60-80 B，80-90 A，90-100 A+
        int score = 109;
        if (score >= 0 && score < 60){
            System.out.println("c");
        }else if(score >= 60 && score < 80){
            System.out.println("b");
        } else if (score >= 80 && score < 90){
            System.out.println("a");
        }else if (score >= 90 && score <= 100){
            System.out.println("a+");
        }else {
            System.out.println("分数有误！");
        }
    }
}
