package day03;

import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入公司员工基本工资:");
        double gz = sc.nextDouble();
        System.out.println("本月销售金额为:");
        double xse = sc.nextDouble();
        System.out.println("提成销售额的百分之几为:");
        double tc = sc.nextDouble();
        double zgz = gz+xse*tc;
        if (tc<1)
        {
            System.out.println("某公司员工基本工资为:"+gz+",本月销售金额为:"+xse+",提成为销售额的"+tc+"");
            System.out.println("该员工的本月工资:"+zgz+"");
        }
        else{
            System.out.println("本公司毕亏死");
        }
    }
}
