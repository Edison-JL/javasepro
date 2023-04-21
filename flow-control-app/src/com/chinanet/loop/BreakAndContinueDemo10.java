package com.chinanet.loop;

public class BreakAndContinueDemo10 {
    public static void main(String[] args) {
        //
        for (int i = 0; i < 5; i++) {
            System.out.println("123");
            if (i==2)
                break;

        }
        //continue
        for (int i = 1; i <=5 ; i++) {
            if (i==3) {
                continue;//立即跳出当次执行
            }
            System.out.println("123"+i);
        }
        //break不能用在if中，只能在循环跟switch中使用
        //continue只能在循环中使用
    }
}
