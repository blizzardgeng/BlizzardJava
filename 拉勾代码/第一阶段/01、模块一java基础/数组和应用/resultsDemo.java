package 数组和应用;

import java.util.Scanner;

/**
 * @author blizzard
 */
public class resultsDemo {
    public static void main(String[] args) {
        System.out.print("请输入学生人数:");
        Scanner sc = new Scanner(System.in);
        int renNum = sc.nextInt();
        int[] arrList = new int[renNum];
        System.out.println("请输入学生分数");
        for (int i = 0; i < arrList.length; i++) {
            arrList[i] = sc.nextInt();
            System.out.println("请继续输入下一个");

        }

        for (int i = 0; i < arrList.length; i++) {
            System.out.println("成绩是" + arrList[i]);
        }

    }
}
