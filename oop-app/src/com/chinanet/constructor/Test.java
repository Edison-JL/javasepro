package com.chinanet.constructor;
//构造器
public class Test {
    public static void main(String[] args) {
        Car c = new Car("宝马",54.6);
        System.out.println(c.name);
        System.out.println(c.price);
        c.goWith("dhun");
        

    }

}
