package work01.work;

import java.util.Scanner;

public class SXH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int Num = sc.nextInt();
        int g = Num%100%10;
        int s = Num%100/10;
        int bai = Num/100;
        if (Num>99 && Num<1000)
        {
            if (Num==g*g*g+s*s*s+bai*bai*bai)
            {
                System.out.println(""+Num+"是水仙花数");
            }else {
                System.out.println(""+Num+"不是水仙花数");
            }
        }else{
            System.out.println("您输入的不是一个三位数");
        }
    }
}
