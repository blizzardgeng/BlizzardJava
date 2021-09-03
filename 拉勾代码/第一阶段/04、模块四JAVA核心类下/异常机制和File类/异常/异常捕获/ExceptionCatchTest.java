package 异常机制和File类.异常.异常捕获;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionCatchTest {
    public static void main(String[] args) {
        //创建一个FileInputStream类型的对象和D:\a.txt文件关联。可以理解为打开文件
        FileInputStream fis = null;
        try {
            //当程序发生异常后直接执行catch
            System.out.println(1);
            fis = new FileInputStream("d:/a.txt");
            System.out.println(2);
        } catch (FileNotFoundException e) {
            System.out.println(3);
            e.printStackTrace();
            System.out.println(4);
        }

        try {
            System.out.println(5);
            fis.close();
            System.out.println(6);
        } /*catch (IOException e) {
            System.out.println(7);
            e.printStackTrace();
            System.out.println(8);

        } catch (NullPointerException e) {

            e.printStackTrace();

        }*/ catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("结束");

//        当程序执行过程中没有发生异常时的执行流程：1    2   5   6   结束
//        当程序执行过程中发生异常又没有手动处理空指针异常时的执行流程：1  3   4   5，空指针异常，没办法往下执行
//        当程序执行过程中发生异常并手动处理异常后1 3   4   5   结束
    }
}
