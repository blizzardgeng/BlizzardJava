package 流程控制;

import java.util.Random;
import java.util.Scanner;

/**
 * @author blizzard
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random ran = new Random();
        int temp = ran.nextInt(100);
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入数字:");
            int inputData = sc.nextInt();
            if (inputData < temp) {
                System.out.println("输入的小了。");
            } else if (inputData > temp) {
                System.out.println("输入的大了，往小里猜");
            } else {
                System.out.println("恭喜你，答对啦");
                break;
            }
        }
    }
}
