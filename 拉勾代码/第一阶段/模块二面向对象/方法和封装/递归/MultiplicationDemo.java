package 第一阶段.模块二面向对象.方法和封装.递归;

import java.util.Scanner;

/**
 * @author : Kevin Geng
 * @date : 2021/5/30 11:41 下午
 */
public class MultiplicationDemo {



    int show(int n) {
//        int count = 1;
//        //递推
//        for (int i = 1; i <= n; i++) {
//            count *= i;
//        }
//        return count;

        //递归的方式
        if (1 == n) {
            return 1;
        }
        return n * show(n - 1);
    }

    public static void main(String[] args) {
        MultiplicationDemo m = new MultiplicationDemo();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int count = m.show(sc.nextInt());
        System.out.println(count);

    }

}
