package com.chinanet.encapsulation;

public class Student {
    private int age;//私有变量只能在本类中访问
    public void setAge(int age){
        if (age >=0 && age<200){
            this.age = age;

        }else {
            System.out.println("输入错误");
        }
    }
    public int getAge(){
        return age;
    }
}

