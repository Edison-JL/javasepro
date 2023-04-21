package com.chinanet.createobject;

public class Test1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "宝马";
        c.price = 39.8;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();
        Car c2 = new Car();
        c2.name = "奔驰";
        c2.price = 39.9;
        System.out.println(c2.name);
        System.out.println(c2.price);
        c2.run();
        c2.start();
        Student xm = new Student();
        xm.name = "小民";
        xm.age = 12;
        xm.eat();
        xm.play();
        Student xh = new Student();
        xh.name = "小红";
        xh.age = 34;
        xh.play();
        xh.eat();
    }
}
