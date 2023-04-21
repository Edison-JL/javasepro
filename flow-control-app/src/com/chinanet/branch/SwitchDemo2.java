package com.chinanet.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //switch
        String weekday = "周三";
        switch (weekday){
            case "周一":
                System.out.println("1");
                break;
            case "周二":
                System.out.println("2");
                break;
            case "周三":
                System.out.println("3");
                break;
            case "周四":
                System.out.println("4");
                break;
            case "周五":
                System.out.println("5");
                break;
            case "周六":
                System.out.println("6");
                break;
            case "周日":
                System.out.println("7");
                break;
            default:
                System.out.println("sb");
        }
    }
}
