package work01.work;

import java.util.Scanner;

public class Naicha {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("1.添加商品信息");
        System.out.println("2.显示所有商品信息");
        System.out.println("根据序号查询对应的商品信息");
        System.out.println("********************************");
        System.out.println("请输入你想要进行的操作");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品序号:");
        String id = sc.next();
        System.out.println("请输入商品名称:");
        String Name = sc.next();
        System.out.println("请输入商品价格:");
        float price = sc.nextFloat();
        System.out.println("书店管理系统>会员信息管理>新增客户信息");
        System.out.println("序号     奶茶名称     价格");
        System.out.println(id+"    "+Name+"     "+price);

    }
}
