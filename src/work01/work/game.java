package work01.work;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        System.out.println("-------------欢 迎 进 入 游 戏 世 界--------------");
        System.out.println("");
        System.out.println("             *****************                   ");
        System.out.println("             ***  猜拳 开始 ***                   ");
        System.out.println("             *****************                   ");
        System.out.println("出拳规则:1.剪刀 2.石头 3.布");
        System.out.print("请选择对方角色(1：刘备 2：孙权 3：曹操)");
        Scanner sc = new Scanner(System.in);

        int Name = sc.nextInt();
        if (Name==1)
        {
           System.out.print("请输入你的姓名:");
           String player = sc.next();
           System.out.println(""+player+"  VS  刘备对战");
        }else if (Name==2)
        {
            System.out.print("请输入你的姓名:");
            String player = sc.next();
            System.out.println(""+player+"  VS  孙权对战");
        }else if (Name==3)
        {
            System.out.print("请输入你的姓名:");
            String player = sc.next();
            System.out.println(""+player+"  VS  曹操对战");
         }else{
               System.out.println("选择了未在名单内的对手");
        }

//        if (Name.equals("刘备")|| Name.equals("孙权") || Name.equals("曹操"))
//        {
//
//        }
    }
}
