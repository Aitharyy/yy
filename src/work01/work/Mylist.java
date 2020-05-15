package work01.work;

import java.util.Scanner;

public class Mylist {
    public static void main(String[] args) {
        System.out.println("请输入你的姓名");
        Scanner sc  =new Scanner(System.in);
        String Name = sc.next();
        System.out.println("请输入你的年龄");
        int age = sc.nextInt();
        System.out.println("请输入你的性别");
        String sex = sc.next();
        System.out.println("请输入你的身高");
        float hige = sc.nextFloat();
        System.out.println("请输入你的体重");
        float wight = sc.nextFloat();
        System.out.println("请输入你所在的地址");
        String from = sc.next();
        System.out.println(""+Name+"个人信息:");
        System.out.println("            姓名:"+Name+"");
        System.out.println("            年龄:"+age+"");
        System.out.println("            性别:"+sex+"");
        System.out.println("            身高:"+hige+"CM");
        System.out.println("            体重:"+wight+"KG");
        System.out.println("            地址:"+from+"");
    }
}
