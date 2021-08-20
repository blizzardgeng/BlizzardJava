package 第一阶段.模块一java基础.流程控制;

import java.util.Scanner;

/**
 * @author blizzard
 */
public class IfMaxCount {

    public static void main(String[] args) {
        System.out.println("请输入两个最大值：");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
//        正常方式
        if (s1 > s2) {
            System.out.println("最大值是" + s1);
        } else {
            System.out.println("最大值是" + s2);
        }
        System.out.println("--------------");
//        假设方式,推荐
        int max = s1;
        if (s2 > max) {
            max = s2;
        }
        System.out.println("最大值是" + max);

    }
}
