package 多线程.生命周期常用方法.sleep方法;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class ThreadSleepTest extends Thread {

    private boolean flag = true;

    //子类中重写的方法不能抛出更大的异常

    @Override
    public void run() {
//        1、没隔一秒获取一次系统时间
        int i = 1;
        while (flag) {


            Date d1 = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            System.out.println(LocalDateTime.now());
            System.out.println("当前时间是" + simpleDateFormat.format(d1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        ThreadSleepTest tst = new ThreadSleepTest();
        tst.start();
//        主线程等待5秒后结束子线程
        System.out.println("主线程等待");
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tst.flag = false;
        System.out.println("结束");

    }
}
