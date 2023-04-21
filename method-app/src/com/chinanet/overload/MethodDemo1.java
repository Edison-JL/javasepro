package com.chinanet.overload;

public class MethodDemo1 {
    public static void main(String[] args) {
        fire();
        fire( "srfsc");
        fire("sddfx",5);

    }
    public static void fire(){

        System.out.println("");
    }
    public static void fire(String location){
        System.out.println(location);
    }
    public static void fire(String location,int a){
        System.out.println(a+location);
    }
    //只要是同一个类中，方法名称相同（区分大小写），形参列表不同（个数，类型，顺序，不关心形参名称），那他们就是重载的方法！
    //return 可以立即
}
