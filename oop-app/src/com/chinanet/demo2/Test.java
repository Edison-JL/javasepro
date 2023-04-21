package com.chinanet.demo2;

public class Test {
    public static void main(String[] args) {

        Movie m1 = new Movie("123",9.7,"wj");
        Movie m2 = new Movie("1234",9.0,"wj");
        Movie m3 = new Movie("12345",9.5,"wc");
        Movie[] arr = new Movie[3];
        arr[0]= new Movie("123",9.7,"wj");
        arr[1] = m2;
        arr[2] = m3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(arr[i].getName());
            System.out.println(arr[i].getActor());
            System.out.println(arr[i].getScore());
        }


    }
}
