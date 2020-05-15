package work01.work;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入车型 1:夏利、2:富康、3:桑塔纳");
        int car = sc.nextInt();
        if (car==1)
        {
            System.out.println("请输入乘搭千米数");
            int kilomitter =sc.nextInt();
            System.out.println("车费为:"+kilomitter*1.44);
        }else if (car==2)
        {
            System.out.println("请输入乘搭千米数");
            int kilomitter =sc.nextInt();
            System.out.println("车费为:"+kilomitter*2.4);
        }else if (car==3)
        {
            System.out.println("请输入乘搭千米数");
            int kilomitter =sc.nextInt();
            System.out.println("车费为:"+kilomitter*5.8);
        }else
            {
                System.out.println("没有该型号的车");
            }


    }
}
