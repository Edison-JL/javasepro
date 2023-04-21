package com.chinanet.type;

public class TypeDemo3 {
    public static void main(String[] args) {
        //强制类型转换
        int a = 20;
//        byte b = a ;
        byte b = (byte)a ;
        System.out.println(b);
        int i = 1500;
        byte j = (byte) i;
        System.out.println(j);
        //浮点型强转直接丢掉小数
        double score = 99.6;
        int score3 = (int) score;
        System.out.println(score3);

    }
}
