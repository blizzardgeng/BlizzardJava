package 运算符;

import java.util.Scanner;

/**
 * @author blizzard
 */
public class JudgeNegative {
    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(((100 <= num && num <= 999) ? "ture" : "flase"));

    }
}
