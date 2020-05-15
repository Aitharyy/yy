package work01.work;

import java.util.Scanner;

public class YearMoney {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入职位类别");
        String Lei  = sc.next();
        if (Lei.equals("A"))
        {
            System.out.println("年终奖按 30% 提成");
        }else if (Lei.equals("B"))
        {
            System.out.println("年终奖按 25% 提成");
        }else if (Lei.equals("C"))
        {
            System.out.println("年终奖按 20% 提成");
        }else if (Lei.equals("D"))
        {
            System.out.println("年终奖按 10% 提成");
        }else if (Lei.equals("E"))
        {
            System.out.println("年终奖按 5% 提成");
        }else{
            System.out.println("没有年终奖");
        }
    }
}
