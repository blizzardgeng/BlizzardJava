package 多线程.创建方法.Runnable.project;

public class SubRunnableTest {
    public static void main(String[] args) {

        System.out.println("主流程" +Thread.currentThread().getName() + "运行-----");
        SubRunnable s1 = new SubRunnable();

        Thread t1 = new Thread(s1);

        t1.start();

        t1.getName();

        System.out.println("主流程" + Thread.currentThread().getName()+"结束-----");


    }


}
