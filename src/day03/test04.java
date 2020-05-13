package day03;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入你的卡号(4位数)");
        int CoadNum = sc.nextInt();
        //8888%1000%100%10
        int ge = CoadNum%1000%100%10;
        int shi = CoadNum%1000%100/10;
        int bai = CoadNum%1000/100;
        int qian = CoadNum/1000;
        int allcoadnum=ge+shi+bai+qian;
        if (CoadNum>999&&CoadNum<10000){
            System.out.println("您的卡号个位数为:"+ge);
            System.out.println("您的卡号十位数为:"+shi);
            System.out.println("您的卡号百位数为:"+bai);
            System.out.println("您的卡号千位数为:"+qian);
            System.out.println("您的卡号所有数字之和为:"+allcoadnum);
            if (allcoadnum/4==ge){
                System.out.println("您是否中奖:flase");
            }else
            {
                System.out.println("您是否中奖:true");
            }
        }else{
            System.out.println("请输入4位数卡号");
        }
    }
}
