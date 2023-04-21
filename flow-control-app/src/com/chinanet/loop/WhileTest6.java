package com.chinanet.loop;

public class WhileTest6 {
    public static void main(String[] args) {
        //珠穆朗玛峰高度是884860.纸张厚度0.1，折叠纸张到不低于珠穆朗玛峰的高度。求折叠几次
        int high = 1;
        int count = 0;
        while (high<88488600){
            high=high*2;
            count++;
        }
        System.out.println(high);
        System.out.println(count);
    }
}
