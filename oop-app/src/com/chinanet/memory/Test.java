package com.chinanet.memory;

public class Test {
    public static void main(String[] args) {
        //创建学生对象。
        Student s1 = new Student();
        s1.name = "小明";
        s1.sex = '男';
        s1.hobby = "睡觉，游戏，学习";
        s1.study();
        //s1赋值给s2
        Student s2 = s1;
        s2.name = "大统";
        s1.study();
        s2.study();
    }
}
