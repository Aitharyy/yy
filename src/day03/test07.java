package day03;

import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入语文的分数:");
        int Chinese = sc.nextInt();
        System.out.println("请输入数学的分数:");
        int math = sc.nextInt();
        System.out.println("请输入英语的分数:");
        int English = sc.nextInt();
        int zongfen=Chinese+math+English;
        double pjf = Chinese+math+English;
        System.out.println("语文     数学     英语");
        System.out.println(""+Chinese+"       "+math+"        "+English+"");
        System.out.println("总分:"+zongfen);
        System.out.println("平均分:"+pjf/3);
    }
}
