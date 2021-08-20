package 第一阶段.模块二面向对象.static关键字和继承;

import java.util.Arrays;

/**
 * @author : Kevin Geng
 * @ClassName ：MainTest
 * @date : 2021/6/1 10:52 下午
 */
public class MainTest {



    public static void main(String[] args) {

        System.out.println("长度是"+args.length);
        System.out.println("获取到的数据是：");
        for (int i = 0; i < args.length; i++) {
            System.out.println("下标是"+i+"的数据是"+args[i]);
        }
    }
}
