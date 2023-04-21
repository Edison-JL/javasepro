package com.chinanet.branch;

public class SwitchDemo4 {
    public static void main(String[] args) {
        //
        int month = 7 ;
        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("这个月有31天");
                break;
            case 2 :
                System.out.println("闰年有28天，非闰年有29天");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("这个月有30天");
                break;


        }
    }
}
