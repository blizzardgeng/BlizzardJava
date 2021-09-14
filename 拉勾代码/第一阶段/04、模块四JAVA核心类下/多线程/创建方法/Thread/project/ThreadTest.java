package 多线程.创建方法.Thread.project;

public class ThreadTest extends Thread {

    @Override
    public void run() {
        System.out.println("子线程运行");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        System.out.println("主线程运行");
        Thread t1 = new ThreadTest();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束");


    }
}
