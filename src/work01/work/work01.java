package work01.work;

import java.util.Scanner;

public class work01 {
    public static void main(String[] args) {
        System.out.println("请输入你的名字");
        Scanner sc = new Scanner(System.in);
        String nc = sc.next();
        System.out.println("请输入你的年龄");
        int mc = sc.nextInt();
        System.out.println("我的名字是"+nc+"");
        System.out.println("我的年龄是"+mc+"岁");
    }
}
