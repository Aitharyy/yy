package day03;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长度:");
        float chang = sc.nextFloat();
        System.out.println("请输入宽度:");
        float kuang = sc.nextFloat();
        System.out.println("面积为:"+chang*kuang+"");
    }
}
