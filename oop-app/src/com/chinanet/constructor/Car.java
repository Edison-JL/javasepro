package com.chinanet.constructor;

public class Car {
    String name;
    double price;
    //无参数构造器
    public Car(){
        System.out.println("无参数");
    }

    public Car(String name ,double price ){
        System.out.println("有参数");
        this.name = name;
        this.price = price;
    }
    public void goWith(String name){
        System.out.println(this.name + "正在和" + name +"比赛！");
    }

}
