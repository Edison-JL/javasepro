package com.chinanet.scanner;

import java.util.Random;
import java.util.Scanner;

//导入包
//import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        //学会使用键盘录入技术
        //得到一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄");
        int c = sc.nextInt();
        System.out.println("年龄是"+ c);
        String name = sc.next();
        System.out.println("欢迎"+ name);
        Scanner sb = new Scanner(System.in);

    }
}
