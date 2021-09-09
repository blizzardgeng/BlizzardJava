package 多线程.创建方法.Thread.继承Thread类重写run方法;

public class SubThreadRun extends Thread {

    @Override
    public void run() {
        //打印1到20所有整数
        for (int i = 1; i <= 20; i++) {
            System.out.println("run方法中i的值是"+i);

        }

    }
}
