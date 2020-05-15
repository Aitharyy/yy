package work01.work;

import java.util.Scanner;

public class YySystem {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("=          欢迎使用ATM取款机器         =");
        System.out.println("======================================");
        Scanner sc = new Scanner(System.in);
        BankSystem(sc);

    }
    public  static  void  BankSystem(Scanner sc)
    {
        for (int i = 0 ;i<3;i++){
            System.out.print("账号:");
            String User = sc.next();
            System.out.print("密码:");
            String pwd = sc.next();
            if (User.equals("0123")==true && pwd.equals("1234")==true)
            {
                System.out.println("登陆成功");
                BankSystem();
                break;
            }else{

                System.out.println("登陆失败");
                if (i >=0 && i<2){
                    System.out.println("今天还可以登陆"+(2-i)+"次");
                }else if (i==2){
                    System.out.println("账号以ban，不用再来！");
                }
            }
        }
    }
    public  static  void  BankSystem(){
        System.out.println("*************************************");
        System.out.println("********请输入你想要的操作类型:********");
        System.out.println("********1.余额查询      2.取款********");
        System.out.println("********3.转账          4.存款********");
        System.out.println("********5.修改密码      6.退卡********");
        System.out.println("*************************************");
    }
}
