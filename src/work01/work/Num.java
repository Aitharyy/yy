package work01.work;

import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int Num = sc.nextInt();
       if (Num>0)
       {
           if (Num%2==1)
           {
               System.out.println(""+Num+"是奇数");
           }else if (Num%2==0)
           {
               System.out.println(""+Num+"是奇数");
           }
       }else {
           System.out.println("您输入的不是一个正整数");
       }
    }
}
