package com.chinanet.demo;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        Goods[] ShopCar  = new Goods[100];
       while (true){
           System.out.println("查询购物车详情请输入：query");
           System.out.println("添加购物车商品请输入：add");
           System.out.println("修改购物车商品请输入：modify");
           System.out.println("结算购物车商品请输入：pay");
           Scanner sc = new Scanner(System.in);
           System.out.println("");
           String sr = sc.next();
           switch (sr){
               case "query":
                   query(ShopCar,sc);
                   break;
               case "add":
                   add(ShopCar,sc);
                   break;
               case "modify":
                   modify(ShopCar,sc);
                   break;
               case "pay":
                   pay(ShopCar,sc);
                   break;
               default:
                   System.out.println("输入错误！ ");
           }
       }

    }
    public static void query(Goods[] ShopCar,Scanner sc){
        if (ShopCar[0] == null){
            System.out.println("购物车为空！");
        }else {
            System.out.println("编号 名称    数量  价格");
            for (int i = 0; i < ShopCar.length; i++) {
                if (ShopCar[i]!= null) {
                    System.out.print(ShopCar[i].id);
                    System.out.print("   ");
                    System.out.print(ShopCar[i].name);
                    System.out.print("   ");
                    System.out.print(ShopCar[i].quantity);
                    System.out.print("   ");
                    System.out.println(ShopCar[i].price);
                }else {
                    break;
                }
            }
        }




    }
    public static void add(Goods[] ShopCar,Scanner sc){
        Goods G = new Goods();
        System.out.println("请输入需要添加的物品名称：");
        G.name = sc.next();
        System.out.println("请输入需要添加的商品编号：");
        G.id = sc.nextInt();
        System.out.println("请输入需要添加的商品数量");
        G.quantity= sc.nextInt();
        System.out.println("请输入需要添加的商品价格");
        G.price = sc.nextDouble();
        for (int i = 0; i < ShopCar.length; i++) {
            if (ShopCar[i] == null){
                ShopCar[i] = G;
                break;
            }

        }





    }
    public static void modify(Goods[] shopCar,Scanner sc){
        query(shopCar,sc);
        if (shopCar[0] == null){
            System.out.println("购物车为空！！！");
        }else {
            boolean bz = true;
            while (bz){
                System.out.println("请输入你需要更改的商品ID");
                int id = sc.nextInt();

                for (int i = 0; i < shopCar.length; i++) {
                    if (shopCar[i] != null ){
                        if (shopCar[i].id == id ){
                            bz = false;
                            System.out.println("请输入改正后的数量!");
                            shopCar[i].quantity = sc.nextInt();
                            break;
                        }
                    }
                }
                if(bz == true){
                    System.out.println("id输入错误！");
                }
            }


        }


    }
    public static void pay(Goods[] shopCar,Scanner sc){
        int total = 0;
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] != null){
                total +=shopCar[i].quantity*shopCar[i].price;
            }else {
                break;
            }

        }
        query(shopCar,sc);
        System.out.println("商品总价为"+total);




    }

}
