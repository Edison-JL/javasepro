package com.chinanet.demo;

import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        System.out.println(creatCode(7));

    }
    public static String creatCode(int a ){
        String code = "";
        for (int i = 0; i < a; i++) {

            Random rd = new Random();
            int type = rd.nextInt(3);
            switch (type){
                case 0:
                    char code1 = (char)(rd.nextInt(10)+48);
                    code+=code1;
                    break;
                case 1:
                    char code2 = (char)(rd.nextInt(26)+65);
                    code+=code2;
                    break;
                case 2:
                    char code3 = (char)(rd.nextInt(26)+97);
                    code+=code3;
                    break;
            }

        }
        return code;

    }
}
