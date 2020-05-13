package day03;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        double oneNum = sc.nextDouble();
        System.out.println("请输入第二个数");
        double twoNum = sc.nextDouble();
        System.out.println("请输入第三个数");
        double threeNum = sc.nextDouble();
        if (oneNum+twoNum>threeNum || oneNum+threeNum>twoNum || twoNum+threeNum>oneNum)
        {
            System.out.println("能组成一个三角形");
        }else
        {
            System.out.println("不能组成一个三角形");
        }
    }
}
