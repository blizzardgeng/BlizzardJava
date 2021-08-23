package 流程控制;

import java.util.Scanner;

/**
 * @author blizzard
 */
public class DoWhileDemo {
    public static void main(String[] args) throws InterruptedException {
        String str;
        do {
            System.out.println("学习中");
            Thread.sleep(2000);
            System.out.println("成绩是否合格");
            Scanner sc = new Scanner(System.in);
            str = sc.next();
        } while (!"y".equals(str));
    }
}
