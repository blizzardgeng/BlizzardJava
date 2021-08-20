package 第一阶段.模块一java基础.运算符;

import java.util.Scanner;


/**
 * @author blizzard
 */
public class timeText {
    public static void main(String[] args) {
        System.out.println("输入整数秒数：");
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        //计算时间
        System.out.println("小时:" + inputNum / 3600);
        System.out.println("分钟：" + inputNum % 3600 / 60);
        System.out.println("秒：" + inputNum % 60);

    }
}
