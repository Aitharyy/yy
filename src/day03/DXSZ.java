package day03;

import java.util.Scanner;

public class DXSZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符:");
        String str = sc.next();
        char ch = str.charAt(0);
        if (ch >= 65 && ch <= 90) {
            System.out.println("输入字符是属大写");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("输入字符是小写");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("输入字符是数字");
        }else{
            System.out.println("输入字符是特殊符号");
        }
    }
}
