package work01.work;

import java.util.Scanner;

public class bookSystem {
    public static void main(String[] args) {
        System.out.println("书店管理系统>会员信息管理");
        System.out.println("***********************");
        System.out.println("");
        System.out.println("1.显示所有客户信息");
        System.out.println("2.添加客户信息");
        System.out.println("");
        System.out.println("***********************");
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择:");
        int ID = sc.nextInt();
        if (ID == 2 )
        {
            System.out.println("请输入会员名:");
            String Name = sc.next();
            System.out.println("请输入年龄:");
            int age = sc.nextInt();
            System.out.println("请输入积分:");
            int jifen = sc.nextInt();
            System.out.println("会员号     年龄     积分");
            System.out.println(Name+"      "+age+"       "+jifen);


        }else if (ID == 1){

            System.out.println("客户所有消息如下");

        }else {
            System.out.println("选择错误");
        }


    }
}
