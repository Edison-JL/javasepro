package com.chinanet.javabean;

public class Test {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setHeight(187.9);
        u1.setName("yaoming");
        u1.setSalary(5000.00);
        System.out.println(u1.getHeight());
        System.out.println(u1.getName());
        System.out.println(u1.getSalary());
        User u2 = new User("wudaliang",187,30000);
        System.out.println(u2.getSalary());
        System.out.println(u2.getHeight());
        System.out.println(u2.getName());
    }
}
