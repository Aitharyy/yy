package day03;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入钢笔数量");
        int gb = sc.nextInt();
        System.out.println("请输入笔记本数量");
        int bjb = sc.nextInt();
        System.out.println("请输入书架数量");
        int sj = sc.nextInt();
        System.out.println("**************消费单**************");
        System.out.println("品名   单价(￥)    数量    金额(￥)");
        if (gb==0){

        }else {
            System.out.println("钢笔   25.0       "+gb+"      "+gb*25.0+" ");
        }if (bjb==0){

        }else
        {
            System.out.println("笔记本  3.0       "+bjb+"       "+bjb*3.0+" ");
        }if (sj==0){

        }else {
            System.out.println("书架   10.0       "+sj+"      "+sj*50.0+" ");
        }
        System.out.print("折扣:  9折");
        double e = (gb*25.0+bjb*3.0+sj*50.0)*0.9;
        System.out.println("金额总计：￥"+e*0.9+"");
        System.out.print("请输入客户交的费:");
        double money = sc.nextInt();
        double a = money-e*0.9;
        System.out.println("找钱:      ￥"+a);
        System.out.println("本次购物所获积分:320");






    }
}
